package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FrogController implements ActionListener {
	private JLabel frog1;
	private JLabel frog2;
	private JButton btComecar;
	private JTextArea tPerdedor;
	private JTextArea tVencedor;
	private String sonic;
	private String flash;
	
	public FrogController (JLabel frog1, JLabel frog2, JButton btComecar,JTextArea tVencedor, JTextArea tPerdedor){
		this.frog1 = frog1;
		this.frog2 = frog2;
		this.btComecar = btComecar;
		this.tPerdedor = tPerdedor;
		this.tVencedor = tVencedor;
		sonic = "Sonic";
		flash = "Flash";
	}
	
	private void botaoFrog(){
		Thread t1 = new ThreadFrog(frog1, btComecar, tVencedor, tPerdedor,sonic);
		Thread t2 = new ThreadFrog(frog2, btComecar, tVencedor, tPerdedor,flash);
		t1.start();
		t2.start();
	}
	public void actionPerformed(ActionEvent e){
		botaoFrog();
	}
}
