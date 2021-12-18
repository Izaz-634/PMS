package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard {

	 JFrame frame;
	private final JPanel headerdrpanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setUndecorated(true);
		frame.setBackground(new Color(240, 240, 240));
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 675);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		headerdrpanel.setBounds(0, 0, 1000, 50);
		headerdrpanel.setBackground(new Color(0, 51, 78));
		frame.getContentPane().add(headerdrpanel);
		headerdrpanel.setLayout(null);
		
		JLabel headertxtlb = new JLabel("Property Management System");
		headertxtlb.setBounds(384, 11, 295, 25);
		headertxtlb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 20));
		headertxtlb.setForeground(new Color(230, 230, 250));
		headerdrpanel.add(headertxtlb);
		
		JLabel minimizelb = new JLabel("");
		minimizelb.setBounds(1073, 20, 46, 14);
		headerdrpanel.add(minimizelb);
		
		JLabel minimizeimglb = new JLabel("");
		minimizeimglb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setState(JFrame.ICONIFIED);
			}
		});
		minimizeimglb.setToolTipText("Minimize");
		minimizeimglb.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Minimize icon.png")));
		minimizeimglb.setBounds(897, 11, 35, 30);
		headerdrpanel.add(minimizeimglb);
		
		JLabel minimizeimglb_1 = new JLabel("");
		minimizeimglb_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		minimizeimglb_1.setToolTipText("Close");
		minimizeimglb_1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		minimizeimglb_1.setBounds(942, 11, 35, 30);
		headerdrpanel.add(minimizeimglb_1);
		
		JLabel lblAdmin = new JLabel("Seller");
		lblAdmin.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/owners.png")));
		lblAdmin.setForeground(new Color(230, 230, 250));
		lblAdmin.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 18));
		lblAdmin.setBounds(22, 11, 121, 30);
		headerdrpanel.add(lblAdmin);
		
		JLabel lblAdmin_1 = new JLabel("");
		lblAdmin_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAdmin_1.setToolTipText("log out");
		lblAdmin_1.setIcon(new ImageIcon("C:\\Users\\Ashikur Rahman\\Downloads\\png\\log out icon.png"));
		lblAdmin_1.setForeground(new Color(230, 230, 250));
		lblAdmin_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 18));
		lblAdmin_1.setBounds(145, 11, 46, 30);
		headerdrpanel.add(lblAdmin_1);
		
		JPanel OVpropertyp = new JPanel();
		OVpropertyp.setBorder(new TitledBorder(null, "Overview", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(25, 25, 112)));
		OVpropertyp.setBounds(10, 61, 980, 250);
		OVpropertyp.setBackground(new Color(182, 217, 236));
		frame.getContentPane().add(OVpropertyp);
		OVpropertyp.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(30, 21, 165, 100);
		OVpropertyp.add(panel);
		panel.setLayout(null);
		
		JLabel OVpropertyimglb = new JLabel("");
		OVpropertyimglb.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/propertyIcon.png")));
		OVpropertyimglb.setBounds(10, 11, 60, 60);
		panel.add(OVpropertyimglb);
		
		JLabel OVpropertynamelb = new JLabel("Property");
		OVpropertynamelb.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb.setBounds(15, 71, 70, 18);
		panel.add(OVpropertynamelb);
		
		JLabel OVpropertynamelb_1 = new JLabel("1069");
		OVpropertynamelb_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1.setBounds(115, 28, 40, 18);
		panel.add(OVpropertynamelb_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(30, 132, 165, 100);
		OVpropertyp.add(panel_1);
		
		JLabel OVpropertyimglb_1 = new JLabel("");
		OVpropertyimglb_1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/property small icon.png")));
		OVpropertyimglb_1.setBounds(10, 11, 60, 60);
		panel_1.add(OVpropertyimglb_1);
		
		JLabel OVpropertynamelb_2 = new JLabel("Property");
		OVpropertynamelb_2.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb_2.setBounds(15, 71, 70, 18);
		panel_1.add(OVpropertynamelb_2);
		
		JLabel OVpropertynamelb_1_1 = new JLabel("1069");
		OVpropertynamelb_1_1.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1_1.setBounds(115, 28, 40, 18);
		panel_1.add(OVpropertynamelb_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(219, 21, 165, 100);
		OVpropertyp.add(panel_2);
		
		JLabel OVpropertyimglb_2 = new JLabel("");
		OVpropertyimglb_2.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Clinets filled Icon.png")));
		OVpropertyimglb_2.setBounds(10, 11, 60, 60);
		panel_2.add(OVpropertyimglb_2);
		
		JLabel OVpropertynamelb_3 = new JLabel("Clients");
		OVpropertynamelb_3.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb_3.setBounds(15, 71, 70, 18);
		panel_2.add(OVpropertynamelb_3);
		
		JLabel OVpropertynamelb_1_2 = new JLabel("1069");
		OVpropertynamelb_1_2.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1_2.setBounds(115, 28, 40, 18);
		panel_2.add(OVpropertynamelb_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(219, 132, 165, 100);
		OVpropertyp.add(panel_3);
		
		JLabel OVpropertynamelb_4 = new JLabel("Owners");
		OVpropertynamelb_4.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb_4.setBounds(15, 71, 70, 18);
		panel_3.add(OVpropertynamelb_4);
		
		JLabel OVpropertynamelb_1_3 = new JLabel("1069");
		OVpropertynamelb_1_3.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1_3.setBounds(115, 28, 40, 18);
		panel_3.add(OVpropertynamelb_1_3);
		
		JLabel OVpropertyimglb_4_1 = new JLabel("");
		OVpropertyimglb_4_1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Owners Icon.png")));
		OVpropertyimglb_4_1.setBounds(10, 11, 60, 60);
		panel_3.add(OVpropertyimglb_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(407, 132, 165, 100);
		OVpropertyp.add(panel_4);
		
		JLabel OVpropertyimglb_4 = new JLabel("");
		OVpropertyimglb_4.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/unlisted Property.png")));
		OVpropertyimglb_4.setBounds(10, 11, 60, 60);
		panel_4.add(OVpropertyimglb_4);
		
		JLabel OVpropertynamelb_5 = new JLabel("Unlisted");
		OVpropertynamelb_5.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb_5.setBounds(15, 71, 70, 18);
		panel_4.add(OVpropertynamelb_5);
		
		JLabel OVpropertynamelb_1_4 = new JLabel("1069");
		OVpropertynamelb_1_4.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1_4.setBounds(115, 28, 40, 18);
		panel_4.add(OVpropertynamelb_1_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(407, 21, 165, 100);
		OVpropertyp.add(panel_5);
		
		JLabel OVpropertyimglb_5 = new JLabel("");
		OVpropertyimglb_5.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Sales filled Icon.png")));
		OVpropertyimglb_5.setBounds(10, 11, 60, 60);
		panel_5.add(OVpropertyimglb_5);
		
		JLabel OVpropertynamelb_6 = new JLabel("Total Sales");
		OVpropertynamelb_6.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		OVpropertynamelb_6.setBounds(15, 71, 70, 18);
		panel_5.add(OVpropertynamelb_6);
		
		JLabel OVpropertynamelb_1_5 = new JLabel();
		OVpropertynamelb_1_5.setText("1069");
		OVpropertynamelb_1_5.setFont(new Font("Quicksand", Font.BOLD, 18));
		OVpropertynamelb_1_5.setBounds(115, 28, 40, 18);
		panel_5.add(OVpropertynamelb_1_5);
		
		JPanel Featurespnl = new JPanel();
		Featurespnl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Featurespnl.setName("");
		Featurespnl.setLayout(null);
		Featurespnl.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Features", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(25, 25, 112)));
		Featurespnl.setBackground(new Color(182, 217, 236));
		Featurespnl.setBounds(10, 353, 980, 268);
		frame.getContentPane().add(Featurespnl);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(76, 26, 165, 232);
		Featurespnl.add(panel_6);
		
		JLabel FEclientsimglb = new JLabel("");
		FEclientsimglb.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/miniClients.png")));
		FEclientsimglb.setBounds(47, 11, 80, 70);
		panel_6.add(FEclientsimglb);
		
		JLabel lblHereYouCan = new JLabel("<html> Here you can show all the \n records of clients &nbsp and their details </html>");
		lblHereYouCan.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		lblHereYouCan.setBounds(20, 110, 124, 60);
		panel_6.add(lblHereYouCan);
		
		JLabel OVpropertynamelb_2_1 = new JLabel("CLIENTS");
		OVpropertynamelb_2_1.setFont(new Font("Quicksand Medium", Font.BOLD, 13));
		OVpropertynamelb_2_1.setBounds(51, 81, 56, 18);
		panel_6.add(OVpropertynamelb_2_1);
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				
//				Manage_Clients f = new Manage_Clients();
//				f.frame.setVisible(true);
//				frame.setState(JFrame.ICONIFIED);
			
			}
		});
		bt1.setBackground(Color.WHITE);
		bt1.setBorder(null);
		bt1.setToolTipText("Click to show");
		bt1.setForeground(Color.WHITE);
		bt1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bt1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/view button.png")));
		bt1.setBounds(38, 173, 90, 40);
		panel_6.add(bt1);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setLayout(null);
		panel_6_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_6_1.setBackground(Color.WHITE);
		panel_6_1.setBounds(295, 26, 165, 232);
		Featurespnl.add(panel_6_1);
		
		JLabel FEclientsimglb_1 = new JLabel("");
		FEclientsimglb_1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Owners Icon.png")));
		FEclientsimglb_1.setBounds(47, 11, 80, 70);
		panel_6_1.add(FEclientsimglb_1);
		
		JLabel lblHereYouCan_1 = new JLabel("<html> Here you can show all the \n records of owners &nbsp and their details </html>");
		lblHereYouCan_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		lblHereYouCan_1.setBounds(10, 110, 145, 60);
		panel_6_1.add(lblHereYouCan_1);
		
		JLabel OVpropertynamelb_2_1_1 = new JLabel("OWNERS");
		OVpropertynamelb_2_1_1.setFont(new Font("Quicksand Medium", Font.BOLD, 13));
		OVpropertynamelb_2_1_1.setBounds(51, 81, 56, 18);
		panel_6_1.add(OVpropertynamelb_2_1_1);
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		bt2.setBorder(null);
		bt2.setBackground(Color.WHITE);
		bt2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bt2.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/view button.png")));
		bt2.setToolTipText("Click to show");
		bt2.setForeground(Color.WHITE);
		bt2.setBounds(38, 173, 90, 40);
		panel_6_1.add(bt2);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setLayout(null);
		panel_6_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_6_1_1.setBackground(Color.WHITE);
		panel_6_1_1.setBounds(523, 26, 165, 232);
		Featurespnl.add(panel_6_1_1);
		
		JLabel FEclientsimglb_1_1 = new JLabel("");
		FEclientsimglb_1_1.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/property icon.png")));
		FEclientsimglb_1_1.setBounds(47, 11, 80, 70);
		panel_6_1_1.add(FEclientsimglb_1_1);
		
		JLabel lblHereYouCan_1_1 = new JLabel("<html> Here you can manage all the \n your properties  &nbsp and their details </html>");
		lblHereYouCan_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		lblHereYouCan_1_1.setBounds(10, 110, 145, 60);
		panel_6_1_1.add(lblHereYouCan_1_1);
		
		JLabel OVpropertynamelb_2_1_1_1 = new JLabel("PROPERTIES");
		OVpropertynamelb_2_1_1_1.setFont(new Font("Quicksand Medium", Font.BOLD, 13));
		OVpropertynamelb_2_1_1_1.setBounds(38, 81, 89, 18);
		panel_6_1_1.add(OVpropertynamelb_2_1_1_1);
		
		JButton bt3 = new JButton("");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ManageProperties f=new ManageProperties();
				f.ManagePropertiesF.setVisible(true);
				//frame.setState(JFrame.ICONIFIED);
				frame.setVisible(false);
			}
		});
		bt3.setBackground(Color.WHITE);
		bt3.setBorder(null);
		bt3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bt3.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/view button.png")));
		bt3.setToolTipText("Click to show");
		bt3.setForeground(Color.WHITE);
		bt3.setBounds(38, 173, 90, 40);
		panel_6_1_1.add(bt3);
		
		JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setLayout(null);
		panel_6_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_6_1_2.setBackground(Color.WHITE);
		panel_6_1_2.setBounds(743, 26, 165, 232);
		Featurespnl.add(panel_6_1_2);
		
		JLabel FEclientsimglb_1_2 = new JLabel("");
		FEclientsimglb_1_2.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/Sales ivon.png")));
		FEclientsimglb_1_2.setBounds(47, 11, 80, 70);
		panel_6_1_2.add(FEclientsimglb_1_2);
		
		JLabel lblHereYouCan_1_2 = new JLabel("<html> Here you can show all the \n records of sales &nbsp and their details </html>");
		lblHereYouCan_1_2.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		lblHereYouCan_1_2.setBounds(10, 110, 145, 60);
		panel_6_1_2.add(lblHereYouCan_1_2);
		
		JLabel OVpropertynamelb_2_1_1_2 = new JLabel("VENDINGS");
		OVpropertynamelb_2_1_1_2.setFont(new Font("Quicksand Medium", Font.BOLD, 13));
		OVpropertynamelb_2_1_1_2.setBounds(47, 81, 76, 18);
		panel_6_1_2.add(OVpropertynamelb_2_1_1_2);
		
		JButton bt4 = new JButton("");
		bt4.setBorder(null);
		bt4.setBackground(Color.WHITE);
		bt4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bt4.setIcon(new ImageIcon(Dashboard.class.getResource("/com/TeamMatrix/PMS/UI_Images/view button.png")));
		bt4.setToolTipText("Click to show");
		bt4.setForeground(new Color(255, 255, 255));
		bt4.setBounds(38, 173, 90, 40);
		panel_6_1_2.add(bt4);
		
		JLabel supportlb = new JLabel("SUPPORT");
		supportlb.setToolTipText("Click here for developers support");
		supportlb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		supportlb.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SupportPage f = new SupportPage();
				f.frame.setVisible(true);
				frame.setState(JFrame.ICONIFIED); 
			}
		});
		supportlb.setForeground(Color.BLUE);
		supportlb.setFont(new Font("Quicksand", Font.BOLD, 15));
		supportlb.setBounds(20, 632, 100, 20);
		frame.getContentPane().add(supportlb);
		
		JLabel supportlb_1 = new JLabel("\u00A9 Team Matrix 2021");
		supportlb_1.setForeground(Color.BLUE);
		supportlb_1.setFont(new Font("Quicksand", Font.BOLD, 12));
		supportlb_1.setBounds(779, 633, 221, 20);
		frame.getContentPane().add(supportlb_1);
	}
}