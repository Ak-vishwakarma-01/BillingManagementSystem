/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author ak_vishwakarma_0
 */
public class home extends javax.swing.JFrame {

	public int z = 0;
    /**
     * Creates new form home
     */
    public home() {
    	
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(162, 242, 205));
        setLocationRelativeTo(null);
        
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        label10.setVisible(false);
        label11.setVisible(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        ImageIcon nextIconPng=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//next.png");
        Image nextImg=nextIconPng.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton1 = new javax.swing.JButton(new ImageIcon(nextImg));
        
        ImageIcon nextIconPng1=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//new costomer.png");
        Image nextImg1=nextIconPng1.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        
        jButton2 = new javax.swing.JButton(new ImageIcon(nextImg1));
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new NewCustomer().setVisible(true);
        	}
        });
      
        ImageIcon nextIconPng2=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//update costomer.png");
        Image nextImg2=nextIconPng2.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        
        jButton3 = new javax.swing.JButton(new ImageIcon(nextImg2));
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new UpdateCustomer().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng3=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//costomer details.png");
        Image nextImg3=nextIconPng3.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);
        
        jButton4 = new javax.swing.JButton(new ImageIcon(nextImg3));
        
        ImageIcon nextIconPng4=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//delete costomer.png");
        Image nextImg4=nextIconPng4.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton5 = new javax.swing.JButton(new ImageIcon(nextImg4));
        jButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new DeleteCustomer().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng5=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//new product.png");
        Image nextImg5=nextIconPng5.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton6 = new javax.swing.JButton(new ImageIcon(nextImg5));
        jButton6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new NewProduct().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng6=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//update product.png");
        Image nextImg6=nextIconPng6.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton7 = new javax.swing.JButton(new ImageIcon(nextImg6));
        jButton7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new UpdateProduct().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng7=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//product details.png");
        Image nextImg7=nextIconPng7.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton8 = new javax.swing.JButton(new ImageIcon(nextImg7));
        jButton8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new ProductDetails().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng8=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//delete product.png");
        Image nextImg8=nextIconPng8.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton9 = new javax.swing.JButton(new ImageIcon(nextImg8));
        jButton9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new DeleteProduct().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng9=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//billing.png");
        Image nextImg9=nextIconPng9.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton10 = new javax.swing.JButton(new ImageIcon(nextImg9));
        jButton10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Billing().setVisible(true);
        	}
        });
        
        ImageIcon nextIconPng10=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//logout.png");
        Image nextImg10=nextIconPng10.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton11 = new javax.swing.JButton(new ImageIcon(nextImg10));
        
        ImageIcon nextIconPng11=new ImageIcon("C://All codes//java code//mavenproject1//src//main//java//com//mycompany//mavenproject1//close.png");
        Image nextImg11=nextIconPng11.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH);

        jButton12 = new javax.swing.JButton(new ImageIcon(nextImg11));

        label1 = new JLabel("new Customer");
        label2 = new JLabel("update Customer");
        label3 = new JLabel("Customer details");
        label4 = new JLabel("delete customer");
        label5 = new JLabel("new product");
        label6 = new JLabel("update product");
        label7 = new JLabel("product details");
        label8 = new JLabel("delete product");
        label9 = new JLabel("Billing");
        label10 = new JLabel("log out");
        label11 = new JLabel("close");


        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(230, 255, 238));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton2ComponentShown(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 16, -1, -1));
        
        

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton3ComponentShown(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton4ComponentShown(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 16, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton5ComponentShown(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 16, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton6ComponentShown(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 16, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton7ComponentShown(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 16, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 204));
        jButton8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton8ComponentShown(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 16, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 204));
        jButton9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton9ComponentShown(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 16, 144, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 204));
        jButton10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton10ComponentShown(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 16, 91, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 204));
        jButton11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton11ComponentShown(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1239, 16, 91, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 204));
        jButton12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jButton12ComponentShown(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1336, 16, 91, -1));
        
        label1.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 110, 20));
        
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, 20));
        
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, 20));
        
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 100, 130, 20));
        
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 110, 20));
        
        label6.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 110, 20));
        
        label7.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 100, 110, 20));
        
        label8.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 110, 20));
        
        label9.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 100, 110, 20));
        
        label10.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 100, 110, 20));
        
        label11.setFont(new Font("Tahoma", Font.BOLD, 14));
        getContentPane().add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 100, 110, 20));
        

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    	new CustomerDetails().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "do you really want to log out","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "do you really want to close this application","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    	if(z==0) {
    		try {
    			Thread.sleep(250);
    			jButton2.setVisible(true);
    			label1.setVisible(true);
    		}catch(Exception e){}
    	}else {
    		jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton10.setVisible(false);
            jButton11.setVisible(false);
            jButton12.setVisible(false);
            
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            z = 0;
    	}
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton2ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton3.setVisible(true);
			label2.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton2ComponentShown

    private void jButton3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton3ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton4.setVisible(true);
			label3.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton3ComponentShown

    private void jButton4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton4ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton5.setVisible(true);
			label4.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton4ComponentShown

    private void jButton5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton5ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton6.setVisible(true);
			label5.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton5ComponentShown

    private void jButton6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton6ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton7.setVisible(true);
			label6.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton6ComponentShown

    private void jButton7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton7ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton8.setVisible(true);
			label7.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton7ComponentShown

    private void jButton8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton8ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton9.setVisible(true);
			label8.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton8ComponentShown

    private void jButton9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton9ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton10.setVisible(true);
			label9.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton9ComponentShown

    private void jButton10ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton10ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton11.setVisible(true);
			label10.setVisible(true);
		}catch(Exception e){}
    }//GEN-LAST:event_jButton10ComponentShown

    private void jButton11ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton11ComponentShown
        // TODO add your handling code here:
    	try {
			Thread.sleep(250);
			jButton12.setVisible(true);
			label11.setVisible(true);
			z=1;
		}catch(Exception e){}
    }//GEN-LAST:event_jButton11ComponentShown

    private void jButton12ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jButton12ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
   
}
