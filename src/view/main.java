package view;

import br.com.KauanPaulino.ListaInt.Lista_Int;

public class main {
	public static void main(String[] args) {
		Lista_Int l = new Lista_Int();
		l.addFirst(3);
		try {
			l.addLast(5);
			l.addLast(18);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(13);
			l.addLast(4);
			l.addLast(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//mostra em ordem invertida
		int tamanho = l.size();
		while (tamanho>0) {
			int valor;
			try {
				valor = l.get(tamanho-1);
				tamanho--;
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
