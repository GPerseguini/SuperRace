package controller;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.util.Random;
import javax.swing.ImageIcon;

public class ThreadFrog extends Thread {
	private JLabel frog;
	private JButton btComecar;
	private JTextArea tPerdedor;
	private JTextArea tVencedor;
	private String string;
	
	static int pos=1;
	public ThreadFrog(JLabel frog, JButton btComecar, JTextArea tVencedor, JTextArea tPerdedor,String string){
		this.frog = frog;
		this.btComecar = btComecar;
		this.tVencedor = tVencedor;
		this.tPerdedor = tPerdedor;
		this.string = string;
	}
	private void pulaSapo(){
		Random random = new Random();
		btComecar.setEnabled(false);
		Rectangle posicao;
		posicao = frog.getBounds();
		frog.setBounds(posicao);
		int contadorMov = 0;
		
		while (contadorMov < 400 ) {
			int aux = random.nextInt(30);
			posicao.x = posicao.x + aux;
			contadorMov = contadorMov + aux;
		
		frog.setBounds(posicao);
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
		contadorMov++;
		}
		if (contadorMov >= 400 && tVencedor.getText().isEmpty()){	
			tVencedor.setText(string);
		}else{
			if (tPerdedor.getText().isEmpty()){
				tPerdedor.setText(string);
			}
		}
		btComecar.setEnabled(true);
	}
	public void run() {
		pulaSapo();
	}
}
