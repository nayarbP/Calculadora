/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import com.mycompany.operacionesbasicas.OperacionesBasicas;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
    
/**
 *
 * @author asus
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Interface() {
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

        jPanel3 = new javax.swing.JPanel();
        btn_Retroceso = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_Operacion = new javax.swing.JLabel();
        txt_Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Retroceso.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Retroceso.setForeground(new java.awt.Color(55, 62, 71));
        btn_Retroceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Retroceso.setText("CE");
        btn_Retroceso.setBorderPainted(false);
        btn_Retroceso.setFocusPainted(false);
        btn_Retroceso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Retroceso.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Retroceso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Retroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetrocesoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Retroceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, 50));

        btn_Borrar.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Borrar.setForeground(new java.awt.Color(55, 62, 71));
        btn_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Borrar.setText("C");
        btn_Borrar.setBorderPainted(false);
        btn_Borrar.setFocusPainted(false);
        btn_Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 50));

        btn_Division.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Division.setForeground(new java.awt.Color(55, 62, 71));
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Division.setText("/");
        btn_Division.setBorderPainted(false);
        btn_Division.setFocusPainted(false);
        btn_Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 50, 50));

        btn_Multiplicacion.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Multiplicacion.setForeground(new java.awt.Color(55, 62, 71));
        btn_Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Multiplicacion.setText("x");
        btn_Multiplicacion.setBorderPainted(false);
        btn_Multiplicacion.setFocusPainted(false);
        btn_Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 50, 50));

        btn_Resta.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.setBorderPainted(false);
        btn_Resta.setFocusPainted(false);
        btn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 50, 50));

        btn_Suma.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_Suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.setBorderPainted(false);
        btn_Suma.setFocusPainted(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 50, 50));

        Igual.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        Igual.setText("=");
        Igual.setBorderPainted(false);
        Igual.setFocusPainted(false);
        Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        Igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        jPanel3.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 50, 50));

        btn_7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));

        btn_0.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 50));

        btn_6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 50, 50));

        btn_4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, 50));

        btn_1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorderPainted(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, 50));

        btn_8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, 50));

        btn_5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 50, 50));

        btn_2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, 50));

        btn_9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 50));

        btn_punto.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(55, 62, 71));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorderPainted(false);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 50, 50));

        btn_3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, 50));

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Operacion.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        txt_Operacion.setForeground(new java.awt.Color(55, 62, 71));
        txt_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_Operacion.setText("2+2");
        jPanel1.add(txt_Operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 54));

        txt_Resultado.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        txt_Resultado.setForeground(new java.awt.Color(55, 62, 71));
        txt_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_Resultado.setText("4");
        jPanel1.add(txt_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, 61));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private static String formatResult(double result) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.####", symbols);
        df.setGroupingUsed(false);
        
        String formattedResult = df.format(result);
        // Eliminar ceros finales después del punto decimal
        if (formattedResult.contains(".")) {
            formattedResult = formattedResult.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        return formattedResult;
    }

    private void btn_RetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetrocesoActionPerformed
        txt_Operacion.setText("");
        txt_Resultado.setText("");
    }//GEN-LAST:event_btn_RetrocesoActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        String operacion = txt_Operacion.getText();
    if (operacion.length() > 0) {
        txt_Operacion.setText(operacion.substring(0, operacion.length() - 1));
    }
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + " / ");
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + " * ");
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + " - ");
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + " + ");
    }//GEN-LAST:event_btn_SumaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        try {
            String operacion = txt_Operacion.getText().replaceAll("\\s+", ""); 
            double resultado = OperacionesBasicas.calcularexpresion(operacion);
            if (!Double.isNaN(resultado)) {
                txt_Resultado.setText(formatResult(resultado));
            } else {
                txt_Resultado.setText("Error");
            }
        } catch (Exception e) {
            txt_Resultado.setText("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
         txt_Operacion.setText(txt_Operacion.getText() + " . ");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txt_Operacion.setText(txt_Operacion.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Igual;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Retroceso;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JButton btn_punto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txt_Operacion;
    private javax.swing.JLabel txt_Resultado;
    // End of variables declaration//GEN-END:variables
}
