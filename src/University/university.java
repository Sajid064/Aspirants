/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package University;

import Login.GetID;
import java.awt.BorderLayout;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.awt.Component;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import scrollbar.ScrollBarCustom;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.UIManager.put;

/**
 *
 * @author SAJID
 */
public class university extends javax.swing.JFrame {

    /**
     * Creates new form university
     */
    Connection conn=null;
    PreparedStatement ps=null;
    PreparedStatement ps2=null;

    ResultSet rs=null;
    ResultSet rs2=null;

    int x=80;
    int st=1;
   
    public university() {
        initComponents();
        
        jPanel1.setVisible(false);
        conn=Jconnection.CC();
        kButton1.setVisible(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        combobox3.setVisible(false);
        combobox1.setVisible(false);
        radioButtonCustom1.setVisible(false);
        radioButtonCustom2.setVisible(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        addPanel(body,"SELECT * FROM university_information order by ranking asc"); 
        winButton1.initEvent(this);
    }
    
    public university(String str) {
        initComponents();
        
        jPanel1.setVisible(false);
        conn=Jconnection.CC();
        kButton1.setVisible(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        combobox3.setVisible(false);
        combobox1.setVisible(false);
        radioButtonCustom1.setVisible(false);
        radioButtonCustom2.setVisible(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        addPanel(body,str); 
        winButton1.initEvent(this);

    }
    
    private void addPanel(JPanel panel,String str){
        //int x1 = 40, y1 = 40, w1= 350, h1= 350;
        
        try{
            String query = str;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            int i = 1; 
            int x1 = 40, y1 = 20, w1= 350, h1= 350;
            while(rs.next()){
               
                default_uni obj = new default_uni();
                //default_uni obj = new default_uni();
                obj.setBounds(x1, y1, w1, h1);
                x1+=390;
                obj.setVisible(true); 
                obj.setPreferredSize(new java.awt.Dimension(350, 350));
                String name = rs.getString("uni_name"), country = rs.getString("country"), rank = rs.getString("ranking"), mncg = rs.getString("mincg"), req = rs.getString("requirements");
                double m;
                if(mncg==null||mncg.isEmpty()){
                    m=2.5;
                }
                else {                    
                    try{
                        m=Double.parseDouble(mncg);
                    } catch (NumberFormatException nfe){
                        m=0.0;
                    }    
                }
                double n;
                if(req==null||req.isEmpty()){
                    n=7.0;
                }
                else {
                    n=Double.parseDouble(req);
                    try{
                        n=Double.parseDouble(req);
                    } catch (NumberFormatException nfe){
                        n=0.0;
                    }       
                }
                System.out.println(m);
                System.out.println(n);
                if(GetID.flag==0){
                    obj.pro.setBackground(yellow);
                }
                else
                {
                    String q="SELECT bsc_cg, ielts from student_information where ID = "+GetID.ID;
                    ps2=conn.prepareStatement(q);
                    rs2=ps2.executeQuery();
                    rs2.next();
                    double p;
                    String s=rs2.getString("bsc_cg");
                    if(s==null||s.isEmpty()){
                        p=0.0;
                    }
                    else {                        
                        try{
                            p=Double.parseDouble(s);
                        } catch (NumberFormatException nfe){
                            p=0.0;
                        }
                        
                    }
                    String u=rs2.getString("ielts");
                    double r;
                    if(u==null||u.isEmpty()){
                        r=0.0;
                    }
                    else {
                        try{
                            r=Double.parseDouble(u);
                        } catch (NumberFormatException nfe){
                            r=0.0;
                        }        
                    }
                   
                    if(p>=m&&r>=n){
                        obj.pro.setBackground(green);
                    }
                    else {
                        obj.pro.setBackground(red);
                    }
                }    
                
                
                /*
                ImageIcon iconLogo = new ImageIcon("images/paran.png");

          jLabel1.setIcon(iconLogo);
                */
                ImageIcon iconLogo = new ImageIcon("src/University/image/"+rank+".jpg"); 
                obj.pics.setIcon(iconLogo);
                
                
                //obj.pics.setText(pic); 
                obj.Uniname.setText(name); 
                obj.country.setText("Country : "+country);
                obj.qsrank.setText("QS Rank : "+rank); 
                obj.getObj(this);
                panel.add(obj); 
                if(i%3==0){
                    x1 = 40; 
                    y1 += 390;
                    //break;
                }
                i++; 
                //System.out.println(country+"  " + name+ " ");
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        
//        for(int i =1;i<=6;i++)
//        {
//            default_uni obj = new default_uni();
//            obj.setBounds(x1, y1, w1, h1);
//            x1+=390;
//            obj.setVisible(true); 
//            obj.setPreferredSize(new java.awt.Dimension(350, 350));
//            obj.pics.setText("this is pics"); 
//            obj.country.setText("BD"); 
//            obj.qsrank.setText("1"); 
//            panel.add(obj); 
//            if(i%3==0){
//                x1 = 40; 
//                y1 += 390; 
//            }
//        }
    }
    
    //private void addPanel(int number_of_uni, String image, String country, String name, )

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton2 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        combobox1 = new combobox.Combobox();
        textField1 = new textfield.TextField();
        textField2 = new textfield.TextField();
        textField3 = new textfield.TextField();
        kButton1 = new com.k33ptoo.components.KButton();
        combobox3 = new combobox.Combobox();
        radioButtonCustom1 = new radio_button.RadioButtonCustom();
        radioButtonCustom2 = new radio_button.RadioButtonCustom();
        scroll = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        winButton1 = new University.win_button1.WinButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton2.setForeground(new java.awt.Color(0, 0, 0));
        kButton2.setText("|||");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(0, 153, 153));
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton2.setkSelectedColor(new java.awt.Color(0, 153, 153));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 16, 48, 48));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 800));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combobox1.setBackground(new java.awt.Color(0, 0, 0));
        combobox1.setForeground(new java.awt.Color(255, 255, 255));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Name", "QS Rank", "Requirements", "Tution Fee" }));
        combobox1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        combobox1.setLabeText("Sort by");
        combobox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combobox1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combobox1MousePressed(evt);
            }
        });
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        jPanel1.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, 50));

        textField1.setBackground(new java.awt.Color(0, 0, 0));
        textField1.setForeground(new java.awt.Color(255, 255, 255));
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textField1.setLabelText("Minimum CGPA");
        textField1.setOpaque(true);
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 50));

        textField2.setBackground(new java.awt.Color(0, 0, 0));
        textField2.setForeground(new java.awt.Color(255, 255, 255));
        textField2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textField2.setLabelText("Maximum CGPA");
        textField2.setOpaque(true);
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        jPanel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 50));

        textField3.setBackground(new java.awt.Color(0, 0, 0));
        textField3.setForeground(new java.awt.Color(255, 255, 255));
        textField3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        textField3.setLabelText("Search");
        textField3.setOpaque(true);
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        jPanel1.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 112, 200, 50));

        kButton1.setText("Apply");
        kButton1.setToolTipText("");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(153, 255, 204));
        kButton1.setkBorderRadius(40);
        kButton1.setkEndColor(new java.awt.Color(102, 255, 255));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 0, 102));
        kButton1.setkSelectedColor(new java.awt.Color(102, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(153, 255, 204));
        kButton1.setOpaque(true);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 200, 45));

        combobox3.setBackground(new java.awt.Color(0, 0, 0));
        combobox3.setForeground(new java.awt.Color(255, 255, 255));
        combobox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "Australia", "Canada", "Ireland", "New Zealand", "United Kingdom", "United States" }));
        combobox3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        combobox3.setLabeText("Country");
        combobox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combobox3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combobox3MousePressed(evt);
            }
        });
        combobox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox3ActionPerformed(evt);
            }
        });
        jPanel1.add(combobox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 200, 50));

        radioButtonCustom1.setBackground(new java.awt.Color(0, 0, 0));
        radioButtonCustom1.setForeground(new java.awt.Color(140, 140, 140));
        radioButtonCustom1.setText("Descending");
        radioButtonCustom1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        radioButtonCustom1.setOpaque(true);
        radioButtonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCustom1ActionPerformed(evt);
            }
        });
        jPanel1.add(radioButtonCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        radioButtonCustom2.setBackground(new java.awt.Color(0, 0, 0));
        radioButtonCustom2.setForeground(new java.awt.Color(140, 140, 140));
        radioButtonCustom2.setText("Ascending");
        radioButtonCustom2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        radioButtonCustom2.setOpaque(true);
        radioButtonCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCustom2ActionPerformed(evt);
            }
        });
        jPanel1.add(radioButtonCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 800));

        scroll.setBackground(new java.awt.Color(0, 0, 0));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        body.setBackground(new java.awt.Color(30, 30, 30));
        body.setPreferredSize(new java.awt.Dimension(1220, 2960));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2960, Short.MAX_VALUE)
        );

        scroll.setViewportView(body);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 1220, 760));

        jPanel3.setBackground(new java.awt.Color(30, 30, 30));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(winButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1220, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        // TODO add your handling code here:
            // TODO add your handling code here:
        if(x==280)
        {
            kButton1.setVisible(false);
            textField1.setVisible(false);
            textField2.setVisible(false);
            textField3.setVisible(false);
            combobox3.setVisible(false);
            combobox1.setVisible(false);
            radioButtonCustom1.setVisible(false);
            radioButtonCustom2.setVisible(false);
            scroll.setWheelScrollingEnabled(true);

            Thread th= new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=280;i>=80;i-=2)
                        {
                            Thread.sleep((long) 1);
                            jPanel1.setSize(i, 800);

                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=80;
        }
        else if(x==80)
        {
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            kButton1.setVisible(true);
            textField1.setVisible(true);
            textField2.setVisible(true);
            textField3.setVisible(true);
            combobox3.setVisible(true);
            combobox1.setVisible(true);
            radioButtonCustom1.setVisible(true);
            radioButtonCustom2.setVisible(true);
            scroll.setWheelScrollingEnabled(false);
//            jPanel1.show();
//            jPanel1.setSize(280, 800);
            Thread th= new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=80;i<=280;i+=2)
                        {
                            Thread.sleep((long)1);
                            jPanel1.setSize(i, 800);

                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=280;
        }

    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String str=textField3.getText();
        
        

        String country =(String) combobox3.getSelectedItem().toString(); 
        
        
        double mn_cg,mx_cg;
        if((textField1.getText().length()==0))
        {
            mn_cg=0.0;
        }
        else
        {
            mn_cg=Float.parseFloat(textField1.getText());
        }
        if((textField2.getText().length()==0))
        {
            mx_cg=10.0;
        }
        else
        {
            mx_cg=Float.parseFloat(textField2.getText());
        }
        if(country.length()==2)
        {
            country="";
        }
        
        String srt=combobox1.getSelectedItem().toString();
        System.out.println(srt);
        String query="";

        if(srt.length()==2)
        {
            if(st==2)
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by ranking desc";
            }
            else
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by ranking asc";
            }
        
        }
        else
        {
        if(srt=="Name")
        {
            if(st==1)
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by uni_name asc";
            }
            else
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by uni_name desc";
            }
        }
        else if(srt=="QS Rank")
        {
            if(st==1)
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by ranking asc";
            }
            else
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by ranking desc";
            }
        }
//        else if(srt=="Tution Fee")
//        {
//            if(st==1)
//            {
//                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by "+srt+" asc";
//            }
//            else
//            {
//                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by "+srt+" desc";
//            }
//        }
        else if(srt=="Requirements")
        {
            if(st==1)
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by requirements asc";
            }
            else
            {
                query="select * from  university_information where uni_name like '%"+str+"%' and requirements >=" +mn_cg+ " and requirements <= " +mx_cg+ "and country like '%"+country+"%' order by requirements desc";
            }
        }
        }
        showForm();
        addPanel(body,query);

        kButton1.setVisible(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);
        combobox3.setVisible(false);
        combobox1.setVisible(false);
        radioButtonCustom1.setVisible(false);
        radioButtonCustom2.setVisible(false);


        scroll.setWheelScrollingEnabled(true);
        Thread th= new Thread(){
            @Override
            public void run(){
                try{
                    for(int i=280;i>=80;i-=2)
                    {
                        Thread.sleep((long) 1);
                        jPanel1.setSize(i, 800);

                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };th.start();
        x=80;
        //body.setLayout(new BorderLayout());
       
       System.out.println("apply");
        //addPanel(body); 


        
    }//GEN-LAST:event_kButton1ActionPerformed

    private void combobox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combobox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1MouseClicked

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_combobox1ActionPerformed

    private void combobox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combobox1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox1MousePressed

    private void combobox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combobox3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3MouseClicked

    private void combobox3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combobox3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3MousePressed

    private void combobox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3ActionPerformed

    private void radioButtonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom1ActionPerformed
        // TODO add your handling code here:
        radioButtonCustom2.setSelected(false);
        st=2;
    }//GEN-LAST:event_radioButtonCustom1ActionPerformed

    private void radioButtonCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCustom2ActionPerformed
        // TODO add your handling code here:
        radioButtonCustom1.setSelected(false);
        st=1;
    }//GEN-LAST:event_radioButtonCustom2ActionPerformed

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
            java.util.logging.Logger.getLogger(university.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(university.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(university.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(university.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new university().setVisible(true);
                
            
            }
        });
        
    }
     private void showForm() {
        body.removeAll();
//        body.add(com);
        body.revalidate();
        body.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private combobox.Combobox combobox1;
    private combobox.Combobox combobox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private radio_button.RadioButtonCustom radioButtonCustom1;
    private radio_button.RadioButtonCustom radioButtonCustom2;
    private javax.swing.JScrollPane scroll;
    private textfield.TextField textField1;
    private textfield.TextField textField2;
    private textfield.TextField textField3;
    private University.win_button1.WinButton winButton1;
    // End of variables declaration//GEN-END:variables
}
