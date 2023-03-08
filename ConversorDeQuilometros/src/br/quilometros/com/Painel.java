package br.quilometros.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Painel {

	private JFrame frmConversorDeQuilometros;
	private JTextField tfQuantidade;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Painel window = new Painel();
					window.frmConversorDeQuilometros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Painel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorDeQuilometros = new JFrame();
		frmConversorDeQuilometros.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmConversorDeQuilometros.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 15));
		frmConversorDeQuilometros.setTitle("Conversor de Quilometros");
		frmConversorDeQuilometros.setBounds(100, 100, 450, 300);
		frmConversorDeQuilometros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorDeQuilometros.getContentPane().setLayout(null);
		
		JLabel lbConversao = new JLabel("Converter:");
		lbConversao.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbConversao.setBounds(26, 27, 92, 20);
		frmConversorDeQuilometros.getContentPane().add(lbConversao);
		
		JButton btnConvrsao = new JButton("Conversão");
		
		JLabel lbPara = new JLabel("Para:");
		lbPara.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbPara.setBounds(59, 79, 59, 14);
		frmConversorDeQuilometros.getContentPane().add(lbPara);
		
		JComboBox comboBoxC = new JComboBox(QuilometrosQuadrados.quilometrosAMostra);
		comboBoxC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBoxC.setBounds(120, 28, 147, 22);
		comboBoxC.setRenderer(new DistanceRenderer());
		frmConversorDeQuilometros.getContentPane().add(comboBoxC);
		
		JComboBox comboBox_1P = new JComboBox(QuilometrosQuadrados.quilometrosAMostra);
		comboBox_1P.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_1P.setBounds(120, 77, 147, 22);
		comboBox_1P.setRenderer(new DistanceRenderer());
		frmConversorDeQuilometros.getContentPane().add(comboBox_1P);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(166, 216, 89, 23);
		frmConversorDeQuilometros.getContentPane().add(btnNewButton);
		
		
		btnConvrsao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double quantidade = Double.parseDouble(tfQuantidade.getText());
				QuilometrosQuadrados origem = (QuilometrosQuadrados)comboBoxC.getSelectedItem();
				QuilometrosQuadrados destino = (QuilometrosQuadrados)comboBox_1P.getSelectedItem();
				double conversor = Conversor.conversorQuilomeros(quantidade, origem, destino);
				String valorAmostra = MetodoAmostra.converterQuilometros(conversor, destino.getNome());
				tfResultado.setText(valorAmostra);
			}
		});
		btnConvrsao.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnConvrsao.setBounds(300, 54, 124, 23);
		frmConversorDeQuilometros.getContentPane().add(btnConvrsao);
		
		JLabel lbQuantidade = new JLabel("Quantidade:");
		lbQuantidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbQuantidade.setBounds(10, 119, 107, 14);
		frmConversorDeQuilometros.getContentPane().add(lbQuantidade);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setBounds(120, 118, 66, 20);
		frmConversorDeQuilometros.getContentPane().add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lbResultado = new JLabel("Resultado:");
		lbResultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lbResultado.setBounds(300, 119, 106, 14);
		frmConversorDeQuilometros.getContentPane().add(lbResultado);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(260, 144, 124, 20);
		frmConversorDeQuilometros.getContentPane().add(tfResultado);
		tfResultado.setColumns(10);
	}
}
