package br.com.gagjunior.cm.visao;

import javax.swing.JFrame;

public class TelaPincipal extends JFrame {
    
    public TelaPincipal() {
        setTitle("Campo Minado");
        setSize(690, 438);
        setVisible(true);            	
    }

    public static void main(String[] args) {
        new TelaPincipal();
    }
}
