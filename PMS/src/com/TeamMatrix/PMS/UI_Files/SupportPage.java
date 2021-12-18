package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class SupportPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupportPage window = new SupportPage();
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
	public SupportPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 20, 689, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 689, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(SupportPage.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		lblNewLabel.setBounds(647, 3, 32, 40);
		panel.add(lblNewLabel);
		
		JLabel lblMeetTheDevelopers = new JLabel("Meet The Developers");
		lblMeetTheDevelopers.setForeground(new Color(230, 230, 250));
		lblMeetTheDevelopers.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMeetTheDevelopers.setBounds(232, 11, 295, 25);
		panel.add(lblMeetTheDevelopers);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.setState(JFrame.ICONIFIED);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(SupportPage.class.getResource("/com/TeamMatrix/PMS/UI_Images/Minimize icon.png")));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(596, 3, 32, 40);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 56, 670, 148);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Izaz Ahmmed\\Downloads\\Frame 1.png"));
		lblNewLabel_1.setBounds(10, 11, 160, 126);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setText("<html>"+" Izaz Ahmmed Tuhin "+"<br>"+" Software Engineer <br> 01960432399 <br>izaz35-634@diu.edu.bd"+"</html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(186, 21, 341, 116);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(10, 213, 670, 148);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("D:\\SWE\\java\\PMS\\PMS\\src\\com\\TeamMatrix\\PMS\\UI_Images\\profile.png"));
		lblNewLabel_1_1.setBounds(10, 11, 160, 126);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel();
		lblNewLabel_2_1.setText("<html> Ashikur Rahman Ashik <br> Software Engineer <br> 01618201727 <br>ashik35-540@diu.edu.bd</html>");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(186, 21, 341, 116);
		panel_1_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 370, 670, 148);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("D:\\SWE\\java\\PMS\\PMS\\src\\com\\TeamMatrix\\PMS\\UI_Images\\Lamia.png"));
		lblNewLabel_1_2.setBounds(10, 11, 160, 126);
		panel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel();
		lblNewLabel_2_2.setText("<html>Khairun Nahar Lamia<br> Software Engineer <br> 01960432399 <br>khairun35-624@diu.edu.bd</html>");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(186, 21, 341, 116);
		panel_1_2.add(lblNewLabel_2_2);
		
	
	}
}
