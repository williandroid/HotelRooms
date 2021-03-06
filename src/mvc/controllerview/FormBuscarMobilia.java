package mvc.controllerview;

import entity.Mobilia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.MobiliaDAO;
import myutils.Notificacao;

public class FormBuscarMobilia extends javax.swing.JFrame 
{
    private Notificacao notificacao = new Notificacao();

    public FormBuscarMobilia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMobilia = new javax.swing.JPanel();
        btMobiliaNovo = new javax.swing.JButton();
        btMobiliaEditar = new javax.swing.JButton();
        btMobiliaExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMobilia = new javax.swing.JTable();
        lbLocMobiliaNumero = new javax.swing.JLabel();
        tfLocMobiliaNumero = new javax.swing.JTextField();
        btLocMobiliaNumero = new javax.swing.JButton();
        btBuscarTodosMobilia = new javax.swing.JButton();
        lbResultMobilia = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Buscar Mobilia");

        jPanelMobilia.setBorder(javax.swing.BorderFactory.createTitledBorder("Mobilia"));
        jPanelMobilia.setPreferredSize(new java.awt.Dimension(830, 490));

        btMobiliaNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/New document.png"))); // NOI18N
        btMobiliaNovo.setText("Novo");
        btMobiliaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMobiliaNovoActionPerformed(evt);
            }
        });

        btMobiliaEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Modify.png"))); // NOI18N
        btMobiliaEditar.setText("Editar");
        btMobiliaEditar.setEnabled(false);
        btMobiliaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMobiliaEditarActionPerformed(evt);
            }
        });

        btMobiliaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Remove.png"))); // NOI18N
        btMobiliaExcluir.setText("Excluir");
        btMobiliaExcluir.setEnabled(false);
        btMobiliaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMobiliaExcluirActionPerformed(evt);
            }
        });

        jTableMobilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMobilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMobiliaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMobilia);

        lbLocMobiliaNumero.setText("Código:");

        btLocMobiliaNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Search_1.png"))); // NOI18N
        btLocMobiliaNumero.setText("...");
        btLocMobiliaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocMobiliaNumeroActionPerformed(evt);
            }
        });

        btBuscarTodosMobilia.setText("BuscarTodos");
        btBuscarTodosMobilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodosMobiliaActionPerformed(evt);
            }
        });

        lbResultMobilia.setForeground(new java.awt.Color(255, 0, 51));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMobiliaLayout = new javax.swing.GroupLayout(jPanelMobilia);
        jPanelMobilia.setLayout(jPanelMobiliaLayout);
        jPanelMobiliaLayout.setHorizontalGroup(
            jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                        .addComponent(lbLocMobiliaNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLocMobiliaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btMobiliaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMobiliaExcluir)
                    .addComponent(btMobiliaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                        .addComponent(btLocMobiliaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarTodosMobilia)
                        .addGap(163, 163, 163)
                        .addComponent(lbResultMobilia)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMobiliaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanelMobiliaLayout.setVerticalGroup(
            jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocMobiliaNumero)
                    .addComponent(tfLocMobiliaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarTodosMobilia)
                    .addComponent(lbResultMobilia)
                    .addComponent(btLocMobiliaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelMobiliaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMobiliaLayout.createSequentialGroup()
                        .addComponent(btMobiliaNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btMobiliaEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btMobiliaExcluir))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        setSize(new java.awt.Dimension(866, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMobiliaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMobiliaNovoActionPerformed
        FormCadastroMobilia formMobilia = new FormCadastroMobilia();
        formMobilia.setVisible(true);
    }//GEN-LAST:event_btMobiliaNovoActionPerformed

    private void btMobiliaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMobiliaEditarActionPerformed
        int linha = jTableMobilia.getSelectedRow();
        
        Mobilia newMobilia = new Mobilia();
        newMobilia.setCodigo((String)jTableMobilia.getModel().getValueAt(linha, 0));
        newMobilia.setNome((String)jTableMobilia.getModel().getValueAt(linha, 1));
        newMobilia.setDescricao((String)jTableMobilia.getModel().getValueAt(linha, 2));

        FormCadastroMobilia.mobilia = newMobilia;
        FormCadastroMobilia formCadastroMobilia = new FormCadastroMobilia();
        formCadastroMobilia.setVisible(true);
        limparTabela();
    }//GEN-LAST:event_btMobiliaEditarActionPerformed

    private void btMobiliaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMobiliaExcluirActionPerformed

        int linha = jTableMobilia.getSelectedRow();
        String codigoMobiliaSelecionada = (String)jTableMobilia.getModel().getValueAt(linha, 0);
        String nomeMobiliaSelecionada = (String)jTableMobilia.getModel().getValueAt(linha, 1);
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da "
                                              + "mobília: " + nomeMobiliaSelecionada);
        if(confirmacao == 0) {
            try {
                MobiliaDAO mobiliaDAO = new MobiliaDAO();
                mobiliaDAO.remover(codigoMobiliaSelecionada);
                tfLocMobiliaNumero.requestFocus();
                btMobiliaExcluir.setEnabled(false);
                btMobiliaEditar.setEnabled(false);
                limparTabela();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }
        } else {
            tfLocMobiliaNumero.requestFocus();
        }
    }//GEN-LAST:event_btMobiliaExcluirActionPerformed

    private void jTableMobiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMobiliaMouseClicked
        btMobiliaEditar.setEnabled(true);
        btMobiliaExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableMobiliaMouseClicked

    private void btLocMobiliaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocMobiliaNumeroActionPerformed

        btMobiliaEditar.setEnabled(false);
        btMobiliaExcluir.setEnabled(false);
        limparTabela();
        String numero = tfLocMobiliaNumero.getText();
        
        try {
            MobiliaDAO mobiliaDAO = new MobiliaDAO();
            Mobilia mobilia = mobiliaDAO.buscar(numero);
            DefaultTableModel modelo = (DefaultTableModel) jTableMobilia.getModel();
            if(mobilia != null) {
                modelo.addRow(mobilia.getDadosEmVetor());
            } else {
                notificacao.exibir("Nenhuma Mobilia Encontrada.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btLocMobiliaNumeroActionPerformed

    private void btBuscarTodosMobiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodosMobiliaActionPerformed
        btMobiliaEditar.setEnabled(false);
        btMobiliaExcluir.setEnabled(false);
        limparTabela();
        tfLocMobiliaNumero.setText("");
        
        DefaultTableModel modelo = (DefaultTableModel) jTableMobilia.getModel();
        
        try {
            MobiliaDAO mobiliaDAO = new MobiliaDAO();
            ArrayList<Mobilia> listaMobilia = (ArrayList<Mobilia>) mobiliaDAO.buscarTodos();
            if  (!listaMobilia.isEmpty()) {
                for (int i = 0; i < listaMobilia.size(); i++) {
                    modelo.addRow(listaMobilia.get(i).getDadosEmVetor());
                }
            } else {
                notificacao.exibir("Nenhuma Mobilia Encontrada.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btBuscarTodosMobiliaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed
    private void limparTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel) jTableMobilia.getModel();
        for (int i = jTableMobilia.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarTodosMobilia;
    private javax.swing.JButton btLocMobiliaNumero;
    private javax.swing.JButton btMobiliaEditar;
    private javax.swing.JButton btMobiliaExcluir;
    private javax.swing.JButton btMobiliaNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanelMobilia;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMobilia;
    private javax.swing.JLabel lbLocMobiliaNumero;
    private javax.swing.JLabel lbResultMobilia;
    private javax.swing.JTextField tfLocMobiliaNumero;
    // End of variables declaration//GEN-END:variables
}
