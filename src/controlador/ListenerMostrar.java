package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import vista.PanelMostrar;

public class ListenerMostrar implements ActionListener{
	PanelMostrar panelMostrar;
	Logica logica;
	
	
	public ListenerMostrar(PanelMostrar panelMostrar, Logica logica) {
		this.panelMostrar = panelMostrar;
		this.logica = logica;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.panelMostrar.getTextPane().setText(logica.mostrarTodos());
		SwingUtilities.updateComponentTreeUI(panelMostrar);
	}

}
