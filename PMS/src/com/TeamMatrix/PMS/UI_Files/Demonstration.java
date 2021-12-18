package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;

public class Demonstration {

	private JFrame DemonstrationF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demonstration window = new Demonstration();
					window.DemonstrationF.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demonstration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DemonstrationF = new JFrame();
		DemonstrationF.getContentPane().setBackground(new Color(208, 235, 250));
		DemonstrationF.setBounds(100, 100, 1200, 700);
		DemonstrationF.setLocationRelativeTo(null);
		DemonstrationF.setUndecorated(true);
		DemonstrationF.setAlwaysOnTop(true);
		DemonstrationF.setResizable(false);
		DemonstrationF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DemonstrationF.getContentPane().setLayout(null);
	}

}