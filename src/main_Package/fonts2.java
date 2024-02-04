package main_Package;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class fonts2 {
    public static void main(String[] args) {
        // Get the graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Get the names of all available font families
        String[] fontFamilies = ge.getAvailableFontFamilyNames();

        // Print all fonts under each font family
        for (String fontFamily : fontFamilies) {
            System.out.println("Fonts under " + fontFamily + ":");
            Font[] fonts = ge.getAllFonts();
            for (Font font : fonts) {
                if (font.getFamily().equals(fontFamily)) {
                    System.out.println("  " + font.getFontName() + " - Style: " + font.getStyle());
                }
            }
            System.out.println();
        }
    }
}
