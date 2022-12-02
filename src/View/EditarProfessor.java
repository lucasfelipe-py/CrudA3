package View;

import com.formdev.flatlaf.json.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import Model.Professor;

public class EditarProfessor extends javax.swing.JFrame {
    private Professor objetoProfessor;
    
    public EditarProfessor() throws java.text.ParseException {
        initComponents();
        formatarCampos();
        preencheCampos();
        this.objetoProfessor = new Professor();  
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        campus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bConfirmar = new javax.swing.JButton();
        titulo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpfFormatado = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        contatoFormatado = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        salarioFormatado = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();

        setTitle("Editar Professor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Professor");

        campus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Continente", "Dib Mussi", "Ilha", "Pedra Branca", "Trajano", "Tubarão" }));
        campus.setName(""); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nome:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Campus:");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bConfirmar.setText("Confirmar");
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Graduação", "Especialização", "Mestrado", "Doutorado" }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Título:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Idade:");

        jLabel9.setText("CPF:");

        contatoFormatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoFormatadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Contato:");

        jLabel5.setText("Salário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(salarioFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(campus, 0, 282, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cpfFormatado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(contatoFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(contatoFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salarioFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void formatarCampos() throws java.text.ParseException{
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.install(cpfFormatado);
            MaskFormatter mask2 = new MaskFormatter("(##) # ####-####");
            mask2.install(contatoFormatado);
            MaskFormatter mask3 = new MaskFormatter("R$#####");
            mask3.install(salarioFormatado);
        } catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao formatar campos", "ERRO", JOptionPane.ERROR);
        }
    }
    
    private String validarFormatado(String input){
        String str = "";
            
        for (int i = 0; i < input.length(); i++){
            if (("0123456789").contains(input.charAt(i) + "")){
                str += input.charAt(i) + "";
            }
        }
        
        return str;
    }
    private void preencheCampos(){
        String[] arrayCampus = {"-", 
                "Continente",
                "Dib Mussi",
                "Ilha",
                "Pedra Branca",
                "Trajano",
                "Tubarão"};
        String[] arrayTitulo = {"-",
                "Graduação",
                "Especialização",
                "Mestrado",
                "Doutorado"};
        
        int indexCampus = 0;
        int indexTitulo = 0;
        
        for (int i = 0; i < 7; i++){
            if (GerenciaProfessores.listaDados[2].equalsIgnoreCase(arrayCampus[i])){
                indexCampus = i;
            }
        }
        
        for (int j = 0; j < 5; j++){
            if (GerenciaProfessores.listaDados[5].equalsIgnoreCase(arrayTitulo[j])){
                indexTitulo = j;
            }
        }
        
        this.nome.setText(GerenciaProfessores.listaDados[0]);
        this.idade.setText(GerenciaProfessores.listaDados[1]);
        this.campus.setSelectedIndex(indexCampus);
        this.cpfFormatado.setText(GerenciaProfessores.listaDados[3]);
        this.contatoFormatado.setText(GerenciaProfessores.listaDados[4]);
        this.titulo.setSelectedIndex(indexTitulo);
        this.salarioFormatado.setText(GerenciaProfessores.listaDados[6]);
    }
    
    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
        try {
            String nome = "";
            String campus = "";
            String cpf = "";
            String contato = "";
            int idade = 0;
            int salario = 0;
            int id = Integer.parseInt(GerenciaProfessores.listaDados[7]);
            String titulo = "";
            String[] arrayCampus = {"-", 
                "Continente",
                "Dib Mussi",
                "Ilha",
                "Pedra Branca",
                "Trajano",
                "Tubarão"};
            String[] arrayTitulo = {"-",
                "Graduação",
                "Especialização",
                "Mestrado",
                "Doutorado"};
            
            // Setando nome
            if (this.nome.getText().length() < 2){
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.nome.getText();
            }
            
            // Setando campus
            if (this.campus.getSelectedIndex() == 0){
                throw new Mensagens("Escolha o campus");
            } else {
                campus = arrayCampus[this.campus.getSelectedIndex()];
            }
            
            // Setando cpf
            if (validarFormatado(this.cpfFormatado.getText()).length() != 11){
                throw new Mensagens("O campo CPF deve possuir 11 caracteres numéricos");
            } else {
                cpf = this.cpfFormatado.getText();
            }
            
            // Setando contato
            if (validarFormatado(this.contatoFormatado.getText()).length() != 11){
                throw new Mensagens("O campo contato deve possuir 11 caracteres numéricos");
            } else {
                contato = this.contatoFormatado.getText();
            }
            
            // Setando idade
            if (Integer.parseInt(this.idade.getText()) < 11){
                throw new Mensagens("Idade inválida");
            } 
            if (this.idade.getText().equals("")){
                throw new Mensagens("Idade não pode ser vazio");
            } else {
                idade = Integer.parseInt(this.idade.getText());
            }
            
            // Setando salário
            if (validarFormatado(this.salarioFormatado.getText()).length() < 4){
                throw new Mensagens("O campo salário deve possuir no mínimo 4 caracteres numéricos");
            } else {
                salario = Integer.parseInt(validarFormatado(this.salarioFormatado.getText()));
            }
            
            // Setando titulo
            if (this.titulo.getSelectedIndex() == 0){
                throw new Mensagens("Defina um título");
            } else {
                titulo = arrayTitulo[this.titulo.getSelectedIndex()];
            }
            
            // Adicionando dados validados no database
            if (this.objetoProfessor.UpdateProfessorBD(campus, cpf, contato, titulo, salario, id, nome, idade)){
                JOptionPane.showMessageDialog(rootPane, "Professor alterado com sucesso!");
                
                this.dispose();
            }
            
        // Capturando exceções    
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        }
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void contatoFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoFormatadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contatoFormatadoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new EditarProfessor().setVisible(true);
                } catch (java.text.ParseException ex) {
                    Logger.getLogger(EditarProfessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JComboBox<String> campus;
    private javax.swing.JFormattedTextField contatoFormatado;
    private javax.swing.JFormattedTextField cpfFormatado;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nome;
    private javax.swing.JFormattedTextField salarioFormatado;
    private javax.swing.JComboBox<String> titulo;
    // End of variables declaration//GEN-END:variables
}
