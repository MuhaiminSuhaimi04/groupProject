/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author reqaw
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainBackPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Workinghrs = new javax.swing.JLabel();
        Sattothurs = new javax.swing.JLabel();
        timeopen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pricestxt = new javax.swing.JLabel();
        pricetypetxt = new javax.swing.JLabel();
        pricingtxt = new javax.swing.JLabel();
        Emergencybackpanel = new javax.swing.JPanel();
        econtacttxt = new javax.swing.JLabel();
        contact1txt = new javax.swing.JLabel();
        contact2txt = new javax.swing.JLabel();
        contacttxt2 = new javax.swing.JLabel();
        MenuBackPanel = new javax.swing.JPanel();
        menutxt = new javax.swing.JLabel();
        LaundryBackPanel = new javax.swing.JPanel();
        laundrytxt = new javax.swing.JLabel();
        CalculatorBackPanel = new javax.swing.JPanel();
        calctxt = new javax.swing.JLabel();
        AlarmBackPanel = new javax.swing.JPanel();
        alarmtxt = new javax.swing.JLabel();
        reservationbackpanel = new javax.swing.JPanel();
        reservationtxt = new javax.swing.JLabel();
        Feedbackpanel = new javax.swing.JPanel();
        Feedbacktxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Welcomemsg = new javax.swing.JLabel();
        advlausysmsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1118, 666));
        setPreferredSize(new java.awt.Dimension(1118, 666));
        getContentPane().setLayout(null);

        MainBackPanel.setBackground(new java.awt.Color(153, 153, 153));
        MainBackPanel.setMinimumSize(new java.awt.Dimension(1118, 666));
        MainBackPanel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        Workinghrs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Workinghrs.setForeground(new java.awt.Color(255, 255, 255));
        Workinghrs.setText("Working Hours : ");

        Sattothurs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sattothurs.setForeground(new java.awt.Color(255, 255, 255));
        Sattothurs.setText("Saturday - Thursday");

        timeopen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeopen.setForeground(new java.awt.Color(255, 255, 255));
        timeopen.setText("8AM - 10PM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Workinghrs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(Sattothurs)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeopen)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Workinghrs)
                .addGap(12, 12, 12)
                .addComponent(Sattothurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeopen)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        MainBackPanel.add(jPanel2);
        jPanel2.setBounds(440, 100, 240, 104);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        pricestxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pricestxt.setForeground(new java.awt.Color(255, 255, 255));
        pricestxt.setText("Prices :");

        pricetypetxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pricetypetxt.setForeground(new java.awt.Color(255, 255, 255));
        pricetypetxt.setText("Type -     |     Washing     |     Dryer     |     Both     |");

        pricingtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pricingtxt.setForeground(new java.awt.Color(255, 255, 255));
        pricingtxt.setText("Pricing -  |    RM 4.00       |   RM 7.00   |  RM 10.00 |");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pricestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pricetypetxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pricingtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pricestxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricetypetxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pricingtxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainBackPanel.add(jPanel3);
        jPanel3.setBounds(390, 240, 350, 90);

        Emergencybackpanel.setBackground(new java.awt.Color(204, 204, 204));

        econtacttxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        econtacttxt.setForeground(new java.awt.Color(255, 255, 255));
        econtacttxt.setText("Emergency Contact :");

        contact1txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contact1txt.setForeground(new java.awt.Color(255, 255, 255));
        contact1txt.setText("Hafiz - 01938553751");

        contact2txt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contact2txt.setForeground(new java.awt.Color(255, 255, 255));
        contact2txt.setText("Thiru - 01482572063 ");

        contacttxt2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        contacttxt2.setForeground(new java.awt.Color(255, 255, 255));
        contacttxt2.setText("Contact us for any concerns or enquiries regarding our laundry system");

        javax.swing.GroupLayout EmergencybackpanelLayout = new javax.swing.GroupLayout(Emergencybackpanel);
        Emergencybackpanel.setLayout(EmergencybackpanelLayout);
        EmergencybackpanelLayout.setHorizontalGroup(
            EmergencybackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmergencybackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmergencybackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmergencybackpanelLayout.createSequentialGroup()
                        .addComponent(contact2txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                        .addComponent(contacttxt2))
                    .addGroup(EmergencybackpanelLayout.createSequentialGroup()
                        .addGroup(EmergencybackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(econtacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EmergencybackpanelLayout.setVerticalGroup(
            EmergencybackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmergencybackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmergencybackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmergencybackpanelLayout.createSequentialGroup()
                        .addComponent(econtacttxt)
                        .addGap(25, 25, 25)
                        .addComponent(contact1txt)
                        .addGap(20, 20, 20)
                        .addComponent(contact2txt)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmergencybackpanelLayout.createSequentialGroup()
                        .addComponent(contacttxt2)
                        .addContainerGap())))
        );

        MainBackPanel.add(Emergencybackpanel);
        Emergencybackpanel.setBounds(10, 400, 880, 136);

        MenuBackPanel.setBackground(new java.awt.Color(0, 0, 0));

        menutxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menutxt.setForeground(new java.awt.Color(255, 255, 255));
        menutxt.setText("Menu");

        javax.swing.GroupLayout MenuBackPanelLayout = new javax.swing.GroupLayout(MenuBackPanel);
        MenuBackPanel.setLayout(MenuBackPanelLayout);
        MenuBackPanelLayout.setHorizontalGroup(
            MenuBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menutxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        MenuBackPanelLayout.setVerticalGroup(
            MenuBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menutxt)
                .addContainerGap())
        );

        MainBackPanel.add(MenuBackPanel);
        MenuBackPanel.setBounds(0, 80, 250, 46);

        LaundryBackPanel.setBackground(new java.awt.Color(0, 0, 0));

        laundrytxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        laundrytxt.setForeground(new java.awt.Color(255, 255, 255));
        laundrytxt.setText("Laundry");

        javax.swing.GroupLayout LaundryBackPanelLayout = new javax.swing.GroupLayout(LaundryBackPanel);
        LaundryBackPanel.setLayout(LaundryBackPanelLayout);
        LaundryBackPanelLayout.setHorizontalGroup(
            LaundryBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaundryBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(laundrytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        LaundryBackPanelLayout.setVerticalGroup(
            LaundryBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LaundryBackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(laundrytxt)
                .addContainerGap())
        );

        MainBackPanel.add(LaundryBackPanel);
        LaundryBackPanel.setBounds(0, 130, 250, 46);

        CalculatorBackPanel.setBackground(new java.awt.Color(0, 0, 0));

        calctxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        calctxt.setForeground(new java.awt.Color(255, 255, 255));
        calctxt.setText("Calculator");

        javax.swing.GroupLayout CalculatorBackPanelLayout = new javax.swing.GroupLayout(CalculatorBackPanel);
        CalculatorBackPanel.setLayout(CalculatorBackPanelLayout);
        CalculatorBackPanelLayout.setHorizontalGroup(
            CalculatorBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calctxt)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        CalculatorBackPanelLayout.setVerticalGroup(
            CalculatorBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calctxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainBackPanel.add(CalculatorBackPanel);
        CalculatorBackPanel.setBounds(0, 180, 250, 46);

        AlarmBackPanel.setBackground(new java.awt.Color(0, 0, 0));

        alarmtxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        alarmtxt.setForeground(new java.awt.Color(255, 255, 255));
        alarmtxt.setText("Alarm");

        javax.swing.GroupLayout AlarmBackPanelLayout = new javax.swing.GroupLayout(AlarmBackPanel);
        AlarmBackPanel.setLayout(AlarmBackPanelLayout);
        AlarmBackPanelLayout.setHorizontalGroup(
            AlarmBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        AlarmBackPanelLayout.setVerticalGroup(
            AlarmBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alarmtxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainBackPanel.add(AlarmBackPanel);
        AlarmBackPanel.setBounds(0, 230, 250, 46);

        reservationbackpanel.setBackground(new java.awt.Color(0, 0, 0));

        reservationtxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reservationtxt.setForeground(new java.awt.Color(255, 255, 255));
        reservationtxt.setText("Reservation");

        javax.swing.GroupLayout reservationbackpanelLayout = new javax.swing.GroupLayout(reservationbackpanel);
        reservationbackpanel.setLayout(reservationbackpanelLayout);
        reservationbackpanelLayout.setHorizontalGroup(
            reservationbackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationbackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservationtxt)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        reservationbackpanelLayout.setVerticalGroup(
            reservationbackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationbackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservationtxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainBackPanel.add(reservationbackpanel);
        reservationbackpanel.setBounds(0, 280, 250, 46);

        Feedbackpanel.setBackground(new java.awt.Color(0, 0, 0));

        Feedbacktxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Feedbacktxt.setForeground(new java.awt.Color(255, 255, 255));
        Feedbacktxt.setText("Feedback");

        javax.swing.GroupLayout FeedbackpanelLayout = new javax.swing.GroupLayout(Feedbackpanel);
        Feedbackpanel.setLayout(FeedbackpanelLayout);
        FeedbackpanelLayout.setHorizontalGroup(
            FeedbackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Feedbacktxt)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        FeedbackpanelLayout.setVerticalGroup(
            FeedbackpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Feedbacktxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainBackPanel.add(Feedbackpanel);
        Feedbackpanel.setBounds(0, 330, 250, 46);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Welcomemsg.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Welcomemsg.setForeground(new java.awt.Color(255, 255, 255));
        Welcomemsg.setText("Welcome To Our");

        advlausysmsg.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        advlausysmsg.setForeground(new java.awt.Color(255, 255, 255));
        advlausysmsg.setText("Advanced Laundry System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Welcomemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(advlausysmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(337, 337, 337))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Welcomemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(advlausysmsg)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        MainBackPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 70);

        getContentPane().add(MainBackPanel);
        MainBackPanel.setBounds(90, 30, 910, 575);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/New Project.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlarmBackPanel;
    private javax.swing.JPanel CalculatorBackPanel;
    private javax.swing.JPanel Emergencybackpanel;
    private javax.swing.JPanel Feedbackpanel;
    private javax.swing.JLabel Feedbacktxt;
    private javax.swing.JPanel LaundryBackPanel;
    private javax.swing.JPanel MainBackPanel;
    private javax.swing.JPanel MenuBackPanel;
    private javax.swing.JLabel Sattothurs;
    private javax.swing.JLabel Welcomemsg;
    private javax.swing.JLabel Workinghrs;
    private javax.swing.JLabel advlausysmsg;
    private javax.swing.JLabel alarmtxt;
    private javax.swing.JLabel calctxt;
    private javax.swing.JLabel contact1txt;
    private javax.swing.JLabel contact2txt;
    private javax.swing.JLabel contacttxt2;
    private javax.swing.JLabel econtacttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel laundrytxt;
    private javax.swing.JLabel menutxt;
    private javax.swing.JLabel pricestxt;
    private javax.swing.JLabel pricetypetxt;
    private javax.swing.JLabel pricingtxt;
    private javax.swing.JPanel reservationbackpanel;
    private javax.swing.JLabel reservationtxt;
    private javax.swing.JLabel timeopen;
    // End of variables declaration//GEN-END:variables
}
