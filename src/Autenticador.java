import javax.swing.JOptionPane;

public class Autenticador {

	public static void main(String[] args) {
		
		//JOptionPane tela = new JOptionPane(System.in);
		
		String usuario = JOptionPane.showInputDialog("Usu�rio: ");
		
		String senha = JOptionPane.showInputDialog("Senha: ");
		
		if (usuario != null &&
		    senha != null &&
		    (
		    	usuario.equals("tadelle") &&
		    	senha.equals("corinthians"))
		   )
			
	    {
	    	JOptionPane.showMessageDialog(null,"Voce est� conectado.");
	    	} 
		
		else {
	    	JOptionPane.showMessageDialog(null,"Voce � suspeito.");
		
	    }
		

	}

}
