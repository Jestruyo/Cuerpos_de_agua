
package Vista;

import Basededatos.ContextoBD;
import Modelo.CuerpoDeAgua;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtmunicipio = new javax.swing.JTextField();
        txttipo_agua = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtirca = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        txtNivel_de_riesgo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        btnObtenerDatos = new javax.swing.JButton();
        btnNivelesMedio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        MenuB = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE GESTION AMBIENTAL");
        setResizable(false);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("MUNICIPIO");

        jLabel3.setText("TIPO DE AGUA");

        jLabel4.setText("ID");

        jLabel5.setText("TIPO");

        jLabel6.setText("IRCA");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        txtNivel_de_riesgo.setEnabled(false);

        jLabel7.setText("*Ingrese solo numeros enteros");

        AreaTexto.setColumns(20);
        AreaTexto.setRows(5);
        jScrollPane2.setViewportView(AreaTexto);

        btnObtenerDatos.setText("OBTENER DATOS");
        btnObtenerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerDatosActionPerformed(evt);
            }
        });

        btnNivelesMedio.setText("ALERTAS DE RIESGOS");
        btnNivelesMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelesMedioActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPIAR PANTALLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR DATOS DE BASE");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton2.setText("AFECCION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(MenuB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNivel_de_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txttipo_agua, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtmunicipio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btningresar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttipo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtirca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnObtenerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNivelesMedio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtirca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txttipo_agua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btningresar)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObtenerDatos)
                    .addComponent(btnNivelesMedio)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(5, 5, 5)
                .addComponent(txtNivel_de_riesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        try{
            String nom, muni,tipo,tagua,nivel,alerta;
            int id,irca;
            alerta= " ";
        if(Integer.parseInt(txtirca.getText())>=0 && Integer.parseInt(txtirca.getText())<=5){
            alerta = "SIN RIESGO";
            txtNivel_de_riesgo.setText(alerta);
        }else if(Integer.parseInt(txtirca.getText())>5 && Integer.parseInt(txtirca.getText())<=14){
            alerta = "BAJO";
            txtNivel_de_riesgo.setText(alerta);
        }else if(Integer.parseInt(txtirca.getText())>14 && Integer.parseInt(txtirca.getText())<=35){
            alerta = "MEDIO";
            txtNivel_de_riesgo.setText(alerta);
        }else if(Integer.parseInt(txtirca.getText())>35 && Integer.parseInt(txtirca.getText())<=80){
            alerta = "ALTO";
            txtNivel_de_riesgo.setText(alerta);
        }else if(Integer.parseInt(txtirca.getText())>80 && Integer.parseInt(txtirca.getText())<=100){
            alerta = "INVIABLE SANITARIAMENTE"; 
            txtNivel_de_riesgo.setText(alerta);
        }
            
        CuerpoDeAgua c = new CuerpoDeAgua(txtnombre.getText(),Integer.parseInt(txtid.getText()),
                txtmunicipio.getText(),txttipo.getText(),txttipo_agua.getText(),
                Integer.parseInt(txtirca.getText()),txtNivel_de_riesgo.getText());
        
        if(c.resgistrarCuerpoEnBD()){
            JOptionPane.showMessageDialog(this,"***REGISTRO CORRECTO***");
            
            id=Integer.parseInt(txtid.getText());
            nom=txtnombre.getText();
            muni=txtmunicipio.getText();
            tipo=txttipo.getText();
            tagua=txttipo_agua.getText();
            irca=Integer.parseInt(txtirca.getText());
            nivel=txtNivel_de_riesgo.getText();
            AreaTexto.append("ID: "+id+" | NOMBRE: "+nom+" | MUNICIPIO: "+muni+" | TIPO: "+tipo+" | TIPO DE AGUA: "+tagua+" | IRCA: "+irca+" |  NIVEL: "+nivel+"\n");
            
            
            txtnombre.setText(null);
            txtid.setText(null);
            txtmunicipio.setText(null);
            txttipo.setText(null);
            txttipo_agua.setText(null);
            txtirca.setText(null);
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Algunos datos ingresados son invalidos");
            
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnObtenerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerDatosActionPerformed
            AreaTexto.setText(null);
            String salida="";
            String sql = "SELECT * FROM Objeto";
            ContextoBD contexto = new ContextoBD(); 
            ResultSet rs = contexto.ejecutarSelect(sql);
            try{
                if(rs !=null){
                    while(rs.next()){
                        salida = salida +"("+ rs.getInt("id")+") "+rs.getString("nombre")+"  |  "+rs.getString("municipio")+"  |  "+rs.getString("tipo")+"  |  "+rs.getString("tipoagua")+"  |  "+rs.getInt("irca")+"  |  "+rs.getString("nivelderiesgo")+"\n";
                        
                    }
                    AreaTexto.append(salida);
                }
                
            }catch(Exception ex){
                salida= salida + "\n OCURRIO UN ERROR AL LEER LOS DATOS"+ex.getMessage();
                
            }
    }//GEN-LAST:event_btnObtenerDatosActionPerformed

    private void btnNivelesMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelesMedioActionPerformed
            AreaTexto.append(null);
            String mensaje =" ";
            int cont=0;
            String salida=" ";
            String sql = "SELECT nombre, nivelderiesgo FROM Objeto";
            ContextoBD contexto = new ContextoBD(); 
            ResultSet rs = contexto.ejecutarSelect(sql);
            try{
                if(rs !=null){
                    while(rs.next()){
                        cont++;
                        salida = salida+"NOMBRE: "+rs.getString("nombre")+"  *RIESGO: "+rs.getString("nivelderiesgo")+"\n";
                    }
                }
                mensaje="LA CANTIDAD DE CUERPOS CON NIVLES MEDIOS ES: ";
                    AreaTexto.append(salida);
                
            }catch(Exception ex){
                salida= salida + "\n OCURRIO UN ERROR AL LEER LOS DATOS"+ex.getMessage();
                
            }
             
             
    }//GEN-LAST:event_btnNivelesMedioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AreaTexto.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           try{
           String sql = "DELETE FROM Objeto";
           ContextoBD contexto = new ContextoBD();
           ResultSet rs = contexto.ejecutarSelect(sql);
           AreaTexto.setText(null);
          
               
           }catch(Exception ex){
               
           }
              
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrameDensidadPoblacional v = new JFrameDensidadPoblacional();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JMenuBar MenuB;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNivelesMedio;
    private javax.swing.JButton btnObtenerDatos;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtNivel_de_riesgo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtirca;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txttipo_agua;
    // End of variables declaration//GEN-END:variables
}
