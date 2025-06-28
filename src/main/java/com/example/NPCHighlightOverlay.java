package com.example;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

public class NPCHighlightOverlay extends Overlay
{
    private final Client client;
    private final NPCHighlightPlugin plugin;
    private final NPCHighlightConfig config;

    @Inject
    private NPCHighlightOverlay(Client client, NPCHighlightPlugin plugin, NPCHighlightConfig config)
    {
        this.client = client;
        this.plugin = plugin;
        this.config = config;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        for (var entry : plugin.getHighlightedNpcs().entrySet())
        {
            NPC npc = entry.getKey();
            NPCHighlightData highlightData = entry.getValue();

            if (npc.getConvexHull() != null)
            {
                // Draw the highlight
                if (config.highlightHull())
                {
                    graphics.setColor(highlightData.getColor());
                    graphics.draw(npc.getConvexHull());
                }

                // Draw the label if enabled
                if (config.showLabels() && highlightData.getLabel() != null)
                {
                    Point textLocation = npc.getCanvasTextLocation(graphics,
                            highlightData.getLabel(),
                            npc.getLogicalHeight() + 40);

                    if (textLocation != null)
                    {
                        OverlayUtil.renderTextLocation(graphics, textLocation,
                                highlightData.getLabel(),
                                highlightData.getColor());
                    }
                }
            }
        }
        return null;
    }
}