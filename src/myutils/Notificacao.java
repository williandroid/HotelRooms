package myutils;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Tássio Auad
 */
public class Notificacao{

    private static Notificacao instance;
    private Mensagem alerta;
    public static final int SUCESSO = 1;
    public static final int ERRO = 0;
    
    public static synchronized Notificacao getInstance() 
    {
        if (instance == null) {
            instance = new Notificacao();
        }
                
        return instance;
    }

    public void exibir(String mensagem, int tipo) 
    {
        alerta = new Mensagem(mensagem, tipo);
        alerta.setVisible(true);
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                alerta.dispose();
            }
        }
        , 3000);
        
        
    }

    private class Mensagem extends JDialog
    {
        public Mensagem(String text, int tipo) {
            super();
            JPanel panel = new JPanel();
            getContentPane().add(panel);

            JLabel mensagem = new JLabel(text);
            Font font = new Font("Verdana", Font.BOLD, 14);
            mensagem.setFont(font);
            panel.add(mensagem);
            
            switch(tipo) {
                case Notificacao.ERRO:
                    mensagem.setForeground(Color.red);
                    panel.setBackground(Color.yellow);
                    break;
                case Notificacao.SUCESSO:
                    mensagem.setForeground(Color.green);
                    panel.setBackground(Color.BLUE);
                default :
                    break;
            }
            
            pack();
            
        }
    }
    
}
