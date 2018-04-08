package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import vista.PanelAnadir;
import vista.PanelMostrar;

public class ListenerMenu implements ActionListener {

	JPanel panelPrincipal;
	PanelAnadir panelAnadir;
	PanelMostrar panelMostrar;
	
	public ListenerMenu(JPanel panelPrincipal, PanelAnadir panelAnadir, PanelMostrar panelMostrar) {
		this.panelPrincipal = panelPrincipal;
		this.panelAnadir = panelAnadir;
		this.panelMostrar = panelMostrar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem botonPulsado = ((JMenuItem)e.getSource());
		if (botonPulsado.getName()=="anadir") {
			panelPrincipal.remove(panelMostrar);
			panelPrincipal.add(panelAnadir);
		}
		else if (botonPulsado.getName()=="mostrar") {
			panelPrincipal.remove(panelAnadir);
			panelPrincipal.add(panelMostrar);
		}
		else salirDelPrograma();
		
		SwingUtilities.updateComponentTreeUI(panelPrincipal);
	}

	private void salirDelPrograma() {
		// TODO Auto-generated method stub
		
	}

}
