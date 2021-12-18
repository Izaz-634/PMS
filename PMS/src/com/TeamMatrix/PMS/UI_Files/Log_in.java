package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JToggleButton;



import javax.swing.JComboBox;

public class Log_in {

	public JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField t1;
	private JPasswordField t2;
	
	public int type = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_in window = new Log_in();
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
	public Log_in() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 850, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel headerdrpanel = new JPanel();
		headerdrpanel.setLayout(null);
		headerdrpanel.setBackground(new Color(0, 0, 128));
		headerdrpanel.setBounds(0, 0, 850, 56);
		frame.getContentPane().add(headerdrpanel);
		
		JLabel headertxtlb = new JLabel("Property Management System");
		headertxtlb.setForeground(new Color(230, 230, 250));
		headertxtlb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 20));
		headertxtlb.setBounds(253, 16, 366, 25);
		headerdrpanel.add(headertxtlb);
		
		JLabel minimizeimglb_1 = new JLabel("");
		minimizeimglb_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		minimizeimglb_1.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		minimizeimglb_1.setToolTipText("Close");
		minimizeimglb_1.setBounds(805, 11, 35, 30);
		headerdrpanel.add(minimizeimglb_1);
		
		JLabel minimizeimglb = new JLabel("");
		minimizeimglb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setState(frame.ICONIFIED);
			}
		});
		minimizeimglb.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/UI_Images/Minimize icon.png")));
		minimizeimglb.setToolTipText("Minimize");
		minimizeimglb.setBounds(755, 11, 35, 30);
		headerdrpanel.add(minimizeimglb);
		panel.setBounds(0, 54, 445, 451);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/Images_me/loginP.png")));
		lblNewLabel.setBounds(0, 0, 445, 451);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBackground(new Color(182, 217, 236));
		panel_1.setBounds(441, 54, 409, 452);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Log in First");
		lblNewLabel_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_1.setBounds(22, 25, 194, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2.setBounds(64, 69, 96, 33);
		panel_1.add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t1.setBounds(64, 102, 225, 33);
		panel_1.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(64, 134, 96, 33);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("OR");
		lblNewLabel_2_2.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(166, 290, 48, 33);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conn c1 = new Conn();
					String user = t1.getText(); 
					@SuppressWarnings("deprecation")
					String pass = t2.getText();
					String q = "select * from login where username = '"+user+"' and password = '"+pass+"' and type ="+type+"";
					ResultSet rs = c1.s.executeQuery(q);
	                if(rs.next()){
	                    if(type == 1) {
	                    	frame.setVisible(false);
	                    	new Manage_Clients().frame.setVisible(true);
	                    }else {
	                    	frame.setVisible(false);
	                    	new Dashboard().frame.setVisible(true);
	                    }
	                    
	                }else{
	                    JOptionPane.showMessageDialog(null, "Incorrect Username or PIN");
	                }
				}catch(Exception d) {
					System.out.println(d);
				}
			}
		});
		btnNewButton.setBackground(new Color(182, 217, 236));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/Images_me/loginBt.png")));
		btnNewButton.setBounds(64, 259, 225, 33);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     frame.setVisible(false);
				new SignUp().frame.setVisible(true);
			}
		});
		
		btnNewButton_1.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/Images_me/createBt.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(182, 217, 236));
		btnNewButton_1.setBounds(64, 317, 225, 33);
		panel_1.add(btnNewButton_1);
		
		t2 = new JPasswordField();
		t2.setBounds(64, 164, 225, 33);
		panel_1.add(t2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) 
					t2.setEchoChar((char)0);
				
				else
					t2.setEchoChar('*');
				
			}
			
		});
		chckbxNewCheckBox.setBackground(new Color(182, 217, 236));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(312, 167, 74, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Log_in.class.getResource("/com/TeamMatrix/PMS/Images_me/forget.png")));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(182, 217, 236));
		btnNewButton_1_1.setBounds(62, 381, 237, 33);
		panel_1.add(btnNewButton_1_1);
		
		String[] user = {"Buyer","Seller"};
		JComboBox cm1 = new JComboBox(user);
		cm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = (String) cm1.getSelectedItem();//get the selected item    
                switch (s) {
                //check for a match
                    case "Buyer":
                           type=1;                        
                        break;
                    case "Seller":
                            type = 2;                      
                        break;
                }
			}
		});
	
		cm1.setFont(new Font("Quicksand", Font.PLAIN, 18));
		
		cm1.setBounds(127, 215, 96, 33);
		panel_1.add(cm1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("OR");
		lblNewLabel_2_2_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2_2_1.setBounds(166, 348, 48, 33);
		panel_1.add(lblNewLabel_2_2_1);
	}
}
