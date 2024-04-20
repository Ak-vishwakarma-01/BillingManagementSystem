package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.*;
import java.time.*;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import project.ConnectionProvider;

public class Billing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	
	LocalDate dt = LocalDate.now();
	private boolean running = true;
	
	private JLabel lblNewLabel_5;
	
	private void updateTimeLabel(){
	    while(running) {
	        LocalTime tm = LocalTime.now();
	        try {
	            Thread.sleep(1000);
	            lblNewLabel_5.setText(tm.getHour() + ":" + tm.getMinute() + ":" + tm.getSecond());
	        } catch(Exception ac) {
	            JOptionPane.showMessageDialog(null, "there is an error in your local time that is: " + ac);
	        }
	    }
	}
	
	private int finalTotal = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,600);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 251, 191));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		ImageIcon img = new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//bill img.png");
		Image icon = img.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(icon));
		lblNewLabel.setBounds(38, 10, 93, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Billing ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel_1.setBounds(153, 21, 239, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(607, 44, 57, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Time :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(607, 83, 57, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(671, 42, 133, 29);
		lblNewLabel_4.setText(dt.getDayOfMonth()+"-"+dt.getMonthValue()+"-"+dt.getYear());
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(671, 81, 133, 29);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 120, 1180, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("Customer Details");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(20, 130, 160, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(20, 170, 45, 24);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(89, 167, 139, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("contactNo");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(244, 170, 85, 24);
		contentPane.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contact = textField_1.getText();
				if(contact.length()>10 || !contact.matches("\\d+")) {
					JOptionPane.showMessageDialog(null, "Enter the correct contact NO: ");
					return;
				}
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select *from customer where contactNo like '"+contact+"%'");
					if(rs.next()) {
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(5));
					}else {
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
					}
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setBounds(342, 169, 133, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("email");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(496, 170, 45, 24);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setBounds(563, 169, 147, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("address");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(720, 170, 67, 24);
		contentPane.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setBounds(797, 169, 178, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Gender");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(985, 170, 56, 24);
		contentPane.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setBounds(1051, 169, 106, 27);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 205, 1180, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Product Details");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6_1.setBounds(20, 217, 160, 27);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Product Id");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(20, 257, 85, 24);
		contentPane.add(lblNewLabel_7_1);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pId = textField_5.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select *from product where pId like '"+pId+"%'");
					if(rs.next()) {
						
						textField_5.setText(rs.getString(1));
						textField_6.setText(rs.getString(2));
						textField_7.setText(rs.getString(3));
						textField_8.setText("1");
						textField_9.setText(rs.getString(4));
					}else {
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
					}
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(132, 254, 139, 27);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_8_1 = new JLabel("Product Name");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8_1.setBounds(281, 257, 111, 24);
		contentPane.add(lblNewLabel_8_1);
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pname = textField_6.getText();
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select *from product where Pname like '"+Pname+"%'");
					if(rs.next()) {
						
						textField_5.setText(rs.getString(1));
						textField_6.setText(rs.getString(2));
						textField_7.setText(rs.getString(3));
						textField_8.setText("1");
						textField_9.setText(rs.getString(4));
					}else {
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
					}
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setColumns(10);
		textField_6.setBounds(408, 256, 133, 27);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_9_1 = new JLabel("Price");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9_1.setBounds(555, 257, 45, 24);
		contentPane.add(lblNewLabel_9_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_7.setColumns(10);
		textField_7.setBounds(610, 256, 100, 27);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_10_1 = new JLabel("Quantity");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(720, 257, 67, 24);
		contentPane.add(lblNewLabel_10_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_8.setColumns(10);
		textField_8.setBounds(797, 256, 45, 27);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_11_1 = new JLabel("Description");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11_1.setBounds(870, 257, 85, 24);
		contentPane.add(lblNewLabel_11_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_9.setColumns(10);
		textField_9.setBounds(965, 256, 192, 27);
		contentPane.add(textField_9);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 337, 1180, 2);
		contentPane.add(separator_1_1);
		
		ImageIcon img1 = new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//add user.png");
		Image icon1 = img1.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setIcon(new ImageIcon(icon1));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int price = Integer.parseInt(textField_7.getText());
				int quantity = Integer.parseInt(textField_8.getText());
				int total = price*quantity;
				finalTotal += total;
				DefaultTableModel model1 = (DefaultTableModel)table.getModel();
				model1.addRow(new Object[] {textField_6.getText(), textField_9.getText(), price, quantity, total});
				textField_10.setText(Integer.toString(finalTotal));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(1057, 293, 100, 34);
		contentPane.add(btnNewButton);
		
		String columns[] = {"Name", "Description","Rate","Quantity","Total"};
		model =  new DefaultTableModel(columns,0);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		scroll.setBounds(10, 344, 710, 246);
		contentPane.add(scroll);
		
		JLabel lblNewLabel_12 = new JLabel("Calculation Details");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setBounds(730, 351, 198, 29);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Total");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(742, 419, 45, 28);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Paid Amount");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_14.setBounds(742, 487, 100, 28);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Reuturned Amount");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_15.setBounds(742, 550, 147, 28);
		contentPane.add(lblNewLabel_15);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_10.setBounds(888, 416, 187, 31);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int z = Integer.parseInt(textField_10.getText());
				textField_12.setText(Integer.toString(Integer.parseInt(textField_11.getText())-z));
				textField_12.setEditable(false);
				textField_11.setEditable(false);
				textField_10.setEditable(false);
			}
		});
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_11.setBounds(888, 484, 187, 31);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_12.setBounds(888, 547, 187, 31);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		ImageIcon img2 = new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//printer.png");
		Image icon2 = img2.getImage().getScaledInstance(20,30,Image.SCALE_SMOOTH);
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String contactNo =textField_1.getText();
				String email = textField_2.getText();
				String address = textField_3.getText();
				String path = "D:\\";
				com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
				try {
					PdfWriter.getInstance(doc, new FileOutputStream(path+""+name+" "+lblNewLabel_4.getText()+".pdf"));
					doc.open();
					Paragraph paragraph1 = new Paragraph("                                         Billing Management System \n                             Contact Number:(+91)7518199429\n\n");
					doc.add(paragraph1);
					Paragraph paragraph2 = new Paragraph("Date: "+lblNewLabel_4.getText()+"  Time: "+lblNewLabel_5.getText()+"\n Customer Details:\nNmae:"+name+"\nContactNO:"+contactNo+"\nEmail:"+email+"\nAddress:"+address+"\n\n");
				    doc.add(paragraph2);
				    PdfPTable tbl1 = new PdfPTable(4);
				    tbl1.addCell("name");
				    tbl1.addCell("Description");
				    tbl1.addCell("Price");
				    tbl1.addCell("Quantity");
				    for(int i=0; i < table.getRowCount(); i++) {
				        String n = table.getValueAt(i, 0).toString();
				        String d = table.getValueAt(i, 1).toString();
				        String p = table.getValueAt(i, 3).toString();  
				        String q = table.getValueAt(i, 2).toString();
				        tbl1.addCell(n);
				        tbl1.addCell(d);
				        tbl1.addCell(p);
				        tbl1.addCell(q);
				    }
				    doc.add(tbl1);
				    Paragraph paragraph3 = new Paragraph("\nTotal:"+textField_10.getText()+"\nAmount:"+textField_11.getText()+"\nReturn amoun:"+textField_12.getText()+"\n\nThank you for visiting: Please come again");
				    doc.add(paragraph3);
				    doc.close();
				    JOptionPane.showMessageDialog(null, "Bill Generated");
				    setVisible(false);
				    new Billing().setVisible(true);
				}catch(Exception ae) {
					JOptionPane.showMessageDialog(null, ae);
				}
			}
		});
		btnSave.setIcon(new ImageIcon(icon2));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(1090, 413, 100, 34);
		contentPane.add(btnSave);
		
		ImageIcon img3 = new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//reset icon.png");
		Image icon3 = img3.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Billing().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon(icon3));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(1090, 484, 100, 34);
		contentPane.add(btnReset);
		
		ImageIcon img4 = new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//close icon.png");
		Image icon4 = img4.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
		JButton btnClose = new JButton("Close");
		btnClose.setIcon(new ImageIcon(icon4));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.setBounds(1090, 544, 100, 34);
		contentPane.add(btnClose);
		
		new Thread(() -> {
		    updateTimeLabel();
		}).start();
		
		/*
		 Using new Thread(() -> { updateTimeLabel(); }).start(); creates a new thread that executes the updateTimeLabel() method. This is done to prevent the GUI from freezing while waiting for the updateTimeLabel() method to complete.

		 If you were calling updateTimeLabel() directly from the constructor without starting a new thread, it would run synchronously within the main GUI thread. This could potentially freeze the GUI until the updateTimeLabel() method finishes executing, which is not desirable because it would prevent the GUI from being responsive to user interactions.
		 */
	}

}
