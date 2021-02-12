import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculadora extends JFrame implements ActionListener{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Calculadora() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
	
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		
	}
	
}


public class PruebaCalculadora {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora();
            }
        });
		

	}

}
