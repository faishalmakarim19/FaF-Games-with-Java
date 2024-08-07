package finalproject;



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Tebak11 extends javax.swing.JFrame {

    int coba = 1;
    int hint = 1;
    public Tebak11() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Tebak Gambar Level 2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jtfJawaban = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfJawaban.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jtfJawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJawabanActionPerformed(evt);
            }
        });
        jPanel1.add(jtfJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, 30));

        btSubmit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btSubmit.setText("SUBMIT");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/OBAT.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(360, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/mata fiks.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 140, 110));

        jButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton1.setText("HINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 273, -1, -1));

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfJawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJawabanActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        //mengecek jawaban yang di input oleh user
        if(coba<=3 && jtfJawaban.getText().toLowerCase().equals("insto")){
            JOptionPane.showMessageDialog(null,"Jawaban Anda Benar");
            this.dispose();
            new Tebak111().setVisible(true); //untuk lanjut ke soal tebak2

        }
        else{
            String inputUser = jtfJawaban.getText().toLowerCase(); //mengambil inputan user

            // Membuat pola regex untuk kata "asah atau otak" yang berdiri sendiri
            Pattern pattern = Pattern.compile("\\b(obat|mata|obat mata)\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(inputUser);

            if(matcher.find()) { //untuk mengecek apabila true terdapat kata asah atau otak maka akan muncul pop up
                JOptionPane.showMessageDialog(null,"Jawaban Anda mendekati");
            }
            else{ //jika tidak maka muncul pop up jawaban salah
                JOptionPane.showMessageDialog(null,"Jawaban Anda salah");
            }
            
            if(coba==1){
                JOptionPane.showMessageDialog(null,"Kesempatan tersisa 2 kali");
            }
            if(coba==2){
                JOptionPane.showMessageDialog(null,"Kesempatan tersisa 1 kali");
            }
            if(coba==3){ // memberikan batasan jawaban hanya 3 kali
                JOptionPane.showMessageDialog(null,"Kesempatan habis");
                this.dispose();
                lobby a = new lobby();
                a.setVisible(true);
            }
            coba++;
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(hint==1){
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Hint hanya sekali, apakah kamu yakin?", "Hint", JOptionPane.OK_CANCEL_OPTION);
            if(showConfirmDialog == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null,"obat mata");
            hint++;
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Kesempatan Hint Habis"); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tebak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tebak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tebak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tebak1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tebak1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfJawaban;
    // End of variables declaration//GEN-END:variables
}
