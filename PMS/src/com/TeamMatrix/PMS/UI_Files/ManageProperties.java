package com.TeamMatrix.PMS.UI_Files;

import java.awt.EventQueue;



import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class ManageProperties {

	 public JFrame ManagePropertiesF;
	 private JTextField searchtf;
	 private JTextField owneridtf;
	 private JTextField textField;
	 private JTextField textField_1;
	 private JTextField textField_2;
	 private JTextField textField_3;
	 private JTextField textField_4;
	 private JTextField textField_5;
	 private JTextField textField_6;
	 private JTextField tfprice;
	 private JTextField textField_7;
	 private JTextField textField_8;
	 private JTextField textField_9;
	 private JTextField textField_10;
	 private JTextField textField_14;
	 private JTextField textField_16;
	 private JCheckBox chckbxpool;
	 private JTextField sow;
	 private JTextField spr;
	 private JTextField spa;
	 private JTextField sr;
	 private JTextField sadd;
	 private JTextField textField_18;
	 private JTextField sdf;
	 private JTextField sdt;
	 private JTable Shoptable;
	 private JTable Residentialtable;
	 private JTable landtable;
	 
	 // my own veriable
	 
	 String ownerid;
	 String propertyid;
	 String area;
	 String room;
	 String dfrom;
	 String dto;
	 String address;
	 
	 Conn c1 = new Conn();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageProperties window = new ManageProperties();
					window.ManagePropertiesF.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManageProperties() {
		initialize();
		display();
	}
	
	
	public void display() {
		try {
			ResultSet rs = c1.s.executeQuery("select * from shop");
			Shoptable.setModel(DbUtils.resultSetToTableModel(rs));

		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
	JLabel slblimage = new JLabel("");
	
	//Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(slblimage.getWidth(), slblimage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ManagePropertiesF = new JFrame();
		ManagePropertiesF.getContentPane().setBackground(new Color(208,235,250));
		ManagePropertiesF.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>"+"Manage Your Clients <br> Get them listed here"+"</html>");
		lblNewLabel.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/property small icon.png")));
		lblNewLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
		lblNewLabel.setBounds(382, 0, 249, 65);
		ManagePropertiesF.getContentPane().add(lblNewLabel);
		
		JLabel minimizeimglb_1 = new JLabel("");
		minimizeimglb_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		minimizeimglb_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Close icon.png")));
		minimizeimglb_1.setToolTipText("Close");
		minimizeimglb_1.setBounds(955, 11, 35, 30);
		ManagePropertiesF.getContentPane().add(minimizeimglb_1);
		
		JLabel minimizeimglb_1_1 = new JLabel("");
		minimizeimglb_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManagePropertiesF.setVisible(false);
				Dashboard f=new Dashboard();
				f.frame.setVisible(true);
				ManagePropertiesF.dispose();
			
			}
		});
		minimizeimglb_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/back icon.png")));
		minimizeimglb_1_1.setToolTipText("Close");
		minimizeimglb_1_1.setBounds(10, 11, 35, 30);
		ManagePropertiesF.getContentPane().add(minimizeimglb_1_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(10, 69, 980, 620);
		ManagePropertiesF.getContentPane().add(tabbedPane);
		
		JPanel shoprentalp = new JPanel();
		shoprentalp.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		shoprentalp.setBackground(new Color(255, 255, 255));
		shoprentalp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		shoprentalp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Shop Rental", null, shoprentalp, null);
		tabbedPane.setForegroundAt(0, new Color(0, 0, 128));
		shoprentalp.setLayout(null);
		
		JPanel information = new JPanel();
		information.setLayout(null);
		information.setFont(new Font("Quicksand", Font.BOLD, 11));
		information.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
		information.setBackground(Color.WHITE);
		information.setBounds(21, 52, 774, 319);
		shoprentalp.add(information);
		
		JLabel owneridlb_1_1 = new JLabel("Owner ID:");
		owneridlb_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		owneridlb_1_1.setBounds(26, 38, 108, 14);
		information.add(owneridlb_1_1);
		
		sow = new JTextField();
		sow.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		sow.setColumns(10);
		sow.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		sow.setBounds(152, 35, 168, 23);
		information.add(sow);
		
		spr = new JTextField();
		spr.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		spr.setColumns(10);
		spr.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		spr.setBounds(150, 69, 168, 23);
		information.add(spr);
		
		JLabel Pnamelb_1_1 = new JLabel("Property ID:");
		Pnamelb_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Pnamelb_1_1.setBounds(25, 77, 99, 14);
		information.add(Pnamelb_1_1);
		
		spa = new JTextField();
		spa.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		spa.setColumns(10);
		spa.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		spa.setBounds(150, 103, 168, 23);
		information.add(spa);
		
		JLabel buildingnolb_1_1 = new JLabel("Property Area:");
		buildingnolb_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		buildingnolb_1_1.setBounds(25, 113, 99, 14);
		information.add(buildingnolb_1_1);
		
		sr = new JTextField();
		sr.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		sr.setColumns(10);
		sr.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		sr.setBounds(150, 140, 168, 23);
		information.add(sr);
		
		JLabel Roomslb_1_1 = new JLabel("Rooms:");
		Roomslb_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb_1_1.setBounds(26, 152, 99, 14);
		information.add(Roomslb_1_1);
		
		JLabel lblAddress_1_1 = new JLabel("Address:");
		lblAddress_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblAddress_1_1.setBounds(389, 11, 74, 14);
		information.add(lblAddress_1_1);
		
		sadd = new JTextField();
		sadd.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		sadd.setColumns(10);
		sadd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		sadd.setAlignmentY(0.0f);
		sadd.setAlignmentX(0.0f);
		sadd.setBounds(473, 14, 168, 64);
		information.add(sadd);
		
		JLabel lblpImage_1_1 = new JLabel("Image:");
		lblpImage_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblpImage_1_1.setBounds(389, 102, 74, 23);
		information.add(lblpImage_1_1);
		
		
		slblimage.setBounds(474, 95, 273, 165);
		information.add(slblimage);
		
		JButton sbrowse = new JButton("");
		sbrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
		         fileChooser.addChoosableFileFilter(filter);
		         int result = fileChooser.showSaveDialog(null);
		         String s = null;
				if(result == JFileChooser.APPROVE_OPTION){
		             File selectedFile = fileChooser.getSelectedFile();
		             String path = selectedFile.getAbsolutePath();
		             slblimage.setIcon(ResizeImage(path));
		             s = path;
		              }
		         else if(result == JFileChooser.CANCEL_OPTION){
		             System.out.println("No Data");
		         }

		try{
		        	   
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
		               PreparedStatement ps = con2.prepareStatement("insert into image values(?,?)");
		               InputStream is = new FileInputStream(new File(s));
		               ps.setString(1, spr.getText());
		  
		               ps.setBlob(2,is);
		               ps.executeUpdate();
		               JOptionPane.showMessageDialog(null, "Data Inserted");
		           }catch(Exception ex){
		               ex.printStackTrace();
		           }	
				
			}
		});
		sbrowse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sbrowse.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Browse button.png")));
		sbrowse.setBorder(null);
		sbrowse.setBackground(Color.WHITE);
		sbrowse.setBounds(484, 271, 108, 38);
		information.add(sbrowse);
		
		JLabel Roomslb_1_1_1 = new JLabel("Date(from):");
		Roomslb_1_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb_1_1_1.setBounds(27, 194, 99, 14);
		information.add(Roomslb_1_1_1);
		
		sdf = new JTextField();
		sdf.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		sdf.setColumns(10);
		sdf.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		sdf.setBounds(149, 185, 168, 23);
		information.add(sdf);
		
		sdt = new JTextField();
		sdt.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		sdt.setColumns(10);
		sdt.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		sdt.setBounds(150, 234, 168, 23);
		information.add(sdt);
		
		JLabel Roomslb_1_1_1_1 = new JLabel("Date(To):");
		Roomslb_1_1_1_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb_1_1_1_1.setBounds(26, 246, 99, 14);
		information.add(Roomslb_1_1_1_1);
		
		JButton sview = new JButton("");
		sview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
	                
	                ResultSet rs1 = c1.s.executeQuery("select * from image where propertyid = '"+spr.getText()+"'");
	                if(rs1.next()){
	                    byte[] img = rs1.getBytes("Image");



	                    //Resize The ImageIcon
	                    ImageIcon image = new ImageIcon(img);
	                    Image im = image.getImage();
	                    Image myImg = im.getScaledInstance(slblimage.getWidth(), slblimage.getHeight(),Image.SCALE_SMOOTH);
	                    ImageIcon newImage = new ImageIcon(myImg);
	                    slblimage.setIcon(newImage);
	                }
	                
	                else{
	                    JOptionPane.showMessageDialog(null, "No Data");
	                }
	            }catch(Exception ex){
	                ex.printStackTrace();
	            }
			}
		});
		sview.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/view button.png")));
		sview.setBorder(null);
		sview.setBackground(Color.WHITE);
		sview.setBounds(602, 271, 108, 38);
		information.add(sview);
		
		textField_18 = new JTextField();
		textField_18.setToolTipText("Search properties by proprty id here");
		textField_18.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_18.setColumns(10);
		textField_18.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_18.setBackground(new Color(243, 229, 229));
		textField_18.setBounds(222, 16, 313, 25);
		shoprentalp.add(textField_18);
		
		JLabel minimizeimglb_1_1_1_1_1 = new JLabel("");
		minimizeimglb_1_1_1_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/search.png")));
		minimizeimglb_1_1_1_1_1.setToolTipText("Close");
		minimizeimglb_1_1_1_1_1.setBounds(544, 11, 35, 30);
		shoprentalp.add(minimizeimglb_1_1_1_1_1);
		
		JButton resetbt_2_1 = new JButton("");
		resetbt_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		resetbt_2_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Reset button.png")));
		resetbt_2_1.setBorder(null);
		resetbt_2_1.setBackground(Color.WHITE);
		resetbt_2_1.setBounds(822, 256, 108, 38);
		shoprentalp.add(resetbt_2_1);
		
		JButton updatebt_1_1 = new JButton("");
		updatebt_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		updatebt_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Update Button.png")));
		updatebt_1_1.setBorder(null);
		updatebt_1_1.setBackground(Color.WHITE);
		updatebt_1_1.setBounds(822, 205, 108, 38);
		shoprentalp.add(updatebt_1_1);
		
		JButton deletebt_1_1 = new JButton("");
		deletebt_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		deletebt_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Delete Button.png")));
		deletebt_1_1.setBorder(null);
		deletebt_1_1.setBackground(Color.WHITE);
		deletebt_1_1.setBounds(821, 150, 108, 38);
		shoprentalp.add(deletebt_1_1);
		
		JButton addbt_1_1 = new JButton("");
		addbt_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ownerid = sow.getText();
				propertyid = spr.getText();
				area = spa.getText();
				room = sr.getText();
				dfrom = sdf.getText();
				dto = sdt.getText();
				address = sadd.getText();
				
				try {
					String q = "insert into shop values ('"+ownerid+"','"+propertyid+"','"+area+"','"+room+"','"+dfrom+"','"+dto+"','"+address+"')";
					c1.s.executeUpdate(q);
				}catch(Exception ex) {
					System.out.println(ex);
				}
				display();
				
			}
		});
		addbt_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addbt_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Add.png")));
		addbt_1_1.setBorder(null);
		addbt_1_1.setBackground(Color.WHITE);
		addbt_1_1.setBounds(822, 95, 108, 38);
		shoprentalp.add(addbt_1_1);
		
		JScrollPane ShoptbscrollPane = new JScrollPane();
		ShoptbscrollPane.setBounds(21, 392, 899, 189);
		shoprentalp.add(ShoptbscrollPane);
		
		Shoptable = new JTable();
		Shoptable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel f =(DefaultTableModel)Shoptable.getModel();
				   int p =Shoptable.getSelectedRow();
				   
				   sow.setText(f.getValueAt(p, 0).toString());
				   spr.setText(f.getValueAt(p, 1).toString());
				   spa.setText(f.getValueAt(p, 2).toString());
				   sr.setText(f.getValueAt(p, 3).toString());
				   sdf.setText(f.getValueAt(p, 4).toString());
				   sdt.setText(f.getValueAt(p, 5).toString());
				   sadd.setText(f.getValueAt(p, 6).toString());
			}
		});
		Shoptable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"OwnID", "PropertyID", "Area", "Rooms", "D.From", "D.To", "Address"
			}
		));
		ShoptbscrollPane.setViewportView(Shoptable);
		tabbedPane.setBackgroundAt(0, new Color(233, 196, 106));
		
		JPanel Residentialp = new JPanel();
		Residentialp.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		Residentialp.setBackground(new Color(255, 255, 255));
		Residentialp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		Residentialp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tabbedPane.addTab("Residential", null, Residentialp, null);
		tabbedPane.setBackgroundAt(1, new Color(231,111,81));
		tabbedPane.setForegroundAt(1, new Color(0, 0, 139));
		Residentialp.setLayout(null);
		
		searchtf = new JTextField();
		searchtf.setBackground(new Color(243,229,229));
		searchtf.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		searchtf.setToolTipText("Search properties by proprty id here");
		searchtf.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		searchtf.setBounds(247, 10, 313, 25);
		Residentialp.add(searchtf);
		searchtf.setColumns(10);
		
		JPanel insiderp = new JPanel();
		insiderp.setFont(new Font("Quicksand", Font.BOLD, 11));
		insiderp.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
		insiderp.setBackground(Color.WHITE);
		insiderp.setBounds(24, 46, 774, 336);
		Residentialp.add(insiderp);
		insiderp.setLayout(null);
		
		JLabel owneridlb = new JLabel("Owner ID:");
		owneridlb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		owneridlb.setBounds(14, 29, 74, 14);
		insiderp.add(owneridlb);
		
		owneridtf = new JTextField();
		owneridtf.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		owneridtf.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		owneridtf.setBounds(123, 20, 168, 23);
		insiderp.add(owneridtf);
		owneridtf.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(123, 54, 168, 23);
		insiderp.add(textField);
		
		JLabel Pnamelb = new JLabel("Property ID:");
		Pnamelb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Pnamelb.setBounds(14, 63, 99, 14);
		insiderp.add(Pnamelb);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBounds(123, 88, 168, 23);
		insiderp.add(textField_1);
		
		JLabel buildingnolb = new JLabel("Building No:");
		buildingnolb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		buildingnolb.setBounds(14, 97, 99, 14);
		insiderp.add(buildingnolb);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBounds(123, 121, 168, 23);
		insiderp.add(textField_2);
		
		JLabel Roomslb = new JLabel("Rooms:");
		Roomslb.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb.setBounds(14, 130, 99, 14);
		insiderp.add(Roomslb);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBounds(123, 155, 168, 23);
		insiderp.add(textField_3);
		
		JLabel lblBathrooms = new JLabel("Bathrooms:");
		lblBathrooms.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblBathrooms.setBounds(14, 164, 74, 14);
		insiderp.add(lblBathrooms);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBounds(123, 189, 168, 23);
		insiderp.add(textField_4);
		
		JLabel lblBelcony = new JLabel("Belcony:");
		lblBelcony.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblBelcony.setBounds(14, 198, 74, 14);
		insiderp.add(lblBelcony);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_5.setBounds(123, 223, 168, 23);
		insiderp.add(textField_5);
		
		JLabel lblKitchen = new JLabel("Kitchen:");
		lblKitchen.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblKitchen.setBounds(14, 232, 74, 14);
		insiderp.add(lblKitchen);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblAddress.setBounds(14, 263, 74, 14);
		insiderp.add(lblAddress);
		
		textField_6 = new JTextField();
		textField_6.setAlignmentY(Component.TOP_ALIGNMENT);
		textField_6.setAlignmentX(Component.LEFT_ALIGNMENT);
		textField_6.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_6.setBounds(123, 261, 168, 64);
		insiderp.add(textField_6);
		
		chckbxpool = new JCheckBox("Swimming pool");
		chckbxpool.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		chckbxpool.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxpool.setBackground(Color.WHITE);
		chckbxpool.setBounds(442, 20, 114, 23);
		insiderp.add(chckbxpool);
		
		JCheckBox chckbxBackyard = new JCheckBox("Backyard");
		chckbxBackyard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxBackyard.setBackground(Color.WHITE);
		chckbxBackyard.setBounds(558, 20, 97, 23);
		insiderp.add(chckbxBackyard);
		
		JCheckBox chckbxGarage = new JCheckBox("Garage");
		chckbxGarage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chckbxGarage.setBackground(Color.WHITE);
		chckbxGarage.setBounds(657, 20, 97, 23);
		insiderp.add(chckbxGarage);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblPrice.setBounds(442, 63, 74, 14);
		insiderp.add(lblPrice);
		
		tfprice = new JTextField();
		tfprice.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		tfprice.setColumns(10);
		tfprice.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		tfprice.setBounds(526, 54, 168, 23);
		insiderp.add(tfprice);
		
		JLabel lblpImage = new JLabel("Image:");
		lblpImage.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblpImage.setBounds(442, 98, 74, 23);
		insiderp.add(lblpImage);
		
		JLabel lblimage = new JLabel("");
		lblimage.setBounds(526, 92, 183, 154);
		insiderp.add(lblimage);
		
		JButton resetbt_1 = new JButton("");
		resetbt_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Browse button.png")));
		resetbt_1.setBorder(null);
		resetbt_1.setBackground(Color.WHITE);
		resetbt_1.setBounds(569, 282, 108, 38);
		insiderp.add(resetbt_1);
		
		JLabel minimizeimglb_1_1_1 = new JLabel("");
		minimizeimglb_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minimizeimglb_1_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/search.png")));
		minimizeimglb_1_1_1.setToolTipText("Close");
		minimizeimglb_1_1_1.setBounds(570, 9, 35, 30);
		Residentialp.add(minimizeimglb_1_1_1);
		
		JButton addbt = new JButton("");
		addbt.setBorder(null);
		addbt.setBackground(Color.WHITE);
		addbt.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Add.png")));
		addbt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addbt.setBounds(837, 49, 108, 38);
		Residentialp.add(addbt);
		
		JButton deletebt = new JButton("");
		deletebt.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Delete Button.png")));
		deletebt.setBorder(null);
		deletebt.setBackground(Color.WHITE);
		deletebt.setBounds(836, 104, 108, 38);
		Residentialp.add(deletebt);
		
		JButton updatebt = new JButton("");
		updatebt.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Update Button.png")));
		updatebt.setBorder(null);
		updatebt.setBackground(Color.WHITE);
		updatebt.setBounds(838, 159, 108, 38);
		Residentialp.add(updatebt);
		
		JButton resetbt = new JButton("");
		resetbt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		resetbt.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Reset button.png")));
		resetbt.setBorder(null);
		resetbt.setBackground(Color.WHITE);
		resetbt.setBounds(837, 210, 108, 38);
		Residentialp.add(resetbt);
		
		JScrollPane ResidentialtbscrollPane = new JScrollPane();
		ResidentialtbscrollPane.setBounds(24, 393, 921, 188);
		Residentialp.add(ResidentialtbscrollPane);
		
		Residentialtable = new JTable();
		ResidentialtbscrollPane.setViewportView(Residentialtable);
		
		JPanel landp = new JPanel();
		landp.setFont(new Font("Quicksand Medium", Font.PLAIN, 13));
		landp.setBackground(new Color(255, 255, 255));
		landp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		landp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		tabbedPane.addTab("Land", null, landp, null);
		tabbedPane.setForegroundAt(2, new Color(0, 0, 128));
		tabbedPane.setBackgroundAt(2, new Color(42,157,143));
		landp.setLayout(null);
		
		textField_16 = new JTextField();
		textField_16.setToolTipText("Search properties by proprty id here");
		textField_16.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_16.setColumns(10);
		textField_16.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_16.setBackground(new Color(243, 229, 229));
		textField_16.setBounds(263, 10, 313, 25);
		landp.add(textField_16);
		
		JLabel minimizeimglb_1_1_1_1 = new JLabel("");
		minimizeimglb_1_1_1_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/search.png")));
		minimizeimglb_1_1_1_1.setToolTipText("Close");
		minimizeimglb_1_1_1_1.setBounds(585, 5, 35, 30);
		landp.add(minimizeimglb_1_1_1_1);
		
		JPanel insiderp_1 = new JPanel();
		insiderp_1.setBounds(26, 46, 774, 336);
		landp.add(insiderp_1);
		insiderp_1.setLayout(null);
		insiderp_1.setFont(new Font("Quicksand", Font.BOLD, 11));
		insiderp_1.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 102)));
		insiderp_1.setBackground(Color.WHITE);
		
		JLabel owneridlb_1 = new JLabel("Owner ID:");
		owneridlb_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		owneridlb_1.setBounds(26, 38, 108, 14);
		insiderp_1.add(owneridlb_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_7.setBounds(152, 35, 168, 23);
		insiderp_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_8.setBounds(150, 69, 168, 23);
		insiderp_1.add(textField_8);
		
		JLabel Pnamelb_1 = new JLabel("Property ID:");
		Pnamelb_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Pnamelb_1.setBounds(25, 77, 99, 14);
		insiderp_1.add(Pnamelb_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_9.setBounds(150, 103, 168, 23);
		insiderp_1.add(textField_9);
		
		JLabel buildingnolb_1 = new JLabel("Property Area:");
		buildingnolb_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		buildingnolb_1.setBounds(25, 113, 99, 14);
		insiderp_1.add(buildingnolb_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_10.setBounds(150, 136, 168, 23);
		insiderp_1.add(textField_10);
		
		JLabel Roomslb_1 = new JLabel("price:");
		Roomslb_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		Roomslb_1.setBounds(26, 148, 99, 14);
		insiderp_1.add(Roomslb_1);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblAddress_1.setBounds(25, 192, 74, 14);
		insiderp_1.add(lblAddress_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 12));
		textField_14.setColumns(10);
		textField_14.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_14.setAlignmentY(0.0f);
		textField_14.setAlignmentX(0.0f);
		textField_14.setBounds(152, 192, 168, 64);
		insiderp_1.add(textField_14);
		
		JLabel lblpImage_1 = new JLabel("Image:");
		lblpImage_1.setFont(new Font("Quicksand SemiBold", Font.PLAIN, 13));
		lblpImage_1.setBounds(395, 47, 74, 23);
		insiderp_1.add(lblpImage_1);
		
		JLabel lblimage_1 = new JLabel("");
		lblimage_1.setBounds(474, 32, 273, 228);
		insiderp_1.add(lblimage_1);
		
		JButton browsebt_1 = new JButton("");
		browsebt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		browsebt_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Browse button.png")));
		browsebt_1.setBorder(null);
		browsebt_1.setBackground(Color.WHITE);
		browsebt_1.setBounds(547, 270, 108, 38);
		insiderp_1.add(browsebt_1);
		
		JButton resetbt_2 = new JButton("");
		resetbt_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		resetbt_2.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Reset button.png")));
		resetbt_2.setBorder(null);
		resetbt_2.setBackground(Color.WHITE);
		resetbt_2.setBounds(831, 250, 108, 38);
		landp.add(resetbt_2);
		
		JButton updatebt_1 = new JButton("");
		updatebt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		updatebt_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Update Button.png")));
		updatebt_1.setBorder(null);
		updatebt_1.setBackground(Color.WHITE);
		updatebt_1.setBounds(831, 199, 108, 38);
		landp.add(updatebt_1);
		
		JButton deletebt_1 = new JButton("");
		deletebt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		deletebt_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Delete Button.png")));
		deletebt_1.setBorder(null);
		deletebt_1.setBackground(Color.WHITE);
		deletebt_1.setBounds(830, 144, 108, 38);
		landp.add(deletebt_1);
		
		JButton addbt_1 = new JButton("");
		addbt_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addbt_1.setIcon(new ImageIcon(ManageProperties.class.getResource("/com/TeamMatrix/PMS/UI_Images/Add.png")));
		addbt_1.setBorder(null);
		addbt_1.setBackground(Color.WHITE);
		addbt_1.setBounds(831, 89, 108, 38);
		landp.add(addbt_1);
		
		JScrollPane LandtbscrollPane = new JScrollPane();
		LandtbscrollPane.setBounds(26, 393, 913, 188);
		landp.add(LandtbscrollPane);
		
		landtable = new JTable();
		LandtbscrollPane.setViewportView(landtable);
		ManagePropertiesF.setBounds(100, 100, 1000, 700);
		ManagePropertiesF.setLocationRelativeTo(null);
		ManagePropertiesF.setUndecorated(true);
		ManagePropertiesF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}