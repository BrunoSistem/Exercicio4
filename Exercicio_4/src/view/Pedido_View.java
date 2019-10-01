package view;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import business.PedidoBusiness;
import model.Pedido;

import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pedido_View {

	private JFrame frame;
	private JFrame frame2;
	private JTextField textFieldMatricula;
	private JLabel lblTamanho;
	private JRadioButton radiobtnP;
	private JRadioButton radiobtnM;
	private JRadioButton radiobtnG;
	private JComboBox comboBoxCor;
	private JComboBox comboBoxQtd;
	private ButtonGroup bg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido_View window = new Pedido_View();
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
	public Pedido_View() {
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
		textFieldMatricula = new JTextField();
		textFieldMatricula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textFieldMatricula.getText().length()>=maxCaractere) {
					e.consume();
					JOptionPane.showMessageDialog(null, "São apenas 7 caracteres para matrícula\n"
							+"Ex: 1234567");
				}
			}
		});
		textFieldMatricula.setBounds(102, 76, 110, 20);
		frame.getContentPane().add(textFieldMatricula);
		textFieldMatricula.setColumns(10);

		lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(40, 126, 63, 14);
		frame.getContentPane().add(lblTamanho);

		bg = new  ButtonGroup();

		radiobtnP = new JRadioButton("P");
		radiobtnP.setSelected(true);
		radiobtnP.setBounds(102, 122, 37, 23);
		frame.getContentPane().add(radiobtnP);
		bg.add(radiobtnP);


		radiobtnM = new JRadioButton("M");
		radiobtnM.setBounds(141, 122, 37, 23);
		frame.getContentPane().add(radiobtnM);
		bg.add(radiobtnM);

		radiobtnG = new JRadioButton("G");
		radiobtnG.setBounds(180, 122, 37, 23);
		frame.getContentPane().add(radiobtnG);
		bg.add(radiobtnG);


		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(73, 171, 30, 14);
		frame.getContentPane().add(lblCor);

		comboBoxCor = new JComboBox();
		comboBoxCor.setModel(new DefaultComboBoxModel(new String[] {"Branco", "Azul", "Vermelho", "Verde", "Amarelo"}));
		comboBoxCor.setBounds(102, 168, 110, 20);
		frame.getContentPane().add(comboBoxCor);

		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setBounds(73, 216, 63, 14);
		frame.getContentPane().add(lblQtd);

		comboBoxQtd = new JComboBox();
		comboBoxQtd.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxQtd.setBounds(102, 214, 46, 20);
		frame.getContentPane().add(comboBoxQtd);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ação do botão confirmar
				recuperaDados();

			}
		});
		btnConfirmar.setBounds(95, 284, 100, 23);
		frame.getContentPane().add(btnConfirmar);

	}

	public void initialize2(){
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 300, 400);
		frame2.setLocationRelativeTo(null);
		frame2.setResizable(false);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		JLabel lblPedido = new JLabel("PEDIDO");
		lblPedido.setBounds(116, 21, 46, 14);
		frame2.getContentPane().add(lblPedido);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(40, 79, 63, 14);
		frame2.getContentPane().add(lblMatricula);

		//Criar limitação de caracteres
		int maxCaractere = 7;

		lblTamanho = new JLabel("Tamanho:");
		lblTamanho.setBounds(40, 126, 63, 14);
		frame2.getContentPane().add(lblTamanho);

		bg = new  ButtonGroup();


		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(73, 171, 30, 14);
		frame2.getContentPane().add(lblCor);

		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setBounds(73, 216, 63, 14);
		frame2.getContentPane().add(lblQtd);

		JButton btnConfirmar = new JButton("Fechar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ação do botão confirmar
				//frame.dispose();

			}
		});
		btnConfirmar.setBounds(95, 284, 100, 23);
		frame2.getContentPane().add(btnConfirmar);

		JLabel label = new JLabel("Matricula:");
		label.setBounds(99, 79, 63, 14);
		frame2.getContentPane().add(label);
	}



	public void recuperaDados() {
		/*
		 * Variáveis auxiliares com função de referenciar os
		 * dados preechidos ou marcados no formulário. 
		 */
		String matricula = null;
		String tamanho = null;
		String cor = null;
		int qtd = 0;
		Pedido p;

		//Recupera a matricula
		matricula = textFieldMatricula.getText();
		System.out.println(matricula);


		//Recupera o tamanho
		if(radiobtnP.isSelected()) {
			tamanho = "P";
		}
		if(radiobtnM.isSelected()) {
			tamanho = "M";
		}
		if(radiobtnG.isSelected()) {
			tamanho = "G";
		}
		System.out.println(tamanho);

		//Recupera a cor
		cor = (String) comboBoxCor.getSelectedItem();
		System.out.println(cor);

		//Recupera a qtd
		qtd = comboBoxQtd.getSelectedIndex()+1;
		System.out.println(qtd);

		p = new Pedido(matricula, tamanho, cor, qtd);

		if(new PedidoBusiness().solicitacao(p)) {
			JOptionPane.showMessageDialog(null, "Pedido criado com sucesso!");
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja gerar o txt do pedido?");
			if (opcao == JOptionPane.YES_OPTION) {

				/*Abre o arquivo*/
				if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.open(new File("src/arquivo/Pedido.txt"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				} 
			}
		}

	}

}
