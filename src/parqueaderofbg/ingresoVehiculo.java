/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package parqueaderofbg;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import static org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName.TIMES_ROMAN;


/**
 *
 * @author fblum
 */
public class ingresoVehiculo extends javax.swing.JPanel {

    /**
     * Creates new form ingresoVehiculo
     */
    public ingresoVehiculo() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica libreria instalada
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ingresoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cbVehiculo = new javax.swing.JCheckBox();
        cbMoto = new javax.swing.JCheckBox();
        propietario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(153, 255, 153));

        registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cbVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbVehiculo.setText("Vehículo");
        cbVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVehiculoActionPerformed(evt);
            }
        });

        cbMoto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbMoto.setText("Motocicleta");
        cbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotoActionPerformed(evt);
            }
        });

        propietario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        propietario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Propietario");

        placa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Placa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Registro Vehículos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(cbVehiculo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMoto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(registrar)))
                .addGap(196, 261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVehiculo)
                    .addComponent(cbMoto))
                .addGap(44, 44, 44)
                .addComponent(registrar)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String tipoVehiculo="";
        if(cbVehiculo.isSelected()){
            tipoVehiculo="AUTOMOVIL";
        }else if(cbMoto.isSelected()){
            tipoVehiculo="MOTOCICLETA";
        }
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        String fechaHora = dateFormat.format(date);
        try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/parqueaderodb","root","")){  
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO vehiculos (placa,propietario,tipovehiculo,horaentrada,estado) VALUES('"+placa.getText().toUpperCase()+"','"+propietario.getText().toUpperCase()+"','"+tipoVehiculo+"','"+fechaHora+"','DISPONIBLE')");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Vehículo registrado");
            conn.close();
            try (PDDocument recibo = new PDDocument()) {
                PDPage page=new PDPage();//Se crea la página
                recibo.addPage(page);
                try (PDPageContentStream content = new PDPageContentStream(recibo, page) //Se crea el contenido
                ) {
                    PDFont font=new PDType1Font(TIMES_ROMAN);
                    content.beginText();//Se inicia el texto
                    content.setFont(font, 12);
                    content.setLeading(14.5f);
                    content.newLineAtOffset(25, 725);
                    String title="Parqueadero FBG";
                    String par1="Hora Entrada: "+fechaHora;
                    String par2="Propietario: "+propietario.getText().toUpperCase();
                    String par3="Placa: "+placa.getText().toUpperCase();
                    String par4="Tipo Vehiculo: "+tipoVehiculo;
                    content.showText(title);
                    content.newLine();                    
                    content.showText(par1);
                    content.newLine();                    
                    content.showText(par2);
                    content.newLine();                    
                    content.showText(par3);
                    content.newLine();                    
                    content.showText(par4);
                    content.endText();
                } //Se inicia el texto
                recibo.save("C:\\Users\\fblum\\Documents\\Proyectos\\parqueaderoFBG\\recibo.pdf");//se guarda
                recibo.close();
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(ingresoVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
              
    }//GEN-LAST:event_registrarActionPerformed

    private void cbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotoActionPerformed
        cbVehiculo.setSelected(false);
    }//GEN-LAST:event_cbMotoActionPerformed

    private void cbVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVehiculoActionPerformed
        cbMoto.setSelected(false);
    }//GEN-LAST:event_cbVehiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbMoto;
    private javax.swing.JCheckBox cbVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField propietario;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
