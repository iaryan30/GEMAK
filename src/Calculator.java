import java.math.*;

public class Calculator extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dgrrad;
    private boolean sh;
    private byte op;
    
    private double ina;
    private double inb;
    private double out;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        display1 = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        memorydisplay = new javax.swing.JTextField();
        memoryread = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        add = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        one = new javax.swing.JButton();
        three = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        two = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        degree = new javax.swing.JRadioButton();
        radian = new javax.swing.JRadioButton();
        memorysave = new javax.swing.JButton();
        memoryclear = new javax.swing.JButton();
        onedividedbyx = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        shift = new javax.swing.JToggleButton();
        back = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA CALCULATOR");
        setResizable(false);

        display1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        display1.setText("0");
        display1.setFocusable(false);
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });

        display2.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        display2.setFocusable(false);
        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });

        memorydisplay.setBackground(new java.awt.Color(199, 218, 220));
        memorydisplay.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        memorydisplay.setText("0");
        memorydisplay.setFocusable(false);
        memorydisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorydisplayActionPerformed(evt);
            }
        });

        memoryread.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        memoryread.setText("MR");
        memoryread.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memoryread.setFocusable(false);
        memoryread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryreadActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        seven.setText("7");
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        nine.setText("9");
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        squared.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        squared.setText("x2");
        squared.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        eight.setText("8");
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        add.setText("+");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        four.setText("4");
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        five.setText("5");
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        six.setText("6");
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        reset.setText("C");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        squareroot.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        squareroot.setText("√x");
        squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        squareroot.setFocusable(false);
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        sub.setText("-");
        sub.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sub.setFocusable(false);
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        clear.setText("CE");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        divide.setText("/");
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        one.setText("1");
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        three.setText("3");
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        multiply.setText("*");
        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiply.setFocusable(false);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        two.setText("2");
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        cubed.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        cubed.setText("x3");
        cubed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cubed.setFocusable(false);
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        cuberoot.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        cuberoot.setText("3√");
        cuberoot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cuberoot.setFocusable(false);
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        negate.setText("±");
        negate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        decpoint.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        decpoint.setText(".");
        decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        decpoint.setFocusable(false);
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        zero.setText("0");
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        equal.setText("=");
        equal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        equal.setFocusable(false);
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        degree.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        degree.setText("Degree");
        degree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        degree.setFocusable(false);
        degree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeActionPerformed(evt);
            }
        });

        radian.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        radian.setText("Radian");
        radian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radian.setFocusable(false);
        radian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radianActionPerformed(evt);
            }
        });

        memorysave.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        memorysave.setText("MS");
        memorysave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memorysave.setFocusable(false);
        memorysave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorysaveActionPerformed(evt);
            }
        });

        memoryclear.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        memoryclear.setText("MC");
        memoryclear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        memoryclear.setFocusable(false);
        memoryclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryclearActionPerformed(evt);
            }
        });

        onedividedbyx.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        onedividedbyx.setText("1/x");
        onedividedbyx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        onedividedbyx.setFocusable(false);
        onedividedbyx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedividedbyxActionPerformed(evt);
            }
        });

        percent.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        percent.setText("%");
        percent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        percent.setFocusable(false);
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        sin.setText("sin");
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        cos.setText("cos");
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        jButton40.setText("n");
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton40.setFocusable(false);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        tan.setText("tan");
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        shift.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        shift.setText("Sh");
        shift.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shift.setFocusable(false);
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(negate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(three, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(onedividedbyx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuberoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cubed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(degree)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radian))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(memoryread, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memoryclear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memorysave, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(display2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addComponent(display1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memoryread, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryclear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorysave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degree)
                    .addComponent(radian)
                    .addComponent(onedividedbyx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shift, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display1ActionPerformed

    private void memorydisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorydisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memorydisplayActionPerformed

    private void memoryreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryreadActionPerformed
        display1.setText(String.valueOf(memorydisplay.getText()));
    }//GEN-LAST:event_memoryreadActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"6");
       zerodisp=true;
    }//GEN-LAST:event_sixActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=Math.sqrt(inb);
        
        display1.setText(String.valueOf(out));
        
        display2.setText("√"+String.valueOf(inb));
        out=0; 
        op=0;
    }//GEN-LAST:event_squarerootActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"9");
       zerodisp=true;
    }//GEN-LAST:event_nineActionPerformed

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display2ActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=Math.cbrt(inb);
        
        display1.setText(String.valueOf(out));
        
        display2.setText("√"+String.valueOf(inb));
        out=0;
        op=0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"3");
       zerodisp=true;
    }//GEN-LAST:event_threeActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
         if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb= Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+"/");
        op=4;
        decdisp=false;
        zerodisp=false;
        
    }//GEN-LAST:event_divideActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(op==0){
            out = inb;
            display2.setText(String.valueOf(inb));
        }
         if(op==1){
            out= ina + inb;
            display2.setText(display2.getText()+String.valueOf(inb));
        } 
         if(op==2){
            out= ina - inb;
            display2.setText(display2.getText()+String.valueOf(inb));
        }
         if(op==3){
            out= ina * inb;
            display2.setText(display2.getText()+String.valueOf(inb));
        }
         if(op==4){
            out= ina / inb;
            display2.setText(display2.getText()+String.valueOf(inb));
        }
         if(op==5){
            out= ina * inb/100;
            display2.setText(display2.getText()+String.valueOf(inb)+")");
        }
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
            
        }
        else {
            display1.setText("Error");
        }
         ina=0;
         inb=0;
         out=0;
         op=0;
         decdisp=false;
         zerodisp=false;
         
    }//GEN-LAST:event_equalActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        zerodisp=false;
        decdisp=false;
    }//GEN-LAST:event_clearActionPerformed

    private void memorysaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorysaveActionPerformed
        memorydisplay.setText(String.valueOf(display1.getText()));
    }//GEN-LAST:event_memorysaveActionPerformed

    private void memoryclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryclearActionPerformed
        memorydisplay.setText("0");
    }//GEN-LAST:event_memoryclearActionPerformed

    private void onedividedbyxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedividedbyxActionPerformed
       inb=Double.parseDouble(String.valueOf(display1.getText()));
       out=1/inb;
       
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
            
        }
        else {
            display1.setText("Error");
        }
        display2.setText("1/"+String.valueOf(inb));
        out=0;
        op=0;
        
    }//GEN-LAST:event_onedividedbyxActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        display1.setText("0");
        display2.setText(String.valueOf(ina)+"%(");
        
        decdisp=false;
        zerodisp=false;
        op=5;
    }//GEN-LAST:event_percentActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
              display2.setText("sin("+ String.valueOf(inb) + ")");
              inb=inb * 0.0174532925;
            }
            out=Math.sin(inb);
        }
        else{
             display2.setText("sinh("+ String.valueOf(inb) + ")");
              out=Math.sinh(inb);
              
        }
        display1.setText(String.valueOf(out));
        out=0;
        op=0;
              
    }//GEN-LAST:event_sinActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
       inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
              display2.setText("cos("+ String.valueOf(inb) + ")");
              inb=inb * 0.0174532925;
            }
            out=Math.cos(inb);
        }
        else{
             display2.setText("cosh("+ String.valueOf(inb) + ")");
              out=Math.cosh(inb);
              
        }
        display1.setText(String.valueOf(out));
        out=0;
        op=0;
              
    }//GEN-LAST:event_cosActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        display1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_jButton40ActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        inb= Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
              display2.setText("tan("+ String.valueOf(inb) + ")");
              inb=inb * 0.0174532925;
            }
            out=Math.tan(inb);
        }
        else{
             display2.setText("tanh("+ String.valueOf(inb) + ")");
              out=Math.tanh(inb);
              
        }
        display1.setText(String.valueOf(out));
        out=0;
        op=0;
              
    }//GEN-LAST:event_tanActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
       if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"2");
       zerodisp=true;
    }//GEN-LAST:event_twoActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"8");
       zerodisp=true;
    }//GEN-LAST:event_eightActionPerformed

    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
        if(!decdisp){
       display1.setText(display1.getText()+".");
       decdisp=true;
        }
    }//GEN-LAST:event_decpointActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
       if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"0");
       zerodisp=true;
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
      if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"1");
       zerodisp=true;
    }//GEN-LAST:event_oneActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"4");
       zerodisp=true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"5");
       zerodisp=true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
          if(!zerodisp  && !decdisp){
           display1.setText(null);
       }
       display1.setText(display1.getText()+"7");
       zerodisp=true;
    }//GEN-LAST:event_sevenActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=inb * -1;
        
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
            
        }
        else {
            display1.setText("Error");
        }
        decdisp=true;
        out=0;
        
    }//GEN-LAST:event_negateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         display1.setText("0");
         display1.setText(null);
         zerodisp=false;
         decdisp=false;
         ina=0;
         inb=0;
         out=0;
    }//GEN-LAST:event_resetActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
       inb=Double.parseDouble(String.valueOf(display1.getText()));
       out=inb*inb;
       
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
            
        }
        else {
            display1.setText("Error");
        }
        display2.setText(String.valueOf(inb)+"^2");
        out=0;
        op=0;
    
    }//GEN-LAST:event_squaredActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
         inb=Double.parseDouble(String.valueOf(display1.getText()));
       out=inb*inb*inb;
       
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
            
        }
        else {
            display1.setText("Error");
        }
        display2.setText(String.valueOf(inb)+"^3");
        out=0;
        op=0;
    
    }//GEN-LAST:event_cubedActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
                if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb= Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+"*");
        op=3;
        decdisp=false;
        zerodisp=false;
        
    }//GEN-LAST:event_multiplyActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb= Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+"+");
        op=1;
        decdisp=false;
        zerodisp=false;
        
        
    }//GEN-LAST:event_addActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        if(!sh){
            sh=true;
        }
        else{
            sh=false;
        }
    }//GEN-LAST:event_shiftActionPerformed

    private void degreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeActionPerformed
       dgrrad=false;
    }//GEN-LAST:event_degreeActionPerformed

    private void radianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radianActionPerformed
        dgrrad=true;
    }//GEN-LAST:event_radianActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
               if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb= Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina)+"-");
        op=2;
        decdisp=false;
        zerodisp=false;
                
    }//GEN-LAST:event_subActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Front l=new Front();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cubed;
    private javax.swing.JButton cuberoot;
    private javax.swing.JButton decpoint;
    private javax.swing.JRadioButton degree;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton40;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton memoryclear;
    private javax.swing.JTextField memorydisplay;
    private javax.swing.JButton memoryread;
    private javax.swing.JButton memorysave;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onedividedbyx;
    private javax.swing.JButton percent;
    private javax.swing.JRadioButton radian;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JToggleButton shift;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
