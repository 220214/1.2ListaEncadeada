package model;

public class ParImpar {
	 private int numero;

	 public int getNumero() {
		 return numero;
	 }
	 public void setNumero(int numero) {
		 this.numero= numero;
	 }
	 public int hashCode() {
		 int pos = numero%2;
		 return pos;
	 }
	 @Override
		
		public String toString() {
			if(numero%2 ==1) {
			return " vetor Impar :"+ numero; 
		}else {
			return "vetor par : "+ numero;
		}
	 } 
}
