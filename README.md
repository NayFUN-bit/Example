
# NPC Highlighter Plugin

A RuneLite plugin that allows you to highlight specific NPCs with custom colors and labels in-game.

## Features

- Highlight up to 15 different NPCs simultaneously
- Customize each NPC with:
  - Custom colors
  - Custom labels
  - Enable/disable individual NPC highlights
- Visual highlighting includes:
  - NPC model outline highlighting
  - Optional custom text labels above NPCs
- Case-insensitive NPC name matching
- Real-time updates when NPCs spawn or despawn
- Persists settings between game sessions

## Configuration

### General Settings

- **Show Labels**: Toggle visibility of custom labels above NPCs
- **Highlight Hull**: Toggle the outline highlight around NPCs

### NPC Settings

For each of the 15 available NPC slots, you can configure:

1. **Enable**: Toggle highlighting for this NPC slot
2. **NPC Name**: The exact name of the NPC to highlight
3. **Color**: Custom color for the highlight
4. **Label**: Optional custom text to display above the NPC

## Usage

1. Enable the plugin in RuneLite's plugin list
2. Open the configuration panel
3. For each NPC you want to highlight:
   - Enable the NPC slot
   - Enter the exact NPC name
   - Choose a highlight color
   - (Optional) Add a custom label
4. The changes will take effect immediately for any matching NPCs in view

## Tips

- NPC names must match exactly (though case doesn't matter)
- Leave the label field empty if you only want the highlight without text
- Different colors for different NPCs help distinguish them quickly
- Use labels to add important information or reminders about specific NPCs

## Support

For issues, suggestions, or contributions, please visit the plugin's GitHub repository.

## Author

NayFUN

## Tags

`npc`, `highlight`, `overlay`