package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manage_Clients {

	public JFrame frame;
	private JTextField t1;
	private JTextField t3;
	private JTextField t7;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField t2;
	String s;
	int flag = 0;
	
	JLabel veri = new JLabel("");

	Conn c1 = new Conn();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Clients window = new Manage_Clients();
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
	public Manage_Clients() {
		initialize();
	}
	JLabel label = new JLabel("");
	//Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
       
		Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(208,235,250));
		frame.setBounds(100, 100, 1000, 497);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel minimizeimglb_1_1 = new JLabel("");
		minimizeimglb_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashboard f= new Dashboard();
				f.frame.setVisible(true);
				frame.dispose();
			}
		});
		minimizeimglb_1_1.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/UI_Images/back icon.png")));
		minimizeimglb_1_1.setToolTipText("Close");
		minimizeimglb_1_1.setBounds(10, 11, 35, 30);
		frame.getContentPane().add(minimizeimglb_1_1);
		
		JLabel lblNewLabel = new JLabel("All your demands are in one place");
		lblNewLabel.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel.setBounds(338, 0, 314, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel minimizeimglb_1 = new JLabel("");
		minimizeimglb_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		minimizeimglb_1.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		minimizeimglb_1.setToolTipText("Close");
		minimizeimglb_1.setBounds(955, 11, 35, 30);
		frame.getContentPane().add(minimizeimglb_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 64, 980, 429);
		frame.getContentPane().add(tabbedPane);
		
		JPanel land = new JPanel();
		land.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		land.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Land", null, land, null);
		land.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(74, 11, 250, 190);
		land.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Property ID :");
		lblNewLabel_2.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2.setBounds(74, 234, 104, 17);
		land.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Area :");
		lblNewLabel_2_1.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(74, 262, 104, 17);
		land.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Address :");
		lblNewLabel_2_2.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(74, 290, 104, 17);
		land.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Price :");
		lblNewLabel_2_3.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(74, 318, 104, 17);
		land.add(lblNewLabel_2_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(159, 355, 105, 35);
		land.add(btnNewButton);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_7.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_7.setBounds(175, 230, 149, 20);
		land.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_8.setBounds(175, 259, 149, 20);
		land.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_9.setBounds(175, 289, 149, 20);
		land.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_10.setBounds(175, 317, 149, 20);
		land.add(textField_10);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(651, 11, 250, 190);
		land.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Property ID :");
		lblNewLabel_2_4.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(651, 234, 104, 17);
		land.add(lblNewLabel_2_4);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_11.setColumns(10);
		textField_11.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_11.setBounds(752, 230, 149, 20);
		land.add(textField_11);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Area :");
		lblNewLabel_2_1_1.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1_1.setBounds(651, 262, 104, 17);
		land.add(lblNewLabel_2_1_1);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_12.setColumns(10);
		textField_12.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_12.setBounds(752, 259, 149, 20);
		land.add(textField_12);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Address :");
		lblNewLabel_2_2_1.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2_1.setBounds(651, 290, 104, 17);
		land.add(lblNewLabel_2_2_1);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_13.setColumns(10);
		textField_13.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_13.setBounds(752, 289, 149, 20);
		land.add(textField_13);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Price :");
		lblNewLabel_2_3_1.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3_1.setBounds(651, 318, 104, 17);
		land.add(lblNewLabel_2_3_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_14.setColumns(10);
		textField_14.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_14.setBounds(752, 317, 149, 20);
		land.add(textField_14);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(744, 355, 105, 35);
		land.add(btnNewButton_1);
		
		JPanel shop = new JPanel();
		shop.setBackground(Color.WHITE);
		tabbedPane.addTab("Shop", null, shop, null);
		shop.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2.setBounds(73, 11, 250, 190);
		shop.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_5 = new JLabel("Property ID :");
		lblNewLabel_2_5.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_5.setBounds(73, 234, 104, 17);
		shop.add(lblNewLabel_2_5);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_15.setColumns(10);
		textField_15.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_15.setBounds(174, 230, 149, 20);
		shop.add(textField_15);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Area :");
		lblNewLabel_2_1_2.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1_2.setBounds(73, 262, 104, 17);
		shop.add(lblNewLabel_2_1_2);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_16.setColumns(10);
		textField_16.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_16.setBounds(174, 259, 149, 20);
		shop.add(textField_16);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Address :");
		lblNewLabel_2_2_2.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2_2.setBounds(73, 290, 104, 17);
		shop.add(lblNewLabel_2_2_2);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_17.setColumns(10);
		textField_17.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_17.setBounds(174, 289, 149, 20);
		shop.add(textField_17);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Price :");
		lblNewLabel_2_3_2.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3_2.setBounds(73, 318, 104, 17);
		shop.add(lblNewLabel_2_3_2);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_18.setColumns(10);
		textField_18.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_18.setBounds(174, 317, 149, 20);
		shop.add(textField_18);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(142, 355, 105, 35);
		shop.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_3.setBounds(634, 11, 250, 190);
		shop.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_6 = new JLabel("Property ID :");
		lblNewLabel_2_6.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_6.setBounds(634, 234, 104, 17);
		shop.add(lblNewLabel_2_6);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_19.setColumns(10);
		textField_19.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_19.setBounds(735, 230, 149, 20);
		shop.add(textField_19);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Area :");
		lblNewLabel_2_1_3.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1_3.setBounds(634, 262, 104, 17);
		shop.add(lblNewLabel_2_1_3);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_20.setColumns(10);
		textField_20.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_20.setBounds(735, 259, 149, 20);
		shop.add(textField_20);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Address :");
		lblNewLabel_2_2_3.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2_3.setBounds(634, 290, 104, 17);
		shop.add(lblNewLabel_2_2_3);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_21.setColumns(10);
		textField_21.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_21.setBounds(735, 289, 149, 20);
		shop.add(textField_21);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Price :");
		lblNewLabel_2_3_3.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3_3.setBounds(634, 318, 104, 17);
		shop.add(lblNewLabel_2_3_3);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_22.setColumns(10);
		textField_22.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_22.setBounds(735, 317, 149, 20);
		shop.add(textField_22);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(703, 355, 105, 35);
		shop.add(btnNewButton_3);
		
		JPanel Flat = new JPanel();
		Flat.setBackground(Color.WHITE);
		tabbedPane.addTab("Flat", null, Flat, null);
		Flat.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_4.setBounds(60, 11, 250, 190);
		Flat.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_7 = new JLabel("Property ID :");
		lblNewLabel_2_7.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_7.setBounds(60, 234, 104, 17);
		Flat.add(lblNewLabel_2_7);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_23.setColumns(10);
		textField_23.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_23.setBounds(161, 230, 149, 20);
		Flat.add(textField_23);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Area :");
		lblNewLabel_2_1_4.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1_4.setBounds(60, 262, 104, 17);
		Flat.add(lblNewLabel_2_1_4);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_24.setColumns(10);
		textField_24.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_24.setBounds(161, 259, 149, 20);
		Flat.add(textField_24);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("Address :");
		lblNewLabel_2_2_4.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2_4.setBounds(60, 290, 104, 17);
		Flat.add(lblNewLabel_2_2_4);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_25.setColumns(10);
		textField_25.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_25.setBounds(161, 289, 149, 20);
		Flat.add(textField_25);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("Price :");
		lblNewLabel_2_3_4.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3_4.setBounds(60, 318, 104, 17);
		Flat.add(lblNewLabel_2_3_4);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_26.setColumns(10);
		textField_26.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_26.setBounds(161, 317, 149, 20);
		Flat.add(textField_26);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(129, 355, 105, 35);
		Flat.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_5.setBounds(631, 11, 250, 190);
		Flat.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_8 = new JLabel("Property ID :");
		lblNewLabel_2_8.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_8.setBounds(631, 234, 104, 17);
		Flat.add(lblNewLabel_2_8);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_27.setColumns(10);
		textField_27.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_27.setBounds(732, 230, 149, 20);
		Flat.add(textField_27);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Area :");
		lblNewLabel_2_1_5.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_1_5.setBounds(631, 262, 104, 17);
		Flat.add(lblNewLabel_2_1_5);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_28.setColumns(10);
		textField_28.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_28.setBounds(732, 259, 149, 20);
		Flat.add(textField_28);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("Address :");
		lblNewLabel_2_2_5.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_2_5.setBounds(631, 290, 104, 17);
		Flat.add(lblNewLabel_2_2_5);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_29.setColumns(10);
		textField_29.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_29.setBounds(732, 289, 149, 20);
		Flat.add(textField_29);
		
		JLabel lblNewLabel_2_3_5 = new JLabel("Price :");
		lblNewLabel_2_3_5.setFont(new Font("Quicksand", Font.BOLD, 13));
		lblNewLabel_2_3_5.setBounds(631, 318, 104, 17);
		Flat.add(lblNewLabel_2_3_5);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Quicksand", Font.BOLD, 13));
		textField_30.setColumns(10);
		textField_30.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_30.setBounds(732, 317, 149, 20);
		Flat.add(textField_30);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/purchase Button.png")));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(700, 355, 105, 35);
		Flat.add(btnNewButton_5);
		
		JPanel clientsp = new JPanel();
		clientsp.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Profile", null, clientsp, null);
		clientsp.setLayout(null);
		
		JPanel insiderp = new JPanel();
		insiderp.setLayout(null);
		insiderp.setFont(new Font("Quicksand", Font.BOLD, 11));
		insiderp.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
		insiderp.setBackground(Color.WHITE);
		insiderp.setBounds(10, 45, 774, 336);
		clientsp.add(insiderp);
		
		JLabel lblFull = new JLabel("Full Name:");
		lblFull.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblFull.setBounds(14, 29, 74, 14);
		insiderp.add(lblFull);
		
		t1 = new JTextField();
		t1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t1.setColumns(10);
		t1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t1.setBounds(123, 20, 168, 23);
		insiderp.add(t1);
		
		JLabel lblGender = new JLabel("User Name:");
		lblGender.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblGender.setBounds(14, 63, 99, 14);
		insiderp.add(lblGender);
		
		t3 = new JTextField();
		t3.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t3.setColumns(10);
		t3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t3.setBounds(123, 88, 168, 23);
		insiderp.add(t3);
		
		JLabel lblNidNo = new JLabel("Birth Cr. NO:");
		lblNidNo.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblNidNo.setBounds(14, 97, 99, 14);
		insiderp.add(lblNidNo);
		
		t7 = new JTextField();
		t7.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t7.setColumns(10);
		t7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t7.setBounds(123, 221, 168, 23);
		insiderp.add(t7);
		
		JLabel Roomslb = new JLabel("Dis code:");
		Roomslb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb.setBounds(14, 230, 99, 14);
		insiderp.add(Roomslb);
		
		t4 = new JTextField();
		t4.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t4.setColumns(10);
		t4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t4.setBounds(123, 122, 168, 23);
		insiderp.add(t4);
		
		JLabel lblBathrooms = new JLabel("Birth Date(year/..):");
		lblBathrooms.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblBathrooms.setBounds(10, 131, 103, 14);
		insiderp.add(lblBathrooms);
		
		t5 = new JTextField();
		t5.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t5.setColumns(10);
		t5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t5.setBounds(123, 156, 168, 23);
		insiderp.add(t5);
		
		JLabel lblBelcony = new JLabel("Phone Nb:");
		lblBelcony.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblBelcony.setBounds(14, 165, 74, 14);
		insiderp.add(lblBelcony);
		
		t6 = new JTextField();
		t6.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t6.setColumns(10);
		t6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t6.setBounds(123, 190, 168, 23);
		insiderp.add(t6);
		
		JLabel lblKitchen = new JLabel("District:");
		lblKitchen.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblKitchen.setBounds(14, 199, 84, 14);
		insiderp.add(lblKitchen);
		
		JLabel lblpImage = new JLabel("Image:");
		lblpImage.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblpImage.setBounds(428, 59, 74, 23);
		insiderp.add(lblpImage);
		
		
		label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		label.setBounds(524, 63, 183, 154);
		insiderp.add(label);
		
		
		JButton browsebt = new JButton("");
		browsebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
		         fileChooser.addChoosableFileFilter(filter);
		         int result = fileChooser.showSaveDialog(null);
		         if(result == JFileChooser.APPROVE_OPTION){
		             File selectedFile = fileChooser.getSelectedFile();
		             String path = selectedFile.getAbsolutePath();
		             label.setIcon(ResizeImage(path));
		             s = path;
		              }
		         else if(result == JFileChooser.CANCEL_OPTION){
		             System.out.println("No Data");
		         }
			}
		});
		browsebt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		browsebt.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/UI_Images/Browse button.png")));
		browsebt.setBorder(null);
		browsebt.setBackground(Color.WHITE);
		browsebt.setBounds(524, 261, 108, 38);
		insiderp.add(browsebt);
		
		t2 = new JTextField();
		t2.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		t2.setColumns(10);
		t2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		t2.setBounds(123, 54, 168, 23);
		insiderp.add(t2);
		
		JButton addbt = new JButton("");
		addbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		        	  String name = t1.getText();
		        	  String id = t2.getText();
		        	  String birth = t3.getText();
		        	  String birthdate = t4.getText();
		        	  String phone = t5.getText();
		        	  String district = t6.getText();
		        	  String post = t7.getText();
		        	  String dis;
		        	  ResultSet rs = c1.s.executeQuery("select * from district where name = '"+district+"'");
		        	  while(rs.next()) {
		        	   dis = rs.getString("pin");
		        	 t7.setText(dis);
		        	  }
		        	  String ch = t7.getText();
		        	  char ch1[] = new char[7];
		        	  char ch2[] = new char[7];
		        	  int j=0;
		        	  for(int i=0;i<6;i++) {
		        		  ch1[i] = birth.charAt(i);
		        		  if(i<4) {
		        			  ch2[i] = birthdate.charAt(i);
		        		  }
		        		  else {
		        			  
		        			  ch2[i] = ch.charAt(j);
		        			  j++;
		        		  }
		        	  }
		        	  for( int index = 0;index<6;index++)
		        	  {
		        		  if(ch1[index]==ch2[index]) {
		        			  flag =1;
		        			  continue;
		        		  }else {
		        			  flag = 0;
		        			  break;
		        		  }
		        		  
		        	  }
		        	  if(flag == 1 ) {
		        		  Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
			               PreparedStatement ps = con2.prepareStatement("insert into image values(?,?)");
			               InputStream is = new FileInputStream(new File(s));
			                   ps.setString(1, t2.getText());
			               ps.setBlob(2,is);
			               ps.executeUpdate();
			               
			               c1.s.executeUpdate("insert into cprofile values ('"+name+"','"+id+"','"+birth+"','"+birthdate+"','"+phone+"','"+district+"','"+post+"')");
			               JOptionPane.showMessageDialog(null, "Data Inserted");
			               veri.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/Frame 19.png")));
		        	  }else {
		        		  veri.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/Images_me/bl.png")));
		        	  }
		        	  
		        	  
				           }catch(Exception ex){
				               ex.printStackTrace();
				           }
				           	
						
					
			}
		});
		addbt.setBounds(642, 261, 108, 38);
		insiderp.add(addbt);
		addbt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addbt.setIcon(new ImageIcon(Manage_Clients.class.getResource("/com/TeamMatrix/PMS/UI_Images/Add.png")));
		addbt.setBorder(null);
		addbt.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("Profile Status:");
		lblNewLabel_3.setFont(new Font("Quicksand", Font.BOLD, 15));
		lblNewLabel_3.setBounds(816, 115, 109, 28);
		clientsp.add(lblNewLabel_3);
		
		
		
		
		veri.setBounds(838, 151, 59, 59);
		clientsp.add(veri);
		
	}
}