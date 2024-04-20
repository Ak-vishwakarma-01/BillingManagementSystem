package com.mycompany.mavenproject1;
import java.sql.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateCustomer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer frame = new UpdateCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setUndecorated(true);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(190, 254, 250));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        ImageIcon nextIconPng = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\update customer1.png");
        Image nextImg = nextIconPng.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JLabel lblNewLabel = new JLabel(new ImageIcon(nextImg));
        lblNewLabel.setBounds(117, 10, 99, 93);
        contentPane.add(lblNewLabel);
        
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 106, 560, 5);
        getContentPane().add(separator);
        
        JLabel lblNewLabel_1 = new JLabel("Update Customer");
        lblNewLabel_1.setBounds(226, 47, 276, 38);
        lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Contact No");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setBounds(53, 119, 89, 28);
        contentPane.add(lblNewLabel_2);
        
        textField = new JTextField();
        textField.setBounds(167, 117, 250, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Search");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try{
        			Connection con = ConnectionProvider.getCon();
        			Statement st = con.createStatement();
        			ResultSet rs = st.executeQuery("select *from customer where contactNo='"+ textField.getText()+"'");
        			if(rs.next()) {
        				textField_1.setText(rs.getString(1));
        				textField_3.setText(rs.getString(2));
        				textField_4.setText(rs.getString(3));
        				textField_2.setText(rs.getString(4));
        				textField_5.setText(rs.getString(5));	
        				textField.setEditable(false); 
        				
        			}else {
        				JOptionPane.showMessageDialog(null, "Given Contact Doesn't exit in the Statemnt Bill");
        			}
        		}catch(Exception ae) {
        			JOptionPane.showMessageDialog(null, ae);
        		}
        	}
        });
        ImageIcon img1 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\search icon.png");
        Image icon1 = img1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(icon1));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(450, 121, 116, 28);
        contentPane.add(btnNewButton);
        
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 159, 560, 5);
        contentPane.add(separator_1);
        
        JLabel lblNewLabel_3 = new JLabel("name");	
        lblNewLabel_3.setBounds(67, 180, 47, 30);
        lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("contact nu");
        lblNewLabel_4.setBounds(67, 263, 94, 30);
        lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Email");
        lblNewLabel_5.setBounds(67, 303, 47, 30);
        lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("address");
        lblNewLabel_6.setBounds(67, 220, 75, 30);
        lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("gender");
        lblNewLabel_7.setBounds(67, 338, 75, 30);
        lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_7);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_1.setBounds(201, 188, 250, 30);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_2.setBounds(201, 228, 250, 30);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_3.setBounds(201, 271, 250, 30);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_4.setBounds(201, 311, 250, 30);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
        textField_5.setBounds(201, 346, 250, 30);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 386, 560, 5);
        contentPane.add(separator_1_1);
        
        JButton btnNewButton_1 = new JButton("Update");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String contactNo1 = textField.getText();
        		String name = textField_1.getText();
        		String address = textField_2.getText();
        		String contactNo = textField_3.getText();
        		String email = textField_4.getText();
        		String gender= textField_5.getText();
        		try {
        			Connection con = ConnectionProvider.getCon();
        			Statement st = con.createStatement();
        			st.executeUpdate("update customer set name='"+name+"',contactNo='"+contactNo+"',email='"+email+"',address='"+address+"',gender='"+gender+"'where contactNo='"+contactNo1+"'");
        		    JOptionPane.showMessageDialog(null, "Succesfully updated the Contact nu");
        		    setVisible(false);
        		    new UpdateCustomer().setVisible(true);
        		}catch(Exception ae){
        			JOptionPane.showMessageDialog(null, ae);
        		}
        		
        	}
        });
        ImageIcon img2 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\update icon.png");
        Image icon2 = img2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(icon2));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setBounds(57, 407, 116, 28);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new UpdateCustomer().setVisible(true);
        	}
        });
        ImageIcon img3 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\reset icon.png");
        Image icon3 = img3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_2.setIcon(new ImageIcon(icon3));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_2.setBounds(241, 407, 116, 28);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Close");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        ImageIcon img4 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\close icon.png");
        Image icon4 = img4.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_3.setIcon(new ImageIcon(icon4));
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_3.setBounds(417, 407, 116, 28);
        contentPane.add(btnNewButton_3);
	}

}
