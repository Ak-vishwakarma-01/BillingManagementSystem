package com.mycompany.mavenproject1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import project.ConnectionProvider;

import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductDetails extends JFrame {

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
					ProductDetails frame = new ProductDetails();
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
	public ProductDetails() {
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select *from product");
//                    table.setModel(DbUtils.resultSetToTableModel(rs));
                                     
                    while (rs.next()) {
                        model.addRow(new Object[]{
                        	rs.getString("pId"),
                            rs.getString("pName"),
                            rs.getString("price"),
                            rs.getString("description"),
                            rs.getString("activate")
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
        
        contentPane = 	new JPanel();
        contentPane.setBackground(new Color(190, 254, 250));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Product Details");
		lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
        lblNewLabel.setBounds(234, 22, 262, 48);
        contentPane.add(lblNewLabel);
        
        ImageIcon img1 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\product details img.png");
        Image icon1 = img1.getImage().getScaledInstance(150,80,Image.SCALE_SMOOTH);
        JLabel lblNewLabel_2 = new JLabel(new ImageIcon(icon1));
        lblNewLabel_2.setBounds(74, 10, 150, 67);
        contentPane.add(lblNewLabel_2);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 80, 580, 2);
        contentPane.add(separator);
        
        String columnNames[] = {"ProductId", "ProdName", "Price" , "Description", "Activate"};
        model = new DefaultTableModel(columnNames, 0);
        
        
        table = new JTable();
        JScrollPane myScroll = new JScrollPane(table);
		myScroll.setBounds(30, 87, 540, 284);
		contentPane.add(myScroll, BorderLayout.CENTER); 
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 381, 580, 2);
		contentPane.add(separator_1);
		
		ImageIcon img = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\printer.png");
		Image icon = img.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					boolean print = table.print();
					if(!print) {
						JOptionPane.showMessageDialog(null, "Unable to print");
					}
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(icon));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(55, 394, 110, 28);
		contentPane.add(btnNewButton);
		
		ImageIcon img2 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\close icon.png");
        Image icon2 = img2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        JButton btnNewButton_1 = new JButton(new ImageIcon(icon2));
        btnNewButton_1.setText("Close");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setBounds(453, 392, 110, 28);
        contentPane.add(btnNewButton_1);
	}
}
