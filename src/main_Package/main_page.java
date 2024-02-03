package main_Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
        Font font = new Font("Arial", Font.PLAIN, 14);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

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
