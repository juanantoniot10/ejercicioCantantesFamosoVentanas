package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Dimension;

public class VistaPrincipal extends JFrame{
	protected JMenuItem mntmAnadir;
	protected JMenuItem mntmMostrar;
	protected JPanel panelPrincipal;
	protected JMenuItem mntmSalir;
	
	public VistaPrincipal() {
		setMinimumSize(new Dimension(400, 400));
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		panelPrincipal = new JPanel();
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mntmAnadir = new JMenuItem("anadir");
		mntmAnadir.setName("anadir");
		mnOpciones.add(mntmAnadir);
		
		mntmMostrar = new JMenuItem("mostrar");
		mntmMostrar.setName("mostrar");
		mnOpciones.add(mntmMostrar);
		
		mntmSalir = new JMenuItem("salir");
		mntmSalir.setName("salir");
		mnOpciones.add(mntmSalir);
	}
	
}
