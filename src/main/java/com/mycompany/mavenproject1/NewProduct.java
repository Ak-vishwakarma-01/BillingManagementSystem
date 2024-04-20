package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import project.ConnectionProvider;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class NewProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProductName;
	private JTextField txtPrice;
	private JTextField txtDescription;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewProduct frame = new NewProduct();
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
	public NewProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setUndecorated(true);
        contentPane = 	new JPanel();
        contentPane.setBackground(new Color(190, 254, 250));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New Product");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
        lblNewLabel.setBounds(223, 11, 198, 48);
        contentPane.add(lblNewLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 67, 560, 5);
        getContentPane().add(separator);
        
        
        ImageIcon img1 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\product icon.png");
        Image icon1 = img1.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH);
        JLabel lblNewLabel_2 = new JLabel(new ImageIcon(icon1));
        lblNewLabel_2.setBounds(89, 0, 106, 67);
        contentPane.add(lblNewLabel_2);
        
//        ImageIcon img = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\new mobile.png");
//        Image icon = img.getImage().getScaledInstance(650,450,Image.SCALE_SMOOTH);
//        JLabel lblNewLabel_1 = new JLabel(new ImageIcon(icon));
//        lblNewLabel_1.setBounds(0, 0, 600, 450);
//        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_3 = new JLabel("Product Id");
        lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel_3.setBounds(89, 79, 106, 26);
        contentPane.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("100");
        lblNewLabel_4.setForeground(new Color(0, 0, 255));
        lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel_4.setBounds(228, 82, 36, 26);
        contentPane.add(lblNewLabel_4);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); //java.sql.SQLException: Operation not allowed for a result set of type ResultSet.TYPE_FORWARD_ONLY.
            ResultSet rs = st.executeQuery("select max(pId) from product");
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = Integer.toString(id);
                lblNewLabel_4.setText(str);
            } else {
                lblNewLabel_4.setText("1");
            }
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, e1);
        }

        
        JLabel lblNewLabel_5 = new JLabel("Product Name");
        lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel_5.setBounds(89, 131, 106, 18);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_7 = new JLabel("price");
        lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNewLabel_7.setBounds(89, 174, 93, 18);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_1 = new JLabel("Description");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(89, 217, 93, 16);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_6 = new JLabel("Activate");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_6.setBounds(89, 261, 93, 17);
        contentPane.add(lblNewLabel_6);
        
        txtProductName = new JTextField();
        txtProductName.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtProductName.getText().equals("product name")) {
        			txtProductName.setText("");
        			txtProductName.setForeground(new Color(0,0,0));
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent e) {
        		if(txtProductName.getText().equals("")) {
        			txtProductName.setText("product name");
        			txtProductName.setForeground(new Color(172, 172, 172));
        		}
        	}
        });
        txtProductName.setForeground(new Color(172, 172, 172));
        txtProductName.setText("product name");
        txtProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtProductName.setBounds(223, 129, 198, 24);
        contentPane.add(txtProductName);
        txtProductName.setColumns(10);
        
        txtPrice = new JTextField();
        txtPrice.addFocusListener(new FocusAdapter() {
        	@Override
        	 public void focusGained(FocusEvent e) {
        	        if (txtPrice.getText().equals("price")) {
        	            txtPrice.setText("");
        	            txtPrice.setForeground(Color.BLACK);
        	        }
        	    }
        	    @Override
        	    public void focusLost(FocusEvent e) {
        	        if (txtPrice.getText().isEmpty()) {
        	            txtPrice.setText("price");
        	            txtPrice.setForeground(new Color(172, 172, 172));
        	        }
        	    }
        });
        txtPrice.setForeground(new Color(172, 172, 172));
        txtPrice.setText("price");
        txtPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtPrice.setBounds(223, 172, 198, 24);
        contentPane.add(txtPrice);
        txtPrice.setColumns(10);
        
        
        txtDescription = new JTextField();
        txtDescription.addFocusListener(new FocusAdapter() {
        	@Override
            public void focusGained(FocusEvent e) {
                if (txtDescription.getText().equals("Description")) {
                    txtDescription.setText("");
                    txtDescription.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtDescription.getText().isEmpty()) {
                    txtDescription.setText("Description");
                    txtDescription.setForeground(new Color(172, 172, 172));
                }
            }
        });
        txtDescription.setForeground(new Color(172, 172, 172));
        txtDescription.setText("Description");
        txtDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtDescription.setBounds(223, 214, 198, 24);
        contentPane.add(txtDescription);
        txtDescription.setColumns(10);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
        comboBox.setBounds(223, 261, 198, 21);
        contentPane.add(comboBox);
        
        
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 116, 560, 5);
        contentPane.add(separator_1);
        
        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        ImageIcon img4 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\close icon.png");
        Image icon4 = img4.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton.setIcon(new ImageIcon(icon4));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setBounds(419, 337, 119, 32);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Save");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String pId = lblNewLabel_4.getText();
        		String pName =  txtProductName.getText();
        		String price = txtPrice.getText();
        		String desc = txtDescription.getText();
        		String activate =(String)comboBox.getSelectedItem();
        		try {
        			
        			Connection con = ConnectionProvider.getCon();
        			Statement st = con.createStatement();
        			st.executeUpdate("insert into product values('"+pId+"','"+pName+"','"+price+"','"+desc+"','"+activate+"')");
        			JOptionPane.showMessageDialog(null, "Successfully updated the product");
        			setVisible(false);
        			new NewProduct().setVisible(true);
        		}catch(Exception ex) {
        			JOptionPane.showMessageDialog(null, ex);
        		}
        	}
        });
        btnNewButton_1.setBounds(45, 337, 98, 32);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reset");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new NewProduct().setVisible(true);
        	}
        });
        ImageIcon img3 = new ImageIcon("C:\\All codes\\java code\\mavenproject1\\src\\main\\java\\com\\mycompany\\mavenproject1\\reset icon.png");
        Image icon3 = img3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        btnNewButton_2.setIcon(new ImageIcon(icon3));
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_2.setBounds(240, 337, 119, 32);
        contentPane.add(btnNewButton_2);
        
        JSeparator separator_1_1 = new JSeparator();
        separator_1_1.setBounds(10, 307, 560, 5);
        contentPane.add(separator_1_1);
        
        
	}
}
