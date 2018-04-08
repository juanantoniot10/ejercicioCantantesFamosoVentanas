package controlador;

import vista.PanelAnadir;
import vista.PanelMostrar;
import vista.VistaPrincipal;

public class PuenteVistaControl extends VistaPrincipal{
	ListenerAnadir listenerAnadir;
	ListenerMostrar listenerMostrar;
	ListenerMenu listenerMenu;
	PanelMostrar panelMostrar = new PanelMostrar();
	PanelAnadir panelAnadir = new PanelAnadir();
	Logica logica = new Logica();
	public PuenteVistaControl() {
		super();
		this.listenerAnadir = new ListenerAnadir(this.panelAnadir,this.logica);
		this.listenerMostrar = new ListenerMostrar(this.panelMostrar,this.logica);
		this.listenerMenu = new ListenerMenu(this.panelPrincipal,this.panelAnadir,this.panelMostrar);
		this.mntmAnadir.addActionListener(listenerMenu);
		this.mntmMostrar.addActionListener(listenerMenu);
		this.mntmSalir.addActionListener(listenerMenu);
		this.panelAnadir.getBotonAnadir().addActionListener(listenerAnadir);
		this.panelMostrar.getBtnMostrar().addActionListener(listenerMostrar);
	}
	
	
}
