package com.example;

import com.google.inject.Provides;
import java.awt.Color;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import java.util.*;
import java.lang.reflect.Method;

@Slf4j
@PluginDescriptor(
        name = "NPC Highlighter",
        description = "Highlights specified NPCs with custom colors and labels",
        tags = {"npc", "highlight", "overlay"}
)
public class NPCHighlightPlugin extends Plugin
{
    private static final int MAX_NPCS = 15;

    @Inject
    private Client client;

    @Inject
    private NPCHighlightConfig config;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private NPCHighlightOverlay overlay;

    private final Map<NPC, NPCHighlightData> highlightedNpcs = new HashMap<>();
    private List<NPCHighlightData> npcConfigs = new ArrayList<>();

    @Override
    protected void startUp()
    {
        overlayManager.add(overlay);
        loadNpcConfigs();
        updateNpcsToHighlight();
    }

    @Override
    protected void shutDown()
    {
        overlayManager.remove(overlay);
        highlightedNpcs.clear();
        npcConfigs.clear();
    }

    private void loadNpcConfigs()
    {
        npcConfigs.clear();

        for (int i = 1; i <= MAX_NPCS; i++)
        {
            try
            {
                boolean enabled = (boolean) config.getClass()
                        .getMethod("npc" + i + "Enabled")
                        .invoke(config);

                if (enabled)
                {
                    String name = (String) config.getClass()
                            .getMethod("npc" + i + "Name")
                            .invoke(config);

                    Color color = (Color) config.getClass()
                            .getMethod("npc" + i + "Color")
                            .invoke(config);

                    String label = (String) config.getClass()
                            .getMethod("npc" + i + "Label")
                            .invoke(config);

                    if (!name.isEmpty())
                    {
                        npcConfigs.add(new NPCHighlightData(
                                name.toLowerCase(),
                                color,
                                label,
                                true
                        ));
                    }
                }
            }
            catch (Exception e)
            {
                log.warn("Error loading NPC config " + i, e);
            }
        }
    }

    @Subscribe
    public void onNpcSpawned(NpcSpawned event)
    {
        checkNpc(event.getNpc());
    }

    @Subscribe
    public void onNpcDespawned(NpcDespawned event)
    {
        highlightedNpcs.remove(event.getNpc());
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged event)
    {
        if (event.getGameState() == GameState.LOGGED_IN)
        {
            loadNpcConfigs();
            updateNpcsToHighlight();
        }
    }

    private void updateNpcsToHighlight()
    {
        highlightedNpcs.clear();
        for (NPC npc : client.getNpcs())
        {
            checkNpc(npc);
        }
    }

    private void checkNpc(NPC npc)
    {
        if (npc == null || npc.getName() == null)
        {
            return;
        }

        String npcName = npc.getName().toLowerCase();
        for (NPCHighlightData config : npcConfigs)
        {
            if (npcName.equals(config.getNpcName()))
            {
                highlightedNpcs.put(npc, config);
                return;
            }
        }
    }

    public Map<NPC, NPCHighlightData> getHighlightedNpcs()
    {
        return highlightedNpcs;
    }

    @Provides
    NPCHighlightConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(NPCHighlightConfig.class);
    }
}