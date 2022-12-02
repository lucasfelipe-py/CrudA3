package View;

import Model.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaAlunos extends javax.swing.JFrame {
    private Aluno objetoAluno;
    
    public GerenciaAlunos() {
        initComponents();
        this.objetoAluno = new Aluno();
        this.carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCadastro = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bDeletar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuGerenciaProfessores = new javax.swing.JMenuItem();
        menuExport = new javax.swing.JMenuItem();
        menuRefresh = new javax.swing.JMenuItem();
        menuLeave = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerência de Alunos");
        setBackground(new java.awt.Color(80, 80, 80));
        setResizable(false);

        bCadastro.setText("Cadastrar novo");
        bCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastroActionPerformed(evt);
            }
        });

        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bDeletar.setText("Deletar");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });

        jTableAlunos.setForeground(new java.awt.Color(153, 153, 153));
        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Curso", "Fase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.setSelectionForeground(new java.awt.Color(239, 239, 239));
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAlunos);
        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
            jTableAlunos.getColumnModel().getColumn(0).setMinWidth(40);
            jTableAlunos.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableAlunos.getColumnModel().getColumn(1).setMinWidth(400);
            jTableAlunos.getColumnModel().getColumn(1).setMaxWidth(400);
            jTableAlunos.getColumnModel().getColumn(2).setMinWidth(60);
            jTableAlunos.getColumnModel().getColumn(2).setMaxWidth(60);
            jTableAlunos.getColumnModel().getColumn(3).setMinWidth(300);
            jTableAlunos.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Alunos");

        refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\55489\\Desktop\\refresh.png")); // NOI18N
        refresh.setText("  Atualizar");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        menu.setForeground(new java.awt.Color(239, 239, 239));
        menu.setText("Arquivo");

        menuGerenciaProfessores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuGerenciaProfessores.setText("Gerência de Professores");
        menuGerenciaProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciaProfessoresActionPerformed(evt);
            }
        });
        menu.add(menuGerenciaProfessores);

        menuExport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuExport.setText("Exportar para Excel");
        menu.add(menuExport);

        menuRefresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRefresh.setText("Atualizar tabela");
        menuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRefreshActionPerformed(evt);
            }
        });
        menu.add(menuRefresh);

        menuLeave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuLeave.setText("Sair");
        menuLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLeaveActionPerformed(evt);
            }
        });
        menu.add(menuLeave);

        jMenuBar1.add(menu);

        jMenu1.setForeground(new java.awt.Color(239, 239, 239));
        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(refresh)
                        .addGap(98, 98, 98)
                        .addComponent(bCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastro)
                    .addComponent(bEditar)
                    .addComponent(bDeletar)
                    .addComponent(refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuGerenciaProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciaProfessoresActionPerformed
        GerenciaProfessores tela = new GerenciaProfessores();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuGerenciaProfessoresActionPerformed

    private void menuLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLeaveActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuLeaveActionPerformed

    private void bCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastroActionPerformed
        CadastroAluno tela = new CadastroAluno();
        tela.setVisible(true);
        
    }//GEN-LAST:event_bCadastroActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        if (this.jTableAlunos.getSelectedRow() != -1){
            EditarAluno tela = new EditarAluno();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro para alterar");
        }
        
    }//GEN-LAST:event_bEditarActionPerformed
    
    public static String listaDados2[] = new String[5];
    
    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if (this.jTableAlunos.getSelectedRow() != -1) {

            String nome = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 1).toString();
            String idade = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 2).toString();
            String curso = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 3).toString();
            String fase = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 4).toString();
            String id = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString();

            listaDados2[0] = id;
            listaDados2[1] = nome;
            listaDados2[2] = idade;
            listaDados2[3] = curso;
            listaDados2[4] = fase;
            
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        try {
            // validando dados da interface gráfica.
            int id = 0;
            
            if (this.jTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Selecione um cadastro para deletar");
            } else {
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este cadastro?");

            if (respostaUsuario == 0) {// clicou em SIM

                // envia os dados para o Professor processar
                if (this.objetoAluno.DeleteAlunoBD(id)) {
                    JOptionPane.showMessageDialog(rootPane, "Cadastro apagado com sucesso!");
                }
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_bDeletarActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        this.carregaTabela();
    }//GEN-LAST:event_refreshActionPerformed

    private void menuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRefreshActionPerformed
        this.carregaTabela();
    }//GEN-LAST:event_menuRefreshActionPerformed
    
    @SuppressWarnings("unchecked")
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableAlunos.getModel();
        modelo.setNumRows(0);

        ArrayList<Aluno> minhalista = new ArrayList<>();
        minhalista = objetoAluno.getMinhaLista();

        for (Aluno a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCurso(),
                a.getFase(),
            });
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastro;
    private javax.swing.JButton bDeletar;
    private javax.swing.JButton bEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuExport;
    private javax.swing.JMenuItem menuGerenciaProfessores;
    private javax.swing.JMenuItem menuLeave;
    private javax.swing.JMenuItem menuRefresh;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
