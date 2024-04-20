package com.mycompany.mavenproject1;
import java.sql.*;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import project.ConnectionProvider;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.print.PrinterException;

public class CustomerDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDetails frame = new CustomerDetails();
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
	public CustomerDetails() {
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select *from customer");
//                    table.setModel(DbUtils.resultSetToTableModel(rs));
                                     
                    while (rs.next()) {
                        model.addRow(new Object[]{
                            rs.getString("name"),
                            rs.getString("contactNo"),
                            rs.getString("email"),
                            rs.getString("address"),
                            rs.getString("gender")
                        });
                        table.setModel(model);
                    }
                    
                } catch (Exception ae) {
                    ae.printStackTrace(); 
                }
            }
        });
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
        setLocationRelativeTo(null);
        setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(190, 254, 250));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		ImageIcon nextIconPng = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\delete user.png");
        Image nextImg = nextIconPng.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);

        JLabel lblNewLabel = new JLabel(new ImageIcon(nextImg));
        lblNewLabel.setBounds(131, 10, 80, 80);
        contentPane.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 99, 560, 2);
        getContentPane().add(separator);
        
        JLabel lblNewLabel_1 = new JLabel("Customer Details");
        lblNewLabel_1.setBounds(221, 39, 279, 38);
        lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 28));
        contentPane.add(lblNewLabel_1);
        
        
        String[] columnNames = { "Name", "ContactNo", "Email","Address","Gender"};
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable();
		
		JScrollPane myScroll = new JScrollPane(table);
		myScroll.setBounds(20, 117, 560, 284);
		contentPane.add(myScroll, BorderLayout.CENTER); 
        
		
		
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 411, 560, 2);
        contentPane.add(separator_1);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					boolean print = table.print();
					if(!print) {
						JOptionPane.showMessageDialog(null, "Unable to print");
					}
				} catch (PrinterException e1) {
					
					JOptionPane.showMessageDialog(null, e1);
				}
        	}
        });
        ImageIcon img = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\printer.png");
        Image icon = img.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(icon));
        btnNewButton.setBounds(30, 415, 50, 30);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        
        ImageIcon img1 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\close icon.png");
        Image icon1 = img1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_1.setIcon(new ImageIcon(icon1));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setBounds(460, 418, 110, 28);
        contentPane.add(btnNewButton_1);
	}
}
