package model.data_structures;

public interface IListaEncadenada <T extends Comparable>
{
	int darTamano();
	Comparendo<T> darPrimero();
	public void agregar(Comparendo<T> pCom);
	Comparendo<T> eliminar(Comparendo<T> pCom);
	Comparendo<T> buscar(Comparendo<T> pCom);
}
