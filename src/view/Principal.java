package view;

import model.ListaInt;


public class Principal {

	public static void main(String[] args) throws Exception{
		ListaInt lista = new ListaInt();
		
		for (int i = 0; i < 5; i++) {
			lista.addFirst(i);
		}
		lista.addFirst(2);
		
	}

}
