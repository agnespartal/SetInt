package model;

public interface InterfaceListaInt {
	
	public boolean isEmpty();
	public int size();
	public No getNo(int posicao) throws Exception;
	public void addFirst (int valor)throws Exception;
	public void addLast (int valor) throws Exception;
	public void add (int valor, int posicao)throws Exception;
	public void removeFirst ()throws Exception;
	public void removeLast()throws Exception;
	public void remove (int posicao)throws Exception;
	public int get(int posicao)throws Exception;

}
