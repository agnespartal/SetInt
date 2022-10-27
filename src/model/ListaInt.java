package model;


public class ListaInt implements model.InterfaceListaInt{

	No primeiro;
	
	public ListaInt() {
		primeiro = null;
	}

	@Override
	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = primeiro;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

	@Override
	public No getNo(int posicao) throws Exception {
		if (isEmpty()) {
			 new Exception ("Lista vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			new Exception ("Posicao Invalida");
		}
		No auxiliar = primeiro;
		int cont = 0;
		while (cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}

	@Override
	public void addFirst(int valor) throws Exception{
		setInt(valor);
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}

	@Override
	public void addLast (int valor) throws Exception {
		setInt(valor);
		int tamanho = size();
		if (isEmpty()) {
			new Exception ("Lista Vazia");
		}
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		No ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}

	@Override
	public void add (int valor, int posicao) throws Exception {
		setInt(valor);
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			new Exception ("Posicao Invalida");
		}
		No elemento = new No();
		elemento.dado = valor;
		if (posicao == 0) {
			addFirst(valor);
		}else if (posicao == tamanho - 1) {
			addLast(valor);
		}else {
			No anterior = getNo(posicao - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	@Override
	public void removeFirst() throws Exception {
		if (isEmpty()) {
			new Exception ("Lista vazia");
		}
		primeiro = primeiro.proximo;
	}

	@Override
	public void removeLast() throws Exception {
		if (isEmpty()) {
			new Exception ("Lista Vazia");
		}
		int tamanho= size();
		No penultimo = getNo(tamanho - 2);
		penultimo.proximo = null;
	}

	@Override
	public void remove(int posicao) throws Exception {
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			new Exception ("Posicao invalida");
		}
		if (isEmpty()) {
			new Exception ("Lista vazia");
		}
		if (posicao == 0) {
			removeFirst();
		}else if (posicao == tamanho - 1) {
			removeLast();
		}else {
			No anterior = getNo(posicao - 1);
			No atual = getNo(posicao);
			anterior.proximo = atual.proximo;
		}
	}

	@Override
	public int get(int posicao) throws Exception {
		if (isEmpty()) {
			new Exception ("Lista vazia");
		}
		int tamanho = size();
		if (posicao < 0 || posicao > tamanho - 1) {
			new Exception ("Posicao Invalida");
		}
		int cont = 0;
		No auxiliar = primeiro;
		while(cont < posicao) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar.dado;
	}

	public void setInt(int valor) throws Exception{
		No auxiliar = primeiro;
		while (auxiliar != null) {
			int compara = auxiliar.dado;
			if (compara == valor) {
				throw new Exception ("Valor nao pode ser inserido");
			}else {
				auxiliar = auxiliar.proximo;
			}
		}
	}

	
}
