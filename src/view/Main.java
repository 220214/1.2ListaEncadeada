package view;

import Controler.ControlerParImpar;
import model.ParImpar;

public class Main {

	public static void main(String[] args) {
		int []vet= {2,4,5,7,8,12,23,45,98};
		ParImpar p = new ParImpar();
		ControlerParImpar c = new ControlerParImpar();
		for (int valor: vet) {
			p.setNumero(valor);
			c.Adicionar(p);
		}
		try {//eu não estou conseguindo fazer esta parte ... o senhor poderia me ajudar?
			c.lista(3);
			c.lista(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
