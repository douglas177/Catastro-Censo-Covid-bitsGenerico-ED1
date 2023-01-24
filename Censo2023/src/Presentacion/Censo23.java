/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocio.Catastro;
import Negocio.Censo;
import Negocio.Registro;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Douglas
 */
public class Censo23 extends javax.swing.JFrame {

    Registro A;
    int dim;
    Boolean Valores = false;

    /**
     * Creates new form Censo
     */
    public Censo23() {
        A = new Registro(100);
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

        Nro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        Insertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        nota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        asignatura = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        año = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nro1 = new javax.swing.JButton();
        Cartilla1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nro.setText("Numero de Ciudadanos");
        Nro.setActionCommand("Numero de Registros");
        Nro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Catastro");

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dato N° ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        Insertar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Insertar.setText("Insertar");
        Insertar.setEnabled(false);
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        Nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreKeyReleased(evt);
            }
        });

        edad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edadKeyReleased(evt);
            }
        });

        nota.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Edad:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Asignatura:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nota:");

        asignatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        asignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                asignaturaKeyReleased(evt);
            }
        });

        jlabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlabel1.setText("Sexo:");

        dia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Dia:");

        mes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mesKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Mes:");

        año.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        año.setText("2000");
        año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                añoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Año:");

        sexo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("(Año 2000 en adelante)");

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(43, 43, 43)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(Insertar)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1)
                            .addComponent(jlabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(43, 43, 43)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(63, 63, 63)
                .addComponent(Insertar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        Nro1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nro1.setText("Mostrar");
        Nro1.setEnabled(false);
        Nro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nro1ActionPerformed(evt);
            }
        });

        Cartilla1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cartilla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cartilla1KeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Nro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cartilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cartilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Nro))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(Nro)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void CambiarTexto() {
        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dato N° " + (dim + 1),
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
    }

    private boolean Numeros(String Valor, JTextField obj, int tope) {

        if ((Valor.matches("[0-9]*"))) {
            if (Integer.valueOf(Valor) == 0 || Integer.valueOf(Valor) > tope) {
                JOptionPane.showMessageDialog(rootPane, "Dato Invalido", "Estructura de Datos 1", 1);
                obj.setText("");
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Dato Invalido", "Estructura de Datos 1", 1);
            obj.setText("");
        }
        return true;
    }
    private void edadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyReleased

        if (edad.getText().length() != 0) {
            Numeros(edad.getText(), edad, 90);
        }
        Habilitar();

    }//GEN-LAST:event_edadKeyReleased
    private void Habilitar() {
        if (Nombre.getText().length() != 0 && edad.getText().length() != 0 && asignatura.getText().length() != 0 && nota.getText().length() != 0
        && dia.getText().length() != 0&& mes.getText().length() != 0&& año.getText().length() != 0) {
            Insertar.setEnabled(true);
        } else {
            Insertar.setEnabled(false);
        }

        if (Valores) {
            Insert();
        }
    }
    private void asignaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asignaturaKeyReleased
        if (asignatura.getText().length() != 0) {
            Numeros(asignatura.getText(), asignatura, 10);
        }
        Habilitar();

    }//GEN-LAST:event_asignaturaKeyReleased

    private void notaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaKeyReleased
        if (nota.getText().length() != 0) {
            Numeros(nota.getText(), nota, 100);
        }
        Habilitar();

    }//GEN-LAST:event_notaKeyReleased

    private void Cartilla1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cartilla1KeyReleased
        /*if (Cartilla1.getText().matches("[0-9]*") && Cartilla1.getText().length() != 0) {
            if (dim != 0 && Integer.valueOf(Cartilla1.getText()) != 0) {
                if (!Numeros(Cartilla1.getText(), Cartilla1, A.Dim()));
                Nro1.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Dafds ", "Estructura de Datos 1", 1);
                Cartilla1.setText("");
                Nro1.setEnabled(false);
            }
        }*/
        if (Cartilla1.getText().matches("[0-9]*") && Cartilla1.getText().length() != 0) {
            if (dim != 0 && Integer.valueOf(Cartilla1.getText()) != 0) {
                Nro1.setEnabled(true);
            }
        } else {
            Nro1.setEnabled(false);
            Cartilla1.setText("");
        }
    }//GEN-LAST:event_Cartilla1KeyReleased

    private int Depart(String Valor) {
        if (Valor == "PD") {
            return 5;
        }
        if (Valor == "BE") {
            return 6;
        }
        if (Valor == "LP") {
            return 1;
        }
        if (Valor == "CB") {
            return 2;
        }
        if (Valor == "SC") {
            return 0;
        }
        if (Valor == "OR") {
            return 7;
        }
        if (Valor == "PT") {
            return 8;
        }
        if (Valor == "TJ") {
            return 3;
        } else {
            return 4;
        }
    }

    private int Sexo(String Valor) {
        if (Valor == "Masculino") {
            return 0;
        }
        return 1;

    }

    private int SiNo(Boolean valor) {
        if (valor) {
            return 1;
        }
        return 0;

    }

    private void Insert() {
        if (dim <=100) {
            Insertar.setEnabled(false);
        }
    }

    private void Limpiar() {
        Nombre.setText("");
        dia.setText("");
        edad.setText("");
        asignatura.setText("");
        nota.setText("");
        mes.setText("");
        año.setText("2000");
        dim++;
    }

    /*PT*/

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed

        if (100 == this.dim) {
            JOptionPane.showMessageDialog(rootPane, "Cartilla llena", "Estructura de Datos 1", 1);
        } else {/*String name, int uv, int manzana, int lote, int area, int luz, int agua, int gas,
             int telefono, int alcantarillado, int pavimento*/
            int x;

            if (Integer.valueOf(nota.getText()) <= 100 && Integer.valueOf(asignatura.getText()) <= 10 && Integer.valueOf(edad.getText()) <= 90 && Integer.valueOf(año.getText()) <= 2022
                    && Integer.valueOf(dia.getText()) <= 31 && Integer.valueOf(mes.getText()) <= 12) {
                if (sexo.getSelectedItem().equals("M")) {
                    x = 1;
                } else {
                    x = 2;
                }
                A.Insertar(Nombre.getText(), x, Integer.valueOf(edad.getText()),
                        Integer.valueOf(asignatura.getText()), Integer.valueOf(nota.getText()), Integer.valueOf(dia.getText()), Integer.valueOf(mes.getText()), Integer.valueOf(año.getText()));
                Limpiar();
                CambiarTexto();
                this.dim = A.getDim();
                JOptionPane.showMessageDialog(rootPane, "Dato Insertado Correctamente", "Estructura de Datos 1", 1);
                Insertar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Valor de Area Invalido", "Estructura de Datos 1", 1);
                nota.setText("");
                Habilitar();
            }
        }
    }//GEN-LAST:event_InsertarActionPerformed


    private void Nro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nro1ActionPerformed
        int valor = Integer.valueOf(Cartilla1.getText());
        if (valor < A.getDim()+ 1 && valor != 0) {
            jTextArea1.setText(A.Mostrar(valor));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Dato Inexistente", "Estructura de Datos 1", 1);

        }
    }//GEN-LAST:event_Nro1ActionPerformed

    private void NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyReleased
        Habilitar();
    }//GEN-LAST:event_NombreKeyReleased

    private void diaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaKeyReleased
       if (dia.getText().length() != 0) {
            Numeros(dia.getText(), dia, 31);
        }
        Habilitar();
    }//GEN-LAST:event_diaKeyReleased

    private void mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyReleased
        if (mes.getText().length() != 0) {
            Numeros(mes.getText(), mes, 12);
        }
        Habilitar();
    }//GEN-LAST:event_mesKeyReleased

    private void añoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyReleased
        if (año.getText().length() != 0) {
            Numeros(año.getText(), año, 2022);
        }
        Habilitar();
    }//GEN-LAST:event_añoKeyReleased

    private void NroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NroActionPerformed
      /*  if (Cartilla.getText().matches("[0-9]*") && Integer.valueOf(Cartilla.getText()) != 0 && Cartilla.getText().length() != 0) {
            int x = Integer.valueOf(Cartilla.getText());
            

            CambiarTexto();
            Nro.setEnabled(false);
            Valores = true;
            Habilitar();
            Cartilla.setEnabled(false);
        }*/

    }//GEN-LAST:event_NroActionPerformed

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
            java.util.logging.Logger.getLogger(Censo23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Censo23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Censo23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Censo23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Censo23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cartilla1;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Nro;
    private javax.swing.JButton Nro1;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JTextField asignatura;
    private javax.swing.JTextField año;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nota;
    private javax.swing.JComboBox<String> sexo;
    // End of variables declaration//GEN-END:variables
}