package semMVC;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginTratamentoPropriaClass extends JFrame implements ActionListener{
	
	int HEIGHT = 200; 
	int WIDTH = 200;
	int MULT = 1;
	
	//Jpanel
	
	JLabel loginLabel, senhaLabel;
	
	JTextField loginText, senhaText;
	
	JButton sairButton, entrarButton;

	public LoginTratamentoPropriaClass() {
		super("Title"); 
		sairButton = new JButton("SAIR");
		entrarButton = new JButton("ENTRAR");
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");

		loginText = new JTextField(10);
		senhaText = new JTextField(10);
		// Questionamento: Como fazer a senha não ser vista?

//		GridBagLayout: VER ISSO!!
		
		setSize(WIDTH*MULT, HEIGHT*MULT);
		setLocationRelativeTo(null); 
//		setResizable(false); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new FlowLayout());
//		setUndecorated(true);
		
		entrarButton.addActionListener(this);
		sairButton.addActionListener(this);
		
		add(loginLabel);
		add(loginText);
		add(senhaLabel);
		add(senhaText);
		add(entrarButton);
		add(sairButton);
		
		setVisible(true); 			
	}


	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == entrarButton) {
		JOptionPane.showMessageDialog(null, "LOGADO");
		}
		else {
			System.exit(0);
		}
	}
	
}
