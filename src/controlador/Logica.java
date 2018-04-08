package controlador;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.CantanteFamoso;

public class Logica {
	private ArrayList<CantanteFamoso> lista = new ArrayList<CantanteFamoso>();
	
	public void anadirCantante(String nombre,String disco) {
		this.lista.add(new CantanteFamoso(nombre, disco));
	}
	
	public String mostrarTodos() {
		StringBuilder cadena = new StringBuilder(0);
		cadena.append("NOMBRE DEL CANTANTE     DISCO MAS VENDIDO\n");
		for (Iterator<CantanteFamoso> iterator = lista.iterator(); iterator.hasNext();) {
			CantanteFamoso cantanteFamoso = (CantanteFamoso) iterator.next();
			cadena.append(String.valueOf(cantanteFamoso.getNombre())+"----------"+String.valueOf(cantanteFamoso.getDisco())+"\n");
		}
		return String.valueOf(cadena);
	}

	public ArrayList<CantanteFamoso> getLista() {
		return lista;
	}

	public void setLista(ArrayList<CantanteFamoso> lista) {
		this.lista = lista;
	}
	
}
