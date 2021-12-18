package com.TeamMatrix.PMS.UI_Files;

import java.sql.ResultSet;

import javax.swing.JOptionPane;



public class test {
	public static void main(String[] args) {
	try {
	Conn c2 = new Conn();
	
	String q  = "select * from login where username = 'ashik'";

    ResultSet rs = c2.s.executeQuery(q);
    
    if(rs.next()){
    	JOptionPane.showMessageDialog(null, "yes");
        
    }else{
        JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
    }
	}catch(Exception a) {
		System.out.println(a);
	}
	}
}

