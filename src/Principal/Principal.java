package Principal;

import View.TelaLogin;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;

// MAIN CLASS
public class Principal {
    
    public static void main(String[] args) {
        
        // Bloco try para capturar erros provenientes da tentativa de executar o tema escuro 
        try {
            FlatDarkLaf.setup();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        // Opções de tema
        String[] options = {"Claro", "Escuro"};
        int n = JOptionPane.showOptionDialog(null, "Escolha um tema", "SisUni", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        // Execução condicional com base no tema escolhido pelo usuário
        if (n != 1){
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FlatLightLaf.setup();
                } catch (Exception e){
                    e.printStackTrace();
                }
                new TelaLogin().setVisible(true);
            }
            });
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FlatDarkLaf.setup();
                } catch (Exception e){
                    e.printStackTrace();
                }
                new TelaLogin().setVisible(true);
            }
            });
        }
    }
}