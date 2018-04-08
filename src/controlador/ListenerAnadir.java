package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import modelo.CantanteFamoso;
import vista.PanelAnadir;

public class ListenerAnadir implements ActionListener{
	PanelAnadir panelAnadir;
	Logica logica;

	public ListenerAnadir(PanelAnadir panelAnadir, Logica logica) {
		this.panelAnadir = panelAnadir;
		this.logica = logica;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ((String.valueOf(panelAnadir.getNombreCantante().getText()).isEmpty()||
			String.valueOf(panelAnadir.getDisco().getText()).isEmpty())&&this.panelAnadir.getDisco().isEnabled()){
			this.panelAnadir.getMensajeExito().setText("ERROR CAMPO VACIO");
			this.panelAnadir.getBotonAnadir().setText("nuevo");
		}
		
		else if (this.panelAnadir.getMensajeExito().getText()!="Añadido cliente"&&this.panelAnadir.getDisco().isEnabled()) {
			this.logica.anadirCantante(String.valueOf(panelAnadir.getNombreCantante().getText()), String.valueOf(panelAnadir.getDisco().getText()));
			this.panelAnadir.getMensajeExito().setText("Añadido cliente");
			this.panelAnadir.getBotonAnadir().setText("nuevo");
		}
			
		else {
			this.panelAnadir.getMensajeExito().setText("");
			this.panelAnadir.getBotonAnadir().setText("añadir");
		}
		this.panelAnadir.getNombreCantante().setText("");
		this.panelAnadir.getDisco().setText("");
		
		this.panelAnadir.getNombreCantante().setEnabled(!this.panelAnadir.getNombreCantante().isEnabled());
		this.panelAnadir.getDisco().setEnabled(!this.panelAnadir.getDisco().isEnabled());
		
		SwingUtilities.updateComponentTreeUI(panelAnadir);
	}

}
