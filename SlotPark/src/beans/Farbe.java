/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.Color;

/**
 *
 * @author Kevin
 */
public enum Farbe {
    PIK("Pik", Color.RED);

    private Farbe(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    String name;
    Color color;
}