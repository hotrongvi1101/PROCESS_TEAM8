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
        jP_Supper = new javax.swing.JPanel();
        jP_Home = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jP_BT1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jP_BT2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jP_BT3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jP_BT4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jP_BT5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jP_BT6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jP_BT7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jP_BT8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jP_BT9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jP_BT10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jP_BT11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jP_BT12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jP_BT13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jP_BT14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jP_BT15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

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
        jL_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_LogoMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jP_Function.setBackground(new java.awt.Color(255, 255, 255));

        jB_BT1.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT1.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT1.setText("BT1");
        jB_BT1.setActionCommand("jB_BT1");
        jB_BT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jB_BT2.setText("BT2");
        jB_BT2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT2MouseClicked(evt);
            }
        });

        jB_BT3.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT3.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT3.setText("BT3");
        jB_BT3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_BT3ActionPerformed(evt);
            }
        });

        jB_BT4.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT4.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT4.setText("BT4");
        jB_BT4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT4MouseClicked(evt);
            }
        });

        jB_BT5.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT5.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT5.setText("BT5");
        jB_BT5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT5MouseClicked(evt);
            }
        });

        jB_BT6.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT6.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT6.setText("BT6");
        jB_BT6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT6MouseClicked(evt);
            }
        });

        jB_BT7.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT7.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT7.setText("BT7");
        jB_BT7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT7MouseClicked(evt);
            }
        });

        jB_BT8.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT8.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT8.setText("BT8");
        jB_BT8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT8MouseClicked(evt);
            }
        });

        jB_BT9.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT9.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT9.setText("BT9");
        jB_BT9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT9MouseClicked(evt);
            }
        });

        jB_BT10.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT10.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT10.setText("BT10");
        jB_BT10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT10MouseClicked(evt);
            }
        });

        jB_BT11.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT11.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT11.setText("BT11");
        jB_BT11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT11MouseClicked(evt);
            }
        });

        jB_BT12.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT12.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT12.setText("BT12");
        jB_BT12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT12MouseClicked(evt);
            }
        });

        jB_BT13.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT13.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT13.setText("BT13");
        jB_BT13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT13MouseClicked(evt);
            }
        });

        jB_BT14.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT14.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT14.setText("BT14");
        jB_BT14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jB_BT14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_BT14MouseClicked(evt);
            }
        });

        jB_BT15.setBackground(new java.awt.Color(255, 255, 255));
        jB_BT15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jB_BT15.setForeground(new java.awt.Color(0, 0, 0));
        jB_BT15.setText("BT15");
        jB_BT15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_Supper.setBackground(new java.awt.Color(204, 204, 204));
        jP_Supper.setLayout(new java.awt.CardLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team8_logo_proportions-01-removebg-preview.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("Thành Viên: ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Hồ Trọng Vỹ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tô Minh Vương");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Lê Hoàng Huy");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Võ Trọng Khuê");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Trần Lê Hoàng");

        javax.swing.GroupLayout jP_HomeLayout = new javax.swing.GroupLayout(jP_Home);
        jP_Home.setLayout(jP_HomeLayout);
        jP_HomeLayout.setHorizontalGroup(
            jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_HomeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE)
                .addGap(307, 307, 307))
            .addGroup(jP_HomeLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP_HomeLayout.setVerticalGroup(
            jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_HomeLayout.createSequentialGroup()
                .addGroup(jP_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_HomeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jP_HomeLayout.createSequentialGroup()
                        .addContainerGap(238, Short.MAX_VALUE)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addGap(103, 103, 103))
        );

        jP_Supper.add(jP_Home, "card17");

        jP_BT1.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel1.setText("Bài tập 1");

        javax.swing.GroupLayout jP_BT1Layout = new javax.swing.GroupLayout(jP_BT1);
        jP_BT1.setLayout(jP_BT1Layout);
        jP_BT1Layout.setHorizontalGroup(
            jP_BT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        jP_BT1Layout.setVerticalGroup(
            jP_BT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT1, "card_BT1");

        jP_BT2.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel2.setText("Bài tập 2");

        javax.swing.GroupLayout jP_BT2Layout = new javax.swing.GroupLayout(jP_BT2);
        jP_BT2.setLayout(jP_BT2Layout);
        jP_BT2Layout.setHorizontalGroup(
            jP_BT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel2)
                .addContainerGap(608, Short.MAX_VALUE))
        );
        jP_BT2Layout.setVerticalGroup(
            jP_BT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT2, "card_BT2");

        jP_BT3.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel3.setText("Bài tập 3");

        javax.swing.GroupLayout jP_BT3Layout = new javax.swing.GroupLayout(jP_BT3);
        jP_BT3.setLayout(jP_BT3Layout);
        jP_BT3Layout.setHorizontalGroup(
            jP_BT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT3Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel3)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jP_BT3Layout.setVerticalGroup(
            jP_BT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT3, "card_BT3");

        jP_BT4.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel4.setText("Bài tập 4");

        javax.swing.GroupLayout jP_BT4Layout = new javax.swing.GroupLayout(jP_BT4);
        jP_BT4.setLayout(jP_BT4Layout);
        jP_BT4Layout.setHorizontalGroup(
            jP_BT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT4Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel4)
                .addContainerGap(582, Short.MAX_VALUE))
        );
        jP_BT4Layout.setVerticalGroup(
            jP_BT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel4)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT4, "card_BT4");

        jP_BT5.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel5.setText("Bài tập 5");

        javax.swing.GroupLayout jP_BT5Layout = new javax.swing.GroupLayout(jP_BT5);
        jP_BT5.setLayout(jP_BT5Layout);
        jP_BT5Layout.setHorizontalGroup(
            jP_BT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT5Layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel5)
                .addContainerGap(562, Short.MAX_VALUE))
        );
        jP_BT5Layout.setVerticalGroup(
            jP_BT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT5Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT5, "card_BT5");

        jP_BT6.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel6.setText("Bài tập 6");

        javax.swing.GroupLayout jP_BT6Layout = new javax.swing.GroupLayout(jP_BT6);
        jP_BT6.setLayout(jP_BT6Layout);
        jP_BT6Layout.setHorizontalGroup(
            jP_BT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT6Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel6)
                .addContainerGap(574, Short.MAX_VALUE))
        );
        jP_BT6Layout.setVerticalGroup(
            jP_BT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT6Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel6)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT6, "card_BT6");

        jP_BT7.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel7.setText("Bài tập 7");

        javax.swing.GroupLayout jP_BT7Layout = new javax.swing.GroupLayout(jP_BT7);
        jP_BT7.setLayout(jP_BT7Layout);
        jP_BT7Layout.setHorizontalGroup(
            jP_BT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT7Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel7)
                .addContainerGap(598, Short.MAX_VALUE))
        );
        jP_BT7Layout.setVerticalGroup(
            jP_BT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT7Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel7)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT7, "card_BT7");

        jP_BT8.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel8.setText("Bài tập 8");

        javax.swing.GroupLayout jP_BT8Layout = new javax.swing.GroupLayout(jP_BT8);
        jP_BT8.setLayout(jP_BT8Layout);
        jP_BT8Layout.setHorizontalGroup(
            jP_BT8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT8Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel8)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jP_BT8Layout.setVerticalGroup(
            jP_BT8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT8Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT8, "card_BT8");

        jP_BT9.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel9.setText("Bài tập 9");

        javax.swing.GroupLayout jP_BT9Layout = new javax.swing.GroupLayout(jP_BT9);
        jP_BT9.setLayout(jP_BT9Layout);
        jP_BT9Layout.setHorizontalGroup(
            jP_BT9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT9Layout.createSequentialGroup()
                .addGap(629, 629, 629)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_BT9Layout.setVerticalGroup(
            jP_BT9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT9Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(352, 352, 352))
        );

        jP_Supper.add(jP_BT9, "card_BT9");

        jP_BT10.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel10.setText("Bài tập 10");

        javax.swing.GroupLayout jP_BT10Layout = new javax.swing.GroupLayout(jP_BT10);
        jP_BT10.setLayout(jP_BT10Layout);
        jP_BT10Layout.setHorizontalGroup(
            jP_BT10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_BT10Layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(423, 423, 423))
        );
        jP_BT10Layout.setVerticalGroup(
            jP_BT10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT10Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel10)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT10, "card_BT10");

        jP_BT11.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel11.setText("Bài tập 11");

        javax.swing.GroupLayout jP_BT11Layout = new javax.swing.GroupLayout(jP_BT11);
        jP_BT11.setLayout(jP_BT11Layout);
        jP_BT11Layout.setHorizontalGroup(
            jP_BT11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT11Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel11)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jP_BT11Layout.setVerticalGroup(
            jP_BT11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT11Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel11)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT11, "card_BT11");

        jP_BT12.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel12.setText("Bài tập 12");

        javax.swing.GroupLayout jP_BT12Layout = new javax.swing.GroupLayout(jP_BT12);
        jP_BT12.setLayout(jP_BT12Layout);
        jP_BT12Layout.setHorizontalGroup(
            jP_BT12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT12Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel12)
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jP_BT12Layout.setVerticalGroup(
            jP_BT12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT12Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel12)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT12, "card_BT12");

        jP_BT13.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel13.setText("Bài tập 13");

        javax.swing.GroupLayout jP_BT13Layout = new javax.swing.GroupLayout(jP_BT13);
        jP_BT13.setLayout(jP_BT13Layout);
        jP_BT13Layout.setHorizontalGroup(
            jP_BT13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT13Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel13)
                .addContainerGap(556, Short.MAX_VALUE))
        );
        jP_BT13Layout.setVerticalGroup(
            jP_BT13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT13Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel13)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT13, "card_BT13");

        jP_BT14.setPreferredSize(new java.awt.Dimension(891, 503));

        jLabel14.setText("Bài tập 14");

        javax.swing.GroupLayout jP_BT14Layout = new javax.swing.GroupLayout(jP_BT14);
        jP_BT14.setLayout(jP_BT14Layout);
        jP_BT14Layout.setHorizontalGroup(
            jP_BT14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_BT14Layout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(419, 419, 419))
        );
        jP_BT14Layout.setVerticalGroup(
            jP_BT14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT14Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel14)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT14, "card_BT14");

        jLabel15.setText("Bài tập 15");

        javax.swing.GroupLayout jP_BT15Layout = new javax.swing.GroupLayout(jP_BT15);
        jP_BT15.setLayout(jP_BT15Layout);
        jP_BT15Layout.setHorizontalGroup(
            jP_BT15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT15Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel15)
                .addContainerGap(564, Short.MAX_VALUE))
        );
        jP_BT15Layout.setVerticalGroup(
            jP_BT15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BT15Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel15)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        jP_Supper.add(jP_BT15, "card_BT15");

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
                    .addComponent(jP_Supper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jP_BackgroundLayout.setVerticalGroup(
            jP_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_Side_Left, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addGroup(jP_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Open)
                .addGap(18, 18, 18)
                .addComponent(jP_Supper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jP_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
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
        jP_Home.setVisible(false);
    }//GEN-LAST:event_jB_BT15MouseClicked

    private void jL_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_LogoMouseClicked
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
        jP_BT15.setVisible(false);
        jP_Home.setVisible(true);
    }//GEN-LAST:event_jL_LogoMouseClicked

          
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jP_Supper;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
