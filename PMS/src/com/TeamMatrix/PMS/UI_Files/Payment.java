package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Payment {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(new Rectangle(0, 0, 470, 450));
		frame.setBounds(100, 100, 480, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(182, 217, 236));
		panel.setBounds(0, 0, 480, 450);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(15, 69, 450, 370);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name : ");
		lblNewLabel_2.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2.setBounds(47, 53, 74, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setLabelFor(panel_1);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setFont(new Font("Quicksand", Font.PLAIN, 16));
		textField.setBounds(191, 53, 164, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Quicksand", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBounds(191, 84, 164, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Clients ID :");
		lblNewLabel_2_1.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(47, 84, 101, 20);
		panel_1.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Quicksand", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBounds(191, 115, 164, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Property ID :");
		lblNewLabel_2_2.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(47, 115, 101, 20);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Mobile Payment :");
		lblNewLabel_2_3.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(47, 155, 134, 20);
		panel_1.add(lblNewLabel_2_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Quicksand", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBounds(191, 189, 164, 20);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Amount :");
		lblNewLabel_2_4.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(47, 189, 74, 20);
		panel_1.add(lblNewLabel_2_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Quicksand", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_5.setBounds(191, 220, 164, 20);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("TrxN ID : ");
		lblNewLabel_2_5.setFont(new Font("Quicksand", Font.BOLD, 16));
		lblNewLabel_2_5.setBounds(47, 220, 74, 20);
		panel_1.add(lblNewLabel_2_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(Payment.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(236, 305, 113, 33);
		panel_1.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Quicksand", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bkash", "Rocket", "Nagad"}));
		comboBox.setBounds(191, 150, 164, 30);
		panel_1.add(comboBox);
		lblNewLabel.setIcon(new ImageIcon(Payment.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		lblNewLabel.setBounds(433, 11, 32, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Payment.class.getResource("/com/TeamMatrix/PMS/UI_Images/back icon.png")));
		lblNewLabel_1.setBounds(15, 11, 32, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Payment.class.getResource("/com/TeamMatrix/PMS/Images_me/payment header icon.png")));
		lblNewLabel_3.setBounds(113, 21, 39, 37);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Your payment");
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Quicksand", Font.BOLD, 20));
		lblNewLabel_4.setBounds(162, 25, 237, 27);
		panel.add(lblNewLabel_4);
	}
}
