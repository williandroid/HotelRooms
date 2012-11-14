<<<<<<< HEAD
package mvc.controllerview;

import entity.Quarto;
import entity.TipoQuarto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.model.dao.QuartoDAO;
import mvc.model.dao.TipoQuartoDAO;

/**
 *
 * @author Willian
 */
public class FormCadastroQuarto extends javax.swing.JFrame {

    static TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();    
    static ArrayList<String> tipoQuartoNomes; 
    static Quarto quarto = null;
    
    /**
     * Creates new form FormCadastroQuarto
     */
    public FormCadastroQuarto() {
        initComponents();  
        
        try {
            tipoQuartoNomes = (ArrayList) tipoQuartoDAO.listarNomesTipoQuarto();
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }   
        
        for (int i = 0; i < tipoQuartoNomes.size(); i++) {
            jComboBoxTipoQuarto.addItem((String)tipoQuartoNomes.get(i));
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

        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbTipoQuarto = new javax.swing.JLabel();
        jComboBoxTipoQuarto = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        lbErro = new javax.swing.JLabel();
        lbConfirma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro de Quartos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodigo.setText("Código: *");

        lbTipoQuarto.setText("Tipo Quarto:");

        jComboBoxTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoQuartoActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Abort.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Refresh.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);

        lbValor.setText("Valor: *");

        lbObs.setText("Observação:");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        lbErro.setForeground(new java.awt.Color(204, 0, 0));

        lbConfirma.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addGap(11, 11, 11)
                                .addComponent(tfValor))
                            .addComponent(lbObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbErro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbConfirma)))
                        .addGap(18, 18, 18)
                        .addComponent(lbTipoQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar)
                                .addGap(35, 35, 35)
                                .addComponent(btSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbConfirma)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo)
                    .addComponent(lbTipoQuarto)
                    .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValor))
                        .addGap(46, 46, 46)
                        .addComponent(lbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-514)/2, (screenSize.height-406)/2, 514, 406);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if (tfCodigo.getText().equals("") || tfValor.getText().equals("")) {
            lbErro.setText("Os Campos com * são obrigatorios!");
        } else {
            Quarto quarto = new Quarto();
            quarto.setCodigo(tfCodigo.getText());
            quarto.setObservacao(taObs.getText());
            quarto.setValor(Float.parseFloat(tfValor.getText()));
            quarto.setStatus(false);
            List<TipoQuarto> tipoQuartoList = tipoQuartoDAO.buscarTodos();
            
            for (TipoQuarto tipoQuarto : tipoQuartoList) {                
                if (tipoQuarto.getNome().equals((String)jComboBoxTipoQuarto.getSelectedItem())) {
                    quarto.setTipoQuarto(tipoQuarto);
                }               
            }
                  
            try {
                QuartoDAO quartoDAO = new QuartoDAO();
                quartoDAO.inserir(quarto);
                tipoQuartoDAO.inserir(quarto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }   
            
            lbErro.setVisible(false);
            lbConfirma.setText("Quarto Cadastrado com sucesso!");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        tfCodigo.setText("");
        tfValor.setText("");
        taObs.setText("");
        lbConfirma.setText("");
        lbErro.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoQuartoActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroQuarto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox jComboBoxTipoQuarto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirma;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbTipoQuarto;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controllerview;

import entity.Quarto;
import entity.TipoQuarto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.model.dao.QuartoDAO;
import mvc.model.dao.TipoQuartoDAO;

/**
 *
 * @author Willian
 */
public class FormCadastroQuarto extends javax.swing.JFrame {

    static TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();    
    static ArrayList<String> tipoQuartoNomes; 
    static Quarto quarto = null;
    
    /**
     * Creates new form FormCadastroQuarto
     */
    public FormCadastroQuarto() {
        initComponents();   
        try
        {
            tipoQuartoNomes = (ArrayList) tipoQuartoDAO.listarNomesTipoQuarto();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
        
        for(int i = 0; i < tipoQuartoNomes.size(); i++)
        {
            jComboBoxTipoQuarto.addItem((String)tipoQuartoNomes.get(i));
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

        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbTipoQuarto = new javax.swing.JLabel();
        jComboBoxTipoQuarto = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        lbErro = new javax.swing.JLabel();
        lbConfirma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro de Quartos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodigo.setText("Código: *");

        lbTipoQuarto.setText("Tipo Quarto:");

        jComboBoxTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoQuartoActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Abort.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Refresh.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);

        lbValor.setText("Valor: *");

        lbObs.setText("Observação:");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        lbErro.setForeground(new java.awt.Color(255, 51, 0));

        lbConfirma.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addGap(11, 11, 11)
                                .addComponent(tfValor))
                            .addComponent(lbObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbErro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbConfirma)))
                        .addGap(18, 18, 18)
                        .addComponent(lbTipoQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar)
                                .addGap(35, 35, 35)
                                .addComponent(btSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbConfirma)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo)
                    .addComponent(lbTipoQuarto)
                    .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValor))
                        .addGap(46, 46, 46)
                        .addComponent(lbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-514)/2, (screenSize.height-406)/2, 514, 406);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        if(camposObrigatorios() == true)
        {
            lbConfirma.setVisible(false);
            lbErro.setVisible(true);
            lbErro.setText("Os Campos com * são obrigatorios!");
        }
        else
        {
            quarto.setCodigo(tfCodigo.getText());
            quarto.setObservacao(taObs.getText());
            quarto.setValor(Float.parseFloat(tfValor.getText()));
            quarto.setStatus(false);
            List<TipoQuarto> tipoQuartoList = tipoQuartoDAO.buscarTodos();
            
            for(TipoQuarto tipoQuarto : tipoQuartoList)
            {                
                if(tipoQuarto.getNome().equals((String)jComboBoxTipoQuarto.getSelectedItem()))
                {
                    quarto.setTipoQuarto(tipoQuarto);
                }               
            }
            
            QuartoDAO quartoDAO = new QuartoDAO();
            quartoDAO.inserir(quarto);
            try
            {
                tipoQuartoDAO.inserir(quarto);
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            lbErro.setVisible(false);
            lbConfirma.setVisible(true);
            lbConfirma.setText("Quarto Cadastrado com sucesso!");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        tfCodigo.setText("");
        tfValor.setText("");
        taObs.setText("");
        lbConfirma.setText("");
        lbErro.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

     private boolean camposObrigatorios()
    {
        boolean retorno = false;
        if(tfCodigo.getText().equals(""))
        {
            tfCodigo.setBackground(Color.orange);
            retorno = true;
        }
        else
        {
            tfCodigo.setBackground(Color.WHITE);
        }
        
        if(tfValor.getText().equals(""))
        {
            tfValor.setBackground(Color.orange);
            retorno = true;
        }
        else
        {
            tfValor.setBackground(Color.WHITE);
        }
        return retorno;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoQuartoActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroQuarto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox jComboBoxTipoQuarto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirma;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbTipoQuarto;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> 666fb89d452314dc873099d296f19a89c136aec7
