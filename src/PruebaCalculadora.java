import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculadora extends JFrame implements ActionListener{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton bResiduo,bRaiz,bPotencia,bLn,bBorrar,bBorrarT,
			bDiv,bMul,bRest,bSum,bIgual,bPunto;
	JTextField caja;
	
	String guardar = "";
	String op = "";
	
	public Calculadora() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		
		caja = new JTextField();
		componente(caja, 0, 0, 4, 1, 2);
		
		bResiduo = new JButton("%");
		bResiduo.addActionListener(this);
		componente(bResiduo, 0, 1, 1, 1, 1);
		
		bRaiz = new JButton("Raiz");
		bRaiz.addActionListener(this);
		componente(bRaiz, 1, 1, 1, 1, 1);
		
		bPotencia = new JButton("x^2");
		bPotencia.addActionListener(this);
		componente(bPotencia, 2, 1, 1, 1, 1);
		
		bLn = new JButton("1/x");
		bLn.addActionListener(this);
		componente(bLn, 3, 1, 1, 1, 1);
		
		bBorrarT = new JButton("CE");
		bBorrarT.addActionListener(this);
		componente(bBorrarT, 0, 2, 1, 1, 1);
		
		bBorrar = new JButton("<[x]");
		bBorrar.addActionListener(this);
		componente(bBorrar, 1, 2, 2, 1, 1);
		
		bDiv = new JButton("/");
		bDiv.addActionListener(this);
		componente(bDiv, 3, 2, 1, 1, 1);
		
		b7 = new JButton("7");
		b7.addActionListener(this);
		componente(b7, 0, 3, 1, 1, 1);
		
		b8 = new JButton("8");
		b8.addActionListener(this);
		componente(b8, 1, 3, 1, 1, 1);
		
		b9 = new JButton("9");
		b9.addActionListener(this);
		componente(b9, 2, 3, 1, 1, 1);
		
		bMul = new JButton("x");
		bMul.addActionListener(this);
		componente(bMul, 3, 3, 1, 1, 1);
		
		b4 = new JButton("4");
		b4.addActionListener(this);
		componente(b4, 0, 4, 1, 1, 1);
		
		b5 = new JButton("5");
		b5.addActionListener(this);
		componente(b5, 1, 4, 1, 1, 1);
		
		b6 = new JButton("6");
		b6.addActionListener(this);
		componente(b6, 2, 4, 1, 1, 1);
		
		bRest = new JButton("-");
		bRest.addActionListener(this);
		componente(bRest, 3, 4, 1, 1, 1);
		
		b1 = new JButton("1");
		b1.addActionListener(this);
		componente(b1, 0, 5, 1, 1, 1);
		
		b2 = new JButton("2");
		b2.addActionListener(this);
		componente(b2, 1, 5, 1, 1, 1);
		
		b3 = new JButton("3");
		b3.addActionListener(this);
		componente(b3, 2, 5, 1, 1, 1);
		
		bSum = new JButton("+");
		bSum.addActionListener(this);
		componente(bSum, 3, 5, 1, 1, 1);
		
		bPunto = new JButton(".");
		bPunto.addActionListener(this);
		componente(bPunto, 0, 6, 1, 1, 1);
		
		b0 = new JButton("0");
		b0.addActionListener(this);
		componente(b0, 1, 6, 1, 1, 1);
		
		bIgual = new JButton("=");
		bIgual.addActionListener(this);
		componente(bIgual, 2, 6, 2, 1, 1);
	
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public void componente(JComponent c, int gx, int gy, int gw, int gh, int fill) {
		
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridheight = gh;
		gbc.gridwidth = gw;
		gbc.fill = fill;
		gbl.setConstraints(c, gbc);
		add(c);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == b0) {
			caja.setText(caja.getText()+"0");
		}else if(e.getSource() == b1) {
			caja.setText(caja.getText()+"1");
		}else if(e.getSource() == b2) {
			caja.setText(caja.getText()+"2");
		}else if(e.getSource() == b3) {
			caja.setText(caja.getText()+"3");
		}else if(e.getSource() == b4) {
			caja.setText(caja.getText()+"4");
		}else if(e.getSource() == b5) {
			caja.setText(caja.getText()+"5");
		}else if(e.getSource() == b6) {
			caja.setText(caja.getText()+"6");
		}else if(e.getSource() == b7) {
			caja.setText(caja.getText()+"7");
		}else if(e.getSource() == b8) {
			caja.setText(caja.getText()+"8");
		}else if(e.getSource() == b9) {
			caja.setText(caja.getText()+"9");
		}else if(e.getSource() == bResiduo) {
			guardar = caja.getText();
			caja.setText("");
			op = "%";
		}else if(e.getSource() == bRaiz) {
			if(caja.getText().length()>0) {
				double num = Double.parseDouble(caja.getText());
				if(num>0) {
					num = Math.sqrt(num);
					caja.setText(Double.toString(num));
				}
			}
		}else if(e.getSource() == bPotencia) {
			if(caja.getText().length()>0) {
				double num = Double.parseDouble(caja.getText());
				num = Math.pow(num, 2);
				caja.setText(Double.toString(num));
			}
		}else if(e.getSource() == bLn) {
			if(caja.getText().length()>0) {
				double num = Double.parseDouble(caja.getText());
				if(num!=0) {
					num=1/num;
					caja.setText(Double.toString(num));
				}
			}
		}else if(e.getSource() == bBorrarT) {
			guardar = "";
			caja.setText("");
			op = " ";
		}else if(e.getSource() == bBorrar) {
			if(caja.getText().length()>0)
				caja.setText(caja.getText().substring(0,caja.getText().length()-1));
		}else if(e.getSource() == bDiv) {
			guardar = caja.getText();
			caja.setText("");
			op = "/";
		}else if(e.getSource() == bMul) {
			guardar = caja.getText();
			caja.setText("");
			op = "*";
		}else if(e.getSource() == bRest) {
			guardar = caja.getText();
			caja.setText("");
			op = "-";
		}else if(e.getSource() == bSum) {
			guardar = caja.getText();
			caja.setText("");
			op = "+";
		}else if(e.getSource() == bPunto) {
			if(!caja.getText().contains("."))
				caja.setText(caja.getText()+".");
		}else if(e.getSource() == bIgual) {
			if(op!=" ") {
				double n1 = Double.parseDouble(guardar);
				double n2 = Double.parseDouble(caja.getText());
				double res = 0;
				switch (op) {
					case "%" : 
						res = n1%n2;break;
					case "/" :
						res = n1/n2;break;
					case "*" :
						res = n1*n2;break;
					case "-" :
						res = n1-n2;break;
					case "+" :
						res = n1+n2;break;
					default : break;
				}
				caja.setText(Double.toString(res));
			}
		}
		
		
	}
	
}


public class PruebaCalculadora {

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			System.out.println(UIManager.getInstalledLookAndFeels());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora();
            }
        });
		

	}

}
