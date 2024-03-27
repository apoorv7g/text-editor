package main_Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Point;

public class main_page {

    private JFrame frmTexteditor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    main_page window = new main_page();
                    window.frmTexteditor.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public main_page() {
        initialize();
    }

    private void initialize() {
   
    	 GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
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

        Dimension screenSize = screenDetails();
        frmTexteditor = new JFrame();
        frmTexteditor.setTitle("text-editor");
        frmTexteditor.setBackground(new Color(0, 0, 0));
        frmTexteditor.getContentPane().setBackground(new Color(0, 0, 0));
        frmTexteditor.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setForeground(new Color(0, 0, 0));
        panel.setBackground(new Color(0, 0, 0));
        frmTexteditor.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setBackground(new Color(0, 0, 0));
        textArea.setCaretColor(new Color(255, 255, 255));
        textArea.setForeground(new Color(255, 255, 255));
        textArea.setLocation(new Point(10, 10));
        Font font1 = new Font("Roboto Mono", Font.TRUETYPE_FONT, 51);
        textArea.setFont(font1);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

        
      
       

        // Get the names of all available fonts
        String[] fontNames = ge.getAvailableFontFamilyNames();

        // Print the names of all available fonts
        System.out.println("Available Fonts:");
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
        frmTexteditor.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frmTexteditor.setBounds(0, 0, screenSize.width, screenSize.height);
        ImageIcon icon = new ImageIcon("src/icons/icon.png");
        frmTexteditor.setIconImage(icon.getImage());
        frmTexteditor.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmTexteditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Dimension screenDetails() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        return screenSize;
    }
}
