package semMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener{
	
	LoginTratamentoEmOutraClasse login;
	
	public ButtonHandler(LoginTratamentoEmOutraClasse login) {
		this.login = login;
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == login.entrarButton) {
		JOptionPane.showMessageDialog(null, "LOGADO");
		}
		else {
			System.exit(0);
		}
	}
}