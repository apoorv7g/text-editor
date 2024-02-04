package main_Package;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class ListFonts {
    public static void main(String[] args) {
        // Get the graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Load the Roboto font file
        try {
            // Replace "path/to/Roboto-Regular.ttf" with the actual path to your Roboto font file
            Font RobotoMono_Bold = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/RobotoMono-Bold.ttf"));
            Font RobotoMono_Bold_Italic  = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/RobotoMono-BoldItalic.ttf"));
            Font RobotoMono_Italic = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/RobotoMono-Italic.ttf"));
            Font RobotoMono_Regular = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/RobotoMono-Regular.ttf"));
            
            // Register the font with the graphics environment
            ge.registerFont(RobotoMono_Bold);
            ge.registerFont(RobotoMono_Bold_Italic);
            ge.registerFont(RobotoMono_Italic);
            ge.registerFont(RobotoMono_Regular);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get the names of all available fonts
        String[] fontNames = ge.getAvailableFontFamilyNames();

        // Print the names of all available fonts
        System.out.println("Available Fonts:");
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}

