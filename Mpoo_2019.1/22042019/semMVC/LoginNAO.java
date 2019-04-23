package semMVC;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginNAO extends JFrame {
	
	int HEIGHT = 200; 
	int WIDTH = 200;
	int MULT = 2;

	public LoginNAO() {
		JFrame jframe = new JFrame("Titulo");
		JButton sairButton = new JButton("SAIR");
		JButton entrarButton = new JButton("ENTRAR");

		
		jframe.setSize(WIDTH*MULT, HEIGHT*MULT); // Define o tamanho da tela
		jframe.setLocationRelativeTo(null); // Define onde a tela aparecerá
		jframe.setResizable(false); // Não ira conseguir mexer no tamanho
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE); // Encerra ele por completo
		jframe.setLayout(new FlowLayout());
//		jframe.setUndecorated(true);
		
		jframe.add(entrarButton);
		jframe.add(sairButton);
		
		jframe.setVisible(true); // Para poder aparecer a tela			
	}
	
	public static void main(String[] args) {
		new LoginNAO();
	}
}
