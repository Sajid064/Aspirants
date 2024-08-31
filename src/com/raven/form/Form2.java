/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import Login.GetID;
import University.Jconnection;
import javax.swing.JScrollBar;
import scrollbar.ScrollBarCustom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SAJID
 */
public class Form2 extends javax.swing.JPanel {
    
    
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    /**
     * Creates new form Form2
     */
    public Form2() throws SQLException {
        initComponents();
        System.out.println("id ="+GetID.ID);
        conn=Jconnection.CC();
        
        String[] arr=new String[]{"Name","Email","Phone","Day","Month","Year","Age","Country","Username","Gender","curr_study_lvl","curr_location","pref_area_study","pref_dest","ssc_gpa","hsc_gpa","msc_cg","ssc_school","ssc_year","hsc_school","hsc_year","bsc_uni","bsc_year","msc_uni","msc_year","ielts","toefl","gre","sat","pref_year","bsc_cg","pref_study_lvl","ssc_dept","hsc_dept","bsc_dept","msc_dept"};
        
        
            String query="SELECT * FROM student_information where ID = "+GetID.ID;
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            rs.next();
            int cnt=0;
            for(int i=0;i<36;i++){
                String p=rs.getString(arr[i]);
                if(p==null||p.isEmpty())
                {
                    cnt++;
                }
            }
            double per=(((36-cnt)*1.0)/36.0)*100.0;
            int qer=(int)per;
            System.out.println(per);
            pro2.setValue(qer);
            pro2.setString(Integer.toString(qer)+"%");
        
        
        String sq1="select Name from student_information where ID = "+GetID.ID;
        String sq2="select Username from student_information where ID = "+GetID.ID;
        String sq3="select Email from student_information where ID = "+GetID.ID;
        String sq4="select Phone from student_information where ID = "+GetID.ID;
        String sq5="select Gender from student_information where ID = "+GetID.ID;
        String sq6="select Day from student_information where ID = "+GetID.ID;
        String sq7="select Month from student_information where ID = "+GetID.ID;
        String sq8="select Year from student_information where ID = "+GetID.ID;
        String sq9="select Age from student_information where ID = "+GetID.ID;
        String sq10="select curr_study_lvl from student_information where ID = "+GetID.ID;
        String sq11="select pref_study_lvl from student_information where ID = "+GetID.ID;
        String sq12="select pref_area_study from student_information where ID = "+GetID.ID;
        String sq13="select pref_dest from student_information where ID = "+GetID.ID;
        String sq14="select Country from student_information where ID = "+GetID.ID;
        String sq15="select ssc_gpa from student_information where ID = "+GetID.ID;
        String sq16="select ssc_school from student_information where ID = "+GetID.ID;
        String sq17="select ssc_year from student_information where ID = "+GetID.ID;
        String sq18="select ssc_dept from student_information where ID = "+GetID.ID;
        String sq19="select hsc_gpa from student_information where ID = "+GetID.ID;
        String sq20="select hsc_school from student_information where ID = "+GetID.ID;
        String sq21="select hsc_year from student_information where ID = "+GetID.ID;
        String sq22="select hsc_dept from student_information where ID = "+GetID.ID;
        String sq23="select bsc_cg from student_information where ID = "+GetID.ID;
        String sq24="select bsc_uni from student_information where ID = "+GetID.ID;
        String sq25="select bsc_year from student_information where ID = "+GetID.ID;
        String sq26="select bsc_dept from student_information where ID = "+GetID.ID;
        String sq27="select msc_cg from student_information where ID = "+GetID.ID;
        String sq28="select msc_uni from student_information where ID = "+GetID.ID;
        String sq29="select msc_year from student_information where ID = "+GetID.ID;
        String sq30="select msc_dept from student_information where ID = "+GetID.ID;
        String sq31="select ielts from student_information where ID = "+GetID.ID;
        String sq32="select sat from student_information where ID = "+GetID.ID;
        String sq33="select gre from student_information where ID = "+GetID.ID;
        String sq34="select toefl from student_information where ID = "+GetID.ID;
        String sq35="select pref_year from student_information where ID = "+GetID.ID;


        
        String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35;

        try {
            ps=conn.prepareStatement(sq1);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s1=rs.getString("Name");
            k1.setText(s1);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq2);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s2=rs.getString("Username");
            k2.setText(s2);
            k100.setText(s2);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        
        try {
            ps=conn.prepareStatement(sq3);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s3=rs.getString("Email");
            k3.setText(s3);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq4);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s4=rs.getString("Phone");
            k4.setText(s4);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq5);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s5=rs.getString("Gender");
            k5.setText(s5);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq6);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s6=rs.getString("Day");
            
            ps=conn.prepareStatement(sq7);
            rs=ps.executeQuery();
            rs.next();
            s7=rs.getString("Month");
            
            ps=conn.prepareStatement(sq8);
            rs=ps.executeQuery();
            rs.next();
            s8=rs.getString("Year");
            
            k6.setText(s6+"."+s7+"."+s8);
            
            
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq9);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s9=rs.getString("Age");
            k7.setText(s9);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        
        try {
            ps=conn.prepareStatement(sq14);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s14=rs.getString("Country");
            k8.setText(s14);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq10);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s10=rs.getString("curr_study_lvl");
            k11.setText(s10);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq11);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s11=rs.getString("pref_study_lvl");
            k12.setText(s11);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq12);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s12=rs.getString("pref_area_study");
            k13.setText(s12);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq35);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s35=rs.getString("pref_year");
            k14.setText(s35);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq13);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s13=rs.getString("pref_dest");
            k15.setText(s13);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        
        try {
            ps=conn.prepareStatement(sq14);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s14=rs.getString("Country");
            k16.setText(s14);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq15);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s15=rs.getString("ssc_gpa");
            k17.setText(s15);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq16);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s16=rs.getString("ssc_school");
            k18.setText(s16);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq17);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s17=rs.getString("ssc_year");
            k19.setText(s17);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq18);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s18=rs.getString("ssc_dept");
            k20.setText(s18);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq19);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s19=rs.getString("hsc_gpa");
            k21.setText(s19);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        try {
            ps=conn.prepareStatement(sq20);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s20=rs.getString("hsc_school");
            k22.setText(s20);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
         try {
            ps=conn.prepareStatement(sq21);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s21=rs.getString("hsc_year");
            k23.setText(s21);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
         try {
            ps=conn.prepareStatement(sq22);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s22=rs.getString("hsc_dept");
            k24.setText(s22);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
         
         try {
            ps=conn.prepareStatement(sq23);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s23=rs.getString("bsc_cg");
            k25.setText(s23);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
        
        try {
            ps=conn.prepareStatement(sq24);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s24=rs.getString("bsc_uni");
            k26.setText(s24);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }  
        
        try {
            ps=conn.prepareStatement(sq25);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s25=rs.getString("bsc_year");
            k27.setText(s25);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }  
         
         try {
            ps=conn.prepareStatement(sq26);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s26=rs.getString("bsc_dept");
            k28.setText(s26);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
         
         
          try {
            ps=conn.prepareStatement(sq27);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s27=rs.getString("msc_cg");
            k29.setText(s27);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
        
        try {
            ps=conn.prepareStatement(sq28);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s28=rs.getString("msc_uni");
            k30.setText(s28);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }  
        
        try {
            ps=conn.prepareStatement(sq29);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s29=rs.getString("msc_year");
            k31.setText(s29);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }  
         
         try {
            ps=conn.prepareStatement(sq30);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s30=rs.getString("msc_dept");
            k32.setText(s30);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
         
         
         try {
            ps=conn.prepareStatement(sq31);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s31=rs.getString("ielts");
            k33.setText(s31);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
         
          try {
            ps=conn.prepareStatement(sq32);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s32=rs.getString("sat");
            k34.setText(s32);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
         
         try {
            ps=conn.prepareStatement(sq33);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s33=rs.getString("gre");
            k35.setText(s33);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        } 
         
          try {
            ps=conn.prepareStatement(sq34);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s34=rs.getString("toefl");
            k36.setText(s34);
        } catch (SQLException ex) {
//            Logger.getLogger(myprofile.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Not");
        }
        
        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelShadow1 = new com.raven.swing.PanelShadow();
        k1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelShadow4 = new com.raven.swing.PanelShadow();
        k2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelShadow7 = new com.raven.swing.PanelShadow();
        k3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelShadow6 = new com.raven.swing.PanelShadow();
        k4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        panelShadow2 = new com.raven.swing.PanelShadow();
        k5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelShadow5 = new com.raven.swing.PanelShadow();
        k6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelShadow8 = new com.raven.swing.PanelShadow();
        k7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panelShadow9 = new com.raven.swing.PanelShadow();
        k8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelShadow10 = new com.raven.swing.PanelShadow();
        k9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelShadow11 = new com.raven.swing.PanelShadow();
        k10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        panelShadow12 = new com.raven.swing.PanelShadow();
        k11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelShadow13 = new com.raven.swing.PanelShadow();
        k12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panelShadow14 = new com.raven.swing.PanelShadow();
        k13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panelShadow15 = new com.raven.swing.PanelShadow();
        k14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        panelShadow16 = new com.raven.swing.PanelShadow();
        k15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        panelShadow17 = new com.raven.swing.PanelShadow();
        k16 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        panelShadow40 = new com.raven.swing.PanelShadow();
        k17 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        panelShadow23 = new com.raven.swing.PanelShadow();
        k18 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        panelShadow24 = new com.raven.swing.PanelShadow();
        k19 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        panelShadow25 = new com.raven.swing.PanelShadow();
        k20 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelShadow42 = new com.raven.swing.PanelShadow();
        k23 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        panelShadow41 = new com.raven.swing.PanelShadow();
        k21 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panelShadow39 = new com.raven.swing.PanelShadow();
        k22 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        panelShadow38 = new com.raven.swing.PanelShadow();
        k24 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panelShadow43 = new com.raven.swing.PanelShadow();
        k25 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        panelShadow44 = new com.raven.swing.PanelShadow();
        k26 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        panelShadow45 = new com.raven.swing.PanelShadow();
        k27 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        panelShadow46 = new com.raven.swing.PanelShadow();
        k28 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        panelShadow47 = new com.raven.swing.PanelShadow();
        k31 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        panelShadow48 = new com.raven.swing.PanelShadow();
        k32 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        panelShadow49 = new com.raven.swing.PanelShadow();
        k29 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        panelShadow50 = new com.raven.swing.PanelShadow();
        k30 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        panelShadow18 = new com.raven.swing.PanelShadow();
        k33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        panelShadow19 = new com.raven.swing.PanelShadow();
        k34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        panelShadow20 = new com.raven.swing.PanelShadow();
        k35 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        panelShadow21 = new com.raven.swing.PanelShadow();
        k36 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        panelShadow3 = new com.raven.swing.PanelShadow();
        k100 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pro2 = new progressbar.ProgressBarCustom();

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        materialTabbed1.setBackground(new java.awt.Color(0, 0, 0));
        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1130, 499));

        jPanel7.setBackground(new java.awt.Color(30, 30, 30));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow1.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow1.setOpaque(true);

        k1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name :");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow4.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow4.setOpaque(true);

        k2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Username :");

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow7.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow7.setOpaque(true);
        panelShadow7.setShadowColor(new java.awt.Color(0, 0, 0));
        panelShadow7.setShadowOpacity(0.1F);

        k3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email :");

        javax.swing.GroupLayout panelShadow7Layout = new javax.swing.GroupLayout(panelShadow7);
        panelShadow7.setLayout(panelShadow7Layout);
        panelShadow7Layout.setHorizontalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelShadow7Layout.setVerticalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow7Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow6.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow6.setOpaque(true);

        k4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Phone :");

        javax.swing.GroupLayout panelShadow6Layout = new javax.swing.GroupLayout(panelShadow6);
        panelShadow6.setLayout(panelShadow6Layout);
        panelShadow6Layout.setHorizontalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow6Layout.setVerticalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("        General Infromation       ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel9.setBackground(new java.awt.Color(30, 30, 30));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow2.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow2.setOpaque(true);
        panelShadow2.setPreferredSize(new java.awt.Dimension(510, 140));

        k5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Gender :");

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k5, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow5.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow5.setOpaque(true);
        panelShadow5.setPreferredSize(new java.awt.Dimension(510, 140));

        k6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Date of Birth :");

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k6, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow8.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow8.setOpaque(true);
        panelShadow8.setPreferredSize(new java.awt.Dimension(510, 140));

        k7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Age :");

        javax.swing.GroupLayout panelShadow8Layout = new javax.swing.GroupLayout(panelShadow8);
        panelShadow8.setLayout(panelShadow8Layout);
        panelShadow8Layout.setHorizontalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelShadow8Layout.setVerticalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow8Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow9.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow9.setOpaque(true);
        panelShadow9.setPreferredSize(new java.awt.Dimension(510, 140));

        k8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Country :");

        javax.swing.GroupLayout panelShadow9Layout = new javax.swing.GroupLayout(panelShadow9);
        panelShadow9.setLayout(panelShadow9Layout);
        panelShadow9Layout.setHorizontalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelShadow9Layout.setVerticalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow9Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow10.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow10.setOpaque(true);
        panelShadow10.setPreferredSize(new java.awt.Dimension(510, 140));

        k9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k9.setForeground(new java.awt.Color(255, 255, 255));
        k9.setText("Unmarried");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Marital Status :");

        javax.swing.GroupLayout panelShadow10Layout = new javax.swing.GroupLayout(panelShadow10);
        panelShadow10.setLayout(panelShadow10Layout);
        panelShadow10Layout.setHorizontalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelShadow10Layout.setVerticalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow10Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow11.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow11.setOpaque(true);
        panelShadow11.setPreferredSize(new java.awt.Dimension(510, 140));

        k10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k10.setForeground(new java.awt.Color(255, 255, 255));
        k10.setText("Dhaka, BD");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Address :");

        javax.swing.GroupLayout panelShadow11Layout = new javax.swing.GroupLayout(panelShadow11);
        panelShadow11.setLayout(panelShadow11Layout);
        panelShadow11Layout.setHorizontalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelShadow11Layout.setVerticalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow11Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelShadow10, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelShadow9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelShadow11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelShadow8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        materialTabbed1.addTab("       Personal Information       ", jPanel3);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel12.setBackground(new java.awt.Color(30, 30, 30));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow12.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow12.setOpaque(true);
        panelShadow12.setPreferredSize(new java.awt.Dimension(510, 140));

        k11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Current Level of Study :");

        javax.swing.GroupLayout panelShadow12Layout = new javax.swing.GroupLayout(panelShadow12);
        panelShadow12.setLayout(panelShadow12Layout);
        panelShadow12Layout.setHorizontalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k11, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelShadow12Layout.setVerticalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow12Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow13.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow13.setOpaque(true);
        panelShadow13.setPreferredSize(new java.awt.Dimension(510, 140));

        k12.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Preferred Level of Study :");

        javax.swing.GroupLayout panelShadow13Layout = new javax.swing.GroupLayout(panelShadow13);
        panelShadow13.setLayout(panelShadow13Layout);
        panelShadow13Layout.setHorizontalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k12, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelShadow13Layout.setVerticalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow13Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow14.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow14.setOpaque(true);
        panelShadow14.setPreferredSize(new java.awt.Dimension(510, 140));

        k13.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Preferred Area of Study :");

        javax.swing.GroupLayout panelShadow14Layout = new javax.swing.GroupLayout(panelShadow14);
        panelShadow14.setLayout(panelShadow14Layout);
        panelShadow14Layout.setHorizontalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k13, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow14Layout.setVerticalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow14Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow15.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow15.setOpaque(true);
        panelShadow15.setPreferredSize(new java.awt.Dimension(510, 140));

        k14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Preferred Year of Study :");

        javax.swing.GroupLayout panelShadow15Layout = new javax.swing.GroupLayout(panelShadow15);
        panelShadow15.setLayout(panelShadow15Layout);
        panelShadow15Layout.setHorizontalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow15Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k14, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow15Layout.setVerticalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow15Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow16.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow16.setOpaque(true);
        panelShadow16.setPreferredSize(new java.awt.Dimension(510, 140));

        k15.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Preferred Destination :");

        javax.swing.GroupLayout panelShadow16Layout = new javax.swing.GroupLayout(panelShadow16);
        panelShadow16.setLayout(panelShadow16Layout);
        panelShadow16Layout.setHorizontalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow16Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k15, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow16Layout.setVerticalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow16Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow17.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow17.setOpaque(true);
        panelShadow17.setPreferredSize(new java.awt.Dimension(510, 140));

        k16.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Address :");

        javax.swing.GroupLayout panelShadow17Layout = new javax.swing.GroupLayout(panelShadow17);
        panelShadow17.setLayout(panelShadow17Layout);
        panelShadow17Layout.setHorizontalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k16, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow17Layout.setVerticalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow17Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelShadow12, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(panelShadow14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(panelShadow16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow13, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addComponent(panelShadow15, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                            .addComponent(panelShadow17, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelShadow14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        materialTabbed1.addTab("      Educational Preferences       ", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        scroll.setBackground(new java.awt.Color(0, 0, 0));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setPreferredSize(new java.awt.Dimension(1060, 1905));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel22.setBackground(new java.awt.Color(30, 30, 30));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow40.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow40.setOpaque(true);
        panelShadow40.setPreferredSize(new java.awt.Dimension(510, 140));

        k17.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k17.setForeground(new java.awt.Color(255, 255, 255));
        k17.setText("5.00");

        jLabel81.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 204, 204));
        jLabel81.setText("GPA :");

        javax.swing.GroupLayout panelShadow40Layout = new javax.swing.GroupLayout(panelShadow40);
        panelShadow40.setLayout(panelShadow40Layout);
        panelShadow40Layout.setHorizontalGroup(
            panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow40Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k17, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow40Layout.setVerticalGroup(
            panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow40Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow23.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow23.setOpaque(true);
        panelShadow23.setPreferredSize(new java.awt.Dimension(510, 140));

        k18.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k18.setForeground(new java.awt.Color(255, 255, 255));
        k18.setText("ISC");

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Institution :");

        javax.swing.GroupLayout panelShadow23Layout = new javax.swing.GroupLayout(panelShadow23);
        panelShadow23.setLayout(panelShadow23Layout);
        panelShadow23Layout.setHorizontalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow23Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k18, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow23Layout.setVerticalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow23Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow24.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow24.setOpaque(true);
        panelShadow24.setPreferredSize(new java.awt.Dimension(510, 140));

        k19.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k19.setForeground(new java.awt.Color(255, 255, 255));
        k19.setText("2017");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Passed Year :");

        javax.swing.GroupLayout panelShadow24Layout = new javax.swing.GroupLayout(panelShadow24);
        panelShadow24.setLayout(panelShadow24Layout);
        panelShadow24Layout.setHorizontalGroup(
            panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow24Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k19, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow24Layout.setVerticalGroup(
            panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow24Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow25.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow25.setOpaque(true);
        panelShadow25.setPreferredSize(new java.awt.Dimension(510, 140));

        k20.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k20.setForeground(new java.awt.Color(255, 255, 255));
        k20.setText("Science");

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("Group :");

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k20, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow25Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("SSC");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        panelShadow42.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow42.setOpaque(true);
        panelShadow42.setPreferredSize(new java.awt.Dimension(510, 140));

        k23.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k23.setForeground(new java.awt.Color(255, 255, 255));
        k23.setText("2019");

        jLabel89.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("Passed Year :");

        javax.swing.GroupLayout panelShadow42Layout = new javax.swing.GroupLayout(panelShadow42);
        panelShadow42.setLayout(panelShadow42Layout);
        panelShadow42Layout.setHorizontalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow42Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k23, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow42Layout.setVerticalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow42Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("HSC");

        panelShadow41.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow41.setOpaque(true);
        panelShadow41.setPreferredSize(new java.awt.Dimension(510, 140));

        k21.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k21.setForeground(new java.awt.Color(255, 255, 255));
        k21.setText("5.00");

        jLabel87.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(204, 204, 204));
        jLabel87.setText("GPA :");

        javax.swing.GroupLayout panelShadow41Layout = new javax.swing.GroupLayout(panelShadow41);
        panelShadow41.setLayout(panelShadow41Layout);
        panelShadow41Layout.setHorizontalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow41Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k21, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow41Layout.setVerticalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow41Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        panelShadow39.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow39.setOpaque(true);
        panelShadow39.setPreferredSize(new java.awt.Dimension(510, 140));

        k22.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k22.setForeground(new java.awt.Color(255, 255, 255));
        k22.setText("ACC");

        jLabel79.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(204, 204, 204));
        jLabel79.setText("Institution :");

        javax.swing.GroupLayout panelShadow39Layout = new javax.swing.GroupLayout(panelShadow39);
        panelShadow39.setLayout(panelShadow39Layout);
        panelShadow39Layout.setHorizontalGroup(
            panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow39Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k22, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow39Layout.setVerticalGroup(
            panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow39Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow38.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow38.setOpaque(true);
        panelShadow38.setPreferredSize(new java.awt.Dimension(510, 140));

        k24.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k24.setForeground(new java.awt.Color(255, 255, 255));
        k24.setText("Science");

        jLabel77.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(204, 204, 204));
        jLabel77.setText("Group :");

        javax.swing.GroupLayout panelShadow38Layout = new javax.swing.GroupLayout(panelShadow38);
        panelShadow38.setLayout(panelShadow38Layout);
        panelShadow38Layout.setHorizontalGroup(
            panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow38Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k24, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow38Layout.setVerticalGroup(
            panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow38Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Undergraduate");

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        panelShadow43.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow43.setOpaque(true);
        panelShadow43.setPreferredSize(new java.awt.Dimension(510, 140));

        k25.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k25.setForeground(new java.awt.Color(255, 255, 255));
        k25.setText("5.00");

        jLabel91.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setText("CGPA :");

        javax.swing.GroupLayout panelShadow43Layout = new javax.swing.GroupLayout(panelShadow43);
        panelShadow43.setLayout(panelShadow43Layout);
        panelShadow43Layout.setHorizontalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow43Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k25, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow43Layout.setVerticalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow43Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow44.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow44.setOpaque(true);
        panelShadow44.setPreferredSize(new java.awt.Dimension(510, 140));

        k26.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k26.setForeground(new java.awt.Color(255, 255, 255));
        k26.setText("CUET");

        jLabel93.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 204, 204));
        jLabel93.setText("Institution :");

        javax.swing.GroupLayout panelShadow44Layout = new javax.swing.GroupLayout(panelShadow44);
        panelShadow44.setLayout(panelShadow44Layout);
        panelShadow44Layout.setHorizontalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k26, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow44Layout.setVerticalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow44Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow45.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow45.setOpaque(true);
        panelShadow45.setPreferredSize(new java.awt.Dimension(510, 140));

        k27.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k27.setForeground(new java.awt.Color(255, 255, 255));
        k27.setText("2025");

        jLabel95.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(204, 204, 204));
        jLabel95.setText("Passed Year :");

        javax.swing.GroupLayout panelShadow45Layout = new javax.swing.GroupLayout(panelShadow45);
        panelShadow45.setLayout(panelShadow45Layout);
        panelShadow45Layout.setHorizontalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k27, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow45Layout.setVerticalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow45Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow46.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow46.setOpaque(true);
        panelShadow46.setPreferredSize(new java.awt.Dimension(510, 140));

        k28.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k28.setForeground(new java.awt.Color(255, 255, 255));
        k28.setText("CSE");

        jLabel97.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(204, 204, 204));
        jLabel97.setText("Department :");

        javax.swing.GroupLayout panelShadow46Layout = new javax.swing.GroupLayout(panelShadow46);
        panelShadow46.setLayout(panelShadow46Layout);
        panelShadow46Layout.setHorizontalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k28, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow46Layout.setVerticalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow46Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow47.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow47.setOpaque(true);
        panelShadow47.setPreferredSize(new java.awt.Dimension(510, 140));

        k31.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k31.setForeground(new java.awt.Color(255, 255, 255));
        k31.setText("N/A");

        jLabel99.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(204, 204, 204));
        jLabel99.setText("Passed Year :");

        javax.swing.GroupLayout panelShadow47Layout = new javax.swing.GroupLayout(panelShadow47);
        panelShadow47.setLayout(panelShadow47Layout);
        panelShadow47Layout.setHorizontalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow47Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k31, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow47Layout.setVerticalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow47Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow48.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow48.setOpaque(true);
        panelShadow48.setPreferredSize(new java.awt.Dimension(510, 140));

        k32.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k32.setForeground(new java.awt.Color(255, 255, 255));
        k32.setText("N/A");

        jLabel101.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 204, 204));
        jLabel101.setText("Department :");

        javax.swing.GroupLayout panelShadow48Layout = new javax.swing.GroupLayout(panelShadow48);
        panelShadow48.setLayout(panelShadow48Layout);
        panelShadow48Layout.setHorizontalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow48Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k32, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow48Layout.setVerticalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow48Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel102.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(204, 204, 204));
        jLabel102.setText("Postgraduate");

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        panelShadow49.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow49.setOpaque(true);
        panelShadow49.setPreferredSize(new java.awt.Dimension(510, 140));

        k29.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k29.setForeground(new java.awt.Color(255, 255, 255));
        k29.setText("N/A");

        jLabel104.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(204, 204, 204));
        jLabel104.setText("CGPA :");

        javax.swing.GroupLayout panelShadow49Layout = new javax.swing.GroupLayout(panelShadow49);
        panelShadow49.setLayout(panelShadow49Layout);
        panelShadow49Layout.setHorizontalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow49Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k29, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow49Layout.setVerticalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow49Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow50.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow50.setOpaque(true);
        panelShadow50.setPreferredSize(new java.awt.Dimension(510, 140));

        k30.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k30.setForeground(new java.awt.Color(255, 255, 255));
        k30.setText("N/A");

        jLabel106.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setText("Institution :");

        javax.swing.GroupLayout panelShadow50Layout = new javax.swing.GroupLayout(panelShadow50);
        panelShadow50.setLayout(panelShadow50Layout);
        panelShadow50Layout.setHorizontalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow50Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k30, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow50Layout.setVerticalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow50Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow42, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                    .addComponent(panelShadow41, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelShadow39, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelShadow38, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(467, 467, 467)
                                .addComponent(jLabel44))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow24, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                    .addComponent(panelShadow40, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelShadow23, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelShadow25, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow45, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                    .addComponent(panelShadow43, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelShadow44, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelShadow46, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(365, 365, 365)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow47, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                    .addComponent(panelShadow49, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelShadow50, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelShadow48, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel36))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jLabel45))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel102)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelShadow48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1905, Short.MAX_VALUE)
        );

        scroll.setViewportView(jPanel15);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        materialTabbed1.addTab("       Educational History       ", jPanel5);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setPreferredSize(new java.awt.Dimension(1130, 499));

        jPanel14.setBackground(new java.awt.Color(30, 30, 30));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow18.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow18.setOpaque(true);

        k33.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k33.setForeground(new java.awt.Color(255, 255, 255));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("IELTS Score :");

        javax.swing.GroupLayout panelShadow18Layout = new javax.swing.GroupLayout(panelShadow18);
        panelShadow18.setLayout(panelShadow18Layout);
        panelShadow18Layout.setHorizontalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k33, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow18Layout.setVerticalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow18Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow19.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow19.setOpaque(true);

        k34.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k34.setForeground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("SAT Score :");

        javax.swing.GroupLayout panelShadow19Layout = new javax.swing.GroupLayout(panelShadow19);
        panelShadow19.setLayout(panelShadow19Layout);
        panelShadow19Layout.setHorizontalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k34, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow19Layout.setVerticalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow20.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow20.setOpaque(true);
        panelShadow20.setShadowColor(new java.awt.Color(0, 0, 0));
        panelShadow20.setShadowOpacity(0.1F);

        k35.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k35.setForeground(new java.awt.Color(255, 255, 255));

        jLabel83.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(204, 204, 204));
        jLabel83.setText("GRE Score :");

        javax.swing.GroupLayout panelShadow20Layout = new javax.swing.GroupLayout(panelShadow20);
        panelShadow20.setLayout(panelShadow20Layout);
        panelShadow20Layout.setHorizontalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow20Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k35, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow20Layout.setVerticalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow20Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        panelShadow21.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow21.setOpaque(true);

        k36.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        k36.setForeground(new java.awt.Color(255, 255, 255));

        jLabel85.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("TOEFL Score :");

        javax.swing.GroupLayout panelShadow21Layout = new javax.swing.GroupLayout(panelShadow21);
        panelShadow21.setLayout(panelShadow21Layout);
        panelShadow21Layout.setHorizontalGroup(
            panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow21Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k36, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelShadow21Layout.setVerticalGroup(
            panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelShadow21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelShadow19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        materialTabbed1.addTab("       Test Scores       ", jPanel6);

        panelShadow3.setBackground(new java.awt.Color(0, 0, 0));
        panelShadow3.setOpaque(true);

        k100.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        k100.setForeground(new java.awt.Color(204, 204, 204));
        k100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        k100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/2.png"))); // NOI18N
        k100.setText(" Sajid064");

        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("My Profile");

        pro2.setForeground(new java.awt.Color(204, 0, 204));
        pro2.setValue(50);
        pro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelShadow3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel10))
                    .addComponent(pro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(k100, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(k100, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(materialTabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel k10;
    private javax.swing.JLabel k100;
    private javax.swing.JLabel k11;
    private javax.swing.JLabel k12;
    private javax.swing.JLabel k13;
    private javax.swing.JLabel k14;
    private javax.swing.JLabel k15;
    private javax.swing.JLabel k16;
    private javax.swing.JLabel k17;
    private javax.swing.JLabel k18;
    private javax.swing.JLabel k19;
    private javax.swing.JLabel k2;
    private javax.swing.JLabel k20;
    private javax.swing.JLabel k21;
    private javax.swing.JLabel k22;
    private javax.swing.JLabel k23;
    private javax.swing.JLabel k24;
    private javax.swing.JLabel k25;
    private javax.swing.JLabel k26;
    private javax.swing.JLabel k27;
    private javax.swing.JLabel k28;
    private javax.swing.JLabel k29;
    private javax.swing.JLabel k3;
    private javax.swing.JLabel k30;
    private javax.swing.JLabel k31;
    private javax.swing.JLabel k32;
    private javax.swing.JLabel k33;
    private javax.swing.JLabel k34;
    private javax.swing.JLabel k35;
    private javax.swing.JLabel k36;
    private javax.swing.JLabel k4;
    private javax.swing.JLabel k5;
    private javax.swing.JLabel k6;
    private javax.swing.JLabel k7;
    private javax.swing.JLabel k8;
    private javax.swing.JLabel k9;
    private tabbed.MaterialTabbed materialTabbed1;
    private com.raven.swing.PanelShadow panelShadow1;
    private com.raven.swing.PanelShadow panelShadow10;
    private com.raven.swing.PanelShadow panelShadow11;
    private com.raven.swing.PanelShadow panelShadow12;
    private com.raven.swing.PanelShadow panelShadow13;
    private com.raven.swing.PanelShadow panelShadow14;
    private com.raven.swing.PanelShadow panelShadow15;
    private com.raven.swing.PanelShadow panelShadow16;
    private com.raven.swing.PanelShadow panelShadow17;
    private com.raven.swing.PanelShadow panelShadow18;
    private com.raven.swing.PanelShadow panelShadow19;
    private com.raven.swing.PanelShadow panelShadow2;
    private com.raven.swing.PanelShadow panelShadow20;
    private com.raven.swing.PanelShadow panelShadow21;
    private com.raven.swing.PanelShadow panelShadow23;
    private com.raven.swing.PanelShadow panelShadow24;
    private com.raven.swing.PanelShadow panelShadow25;
    private com.raven.swing.PanelShadow panelShadow3;
    private com.raven.swing.PanelShadow panelShadow38;
    private com.raven.swing.PanelShadow panelShadow39;
    private com.raven.swing.PanelShadow panelShadow4;
    private com.raven.swing.PanelShadow panelShadow40;
    private com.raven.swing.PanelShadow panelShadow41;
    private com.raven.swing.PanelShadow panelShadow42;
    private com.raven.swing.PanelShadow panelShadow43;
    private com.raven.swing.PanelShadow panelShadow44;
    private com.raven.swing.PanelShadow panelShadow45;
    private com.raven.swing.PanelShadow panelShadow46;
    private com.raven.swing.PanelShadow panelShadow47;
    private com.raven.swing.PanelShadow panelShadow48;
    private com.raven.swing.PanelShadow panelShadow49;
    private com.raven.swing.PanelShadow panelShadow5;
    private com.raven.swing.PanelShadow panelShadow50;
    private com.raven.swing.PanelShadow panelShadow6;
    private com.raven.swing.PanelShadow panelShadow7;
    private com.raven.swing.PanelShadow panelShadow8;
    private com.raven.swing.PanelShadow panelShadow9;
    private progressbar.ProgressBarCustom pro2;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
