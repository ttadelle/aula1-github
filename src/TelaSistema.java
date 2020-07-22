import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaSistema extends JFrame 
{
 
	private static final long serialVersionUID = 1L;

	public TelaSistema() 
    {
        setSize(600, 400);       
        setTitle("Sistema "); 
        JPanel painel = new JPanel();
        painel.setLayout(null);        
        JLabel label = new JLabel();
        label = new JLabel("Olá mundo !");
        painel.add(label);
        label.setBounds(250, 150, 300, 50);
        add(painel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }      

    public static void main(String[] args) {
    	new TelaSistema();
    }
}