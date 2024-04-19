package process_team8;


public class Process extends javax.swing.JFrame {

    int width = 229;
    int height = 556;

    void openMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    jP_Side_Left.setSize(width, height);

                }

            }
        }).start();
    }

    void exitMenuBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    jP_Side_Left.setSize(i, height);
                }

            }
        }).start();
    }

    public Process() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Background = new javax.swing.JPanel();
        jL_Open = new javax.swing.JLabel();
        jP_Side_Left = new javax.swing.JPanel();
        jL_Logo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jP_Function = new javax.swing.JPanel();
        jB_BT1 = new javax.swing.JButton();
        jB_BT2 = new javax.swing.JButton();
        jB_BT3 = new javax.swing.JButton();
        jB_BT4 = new javax.swing.JButton();
        jB_BT5 = new javax.swing.JButton();
        jB_BT6 = new javax.swing.JButton();
        jB_BT7 = new javax.swing.JButton();
        jB_BT8 = new javax.swing.JButton();
        jB_BT9 = new javax.swing.JButton();
        jB_BT10 = new javax.swing.JButton();
        jB_BT11 = new javax.swing.JButton();
        jB_BT12 = new javax.swing.JButton();
        jB_BT13 = new javax.swing.JButton();
        jB_BT14 = new javax.swing.JButton();
        jB_BT15 = new javax.swing.JButton();
        jL_Exit = new javax.swing.JLabel();
        jP_Home = new javax.swing.JPanel();
        jP_BT1 = new javax.swing.JPanel();
        jP_BT2 = new javax.swing.JPanel();
        jP_BT3 = new javax.swing.JPanel();
        jP_BT4 = new javax.swing.JPanel();
        jP_BT5 = new javax.swing.JPanel();
        jP_BT6 = new javax.swing.JPanel();
        jP_BT7 = new javax.swing.JPanel();
        jP_BT8 = new javax.swing.JPanel();
        jP_BT9 = new javax.swing.JPanel();
        jP_BT10 = new javax.swing.JPanel();
        jP_BT11 = new javax.swing.JPanel();
        jP_BT12 = new javax.swing.JPanel();
        jP_BT13 = new javax.swing.JPanel();
        jP_BT14 = new javax.swing.JPanel();
        jP_BT15 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_Background.setBackground(new java.awt.Color(153, 0, 0));

        jL_Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngtree-menu-icon-blue-3d-rendering-png-image_5548185 (1).png"))); // NOI18N
        jL_Open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_OpenMouseClicked(evt);
            }
        });

        jP_Side_Left.setBackground(new java.awt.Color(255, 255, 255));
        jP_Side_Left.setPreferredSize(new java.awt.Dimension(0, 0));

        jL_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team8_logo_proportions-01 (1) (1).jpg"))); // NOI18N
        jL_Logo.setText("jLabel1");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jP_Function.setBackground(new java.awt.Color(255, 255, 255));

        jB_BT1.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT1.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT1.setText("jButton1");
        jB_BT1.setActionCommand("jB_BT1");
        jB_BT1.setBorder(null);
        jB_BT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT1MouseClicked(evt);
            }
        });
        jB_BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BT1ActionPerformed(evt);
            }
        });

        jB_BT2.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT2.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT2.setText("jButton3");
        jB_BT2.setBorder(null);
        jB_BT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT2MouseClicked(evt);
            }
        });

        jB_BT3.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT3.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT3.setText("jButton4");
        jB_BT3.setBorder(null);
        jB_BT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT3MouseClicked(evt);
            }
        });
        jB_BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BT3ActionPerformed(evt);
            }
        });

        jB_BT4.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT4.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT4.setText("jButton5");
        jB_BT4.setBorder(null);
        jB_BT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT4MouseClicked(evt);
            }
        });

        jB_BT5.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT5.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT5.setText("jButton6");
        jB_BT5.setBorder(null);
        jB_BT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT5MouseClicked(evt);
            }
        });

        jB_BT6.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT6.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT6.setText("jButton7");
        jB_BT6.setBorder(null);
        jB_BT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT6MouseClicked(evt);
            }
        });

        jB_BT7.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT7.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT7.setText("jButton8");
        jB_BT7.setBorder(null);
        jB_BT7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT7MouseClicked(evt);
            }
        });

        jB_BT8.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT8.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT8.setText("jButton9");
        jB_BT8.setBorder(null);
        jB_BT8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT8MouseClicked(evt);
            }
        });

        jB_BT9.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT9.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT9.setText("jButton10");
        jB_BT9.setBorder(null);
        jB_BT9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT9MouseClicked(evt);
            }
        });

        jB_BT10.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT10.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT10.setText("jButton11");
        jB_BT10.setBorder(null);
        jB_BT10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT10MouseClicked(evt);
            }
        });

        jB_BT11.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT11.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT11.setText("jButton12");
        jB_BT11.setBorder(null);
        jB_BT11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT11MouseClicked(evt);
            }
        });

        jB_BT12.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT12.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT12.setText("jButton13");
        jB_BT12.setBorder(null);
        jB_BT12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT12MouseClicked(evt);
            }
        });

        jB_BT13.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT13.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT13.setText("jButton2");
        jB_BT13.setBorder(null);
        jB_BT13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT13MouseClicked(evt);
            }
        });

        jB_BT14.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT14.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT14.setText("jButton14");
        jB_BT14.setBorder(null);
        jB_BT14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT14MouseClicked(evt);
            }
        });

        jB_BT15.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT15.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT15.setText("jButton15");
        jB_BT15.setBorder(null);
        jB_BT15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_FunctionLayout = new javax.swing.GroupLayout(jP_Function);
        jP_Function.setLayout(jP_FunctionLayout);
        jP_FunctionLayout.setHorizontalGroup(
            jP_FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_BT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_BT14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_FunctionLayout.setVerticalGroup(
            jP_FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_FunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_BT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_BT15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jL_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/X (1).png"))); // NOI18N
        jL_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP_Side_LeftLayout = new javax.swing.GroupLayout(jP_Side_Left);
        jP_Side_Left.setLayout(jP_Side_LeftLayout);
        jP_Side_LeftLayout.setHorizontalGroup(
            jP_Side_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Side_LeftLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_Side_LeftLayout.createSequentialGroup()
                .addGroup(jP_Side_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_Side_LeftLayout.createSequentialGroup()
                        .addComponent(jL_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Exit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jP_Function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_Side_LeftLayout.setVerticalGroup(
            jP_Side_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_Side_LeftLayout.createSequentialGroup()
                .addGroup(jP_Side_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Exit))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Function, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jP_Home.setBackground(new java.awt.Color(204, 204, 204));

        jP_BT1.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT1Layout = new javax.swing.GroupLayout(jP_BT1);
        jP_BT1.setLayout(jP_BT1Layout);
        jP_BT1Layout.setHorizontalGroup(
            jP_BT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT1Layout.setVerticalGroup(
            jP_BT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT2.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT2Layout = new javax.swing.GroupLayout(jP_BT2);
        jP_BT2.setLayout(jP_BT2Layout);
        jP_BT2Layout.setHorizontalGroup(
            jP_BT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT2Layout.setVerticalGroup(
            jP_BT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT3.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT3Layout = new javax.swing.GroupLayout(jP_BT3);
        jP_BT3.setLayout(jP_BT3Layout);
        jP_BT3Layout.setHorizontalGroup(
            jP_BT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT3Layout.setVerticalGroup(
            jP_BT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT4.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT4Layout = new javax.swing.GroupLayout(jP_BT4);
        jP_BT4.setLayout(jP_BT4Layout);
        jP_BT4Layout.setHorizontalGroup(
            jP_BT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT4Layout.setVerticalGroup(
            jP_BT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT5.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT5Layout = new javax.swing.GroupLayout(jP_BT5);
        jP_BT5.setLayout(jP_BT5Layout);
        jP_BT5Layout.setHorizontalGroup(
            jP_BT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT5Layout.setVerticalGroup(
            jP_BT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT6.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT6Layout = new javax.swing.GroupLayout(jP_BT6);
        jP_BT6.setLayout(jP_BT6Layout);
        jP_BT6Layout.setHorizontalGroup(
            jP_BT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT6Layout.setVerticalGroup(
            jP_BT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT7.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT7Layout = new javax.swing.GroupLayout(jP_BT7);
        jP_BT7.setLayout(jP_BT7Layout);
        jP_BT7Layout.setHorizontalGroup(
            jP_BT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT7Layout.setVerticalGroup(
            jP_BT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT8.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT8Layout = new javax.swing.GroupLayout(jP_BT8);
        jP_BT8.setLayout(jP_BT8Layout);
        jP_BT8Layout.setHorizontalGroup(
            jP_BT8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT8Layout.setVerticalGroup(
            jP_BT8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT9.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT9Layout = new javax.swing.GroupLayout(jP_BT9);
        jP_BT9.setLayout(jP_BT9Layout);
        jP_BT9Layout.setHorizontalGroup(
            jP_BT9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT9Layout.setVerticalGroup(
            jP_BT9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT10.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT10Layout = new javax.swing.GroupLayout(jP_BT10);
        jP_BT10.setLayout(jP_BT10Layout);
        jP_BT10Layout.setHorizontalGroup(
            jP_BT10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT10Layout.setVerticalGroup(
            jP_BT10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT11.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT11Layout = new javax.swing.GroupLayout(jP_BT11);
        jP_BT11.setLayout(jP_BT11Layout);
        jP_BT11Layout.setHorizontalGroup(
            jP_BT11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT11Layout.setVerticalGroup(
            jP_BT11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT12.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT12Layout = new javax.swing.GroupLayout(jP_BT12);
        jP_BT12.setLayout(jP_BT12Layout);
        jP_BT12Layout.setHorizontalGroup(
            jP_BT12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT12Layout.setVerticalGroup(
            jP_BT12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT13.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT13Layout = new javax.swing.GroupLayout(jP_BT13);
        jP_BT13.setLayout(jP_BT13Layout);
        jP_BT13Layout.setHorizontalGroup(
            jP_BT13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT13Layout.setVerticalGroup(
            jP_BT13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        jP_BT14.setPreferredSize(new java.awt.Dimension(891, 503));

        javax.swing.GroupLayout jP_BT14Layout = new javax.swing.GroupLayout(jP_BT14);
        jP_BT14.setLayout(jP_BT14Layout);
        jP_BT14Layout.setHorizontalGroup(
            jP_BT14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT14Layout.setVerticalGroup(
            jP_BT14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_BT15Layout = new javax.swing.GroupLayout(jP_BT15);
        jP_BT15.setLayout(jP_BT15Layout);
        jP_BT15Layout.setHorizontalGroup(
            jP_BT15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jP_BT15Layout.setVerticalGroup(
            jP_BT15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_HomeLayout = new javax.swing.GroupLayout(jP_Home);
        jP_Home.setLayout(jP_HomeLayout);
        jP_HomeLayout.setHorizontalGroup(
            jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_BT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_HomeLayout.setVerticalGroup(
            jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_BT8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_BT15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_BackgroundLayout = new javax.swing.GroupLayout(jP_Background);
        jP_Background.setLayout(jP_BackgroundLayout);
        jP_BackgroundLayout.setHorizontalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addComponent(jP_Side_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_BackgroundLayout.createSequentialGroup()
                        .addComponent(jL_Open)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jP_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_BackgroundLayout.setVerticalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Side_Left, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Open)
                .addGap(18, 18, 18)
                .addComponent(jP_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_BT3ActionPerformed

    private void jL_OpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_OpenMouseClicked
        openMenuBar();
    }//GEN-LAST:event_jL_OpenMouseClicked

    private void jL_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_ExitMouseClicked
        exitMenuBar();
    }//GEN-LAST:event_jL_ExitMouseClicked

    private void jB_BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_BT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_BT1ActionPerformed

    private void jB_BT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT1MouseClicked
        jP_BT1.setVisible(true);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT1MouseClicked

    private void jB_BT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT2MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(true);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT2MouseClicked

    private void jB_BT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT3MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(true);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT3MouseClicked

    private void jB_BT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT4MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(true);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT4MouseClicked

    private void jB_BT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT5MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(true);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT5MouseClicked

    private void jB_BT6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT6MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(true);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT6MouseClicked

    private void jB_BT7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT7MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(true);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT7MouseClicked

    private void jB_BT8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT8MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(true);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT8MouseClicked

    private void jB_BT9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT9MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(true);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT9MouseClicked

    private void jB_BT10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT10MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(true);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT10MouseClicked

    private void jB_BT11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT11MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(true);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT11MouseClicked

    private void jB_BT12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT12MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(true);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT12MouseClicked

    private void jB_BT13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT13MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(true);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT13MouseClicked

    private void jB_BT14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT14MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(true);
        jP_BT15.setVisible(false);
    }//GEN-LAST:event_jB_BT14MouseClicked

    private void jB_BT15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_BT15MouseClicked
        jP_BT1.setVisible(false);
        jP_BT2.setVisible(false);
        jP_BT3.setVisible(false);
        jP_BT4.setVisible(false);
        jP_BT5.setVisible(false);
        jP_BT6.setVisible(false);
        jP_BT7.setVisible(false);
        jP_BT8.setVisible(false);
        jP_BT9.setVisible(false);
        jP_BT10.setVisible(false);
        jP_BT11.setVisible(false);
        jP_BT12.setVisible(false);
        jP_BT13.setVisible(false);
        jP_BT14.setVisible(false);
        jP_BT15.setVisible(true);
    }//GEN-LAST:event_jB_BT15MouseClicked

          
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Process().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_BT1;
    private javax.swing.JButton jB_BT10;
    private javax.swing.JButton jB_BT11;
    private javax.swing.JButton jB_BT12;
    private javax.swing.JButton jB_BT13;
    private javax.swing.JButton jB_BT14;
    private javax.swing.JButton jB_BT15;
    private javax.swing.JButton jB_BT2;
    private javax.swing.JButton jB_BT3;
    private javax.swing.JButton jB_BT4;
    private javax.swing.JButton jB_BT5;
    private javax.swing.JButton jB_BT6;
    private javax.swing.JButton jB_BT7;
    private javax.swing.JButton jB_BT8;
    private javax.swing.JButton jB_BT9;
    private javax.swing.JLabel jL_Exit;
    private javax.swing.JLabel jL_Logo;
    private javax.swing.JLabel jL_Open;
    private javax.swing.JPanel jP_BT1;
    private javax.swing.JPanel jP_BT10;
    private javax.swing.JPanel jP_BT11;
    private javax.swing.JPanel jP_BT12;
    private javax.swing.JPanel jP_BT13;
    private javax.swing.JPanel jP_BT14;
    private javax.swing.JPanel jP_BT15;
    private javax.swing.JPanel jP_BT2;
    private javax.swing.JPanel jP_BT3;
    private javax.swing.JPanel jP_BT4;
    private javax.swing.JPanel jP_BT5;
    private javax.swing.JPanel jP_BT6;
    private javax.swing.JPanel jP_BT7;
    private javax.swing.JPanel jP_BT8;
    private javax.swing.JPanel jP_BT9;
    private javax.swing.JPanel jP_Background;
    private javax.swing.JPanel jP_Function;
    private javax.swing.JPanel jP_Home;
    private javax.swing.JPanel jP_Side_Left;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
