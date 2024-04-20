package com.mycompany.mavenproject1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import project.ConnectionProvider;

public class DeleteProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProduct frame = new DeleteProduct();
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
	public DeleteProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
		setLocationRelativeTo(null);
        setUndecorated(true);
        
        contentPane = 	new JPanel();
        contentPane.setBackground(new Color(190, 254, 250));
        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Product");
		lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
        lblNewLabel.setBounds(202, 23, 241, 48);
        contentPane.add(lblNewLabel);
        
        ImageIcon img1 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\delete photo.png");
        Image icon1 = img1.getImage().getScaledInstance(120,80,Image.SCALE_SMOOTH);
        JLabel lblNewLabel_2 = new JLabel(new ImageIcon(icon1));
        lblNewLabel_2.setBounds(36, 10, 156, 67);
        contentPane.add(lblNewLabel_2);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 81, 580, 2);
        contentPane.add(separator);
        
        JLabel lblNewLabel_1 = new JLabel("Productd Id");
        lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 14));
        lblNewLabel_1.setBounds(97, 103, 95, 27);
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setFont(new Font("STZhongsong", Font.BOLD, 14));
        textField.setBounds(201, 101, 127, 33);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Search");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String pId = textField.getText();
        		try {
        			Connection con = ConnectionProvider.getCon();
        			Statement stmt = con.createStatement();
        			ResultSet rs = stmt.executeQuery("select *from product where pId='"+pId+"'");
        		    if(rs.next()) {
        		    	textField_1.setText(rs.getString(2));
        		    	textField_2.setText(rs.getString(3));
        		    	textField_3.setText(rs.getString(4));
        		    	textField_4.setText(rs.getString(5));
        		    	textField.setEditable(false);
        		    }else {	
        		    	JOptionPane.showMessageDialog(null, "this Product Id Does not exist");
        		    }
        			
        		}catch(Exception ae) {
        			JOptionPane.showMessageDialog(null, ae);
        		}
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(358, 99, 127, 33);
        ImageIcon img2 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\search icon.png");
        Image icon2 = img2.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(icon2));
        contentPane.add(btnNewButton);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 144, 580, 2);
        contentPane.add(separator_1);
        
        JLabel lblNewLabel_3 = new JLabel("Product Name");
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_3.setBounds(66, 168, 106, 27);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Price");
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_4.setBounds(66, 217, 106, 27);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Description");
        lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_5.setBounds(66, 265, 106, 27);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Activate");
        lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
        lblNewLabel_6.setBounds(66, 314, 106, 27);
        contentPane.add(lblNewLabel_6);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Arial", Font.BOLD, 14));
        textField_1.setBounds(202, 156, 194, 33);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Arial", Font.BOLD, 14));
        textField_2.setBounds(202, 205, 194, 33);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setFont(new Font("Arial", Font.BOLD, 14));
        textField_3.setBounds(202, 253, 194, 33);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setFont(new Font("Arial", Font.BOLD, 14));
        textField_4.setBounds(202, 302, 194, 33);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 350, 580, 2);
        contentPane.add(separator_1_1);
        
        JButton btnNewButton_1 = new JButton("Delete");
        ImageIcon img3 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\delete icon.png");
        Image icon3 = img3.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(icon3));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String pId = textField.getText();
        		try {
        			Connection con = ConnectionProvider.getCon();
        			Statement st = con.createStatement();
        			st.executeUpdate("delete from product where pId='"+pId+"'");
        			setVisible(false);
        			new DeleteProduct().setVisible(true);
        		}catch(Exception ae) {
        			JOptionPane.showMessageDialog(null,ae);
        		}
        	}
        });
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_1.setBounds(66, 387, 106, 33);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new UpdateProduct().setVisible(true);
        	}
        });
        ImageIcon img4 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\reset icon.png");
        Image icon4 = img4.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        btnNewButton_2.setIcon(new ImageIcon(icon4));
        btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_2.setBounds(243, 387, 106, 33);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Close");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        ImageIcon img5 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\close icon.png");
        Image icon5 = img5.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        btnNewButton_3.setIcon(new ImageIcon(icon5));
        btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_3.setBounds(422, 393, 106, 27);
        contentPane.add(btnNewButton_3);
	}

}
