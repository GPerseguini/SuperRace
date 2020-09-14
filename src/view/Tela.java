package view;
import controller.FrogController;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Tela extends JFrame {
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		
		JButton btComecar = new JButton("开始!");
		btComecar.setBounds(186, 380, 117, 29);
		getContentPane().add(btComecar);
		
		JLabel frog2 = new JLabel("");
		frog2.setIcon(new ImageIcon("/Users/gabrielperseguini/Downloads/flash-2.png"));
		frog2.setSize(300,300);
		frog2.setBounds(36, 66, 117, 120);
		getContentPane().add(frog2);
		
		JLabel frog1 = new JLabel("");
		frog1.setIcon(new ImageIcon("/Users/gabrielperseguini/Downloads/pngguru.com-2.png"));
		frog1.setBounds(36, 199, 137, 130);
		getContentPane().add(frog1);
		
		
		JLabel lblVencedor = new JLabel("Vencedor:");
		lblVencedor.setBounds(23, 385, 78, 16);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Perdedor:");
		lblPerdedor.setBounds(23, 413, 61, 16);
		contentPane.add(lblPerdedor);
		
		JTextArea tVencedor = new JTextArea();
		tVencedor.setBounds(95, 385, 68, 16);
		contentPane.add(tVencedor);
		
		JTextArea tPerdedor = new JTextArea();
		tPerdedor.setBounds(96, 413, 68, 16);
		contentPane.add(tPerdedor);
		
		FrogController frogController = new FrogController (frog1, frog2, btComecar, tVencedor, tPerdedor);
		
		
		btComecar.addActionListener(frogController);

	}
}
