package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class SignUp {

	JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField tf1;
	private JPasswordField pf1;
	private JPasswordField pf2;
	public int type = 1;
	public int flag =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(0, 0, 850, 506));
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 851, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 413, 506);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/com/TeamMatrix/PMS/Images_me/signup.png")));
		lblNewLabel.setBounds(0, 0, 413, 506);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(182, 217, 236));
		panel_1.setBounds(411, 0, 440, 506);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Hi,<br>Register to get started</html>");
		lblNewLabel_1.setForeground(new Color(0, 51, 255));
		lblNewLabel_1.setFont(new Font("Quicksand", Font.BOLD, 17));
		lblNewLabel_1.setBounds(66, 33, 256, 56);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2.setBounds(66, 100, 121, 23);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(66, 179, 121, 23);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Re-type Password:");
		lblNewLabel_2_2.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(66, 258, 175, 23);
		panel_1.add(lblNewLabel_2_2);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Quicksand", Font.BOLD, 15));
		tf1.setBounds(66, 134, 271, 34);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		
		JCheckBox cb1 = new JCheckBox("Show");
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected()) {
					pf1.setEchoChar((char)0);
				}else {
					pf1.setEchoChar('*');
				}
			}
		});
		cb1.setBounds(358, 215, 65, 23);
		panel_1.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Show");
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected()) {
					pf2.setEchoChar((char)0);
				}else {
					pf2.setEchoChar('*');
				}
			}
		});
		cb2.setBounds(358, 299, 65, 23);
		panel_1.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("<html>Yes,All the information given here is authentic and<br>i agree to the privacy policies and terms of servies</html>");
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb3.isSelected()) {
					flag = 1;
				}else {
					flag =0; 
				}
			}
		});
		cb3.setBackground(new Color(182,217,236));
		cb3.setFont(new Font("Quicksand", Font.PLAIN, 13));
		cb3.setBounds(66, 373, 345, 48);
		panel_1.add(cb3);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String user =tf1.getText();
					String pass = pf1.getText();
					Conn c1 = new Conn();
					if(pf1.getText().equals(pf2.getText())) {
					if(flag == 1) {
					c1.s.executeUpdate("insert into login values ('"+user+"','"+pass+"',"+type+")");
					frame.setVisible(false);
					new Log_in().frame.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"Please Accept our privacy policy");
					}
					
				}else {
					JOptionPane.showMessageDialog(null,"Please give same password");
				}
				}catch(Exception a) {
					System.out.println(a);
				}
			}
		});
		b1.setBorder(null);
		b1.setBackground(new Color(182,217,236));
		b1.setIcon(new ImageIcon(SignUp.class.getResource("/com/TeamMatrix/PMS/Images_me/createBt.png")));
		b1.setBounds(105, 441, 230, 37);
		panel_1.add(b1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(SignUp.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		lblNewLabel_3.setBounds(381, 11, 32, 32);
		panel_1.add(lblNewLabel_3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(66, 213, 271, 34);
		panel_1.add(pf1);
		
		pf2 = new JPasswordField();
		pf2.setBounds(66, 292, 271, 34);
		panel_1.add(pf2);
		
		JComboBox cm1 = new JComboBox(new Object[]{"Buyer","Seller"});
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
		cm1.setBounds(66, 333, 96, 33);
		panel_1.add(cm1);
	}
}
