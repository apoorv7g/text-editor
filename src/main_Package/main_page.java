package main_Package;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Color;

public class main_page{

	private JFrame frmTexteditor;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public main_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTexteditor = new JFrame();
		frmTexteditor.setTitle("text-editor");
		frmTexteditor.setBackground(new Color(0, 0, 0));
		frmTexteditor.getContentPane().setBackground(new Color(0, 0, 0));
		Dimension screenSize = screenDetails();
		frmTexteditor.setBounds(0,0, screenSize.width, screenSize.height);
		frmTexteditor.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmTexteditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTexteditor.getContentPane().setLayout(null);
		
	}
	public Dimension screenDetails()
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
	    // Get the screen size
	    Dimension screenSize = toolkit.getScreenSize();

	    // Return the Dimension object containing the screen size
	    return screenSize;
	}

}
