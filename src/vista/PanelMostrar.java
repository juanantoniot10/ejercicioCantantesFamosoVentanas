package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Component;

public class PanelMostrar extends JPanel{
	private JTextPane textPane;
	private JButton btnMostrar;
	
	public PanelMostrar() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblMostrarCantantesPero = new JLabel("Mostrar cantantes famosos y discos mas vendidos");
		lblMostrarCantantesPero.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblMostrarCantantesPero);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		textPane = new JTextPane();
		panel_1.add(textPane);
		
		btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnMostrar.setMargin(new Insets(2, 0, 2, 0));
		btnMostrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMostrar.setMaximumSize(new Dimension(11111, 60));
		panel_1.add(btnMostrar);
		
		

	}

	public JTextPane getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}
	
}
