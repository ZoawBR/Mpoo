package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		BaseDados.clientes = clientes;
	}
}
