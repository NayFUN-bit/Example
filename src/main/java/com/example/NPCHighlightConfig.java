
package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import java.awt.Color;

@ConfigGroup("npchighlight")
public interface NPCHighlightConfig extends Config {
    @ConfigSection(
            name = "General Settings",
            description = "General plugin settings",
            position = 0
    )
    String generalSection = "generalSection";

    @ConfigSection(
            name = "NPC Settings",
            description = "Individual NPC configuration settings",
            position = 1
    )
    String npcSection = "npcSection";

    @ConfigItem(
            keyName = "showLabels",
            name = "Show Labels",
            description = "Show custom labels above NPCs",
            section = generalSection
    )
    default boolean showLabels() {
        return true;
    }

    @ConfigItem(
            keyName = "highlightHull",
            name = "Highlight Hull",
            description = "Draw a hull around the NPC",
            section = generalSection
    )
    default boolean highlightHull() {
        return true;
    }

    // NPC 1
    @ConfigItem(
            keyName = "npc1Enabled",
            name = "Enable NPC 1",
            description = "Enable highlighting for NPC 1",
            section = npcSection,
            position = 10
    )
    default boolean npc1Enabled() {
        return false;
    }

    @ConfigItem(
            keyName = "npc1Name",
            name = "NPC 1 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 11
    )
    default String npc1Name() {
        return "";
    }

    @ConfigItem(
            keyName = "npc1Color",
            name = "NPC 1 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 12
    )
    default Color npc1Color() {
        return Color.RED;
    }

    @ConfigItem(
            keyName = "npc1Label",
            name = "NPC 1 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 13
    )
    default String npc1Label() {
        return "";
    }

    // Add similar blocks for NPCs 2-15
    // Here's NPC 2 as an example (repeat for 3-15 with increasing position numbers)
    @ConfigItem(
            keyName = "npc2Enabled",
            name = "Enable NPC 2",
            description = "Enable highlighting for NPC 2",
            section = npcSection,
            position = 20
    )
    default boolean npc2Enabled() {
        return false;
    }

    @ConfigItem(
            keyName = "npc2Name",
            name = "NPC 2 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 21
    )
    default String npc2Name() {
        return "";
    }

    @ConfigItem(
            keyName = "npc2Color",
            name = "NPC 2 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 22
    )
    default Color npc2Color() {
        return Color.BLUE;
    }

    @ConfigItem(
            keyName = "npc2Label",
            name = "NPC 2 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 23
    )
    default String npc2Label() {
        return "";
    }


    // NPC 3
    @ConfigItem(
            keyName = "npc3Enabled",
            name = "Enable NPC 3",
            description = "Enable highlighting for NPC 3",
            section = npcSection,
            position = 30
    )
    default boolean npc3Enabled() {
        return false;
    }

    @ConfigItem(
            keyName = "npc3Name",
            name = "NPC 3 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 31
    )
    default String npc3Name() {
        return "";
    }

    @ConfigItem(
            keyName = "npc3Color",
            name = "NPC 3 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 32
    )
    default Color npc3Color() {
        return Color.GREEN;
    }

    @ConfigItem(
            keyName = "npc3Label",
            name = "NPC 3 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 33
    )
    default String npc3Label() {
        return "";
    }

    // NPC 4
    @ConfigItem(
            keyName = "npc4Enabled",
            name = "Enable NPC 4",
            description = "Enable highlighting for NPC 4",
            section = npcSection,
            position = 40
    )
    default boolean npc4Enabled() {
        return false;
    }

    @ConfigItem(
            keyName = "npc4Name",
            name = "NPC 4 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 41
    )
    default String npc4Name() {
        return "";
    }

    @ConfigItem(
            keyName = "npc4Color",
            name = "NPC 4 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 42
    )
    default Color npc4Color() {
        return Color.YELLOW;
    }

    @ConfigItem(
            keyName = "npc4Label",
            name = "NPC 4 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 43
    )
    default String npc4Label() {
        return "";
    }


    // NPC 5
    @ConfigItem(
            keyName = "npc5Enabled",
            name = "Enable NPC 5",
            description = "Enable highlighting for NPC 5",
            section = npcSection,
            position = 50
    )
    default boolean npc5Enabled() { return false; }

    @ConfigItem(
            keyName = "npc5Name",
            name = "NPC 5 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 51
    )
    default String npc5Name() { return ""; }

    @ConfigItem(
            keyName = "npc5Color",
            name = "NPC 5 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 52
    )
    default Color npc5Color() { return Color.ORANGE; }

    @ConfigItem(
            keyName = "npc5Label",
            name = "NPC 5 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 53
    )
    default String npc5Label() { return ""; }

    // NPC 6
    @ConfigItem(
            keyName = "npc6Enabled",
            name = "Enable NPC 6",
            description = "Enable highlighting for NPC 6",
            section = npcSection,
            position = 60
    )
    default boolean npc6Enabled() { return false; }

    @ConfigItem(
            keyName = "npc6Name",
            name = "NPC 6 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 61
    )
    default String npc6Name() { return ""; }

    @ConfigItem(
            keyName = "npc6Color",
            name = "NPC 6 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 62
    )
    default Color npc6Color() { return Color.PINK; }

    @ConfigItem(
            keyName = "npc6Label",
            name = "NPC 6 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 63
    )
    default String npc6Label() { return ""; }

    // NPC 7
    @ConfigItem(
            keyName = "npc7Enabled",
            name = "Enable NPC 7",
            description = "Enable highlighting for NPC 7",
            section = npcSection,
            position = 70
    )
    default boolean npc7Enabled() { return false; }

    @ConfigItem(
            keyName = "npc7Name",
            name = "NPC 7 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 71
    )
    default String npc7Name() { return ""; }

    @ConfigItem(
            keyName = "npc7Color",
            name = "NPC 7 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 72
    )
    default Color npc7Color() { return Color.CYAN; }

    @ConfigItem(
            keyName = "npc7Label",
            name = "NPC 7 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 73
    )
    default String npc7Label() { return ""; }

    // NPC 8
    @ConfigItem(
            keyName = "npc8Enabled",
            name = "Enable NPC 8",
            description = "Enable highlighting for NPC 8",
            section = npcSection,
            position = 80
    )
    default boolean npc8Enabled() { return false; }

    @ConfigItem(
            keyName = "npc8Name",
            name = "NPC 8 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 81
    )
    default String npc8Name() { return ""; }

    @ConfigItem(
            keyName = "npc8Color",
            name = "NPC 8 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 82
    )
    default Color npc8Color() { return Color.LIGHT_GRAY; }

    @ConfigItem(
            keyName = "npc8Label",
            name = "NPC 8 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 83
    )
    default String npc8Label() { return ""; }

    // NPC 9
    @ConfigItem(
            keyName = "npc9Enabled",
            name = "Enable NPC 9",
            description = "Enable highlighting for NPC 9",
            section = npcSection,
            position = 90
    )
    default boolean npc9Enabled() { return false; }

    @ConfigItem(
            keyName = "npc9Name",
            name = "NPC 9 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 91
    )
    default String npc9Name() { return ""; }

    @ConfigItem(
            keyName = "npc9Color",
            name = "NPC 9 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 92
    )
    default Color npc9Color() { return Color.DARK_GRAY; }

    @ConfigItem(
            keyName = "npc9Label",
            name = "NPC 9 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 93
    )
    default String npc9Label() { return ""; }

    // NPC 10
    @ConfigItem(
            keyName = "npc10Enabled",
            name = "Enable NPC 10",
            description = "Enable highlighting for NPC 10",
            section = npcSection,
            position = 100
    )
    default boolean npc10Enabled() { return false; }

    @ConfigItem(
            keyName = "npc10Name",
            name = "NPC 10 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 101
    )
    default String npc10Name() { return ""; }

    @ConfigItem(
            keyName = "npc10Color",
            name = "NPC 10 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 102
    )
    default Color npc10Color() { return new Color(255, 128, 0); }

    @ConfigItem(
            keyName = "npc10Label",
            name = "NPC 10 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 103
    )
    default String npc10Label() { return ""; }

    // NPC 11
    @ConfigItem(
            keyName = "npc11Enabled",
            name = "Enable NPC 11",
            description = "Enable highlighting for NPC 11",
            section = npcSection,
            position = 110
    )
    default boolean npc11Enabled() { return false; }

    @ConfigItem(
            keyName = "npc11Name",
            name = "NPC 11 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 111
    )
    default String npc11Name() { return ""; }

    @ConfigItem(
            keyName = "npc11Color",
            name = "NPC 11 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 112
    )
    default Color npc11Color() { return new Color(128, 0, 128); }

    @ConfigItem(
            keyName = "npc11Label",
            name = "NPC 11 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 113
    )
    default String npc11Label() { return ""; }

    // NPC 12
    @ConfigItem(
            keyName = "npc12Enabled",
            name = "Enable NPC 12",
            description = "Enable highlighting for NPC 12",
            section = npcSection,
            position = 120
    )
    default boolean npc12Enabled() { return false; }

    @ConfigItem(
            keyName = "npc12Name",
            name = "NPC 12 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 121
    )
    default String npc12Name() { return ""; }

    @ConfigItem(
            keyName = "npc12Color",
            name = "NPC 12 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 122
    )
    default Color npc12Color() { return new Color(0, 128, 128); }

    @ConfigItem(
            keyName = "npc12Label",
            name = "NPC 12 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 123
    )
    default String npc12Label() { return ""; }

    // NPC 13
    @ConfigItem(
            keyName = "npc13Enabled",
            name = "Enable NPC 13",
            description = "Enable highlighting for NPC 13",
            section = npcSection,
            position = 130
    )
    default boolean npc13Enabled() { return false; }

    @ConfigItem(
            keyName = "npc13Name",
            name = "NPC 13 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 131
    )
    default String npc13Name() { return ""; }

    @ConfigItem(
            keyName = "npc13Color",
            name = "NPC 13 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 132
    )
    default Color npc13Color() { return new Color(128, 128, 0); }

    @ConfigItem(
            keyName = "npc13Label",
            name = "NPC 13 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 133
    )
    default String npc13Label() { return ""; }

    // NPC 14
    @ConfigItem(
            keyName = "npc14Enabled",
            name = "Enable NPC 14",
            description = "Enable highlighting for NPC 14",
            section = npcSection,
            position = 140
    )
    default boolean npc14Enabled() { return false; }

    @ConfigItem(
            keyName = "npc14Name",
            name = "NPC 14 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 141
    )
    default String npc14Name() { return ""; }

    @ConfigItem(
            keyName = "npc14Color",
            name = "NPC 14 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 142
    )
    default Color npc14Color() { return new Color(0, 128, 0); }

    @ConfigItem(
            keyName = "npc14Label",
            name = "NPC 14 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 143
    )
    default String npc14Label() { return ""; }
    // NPC 15
    @ConfigItem(
            keyName = "npc15Enabled",
            name = "Enable NPC 15",
            description = "Enable highlighting for NPC 15",
            section = npcSection,
            position = 150
    )
    default boolean npc15Enabled() {
        return false;
    }

    @ConfigItem(
            keyName = "npc15Name",
            name = "NPC 15 Name",
            description = "Name of the NPC to highlight",
            section = npcSection,
            position = 151
    )
    default String npc15Name() {
        return "";
    }

    @ConfigItem(
            keyName = "npc15Color",
            name = "NPC 15 Color",
            description = "Color to highlight the NPC with",
            section = npcSection,
            position = 152
    )
    default Color npc15Color() {
        return Color.MAGENTA;
    }

    @ConfigItem(
            keyName = "npc15Label",
            name = "NPC 15 Label",
            description = "Custom label for the NPC",
            section = npcSection,
            position = 153
    )
    default String npc15Label() {
        return "";
    }
}