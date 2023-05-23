package concurrentmatrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixSumGUI extends javax.swing.JFrame {

    public MatrixSumGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        value_result1 = new javax.swing.JLabel();
        value_result2 = new javax.swing.JLabel();
        value_result3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        num2_1 = new javax.swing.JTextField();
        num2_2 = new javax.swing.JTextField();
        num2_3 = new javax.swing.JTextField();
        num2_4 = new javax.swing.JTextField();
        num2_5 = new javax.swing.JTextField();
        num2_6 = new javax.swing.JTextField();
        num2_7 = new javax.swing.JTextField();
        num2_8 = new javax.swing.JTextField();
        num2_9 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        num1_1 = new javax.swing.JTextField();
        num1_2 = new javax.swing.JTextField();
        num1_3 = new javax.swing.JTextField();
        num1_4 = new javax.swing.JTextField();
        num1_5 = new javax.swing.JTextField();
        num1_6 = new javax.swing.JTextField();
        num1_7 = new javax.swing.JTextField();
        num1_8 = new javax.swing.JTextField();
        num1_9 = new javax.swing.JTextField();
        ButtonSum = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        value_result1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        value_result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        value_result1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        value_result2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        value_result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        value_result2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        value_result3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        value_result3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        value_result3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(value_result3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(value_result2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(value_result1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(value_result1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value_result2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value_result3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        num2_1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_1ActionPerformed(evt);
            }
        });

        num2_2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_2ActionPerformed(evt);
            }
        });

        num2_3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_3ActionPerformed(evt);
            }
        });

        num2_4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_4ActionPerformed(evt);
            }
        });

        num2_5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_5ActionPerformed(evt);
            }
        });

        num2_6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_6ActionPerformed(evt);
            }
        });

        num2_7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_7ActionPerformed(evt);
            }
        });

        num2_8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_8ActionPerformed(evt);
            }
        });

        num2_9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num2_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2_9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(num2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(num2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(num2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        num1_1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_1ActionPerformed(evt);
            }
        });

        num1_2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_2ActionPerformed(evt);
            }
        });

        num1_3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_3ActionPerformed(evt);
            }
        });

        num1_4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_4ActionPerformed(evt);
            }
        });

        num1_5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_5ActionPerformed(evt);
            }
        });

        num1_6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_6ActionPerformed(evt);
            }
        });

        num1_7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_7ActionPerformed(evt);
            }
        });

        num1_8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_8ActionPerformed(evt);
            }
        });

        num1_9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        num1_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(num1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(num1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(num1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonSum.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonSum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonSum.setText("Sum");
        ButtonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSumActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ConcurrentMatrix\\src\\concurrentmatrix\\img\\plus.png")); // NOI18N

        ButtonBack.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ConcurrentMatrix\\src\\concurrentmatrix\\img\\back.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Sum Matrix");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Matrix 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Matrix 2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Result");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ConcurrentMatrix\\src\\concurrentmatrix\\img\\locator.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(135, 135, 135)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(85, 85, 85))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(43, 43, 43))))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void num1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_1ActionPerformed
    }//GEN-LAST:event_num1_1ActionPerformed

    private void num1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_2ActionPerformed
    }//GEN-LAST:event_num1_2ActionPerformed

    private void num1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_3ActionPerformed
    }//GEN-LAST:event_num1_3ActionPerformed

    private void num1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_4ActionPerformed
    }//GEN-LAST:event_num1_4ActionPerformed

    private void num1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_5ActionPerformed
    }//GEN-LAST:event_num1_5ActionPerformed

    private void num1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_6ActionPerformed
    }//GEN-LAST:event_num1_6ActionPerformed

    private void num1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_7ActionPerformed
    }//GEN-LAST:event_num1_7ActionPerformed

    private void num1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_8ActionPerformed
    }//GEN-LAST:event_num1_8ActionPerformed

    private void num1_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_9ActionPerformed
    }//GEN-LAST:event_num1_9ActionPerformed

    private void num2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_1ActionPerformed
    }//GEN-LAST:event_num2_1ActionPerformed

    private void num2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_2ActionPerformed
    }//GEN-LAST:event_num2_2ActionPerformed

    private void num2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_3ActionPerformed
    }//GEN-LAST:event_num2_3ActionPerformed

    private void num2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_4ActionPerformed
    }//GEN-LAST:event_num2_4ActionPerformed

    private void num2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_5ActionPerformed
    }//GEN-LAST:event_num2_5ActionPerformed

    private void num2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_6ActionPerformed
    }//GEN-LAST:event_num2_6ActionPerformed

    private void num2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_7ActionPerformed
    }//GEN-LAST:event_num2_7ActionPerformed

    private void num2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_8ActionPerformed
    }//GEN-LAST:event_num2_8ActionPerformed

    private void num2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2_9ActionPerformed
    }//GEN-LAST:event_num2_9ActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSumActionPerformed

        int[][] matrix1 = {
            {Integer.parseInt(num1_1.getText()), Integer.parseInt(num1_2.getText()), Integer.parseInt(num1_3.getText())}, 
            {Integer.parseInt(num1_4.getText()), Integer.parseInt(num1_5.getText()), Integer.parseInt(num1_6.getText())}, 
            {Integer.parseInt(num1_7.getText()), Integer.parseInt(num1_8.getText()), Integer.parseInt(num1_9.getText())}};
        
        int[][] matrix2 = {
            {Integer.parseInt(num2_1.getText()), Integer.parseInt(num2_2.getText()), Integer.parseInt(num2_3.getText())}, 
            {Integer.parseInt(num2_4.getText()), Integer.parseInt(num2_5.getText()), Integer.parseInt(num2_6.getText())}, 
            {Integer.parseInt(num2_7.getText()), Integer.parseInt(num2_8.getText()), Integer.parseInt(num2_9.getText())}};
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        int numThreads = 4; // Number of concurrent threads

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int step = rows / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startRow = i * step;
            int endRow = (i < numThreads - 1) ? (i + 1) * step : rows;
            executor.execute(new MatrixSum(matrix1, matrix2, result, startRow, endRow));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all threads to finish
        }
        String va_result1 = "";
        String va_result2 = "";
        String va_result3 = "";
        // Print the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(i == 0){
                    va_result1 += result[i][j] + "   ";
                }else if(i == 1){
                    va_result2 += result[i][j] + "   ";
                }else{
                    va_result3 += result[i][j] + "   ";
                }
            }
        }
        value_result1.setText(va_result1);
        value_result2.setText(va_result2);
        value_result3.setText(va_result3);
    }//GEN-LAST:event_ButtonSumActionPerformed


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
            java.util.logging.Logger.getLogger(MatrixSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixSumGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixSumGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField num1_1;
    private javax.swing.JTextField num1_2;
    private javax.swing.JTextField num1_3;
    private javax.swing.JTextField num1_4;
    private javax.swing.JTextField num1_5;
    private javax.swing.JTextField num1_6;
    private javax.swing.JTextField num1_7;
    private javax.swing.JTextField num1_8;
    private javax.swing.JTextField num1_9;
    private javax.swing.JTextField num2_1;
    private javax.swing.JTextField num2_2;
    private javax.swing.JTextField num2_3;
    private javax.swing.JTextField num2_4;
    private javax.swing.JTextField num2_5;
    private javax.swing.JTextField num2_6;
    private javax.swing.JTextField num2_7;
    private javax.swing.JTextField num2_8;
    private javax.swing.JTextField num2_9;
    private javax.swing.JLabel value_result1;
    private javax.swing.JLabel value_result2;
    private javax.swing.JLabel value_result3;
    // End of variables declaration//GEN-END:variables
}
