package vista;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Color;

public class PanelAnadir extends JPanel{
	private JTextField nombreCantante;
	private JTextField disco;
	private JButton botonAnadir;
	private JLabel mensajeExito;
	
	public PanelAnadir() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JLabel lblAnadirNuevoCantante = new JLabel("ANADIR NUEVO CANTANTE PERO FAMOSO");
		lblAnadirNuevoCantante.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnadirNuevoCantante.setMinimumSize(new Dimension(11, 14));
		lblAnadirNuevoCantante.setMaximumSize(new Dimension(2208, 33));
		lblAnadirNuevoCantante.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(lblAnadirNuevoCantante);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{143, 85, 140, 0};
		gbl_panel_1.rowHeights = new int[]{42, 26, 40, 0, 44, 0, 42, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNombreDeCantante = new JLabel("Nombre de cantante");
		lblNombreDeCantante.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNombreDeCantante = new GridBagConstraints();
		gbc_lblNombreDeCantante.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreDeCantante.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDeCantante.gridx = 0;
		gbc_lblNombreDeCantante.gridy = 2;
		panel_1.add(lblNombreDeCantante, gbc_lblNombreDeCantante);
		
		nombreCantante = new JTextField();
		nombreCantante.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_nombreCantante = new GridBagConstraints();
		gbc_nombreCantante.fill = GridBagConstraints.BOTH;
		gbc_nombreCantante.insets = new Insets(0, 0, 5, 5);
		gbc_nombreCantante.gridx = 1;
		gbc_nombreCantante.gridy = 2;
		panel_1.add(nombreCantante, gbc_nombreCantante);
		nombreCantante.setColumns(10);
		
		JLabel discoMasVendido = new JLabel("Disco mas venido");
		discoMasVendido.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_discoMasVendido = new GridBagConstraints();
		gbc_discoMasVendido.fill = GridBagConstraints.VERTICAL;
		gbc_discoMasVendido.insets = new Insets(0, 0, 5, 5);
		gbc_discoMasVendido.gridx = 0;
		gbc_discoMasVendido.gridy = 4;
		panel_1.add(discoMasVendido, gbc_discoMasVendido);
		
		disco = new JTextField();
		disco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		panel_1.add(disco, gbc_textField);
		disco.setColumns(10);
		
		mensajeExito = new JLabel("");
		mensajeExito.setFont(new Font("Tahoma", Font.BOLD, 14));
		mensajeExito.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_mensajeExito = new GridBagConstraints();
		gbc_mensajeExito.fill = GridBagConstraints.BOTH;
		gbc_mensajeExito.insets = new Insets(0, 0, 0, 5);
		gbc_mensajeExito.gridx = 0;
		gbc_mensajeExito.gridy = 6;
		panel_1.add(mensajeExito, gbc_mensajeExito);
		
		botonAnadir = new JButton("a\u00F1adir");
		botonAnadir.setMinimumSize(new Dimension(63, 40));
		botonAnadir.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_botonAnadir = new GridBagConstraints();
		gbc_botonAnadir.fill = GridBagConstraints.BOTH;
		gbc_botonAnadir.insets = new Insets(0, 0, 0, 5);
		gbc_botonAnadir.gridx = 1;
		gbc_botonAnadir.gridy = 6;
		panel_1.add(botonAnadir, gbc_botonAnadir);
	}

	public JTextField getNombreCantante() {
		return nombreCantante;
	}

	public void setNombreCantante(JTextField nombreCantante) {
		this.nombreCantante = nombreCantante;
	}

	public JTextField getDisco() {
		return disco;
	}

	public void setDisco(JTextField disco) {
		this.disco = disco;
	}

	public JButton getBotonAnadir() {
		return botonAnadir;
	}

	public void setBotonAnadir(JButton botonAnadir) {
		this.botonAnadir = botonAnadir;
	}

	public JLabel getMensajeExito() {
		return mensajeExito;
	}

	public void setMensajeExito(JLabel mensajeExito) {
		this.mensajeExito = mensajeExito;
	}
	
}
