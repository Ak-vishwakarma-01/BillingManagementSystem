package com.mycompany.mavenproject1;
import java.sql.*;

import java.util.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import project.ConnectionProvider;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class NewCustomer extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JSeparator separator;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_1;
    private JTextField txtName;
    private JTextField txtContacNu;
    private JTextField txtEmail;
    private JTextField txtAddress;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewCustomer frame = new NewCustomer();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NewCustomer() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
//        setLocationRelativeTo(null);
        setUndecorated(true);
        contentPane = new JPanel(); // Set layout to BoxLayout
        contentPane.setBackground(new Color(190, 254, 250));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        

        ImageIcon nextIconPng = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\customer.png");
        Image nextImg = nextIconPng.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

        lblNewLabel = new JLabel(new ImageIcon(nextImg));
        lblNewLabel.setBounds(131, 20, 70, 70);
        contentPane.add(lblNewLabel);
        

        

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 100, 560, 5);
        getContentPane().add(separator);

        
        lblNewLabel_1 = new JLabel("add customer");
        lblNewLabel_1.setBounds(221, 34, 220, 38);
        lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("name");	
        lblNewLabel_2.setBounds(74, 115, 47, 30);
        lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("contact nu");
        lblNewLabel_3.setBounds(74, 155, 94, 30);
        lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("Email");
        lblNewLabel_4.setBounds(74, 195, 47, 30);
        lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_4);
        
        lblNewLabel_5 = new JLabel("address");
        lblNewLabel_5.setBounds(74, 235, 75, 30);
        lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_5);
        
        lblNewLabel_6 = new JLabel("gender");
        lblNewLabel_6.setBounds(74, 275, 75, 30);
        lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
        contentPane.add(lblNewLabel_6);
        
        txtName = new JTextField();
        txtName.setBounds(199, 115, 250, 30);
        txtName.setForeground(UIManager.getColor("Button.shadow"));
        txtName.setText("Enter name");
        txtName.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtName.setColumns(10);
        txtName.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtName.getText().equals("Enter name")) {
        			txtName.setText("");
        			txtName.setForeground(new Color(0,0,0));
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		    
        	}
        });
        contentPane.add(txtName);
        
        txtContacNu = new JTextField();
        txtContacNu.setBounds(199, 161, 250, 30);
        txtContacNu.setForeground(UIManager.getColor("Button.shadow"));
        txtContacNu.setText("Enter contac nu");
        txtContacNu.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtContacNu.setColumns(10);
        txtContacNu.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtContacNu.getText().equals("Enter contac nu")) {
        			txtContacNu.setText("");
        			txtContacNu.setForeground(new Color(0,0,0));
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		    
        	}
        });
        contentPane.add(txtContacNu);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(199, 201, 250, 30);
        txtEmail.setForeground(UIManager.getColor("Button.shadow"));
        txtEmail.setText("Enter email");
        txtEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtEmail.setColumns(10);
        txtEmail.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtEmail.getText().equals("Enter email")) {
        			txtEmail.setText("");
        			txtEmail.setForeground(new Color(0,0,0));
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		
        	}
        });
        contentPane.add(txtEmail);
        
        txtAddress = new JTextField();
        txtAddress.setBounds(199, 241, 250, 30);
        txtAddress.setForeground(UIManager.getColor("Button.shadow"));
        txtAddress.setText("Enter address");
        txtAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtAddress.setColumns(10);
        txtAddress.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtAddress.getText().equals("Enter address")) {
        			txtAddress.setText("");
        			txtAddress.setForeground(new Color(0,0,0));
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		
        	}
        });
        contentPane.add(txtAddress);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(199, 280, 250, 21);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
        comboBox.setToolTipText("gender");
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(comboBox);
        
        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.setBounds(248, 335, 85, 21);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new NewCustomer().setVisible(true);
        	}
        });
        btnNewButton_1.setForeground(new Color(0, 0, 255));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Close");
        btnNewButton_2.setBounds(402, 335, 85, 21);
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        btnNewButton_2.setForeground(new Color(255, 0, 0));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_4 = new JButton("Save");
        btnNewButton_4.setBounds(74, 335, 85, 21);
        btnNewButton_4.setForeground(new Color(64, 128, 128));
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String name = txtName.getText();
        		String contactNo = txtContacNu.getText();
        		if(contactNo.length() < 10 || !contactNo.matches("\\d+")) {
        		    JOptionPane.showMessageDialog(null, "Entered contact number must have length 10 and consist only of numeric digits");
        		    return;
        		}
        		String email = txtEmail.getText();
        		String address = txtAddress.getText();
        		String gender = (String)comboBox.getSelectedItem();
        		try{
        			Connection con = ConnectionProvider.getCon();
        			Statement st = con.createStatement();
        		    st.executeUpdate("insert into customer values('"+name+"','"+contactNo+"','"+email+"','"+address+"','"+gender+"')");
        		    JOptionPane.showMessageDialog(null, "Updated new Costomer successfully");
        		    setVisible(false);
        		    new NewCustomer().setVisible(true);
        		}catch(Exception ae) {
        			JOptionPane.showMessageDialog(null, "Mobile number already exists. Please enter a new mobile number.");
        	            
        		}
        	}
        });
        contentPane.add(btnNewButton_4);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 315, 560, 5);
        getContentPane().add(separator_1);
        
    }
}

