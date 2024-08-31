/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import Login.GetID;
import University.Jconnection;
import java.sql.SQLException;
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
public class Form6 extends javax.swing.JPanel {

    /**
     * Creates new form Form2
     *
     */
    
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public Form6() throws SQLException {
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


        
        String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="",s13="",s14="",s15="",s16="",s17="",s18="",s19="",s20="",s21="",s22="",s23="",s24="",s25="",s26="",s27="",s28="",s29="",s30="",s31="",s32="",s33="",s34="",s35="";

        try {
            ps=conn.prepareStatement(sq1);
//             System.out.println(555);     
            rs=ps.executeQuery();
//             System.out.println(555);  
             rs.next();
             
            s1=rs.getString("Name");
            if(s1==null)
            {
                s1="";
            }
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
            if(s2==null)
            {
                s2="";
            }
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
            if(s3==null)
            {
                s3="";
            }
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
            if(s4==null)
            {
                s4="";
            }
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
            if(s15==null)
            {
                s15="";
            }
            if(s5=="Male")
            {
                k51.setSelected(true);
            }
            else if(s5=="Male")
            {
                k52.setSelected(true);
            }
            else 
            {
                k53.setSelected(true);
            }
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
            if(s6==null)
            {
                s6="";
            }
            
            ps=conn.prepareStatement(sq7);
            rs=ps.executeQuery();
            rs.next();
            s7=rs.getString("Month");
            if(s7==null)
            {
                s7="";
            }
            
            ps=conn.prepareStatement(sq8);
            rs=ps.executeQuery();
            rs.next();
            s8=rs.getString("Year");
            if(s8==null)
            {
                s8="";
            }
            
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
            if(s9==null)
            {
                s9="";
            }
            k7.setValue(Integer.parseInt(s9));
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
            if(s14==null)
            {
                s14="";
            }
//            k8.setText(s14);
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
            if(s10==null)
            {
                s10="";
            }
//            k11.setText(s10);
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
            if(s11==null)
            {
                s11="";
            }
//            k12.setText(s11);
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
            if(s12==null)
            {
                s12="";
            }
//            k13.setText(s12);
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
            if(s35==null)
            {
                s35="";
            }
//            k14.setText(s35);
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
            if(s13==null)
            {
                s13="";
            }
//            k15.setText(s13);
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
            if(s14==null)
            {
                s14="";
            }
//            k16.setText(s14);
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
            if(s15==null)
            {
                s15="";
            }
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
            if(s16==null)
            {
                s16="";
            }
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
            if(s17==null)
            {
                s17="";
            }
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
            if(s18==null)
            {
                s18="";
            }
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
            if(s19==null)
            {
                s19="";
            }
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
            if(s20==null)
            {
                s20="";
            }
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
            if(s21==null)
            {
                s21="";
            }
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
            if(s22==null)
            {
                s22="";
            }
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
            if(s23==null)
            {
                s23="";
            }
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
            if(s24==null)
            {
                s24="";
            }
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
            if(s25==null)
            {
                s25="";
            }
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
            if(s26==null)
            {
                s26="";
            }
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
            if(s27==null)
            {
                s27="";
            }
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
            if(s28==null)
            {
                s28="";
            }
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
            if(s29==null)
            {
                s29="";
            }
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
            if(s30==null)
            {
                s30="";
            }
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
            if(s31==null)
            {
                s31="";
            }
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
            if(s32==null)
            {
                s32="";
            }
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
            if(s33==null)
            {
                s33="";
            }
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
            if(s34==null)
            {
                s34="";
            }
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
        k1 = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        panelShadow4 = new com.raven.swing.PanelShadow();
        jLabel37 = new javax.swing.JLabel();
        k2 = new textfield.TextField();
        panelShadow7 = new com.raven.swing.PanelShadow();
        k3 = new textfield.TextField();
        jLabel4 = new javax.swing.JLabel();
        panelShadow6 = new com.raven.swing.PanelShadow();
        jLabel38 = new javax.swing.JLabel();
        k4 = new textfield.TextField();
        kButton2 = new com.k33ptoo.components.KButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        panelShadow2 = new com.raven.swing.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        k51 = new radio_button.RadioButtonCustom();
        k52 = new radio_button.RadioButtonCustom();
        k53 = new radio_button.RadioButtonCustom();
        panelShadow5 = new com.raven.swing.PanelShadow();
        jLabel5 = new javax.swing.JLabel();
        k61 = new combobox.Combobox();
        k62 = new combobox.Combobox();
        k63 = new combobox.Combobox();
        panelShadow8 = new com.raven.swing.PanelShadow();
        k7 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        panelShadow9 = new com.raven.swing.PanelShadow();
        jLabel7 = new javax.swing.JLabel();
        k8 = new combobox.Combobox();
        panelShadow10 = new com.raven.swing.PanelShadow();
        jLabel8 = new javax.swing.JLabel();
        k9 = new textfield.TextField();
        panelShadow11 = new com.raven.swing.PanelShadow();
        jLabel12 = new javax.swing.JLabel();
        k10 = new textfield.TextField();
        kButton1 = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        panelShadow12 = new com.raven.swing.PanelShadow();
        jLabel25 = new javax.swing.JLabel();
        k11 = new combobox.Combobox();
        panelShadow13 = new com.raven.swing.PanelShadow();
        jLabel39 = new javax.swing.JLabel();
        k12 = new combobox.Combobox();
        panelShadow14 = new com.raven.swing.PanelShadow();
        jLabel26 = new javax.swing.JLabel();
        k13 = new combobox.Combobox();
        panelShadow15 = new com.raven.swing.PanelShadow();
        jLabel27 = new javax.swing.JLabel();
        k14 = new combobox.Combobox();
        panelShadow16 = new com.raven.swing.PanelShadow();
        jLabel28 = new javax.swing.JLabel();
        k15 = new combobox.Combobox();
        panelShadow17 = new com.raven.swing.PanelShadow();
        jLabel29 = new javax.swing.JLabel();
        k16 = new combobox.Combobox();
        kButton4 = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        panelShadow40 = new com.raven.swing.PanelShadow();
        k17 = new textfield.TextField();
        jLabel13 = new javax.swing.JLabel();
        panelShadow23 = new com.raven.swing.PanelShadow();
        jLabel14 = new javax.swing.JLabel();
        k18 = new textfield.TextField();
        panelShadow24 = new com.raven.swing.PanelShadow();
        jLabel15 = new javax.swing.JLabel();
        k19 = new textfield.TextField();
        panelShadow25 = new com.raven.swing.PanelShadow();
        k20 = new textfield.TextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelShadow42 = new com.raven.swing.PanelShadow();
        k23 = new textfield.TextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        panelShadow41 = new com.raven.swing.PanelShadow();
        k21 = new textfield.TextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panelShadow39 = new com.raven.swing.PanelShadow();
        jLabel18 = new javax.swing.JLabel();
        k22 = new textfield.TextField();
        panelShadow38 = new com.raven.swing.PanelShadow();
        jLabel20 = new javax.swing.JLabel();
        k24 = new textfield.TextField();
        jLabel45 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panelShadow43 = new com.raven.swing.PanelShadow();
        jLabel21 = new javax.swing.JLabel();
        k25 = new textfield.TextField();
        panelShadow44 = new com.raven.swing.PanelShadow();
        jLabel22 = new javax.swing.JLabel();
        k26 = new textfield.TextField();
        panelShadow45 = new com.raven.swing.PanelShadow();
        jLabel23 = new javax.swing.JLabel();
        k27 = new textfield.TextField();
        panelShadow46 = new com.raven.swing.PanelShadow();
        jLabel24 = new javax.swing.JLabel();
        k28 = new textfield.TextField();
        panelShadow47 = new com.raven.swing.PanelShadow();
        jLabel32 = new javax.swing.JLabel();
        k31 = new textfield.TextField();
        panelShadow48 = new com.raven.swing.PanelShadow();
        jLabel33 = new javax.swing.JLabel();
        k32 = new textfield.TextField();
        jLabel102 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        panelShadow49 = new com.raven.swing.PanelShadow();
        k29 = new textfield.TextField();
        jLabel30 = new javax.swing.JLabel();
        panelShadow50 = new com.raven.swing.PanelShadow();
        jLabel31 = new javax.swing.JLabel();
        k30 = new textfield.TextField();
        kButton5 = new com.k33ptoo.components.KButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        panelShadow18 = new com.raven.swing.PanelShadow();
        jLabel34 = new javax.swing.JLabel();
        k33 = new textfield.TextField();
        panelShadow19 = new com.raven.swing.PanelShadow();
        jLabel35 = new javax.swing.JLabel();
        k34 = new textfield.TextField();
        panelShadow20 = new com.raven.swing.PanelShadow();
        jLabel42 = new javax.swing.JLabel();
        k35 = new textfield.TextField();
        panelShadow21 = new com.raven.swing.PanelShadow();
        jLabel41 = new javax.swing.JLabel();
        k36 = new textfield.TextField();
        kButton3 = new com.k33ptoo.components.KButton();
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

        k1.setBackground(new java.awt.Color(30, 30, 30));
        k1.setForeground(new java.awt.Color(255, 255, 255));
        k1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        k1.setLabelText("");
        k1.setOpaque(true);
        k1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name :");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelShadow4.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow4.setOpaque(true);

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Username :");

        k2.setBackground(new java.awt.Color(30, 30, 30));
        k2.setForeground(new java.awt.Color(255, 255, 255));
        k2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        k2.setLabelText("");
        k2.setOpaque(true);
        k2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow7.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow7.setOpaque(true);
        panelShadow7.setShadowColor(new java.awt.Color(0, 0, 0));
        panelShadow7.setShadowOpacity(0.1F);

        k3.setBackground(new java.awt.Color(30, 30, 30));
        k3.setForeground(new java.awt.Color(255, 255, 255));
        k3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        k3.setLabelText("");
        k3.setOpaque(true);
        k3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Email :");

        javax.swing.GroupLayout panelShadow7Layout = new javax.swing.GroupLayout(panelShadow7);
        panelShadow7.setLayout(panelShadow7Layout);
        panelShadow7Layout.setHorizontalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow7Layout.setVerticalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelShadow6.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow6.setOpaque(true);

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Phone :");

        k4.setBackground(new java.awt.Color(30, 30, 30));
        k4.setForeground(new java.awt.Color(255, 255, 255));
        k4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        k4.setLabelText("");
        k4.setOpaque(true);
        k4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow6Layout = new javax.swing.GroupLayout(panelShadow6);
        panelShadow6.setLayout(panelShadow6Layout);
        panelShadow6Layout.setHorizontalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panelShadow6Layout.setVerticalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        kButton2.setText("Save");
        kButton2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelShadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                .addGap(51, 51, 51)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("        General Infromation       ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(30, 30, 30));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow2.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow2.setOpaque(true);
        panelShadow2.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Gender :");

        k51.setBackground(new java.awt.Color(30, 30, 30));
        k51.setForeground(new java.awt.Color(255, 255, 255));
        k51.setText("Male");
        k51.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k51ActionPerformed(evt);
            }
        });

        k52.setBackground(new java.awt.Color(30, 30, 30));
        k52.setForeground(new java.awt.Color(255, 255, 255));
        k52.setText("Female");
        k52.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k52ActionPerformed(evt);
            }
        });

        k53.setBackground(new java.awt.Color(30, 30, 30));
        k53.setForeground(new java.awt.Color(255, 255, 255));
        k53.setText("Others");
        k53.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(k51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(k52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(k53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow5.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow5.setOpaque(true);
        panelShadow5.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Date of Birth :");

        k61.setBackground(new java.awt.Color(30, 30, 30));
        k61.setForeground(new java.awt.Color(255, 255, 255));
        k61.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        k61.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k61.setLabeText("Date");

        k62.setBackground(new java.awt.Color(30, 30, 30));
        k62.setForeground(new java.awt.Color(255, 255, 255));
        k62.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        k62.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k62.setLabeText("Month");

        k63.setBackground(new java.awt.Color(30, 30, 30));
        k63.setForeground(new java.awt.Color(255, 255, 255));
        k63.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        k63.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k63.setLabeText("Year");
        k63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelShadow5Layout.createSequentialGroup()
                        .addComponent(k61, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k62, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k63, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k61, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k62, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k63, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow8.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow8.setOpaque(true);
        panelShadow8.setPreferredSize(new java.awt.Dimension(510, 140));

        k7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Age :");

        javax.swing.GroupLayout panelShadow8Layout = new javax.swing.GroupLayout(panelShadow8);
        panelShadow8.setLayout(panelShadow8Layout);
        panelShadow8Layout.setHorizontalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        panelShadow8Layout.setVerticalGroup(
            panelShadow8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelShadow9.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow9.setOpaque(true);
        panelShadow9.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Country :");

        k8.setBackground(new java.awt.Color(30, 30, 30));
        k8.setForeground(new java.awt.Color(255, 255, 255));
        k8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   ", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Lucia", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        k8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k8.setLabeText("Select");

        javax.swing.GroupLayout panelShadow9Layout = new javax.swing.GroupLayout(panelShadow9);
        panelShadow9.setLayout(panelShadow9Layout);
        panelShadow9Layout.setHorizontalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panelShadow9Layout.setVerticalGroup(
            panelShadow9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow10.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow10.setOpaque(true);
        panelShadow10.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Marital Status :");

        k9.setBackground(new java.awt.Color(30, 30, 30));
        k9.setForeground(new java.awt.Color(255, 255, 255));
        k9.setText("Unmarried");
        k9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k9.setLabelText("");
        k9.setOpaque(true);
        k9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow10Layout = new javax.swing.GroupLayout(panelShadow10);
        panelShadow10.setLayout(panelShadow10Layout);
        panelShadow10Layout.setHorizontalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelShadow10Layout.setVerticalGroup(
            panelShadow10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow11.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow11.setOpaque(true);
        panelShadow11.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Address :");

        k10.setBackground(new java.awt.Color(30, 30, 30));
        k10.setForeground(new java.awt.Color(255, 255, 255));
        k10.setText("Dhaka, Bangladesh");
        k10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k10.setLabelText("");
        k10.setOpaque(true);
        k10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow11Layout = new javax.swing.GroupLayout(panelShadow11);
        panelShadow11.setLayout(panelShadow11Layout);
        panelShadow11Layout.setHorizontalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelShadow11Layout.setVerticalGroup(
            panelShadow11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        kButton1.setText("Save");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

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
                            .addComponent(panelShadow2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelShadow11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelShadow8, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelShadow9, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelShadow5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow9, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(panelShadow8, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow11, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(panelShadow10, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1028, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
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

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Current Level of Study :");

        k11.setBackground(new java.awt.Color(30, 30, 30));
        k11.setForeground(new java.awt.Color(255, 255, 255));
        k11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "School", "Vocational Studies", "Undergraduate", "Postgraduate", "Doctorate", "Professional Year", "PhD", " " }));
        k11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k11.setLabeText("Choose Study Level");

        javax.swing.GroupLayout panelShadow12Layout = new javax.swing.GroupLayout(panelShadow12);
        panelShadow12.setLayout(panelShadow12Layout);
        panelShadow12Layout.setHorizontalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        panelShadow12Layout.setVerticalGroup(
            panelShadow12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow13.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow13.setOpaque(true);
        panelShadow13.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Preffered Level of Study :");

        k12.setBackground(new java.awt.Color(30, 30, 30));
        k12.setForeground(new java.awt.Color(255, 255, 255));
        k12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "School", "Vocational Studies", "Undergraduate", "Postgraduate", "Doctorate", "Professional Year", "PhD", " " }));
        k12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k12.setLabeText("Choose Study Level");

        javax.swing.GroupLayout panelShadow13Layout = new javax.swing.GroupLayout(panelShadow13);
        panelShadow13.setLayout(panelShadow13Layout);
        panelShadow13Layout.setHorizontalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k12, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        panelShadow13Layout.setVerticalGroup(
            panelShadow13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow14.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow14.setOpaque(true);
        panelShadow14.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Preferred Area of Study :");

        k13.setBackground(new java.awt.Color(30, 30, 30));
        k13.setForeground(new java.awt.Color(255, 255, 255));
        k13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Accounting & Finance", "Agriculture - Environment & related studies", "Natural and Physical Sciences", "Architecture and Building", "Arts, Humanities and Social Sciences", "Business, Commerce and Management", "Education", "Engineering", "Health and Allied Health", "History", "Humanities & Social Sciences", "Information Technology", "English Language Studies", "Law", "Media & Communication", "Not Decided", "Others", "Performing Arts", "Personal Care & Fitness", "Sports", "Transport & Logistics", "Food, Hospitality and Personal Services", " " }));
        k13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k13.setLabeText("Choose Any");

        javax.swing.GroupLayout panelShadow14Layout = new javax.swing.GroupLayout(panelShadow14);
        panelShadow14.setLayout(panelShadow14Layout);
        panelShadow14Layout.setHorizontalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k13, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow14Layout.setVerticalGroup(
            panelShadow14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow15.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow15.setOpaque(true);
        panelShadow15.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Preferred Year of Study :");

        k14.setBackground(new java.awt.Color(30, 30, 30));
        k14.setForeground(new java.awt.Color(255, 255, 255));
        k14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", " " }));
        k14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k14.setLabeText("Please Select");

        javax.swing.GroupLayout panelShadow15Layout = new javax.swing.GroupLayout(panelShadow15);
        panelShadow15.setLayout(panelShadow15Layout);
        panelShadow15Layout.setHorizontalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow15Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k14, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow15Layout.setVerticalGroup(
            panelShadow15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow16.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow16.setOpaque(true);
        panelShadow16.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Current Location :");

        k15.setBackground(new java.awt.Color(30, 30, 30));
        k15.setForeground(new java.awt.Color(255, 255, 255));
        k15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Lucia", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        k15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k15.setLabeText("Choose Any");

        javax.swing.GroupLayout panelShadow16Layout = new javax.swing.GroupLayout(panelShadow16);
        panelShadow16.setLayout(panelShadow16Layout);
        panelShadow16Layout.setHorizontalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow16Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow16Layout.setVerticalGroup(
            panelShadow16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelShadow17.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow17.setOpaque(true);
        panelShadow17.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Preferred Destination :");

        k16.setBackground(new java.awt.Color(30, 30, 30));
        k16.setForeground(new java.awt.Color(255, 255, 255));
        k16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "The Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Costa Rica", "Côte d’Ivoire", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Lucia", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        k16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        k16.setLabeText("Choose Any");

        javax.swing.GroupLayout panelShadow17Layout = new javax.swing.GroupLayout(panelShadow17);
        panelShadow17.setLayout(panelShadow17Layout);
        panelShadow17Layout.setHorizontalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow17Layout.setVerticalGroup(
            panelShadow17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        kButton4.setText("Save");
        kButton4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panelShadow12, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                                    .addComponent(panelShadow14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                                    .addComponent(panelShadow16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow13, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                    .addComponent(panelShadow17, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                    .addComponent(panelShadow15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelShadow12, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(panelShadow13, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
        jPanel15.setPreferredSize(new java.awt.Dimension(1060, 2000));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.setPreferredSize(new java.awt.Dimension(1130, 500));

        jPanel22.setBackground(new java.awt.Color(30, 30, 30));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelShadow40.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow40.setOpaque(true);
        panelShadow40.setPreferredSize(new java.awt.Dimension(510, 140));

        k17.setBackground(new java.awt.Color(30, 30, 30));
        k17.setForeground(new java.awt.Color(255, 255, 255));
        k17.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k17.setLabelText("");
        k17.setOpaque(true);
        k17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k17ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("GPA :");

        javax.swing.GroupLayout panelShadow40Layout = new javax.swing.GroupLayout(panelShadow40);
        panelShadow40.setLayout(panelShadow40Layout);
        panelShadow40Layout.setHorizontalGroup(
            panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow40Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k17, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow40Layout.setVerticalGroup(
            panelShadow40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow40Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow23.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow23.setOpaque(true);
        panelShadow23.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Institution :");

        k18.setBackground(new java.awt.Color(30, 30, 30));
        k18.setForeground(new java.awt.Color(255, 255, 255));
        k18.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k18.setLabelText("");
        k18.setOpaque(true);
        k18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow23Layout = new javax.swing.GroupLayout(panelShadow23);
        panelShadow23.setLayout(panelShadow23Layout);
        panelShadow23Layout.setHorizontalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k18, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelShadow23Layout.setVerticalGroup(
            panelShadow23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow24.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow24.setOpaque(true);
        panelShadow24.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Passed Year :");

        k19.setBackground(new java.awt.Color(30, 30, 30));
        k19.setForeground(new java.awt.Color(255, 255, 255));
        k19.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k19.setLabelText("");
        k19.setOpaque(true);
        k19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow24Layout = new javax.swing.GroupLayout(panelShadow24);
        panelShadow24.setLayout(panelShadow24Layout);
        panelShadow24Layout.setHorizontalGroup(
            panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow24Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k19, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow24Layout.setVerticalGroup(
            panelShadow24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow25.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow25.setOpaque(true);
        panelShadow25.setPreferredSize(new java.awt.Dimension(510, 140));

        k20.setBackground(new java.awt.Color(30, 30, 30));
        k20.setForeground(new java.awt.Color(255, 255, 255));
        k20.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k20.setLabelText("");
        k20.setOpaque(true);
        k20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k20ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Group :");

        javax.swing.GroupLayout panelShadow25Layout = new javax.swing.GroupLayout(panelShadow25);
        panelShadow25.setLayout(panelShadow25Layout);
        panelShadow25Layout.setHorizontalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k20, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow25Layout.setVerticalGroup(
            panelShadow25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow25Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

        k23.setBackground(new java.awt.Color(30, 30, 30));
        k23.setForeground(new java.awt.Color(255, 255, 255));
        k23.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k23.setLabelText("");
        k23.setOpaque(true);
        k23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k23ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Passed Year :");

        javax.swing.GroupLayout panelShadow42Layout = new javax.swing.GroupLayout(panelShadow42);
        panelShadow42.setLayout(panelShadow42Layout);
        panelShadow42Layout.setHorizontalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow42Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k23, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow42Layout.setVerticalGroup(
            panelShadow42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow42Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("HSC");

        panelShadow41.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow41.setOpaque(true);
        panelShadow41.setPreferredSize(new java.awt.Dimension(510, 140));

        k21.setBackground(new java.awt.Color(30, 30, 30));
        k21.setForeground(new java.awt.Color(255, 255, 255));
        k21.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k21.setLabelText("");
        k21.setOpaque(true);
        k21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k21ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("GPA :");

        javax.swing.GroupLayout panelShadow41Layout = new javax.swing.GroupLayout(panelShadow41);
        panelShadow41.setLayout(panelShadow41Layout);
        panelShadow41Layout.setHorizontalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow41Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k21, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow41Layout.setVerticalGroup(
            panelShadow41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow41Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        panelShadow39.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow39.setOpaque(true);
        panelShadow39.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Institution :");

        k22.setBackground(new java.awt.Color(30, 30, 30));
        k22.setForeground(new java.awt.Color(255, 255, 255));
        k22.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k22.setLabelText("");
        k22.setOpaque(true);
        k22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow39Layout = new javax.swing.GroupLayout(panelShadow39);
        panelShadow39.setLayout(panelShadow39Layout);
        panelShadow39Layout.setHorizontalGroup(
            panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow39Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k22, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelShadow39Layout.setVerticalGroup(
            panelShadow39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow39Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow38.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow38.setOpaque(true);
        panelShadow38.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Group :");

        k24.setBackground(new java.awt.Color(30, 30, 30));
        k24.setForeground(new java.awt.Color(255, 255, 255));
        k24.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k24.setLabelText("");
        k24.setOpaque(true);
        k24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow38Layout = new javax.swing.GroupLayout(panelShadow38);
        panelShadow38.setLayout(panelShadow38Layout);
        panelShadow38Layout.setHorizontalGroup(
            panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow38Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k24, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow38Layout.setVerticalGroup(
            panelShadow38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow38Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("CGPA :");

        k25.setBackground(new java.awt.Color(30, 30, 30));
        k25.setForeground(new java.awt.Color(255, 255, 255));
        k25.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k25.setLabelText("");
        k25.setOpaque(true);
        k25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow43Layout = new javax.swing.GroupLayout(panelShadow43);
        panelShadow43.setLayout(panelShadow43Layout);
        panelShadow43Layout.setHorizontalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow43Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k25, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow43Layout.setVerticalGroup(
            panelShadow43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow43Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow44.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow44.setOpaque(true);
        panelShadow44.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Institution :");

        k26.setBackground(new java.awt.Color(30, 30, 30));
        k26.setForeground(new java.awt.Color(255, 255, 255));
        k26.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k26.setLabelText("");
        k26.setOpaque(true);
        k26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow44Layout = new javax.swing.GroupLayout(panelShadow44);
        panelShadow44.setLayout(panelShadow44Layout);
        panelShadow44Layout.setHorizontalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k26, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelShadow44Layout.setVerticalGroup(
            panelShadow44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow44Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow45.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow45.setOpaque(true);
        panelShadow45.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Passed Year :");

        k27.setBackground(new java.awt.Color(30, 30, 30));
        k27.setForeground(new java.awt.Color(255, 255, 255));
        k27.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k27.setLabelText("");
        k27.setOpaque(true);
        k27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow45Layout = new javax.swing.GroupLayout(panelShadow45);
        panelShadow45.setLayout(panelShadow45Layout);
        panelShadow45Layout.setHorizontalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k27, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow45Layout.setVerticalGroup(
            panelShadow45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow45Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow46.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow46.setOpaque(true);
        panelShadow46.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Department :");

        k28.setBackground(new java.awt.Color(30, 30, 30));
        k28.setForeground(new java.awt.Color(255, 255, 255));
        k28.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k28.setLabelText("");
        k28.setOpaque(true);
        k28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow46Layout = new javax.swing.GroupLayout(panelShadow46);
        panelShadow46.setLayout(panelShadow46Layout);
        panelShadow46Layout.setHorizontalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k28, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow46Layout.setVerticalGroup(
            panelShadow46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow46Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow47.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow47.setOpaque(true);
        panelShadow47.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Passed Year :");

        k31.setBackground(new java.awt.Color(30, 30, 30));
        k31.setForeground(new java.awt.Color(255, 255, 255));
        k31.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k31.setLabelText("");
        k31.setOpaque(true);
        k31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow47Layout = new javax.swing.GroupLayout(panelShadow47);
        panelShadow47.setLayout(panelShadow47Layout);
        panelShadow47Layout.setHorizontalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow47Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k31, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow47Layout.setVerticalGroup(
            panelShadow47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow47Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow48.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow48.setOpaque(true);
        panelShadow48.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Department :");

        k32.setBackground(new java.awt.Color(30, 30, 30));
        k32.setForeground(new java.awt.Color(255, 255, 255));
        k32.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k32.setLabelText("");
        k32.setOpaque(true);
        k32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow48Layout = new javax.swing.GroupLayout(panelShadow48);
        panelShadow48.setLayout(panelShadow48Layout);
        panelShadow48Layout.setHorizontalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow48Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k32, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow48Layout.setVerticalGroup(
            panelShadow48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow48Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

        k29.setBackground(new java.awt.Color(30, 30, 30));
        k29.setForeground(new java.awt.Color(255, 255, 255));
        k29.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k29.setLabelText("");
        k29.setOpaque(true);
        k29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k29ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("CGPA :");

        javax.swing.GroupLayout panelShadow49Layout = new javax.swing.GroupLayout(panelShadow49);
        panelShadow49.setLayout(panelShadow49Layout);
        panelShadow49Layout.setHorizontalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow49Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k29, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow49Layout.setVerticalGroup(
            panelShadow49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow49Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow50.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow50.setOpaque(true);
        panelShadow50.setPreferredSize(new java.awt.Dimension(510, 140));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Institution :");

        k30.setBackground(new java.awt.Color(30, 30, 30));
        k30.setForeground(new java.awt.Color(255, 255, 255));
        k30.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k30.setLabelText("");
        k30.setOpaque(true);
        k30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow50Layout = new javax.swing.GroupLayout(panelShadow50);
        panelShadow50.setLayout(panelShadow50Layout);
        panelShadow50Layout.setHorizontalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow50Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k30, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelShadow50Layout.setVerticalGroup(
            panelShadow50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow50Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        kButton5.setText("Save");
        kButton5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

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
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel23Layout.createSequentialGroup()
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelShadow47, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                        .addComponent(panelShadow49, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelShadow50, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelShadow48, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addGap(52, 52, 52)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
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

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("IELTS Score :");

        k33.setBackground(new java.awt.Color(30, 30, 30));
        k33.setForeground(new java.awt.Color(255, 255, 255));
        k33.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k33.setLabelText("");
        k33.setOpaque(true);
        k33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow18Layout = new javax.swing.GroupLayout(panelShadow18);
        panelShadow18.setLayout(panelShadow18Layout);
        panelShadow18Layout.setHorizontalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k33, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow18Layout.setVerticalGroup(
            panelShadow18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow19.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow19.setOpaque(true);

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("GRE Score :");

        k34.setBackground(new java.awt.Color(30, 30, 30));
        k34.setForeground(new java.awt.Color(255, 255, 255));
        k34.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k34.setLabelText("");
        k34.setOpaque(true);
        k34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow19Layout = new javax.swing.GroupLayout(panelShadow19);
        panelShadow19.setLayout(panelShadow19Layout);
        panelShadow19Layout.setHorizontalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k34, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow19Layout.setVerticalGroup(
            panelShadow19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow20.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow20.setOpaque(true);
        panelShadow20.setShadowColor(new java.awt.Color(0, 0, 0));
        panelShadow20.setShadowOpacity(0.1F);

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("SAT Score :");

        k35.setBackground(new java.awt.Color(30, 30, 30));
        k35.setForeground(new java.awt.Color(255, 255, 255));
        k35.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k35.setLabelText("");
        k35.setOpaque(true);
        k35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow20Layout = new javax.swing.GroupLayout(panelShadow20);
        panelShadow20.setLayout(panelShadow20Layout);
        panelShadow20Layout.setHorizontalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow20Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k35, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelShadow20Layout.setVerticalGroup(
            panelShadow20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelShadow21.setBackground(new java.awt.Color(30, 30, 30));
        panelShadow21.setOpaque(true);

        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("TOEFL Score :");

        k36.setBackground(new java.awt.Color(30, 30, 30));
        k36.setForeground(new java.awt.Color(255, 255, 255));
        k36.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        k36.setLabelText("");
        k36.setOpaque(true);
        k36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow21Layout = new javax.swing.GroupLayout(panelShadow21);
        panelShadow21.setLayout(panelShadow21Layout);
        panelShadow21Layout.setHorizontalGroup(
            panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k36, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow21Layout.setVerticalGroup(
            panelShadow21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(k36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kButton3.setText("Save");
        kButton3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelShadow18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelShadow19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelShadow21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                .addGap(56, 56, 56)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void k1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k1ActionPerformed

    private void k2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k2ActionPerformed

    private void k3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k3ActionPerformed

    private void k4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k4ActionPerformed

    private void radioButtonCustom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCustom4ActionPerformed

    private void k63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k63ActionPerformed

    private void radioButtonCustom6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCustom6ActionPerformed

    private void k52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k52ActionPerformed

    private void k10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k10ActionPerformed

    private void k17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k17ActionPerformed

    private void k18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k18ActionPerformed

    private void k19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k19ActionPerformed

    private void k20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k20ActionPerformed

    private void k21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k21ActionPerformed

    private void k22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k22ActionPerformed

    private void k23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k23ActionPerformed

    private void k24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k24ActionPerformed

    private void k25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k25ActionPerformed

    private void k26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k26ActionPerformed

    private void k27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k27ActionPerformed

    private void k28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k28ActionPerformed

    private void k29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k29ActionPerformed

    private void k30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k30ActionPerformed

    private void k31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k31ActionPerformed

    private void k32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k32ActionPerformed

    private void k33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k33ActionPerformed

    private void k34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k34ActionPerformed

    private void k36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k36ActionPerformed

    private void k35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k35ActionPerformed

    private void k51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k51ActionPerformed

    private void k53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k53ActionPerformed

    private void k9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_k9ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            String update="UPDATE student_information SET Name=?,Username=?,Email=?,Phone=? WHERE ID="+GetID.ID;
            ps=conn.prepareStatement(update);
            ps.setString(1, k1.getText());            
            ps.setString(2, k2.getText());
            ps.setString(3, k3.getText());
            ps.setString(4, k4.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Changes Saved");
            
            
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
                
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp);
        } 
        
        
        
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            String update="UPDATE student_information SET Gender=?,Day=?,Month=?,Year=?, Age=?, Country=? WHERE ID="+GetID.ID;
            ps=conn.prepareStatement(update);
            if(k51.isSelected())
            {
                ps.setString(1, "Male");            
            }
            else if(k52.isSelected())
            {
                ps.setString(1, "Female");            
            }
            else if(k53.isSelected())
            {
                ps.setString(1, "Others");            
            }
            
            ps.setString(2, k61.getSelectedItem().toString());    
            ps.setString(3, k62.getSelectedItem().toString());            
            ps.setString(4, k63.getSelectedItem().toString());            
            ps.setString(5, k7.getValue().toString());
            ps.setString(6, k8.getSelectedItem().toString());           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Changes Saved");
            
            
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

           
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        
         try{
            String update="UPDATE student_information SET curr_study_lvl=?,pref_study_lvl=?,pref_area_study=?,pref_year=?, curr_location=?, pref_dest=? WHERE ID="+GetID.ID;
            ps=conn.prepareStatement(update);
            
            ps.setString(1, k11.getSelectedItem().toString());    
            ps.setString(2, k12.getSelectedItem().toString());            
            ps.setString(3, k13.getSelectedItem().toString());   
            ps.setString(4, k14.getSelectedItem().toString());            
            ps.setString(5, k15.getSelectedItem().toString());            
            ps.setString(6, k16.getSelectedItem().toString());            

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Changes Saved");
            
            
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

           
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp);
        }
        
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        
        try{
            String update="UPDATE student_information SET ssc_gpa=?, ssc_school=?, ssc_year=?, ssc_dept=?, hsc_gpa=?, hsc_school=?, hsc_year=?, hsc_dept=?, bsc_cg=?, bsc_uni=?, bsc_year=?, bsc_dept=?, msc_cg=?, msc_uni=?, msc_year=?, msc_dept=? WHERE ID="+GetID.ID;
            ps=conn.prepareStatement(update);
            
            ps.setString(1, k17.getText());  
            ps.setString(2, k18.getText());    
            ps.setString(3, k19.getText());    
            ps.setString(4, k20.getText());    
            ps.setString(5, k21.getText());    
            ps.setString(6, k22.getText());    
            ps.setString(7, k23.getText());    
            ps.setString(8, k24.getText());    
            ps.setString(9, k25.getText());    
            ps.setString(10, k26.getText());    
            ps.setString(11, k27.getText());    
            ps.setString(12, k28.getText());    
            ps.setString(13, k29.getText());    
            ps.setString(14, k30.getText());    
            ps.setString(15, k31.getText());    
            ps.setString(16, k32.getText());            

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Changes Saved");
            
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

           
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp);
        }
        
        
        
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
            String update="UPDATE student_information SET ielts=?, gre=?, sat=?, toefl=? WHERE ID="+GetID.ID;
            ps=conn.prepareStatement(update);
            
            ps.setString(1, k33.getText());    
            ps.setString(2, k34.getText());    
            ps.setString(3, k35.getText());    
            ps.setString(4, k36.getText());     

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Changes Saved");
            
            
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

           
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp);
        }
        
    }//GEN-LAST:event_kButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private textfield.TextField k1;
    private textfield.TextField k10;
    private javax.swing.JLabel k100;
    private combobox.Combobox k11;
    private combobox.Combobox k12;
    private combobox.Combobox k13;
    private combobox.Combobox k14;
    private combobox.Combobox k15;
    private combobox.Combobox k16;
    private textfield.TextField k17;
    private textfield.TextField k18;
    private textfield.TextField k19;
    private textfield.TextField k2;
    private textfield.TextField k20;
    private textfield.TextField k21;
    private textfield.TextField k22;
    private textfield.TextField k23;
    private textfield.TextField k24;
    private textfield.TextField k25;
    private textfield.TextField k26;
    private textfield.TextField k27;
    private textfield.TextField k28;
    private textfield.TextField k29;
    private textfield.TextField k3;
    private textfield.TextField k30;
    private textfield.TextField k31;
    private textfield.TextField k32;
    private textfield.TextField k33;
    private textfield.TextField k34;
    private textfield.TextField k35;
    private textfield.TextField k36;
    private textfield.TextField k4;
    private radio_button.RadioButtonCustom k51;
    private radio_button.RadioButtonCustom k52;
    private radio_button.RadioButtonCustom k53;
    private combobox.Combobox k61;
    private combobox.Combobox k62;
    private combobox.Combobox k63;
    private javax.swing.JSpinner k7;
    private combobox.Combobox k8;
    private textfield.TextField k9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
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
