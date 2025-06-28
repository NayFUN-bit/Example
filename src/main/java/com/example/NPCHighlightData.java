
package com.example;

import java.awt.Color;
import lombok.Value;

@Value
public class NPCHighlightData {
    String npcName;
    Color color;
    String label;
    boolean enabled;
}