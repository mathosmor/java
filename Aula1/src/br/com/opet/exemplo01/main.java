package br.com.opet.exemplo01;

import com.opet.util.Reader;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws Exception {
		System.out.println(menu());
		ArrayList<Integer> cadastrados = new ArrayList<Integer>();
		
		
		int opc = -1;
		switch (opc){
		case 0: 
			cadastrar(cadastrados);
		break;
		}
		 
		
		

	}
	public static String menu() {
		String texto_menu = "0 - cadastrar"
				+ "\n1 - consultar"
				+ "\n2 - Sair";
		return texto_menu;
	}
	
	public static void cadastrar(ArrayList<Integer> cadastrados) throws Exception {
		System.out.println("Digite o numero que deseja cadastrar : ");
		int x = Reader.readInt();
		cadastrados.add(x);
		
		
	}

}
