package Controler;

import br.edu.fateczl.lista.listaObj.Lista;
import model.ParImpar;

public class ControlerParImpar {
	Lista[] parimpar;
	public ControlerParImpar() {
		parimpar = new Lista[20];
		vetorhash();
	}
	private void vetorhash() {
		int tam =parimpar.length;
		for (int i=0; i< tam; i++) {
			parimpar[i]= new Lista();
	}

	}
	public void Adicionar(ParImpar p) {
		int posi = p.hashCode();
		parimpar[posi].addFirst(p);
	}
	public void lista(int numero) throws Exception {
		int pos = hashCode();
		Lista l = parimpar[pos];
		int tamanho = l.size();
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.println(l.get(i).toString());
		}
	}
	


}
