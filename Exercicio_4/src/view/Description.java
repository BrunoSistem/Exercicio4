package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Description {

	private JFrame frame;
	private JLabel lblTamanho;
	private ButtonGroup bg;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Description window = new Description();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Description() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPedido = new JLabel("PEDIDO");
		lblPedido.setBounds(116, 21, 46, 14);
		frame.getContentPane().add(lblPedido);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(40, 79, 63, 14);
		frame.getContentPane().add(lblMatricula);
		
		//Criar limitação de caracteres
		int maxCaractere = 7;
		
		lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(40, 126, 63, 14);
		frame.getContentPane().add(lblTamanho);
		
		bg = new  ButtonGroup();
				
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(73, 171, 30, 14);
		frame.getContentPane().add(lblCor);
		
		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setBounds(73, 216, 63, 14);
		frame.getContentPane().add(lblQtd);
		
		JButton btnConfirmar = new JButton("Fechar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ação do botão confirmar
				//frame.dispose();
			}
		});
		btnConfirmar.setBounds(95, 284, 100, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JLabel label = new JLabel("Matricula:");
		label.setBounds(99, 79, 63, 14);
		frame.getContentPane().add(label);
	}
}
