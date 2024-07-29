import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class JFrame extends javax.swing.JFrame {
    private boolean x_Turn = true;
    private boolean enable_button1 = true;
    private boolean enable_button2 = true;
    private boolean enable_button3 = true;
    private boolean enable_button4 = true;
    private boolean enable_button5 = true;
    private boolean enable_button6 = true;
    private boolean enable_button7 = true;
    private boolean enable_button8 = true;
    private boolean enable_button9 = true;

    private int x_PT = 0;
    private int o_PT = 0;

    public JFrame() {
        initComponents();
    }

    public void changeWinLook(JButton b1, JButton b2, JButton b3, String winner){
        b1.setBackground(new Color(95,160,160));
        b2.setBackground(new Color(95,160,160));
        b3.setBackground(new Color(95,160,160));

        b1.setForeground(new Color(255,255,204));
        b2.setForeground(new Color(255,255,204));
        b3.setForeground(new Color(255,255,204));

        enable_button1 = false;
        enable_button2 = false;
        enable_button3 = false;
        enable_button4 = false;
        enable_button5 = false;
        enable_button6 = false;
        enable_button7 = false;
        enable_button8 = false;
        enable_button9 = false;

        if(winner == "X"){
            x_PT++;
            xScore.setText(x_PT + "");
        }else if(winner == "O"){
            o_PT++;
            oScore.setText(o_PT + "");
        }
    }

    public void tie(){
        jButton1.setBackground(new Color(95,160,160));
        jButton2.setBackground(new Color(95,160,160));
        jButton3.setBackground(new Color(95,160,160));
        jButton4.setBackground(new Color(95,160,160));
        jButton5.setBackground(new Color(95,160,160));
        jButton6.setBackground(new Color(95,160,160));
        jButton7.setBackground(new Color(95,160,160));
        jButton8.setBackground(new Color(95,160,160));
        jButton9.setBackground(new Color(95,160,160));

        jButton1.setForeground(new Color(255,255,204));
        jButton2.setForeground(new Color(255,255,204));
        jButton3.setForeground(new Color(255,255,204));
        jButton4.setForeground(new Color(255,255,204));
        jButton5.setForeground(new Color(255,255,204));
        jButton6.setForeground(new Color(255,255,204));
        jButton7.setForeground(new Color(255,255,204));
        jButton8.setForeground(new Color(255,255,204));
        jButton9.setForeground(new Color(255,255,204));

        enable_button1 = false;
        enable_button2 = false;
        enable_button3 = false;
        enable_button4 = false;
        enable_button5 = false;
        enable_button6 = false;
        enable_button7 = false;
        enable_button8 = false;
        enable_button9 = false;
    }

    public void result(){
        if(jButton1.getText() == jButton2.getText() && jButton1.getText() == jButton3.getText()){
            if(jButton1.getText() != ""){
                String winner = jButton1.getText();
                changeWinLook(jButton1, jButton2, jButton3, winner);
            }
        }else
        if(jButton1.getText() == jButton5.getText() && jButton1.getText() == jButton9.getText()){
            if(jButton1.getText() != ""){
                String winner = jButton1.getText();
                changeWinLook(jButton1, jButton5, jButton9, winner);
            }
        }else
        if(jButton1.getText() == jButton4.getText() && jButton1.getText() == jButton7.getText()){
            if(jButton1.getText() != ""){
                String winner = jButton1.getText();
                changeWinLook(jButton1, jButton4, jButton7, winner);
            }
        }else
        if(jButton2.getText() == jButton5.getText() && jButton2.getText() == jButton8.getText()){
            if(jButton2.getText() != ""){
                String winner = jButton2.getText();
                changeWinLook(jButton2, jButton5, jButton8, winner);
            }
        }else
        if(jButton3.getText() == jButton5.getText() && jButton3.getText() == jButton7.getText()){
            if(jButton3.getText() != ""){
                String winner = jButton3.getText();
                changeWinLook(jButton3, jButton5, jButton7, winner);
            }
        }else
        if(jButton3.getText() == jButton6.getText() && jButton6.getText() == jButton9.getText()){
            if(jButton3.getText() != ""){
                String winner = jButton3.getText();
                changeWinLook(jButton3, jButton6, jButton9, winner);
            }
        }else
        if(jButton9.getText() == jButton8.getText() && jButton9.getText() == jButton7.getText()){
            if(jButton9.getText() != ""){
                String winner = jButton9.getText();
                changeWinLook(jButton9, jButton8, jButton7, winner);
            }
        }else
        if(jButton4.getText() == jButton5.getText() && jButton4.getText() == jButton6.getText()){
            if(jButton4.getText() != ""){
                String winner = jButton4.getText();
                changeWinLook(jButton4, jButton5, jButton6, winner);
            }
        }else if(jButton1.getText() != "" &&
                jButton2.getText() != "" &&
                jButton3.getText() != "" &&
                jButton4.getText() != "" &&
                jButton5.getText() != "" &&
                jButton6.getText() != "" &&
                jButton7.getText() != "" &&
                jButton8.getText() != "" &&
                jButton9.getText() != ""
        ){
            tie();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        newGameBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton10.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(95, 160, 160));

        jPanel2.setBackground(new java.awt.Color(95, 160, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel6.setBackground(new java.awt.Color(90, 160, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setBackground(new java.awt.Color(95, 160, 160));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Player O: ");

        jLabel3.setBackground(new java.awt.Color(95, 160, 160));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 46)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Player X: ");

        xScore.setFont(new java.awt.Font("Snap ITC", 1, 46)); // NOI18N
        xScore.setForeground(new java.awt.Color(255, 255, 204));
        xScore.setText("0");

        oScore.setFont(new java.awt.Font("Snap ITC", 1, 46)); // NOI18N
        oScore.setForeground(new java.awt.Color(255, 255, 204));
        oScore.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(oScore))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(xScore)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xScore))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(oScore))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(90, 160, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setPreferredSize(new java.awt.Dimension(4, 185));

        newGameBtn.setBackground(new java.awt.Color(255, 255, 180));
        newGameBtn.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        newGameBtn.setForeground(new java.awt.Color(95, 160, 160));
        newGameBtn.setText("New Game");
        newGameBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newGameBtn.setFocusPainted(false);
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 180));
        exitBtn.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(95, 160, 160));
        exitBtn.setText("Exit");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setFocusPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(255, 255, 180));
        resetBtn.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(95, 160, 160));
        resetBtn.setText("Reset");
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.setFocusPainted(false);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(newGameBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(newGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(95, 160, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setBackground(new java.awt.Color(255, 255, 176));
        jButton1.setForeground(new java.awt.Color(95, 160, 160));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 176));
        jButton2.setForeground(new java.awt.Color(95, 160, 160));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 176));
        jButton3.setForeground(new java.awt.Color(95, 160, 160));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 176));
        jButton4.setForeground(new java.awt.Color(95, 160, 160));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 176));
        jButton5.setForeground(new java.awt.Color(95, 160, 160));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 176));
        jButton6.setForeground(new java.awt.Color(95, 160, 160));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 176));
        jButton7.setForeground(new java.awt.Color(95, 160, 160));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 176));
        jButton8.setForeground(new java.awt.Color(95, 160, 160));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 176));
        jButton9.setForeground(new java.awt.Color(95, 160, 160));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
        );

        jPanel5.setBackground(new java.awt.Color(95, 160, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setPreferredSize(new java.awt.Dimension(4, 80));

        jLabel1.setBackground(new java.awt.Color(95, 160, 160));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC-TAC-TOE");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton1.setBackground(new Color(255,255,176));
        jButton1.setForeground(new Color(95,160,160));
        jButton2.setBackground(new Color(255,255,176));
        jButton2.setForeground(new Color(95,160,160));
        jButton3.setBackground(new Color(255,255,176));
        jButton3.setForeground(new Color(95,160,160));
        jButton4.setBackground(new Color(255,255,176));
        jButton4.setForeground(new Color(95,160,160));
        jButton5.setBackground(new Color(255,255,176));
        jButton5.setForeground(new Color(95,160,160));
        jButton6.setBackground(new Color(255,255,176));
        jButton6.setForeground(new Color(95,160,160));
        jButton7.setBackground(new Color(255,255,176));
        jButton7.setForeground(new Color(95,160,160));
        jButton8.setBackground(new Color(255,255,176));
        jButton8.setForeground(new Color(95,160,160));
        jButton9.setBackground(new Color(255,255,176));
        jButton9.setForeground(new Color(95,160,160));
        enable_button1 = true;
        enable_button2 = true;
        enable_button3 = true;
        enable_button4 = true;
        enable_button5 = true;
        enable_button6 = true;
        enable_button7 = true;
        enable_button8 = true;
        enable_button9 = true;

        x_Turn = true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button1){
            jButton1.setText("X");
            jButton1.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button1 = false;
            result();
        }
        else if(!x_Turn && enable_button1){
            jButton1.setText("O");
            jButton1.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button1 = false;
            result();
        }
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame exitFrame = new JFrame();

        if(JOptionPane.showConfirmDialog(
                exitFrame,
                "Are you sure you want to exit?",
                "Tic-Tac-Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame resetFrame = new JFrame();

        if(JOptionPane.showConfirmDialog(
                resetFrame,
                "Are you sure you want to reset the game?",
                "Tic-Tac-Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            jButton1.setText("");
            jButton2.setText("");
            jButton3.setText("");
            jButton4.setText("");
            jButton5.setText("");
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton9.setText("");
            jButton1.setBackground(new Color(255,255,176));
            jButton1.setForeground(new Color(95,160,160));
            jButton2.setBackground(new Color(255,255,176));
            jButton2.setForeground(new Color(95,160,160));
            jButton3.setBackground(new Color(255,255,176));
            jButton3.setForeground(new Color(95,160,160));
            jButton4.setBackground(new Color(255,255,176));
            jButton4.setForeground(new Color(95,160,160));
            jButton5.setBackground(new Color(255,255,176));
            jButton5.setForeground(new Color(95,160,160));
            jButton6.setBackground(new Color(255,255,176));
            jButton6.setForeground(new Color(95,160,160));
            jButton7.setBackground(new Color(255,255,176));
            jButton7.setForeground(new Color(95,160,160));
            jButton8.setBackground(new Color(255,255,176));
            jButton8.setForeground(new Color(95,160,160));
            jButton9.setBackground(new Color(255,255,176));
            jButton9.setForeground(new Color(95,160,160));
            enable_button1 = true;
            enable_button2 = true;
            enable_button3 = true;
            enable_button4 = true;
            enable_button5 = true;
            enable_button6 = true;
            enable_button7 = true;
            enable_button8 = true;
            enable_button9 = true;
            x_PT = 0;
            o_PT = 0;
            xScore.setText(x_PT+"");
            oScore.setText(o_PT+"");
            x_Turn = true;
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button2){
            jButton2.setText("X");
            jButton2.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button2 = false;
            result();
        }
        else if(!x_Turn && enable_button2){
            jButton2.setText("O");
            jButton2.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button2 = false;
            result();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button3){
            jButton3.setText("X");
            jButton3.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button3 = false;
            result();
        }
        else if(!x_Turn && enable_button3){
            jButton3.setText("O");
            jButton3.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button3 = false;
            result();
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button4){
            jButton4.setText("X");
            jButton4.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button4 = false;
            result();
        }
        else if(!x_Turn && enable_button4){
            jButton4.setText("O");
            jButton4.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button4 = false;
            result();
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button5){
            jButton5.setText("X");
            jButton5.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button5 = false;
            result();
        }
        else if(!x_Turn && enable_button5){
            jButton5.setText("O");
            jButton5.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button5 = false;
            result();
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button6){
            jButton6.setText("X");
            jButton6.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button6 = false;
            result();
        }
        else if(!x_Turn && enable_button6){
            jButton6.setText("O");
            jButton6.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button6 = false;
            result();
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button7){
            jButton7.setText("X");
            jButton7.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button7 = false;
            result();
        }
        else if(!x_Turn && enable_button7){
            jButton7.setText("O");
            jButton7.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button7 = false;
            result();
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button8){
            jButton8.setText("X");
            jButton8.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button8 = false;
            result();
        }
        else if(!x_Turn && enable_button8){
            jButton8.setText("O");
            jButton8.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button8 = false;
            result();
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if(x_Turn && enable_button9){
            jButton9.setText("X");
            jButton9.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = false;
            enable_button9 = false;
            result();
        }
        else if(!x_Turn && enable_button9){
            jButton9.setText("O");
            jButton9.setFont(new Font("Snap ITC", Font.BOLD, 52));
            x_Turn = true;
            enable_button9 = false;
            result();
        }
    }

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JLabel oScore;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel xScore;
    // End of variables declaration
}
