package model.data_structures;

public class ListaEncadenada<T extends Comparable> implements IListaEncadenada
{
	private Comparendo<T> primero;
	
	
	public ListaEncadenada(T primero)
	{
		primero = null;
	}
	
	public Comparendo<T> darPrimero()
	{
		return primero;
	}
	
	public int darTamano()
	{
		Comparendo<T> actual = primero;
		int cant = 0;
		if(actual==null)
		{
			cant = 0;
		}
		else
		{
			while(actual!=null)
			{
				cant++;
				actual = actual.darSiguiente();
			}
		}
		return cant;
	}


	@Override
	public void agregar(Comparendo pCom) {
		// TODO Auto-generated method stub
		if(primero==null)
		{
			primero = pCom;
		}
		else
		{
			Comparendo<T>actual=primero;
			while(actual.darSiguiente()!=null)
			{
				actual = actual.darSiguiente();
			}
			actual.cambiarSiguiente(pCom);
		}
	}

	@Override
	public Comparendo<T> eliminar(Comparendo pCom) {
		// TODO Auto-generated method stub
		Comparendo<T>actual = primero;
		boolean elim = false;
		while(actual.darSiguiente()!=null && !elim)
		{
			if(actual.darSiguiente()==pCom)
			{
				actual.cambiarSiguiente(actual.darSiguiente().darSiguiente());
				elim=true;
			}
			else
			{
				actual=actual.darSiguiente();
			}
		}
		return pCom;
	}

	@Override
	public Comparendo<T> buscar(Comparendo pCom) {
		// TODO Auto-generated method stub
		Comparendo<T>actual = primero;
		boolean encontrado=false;
		while(actual!=null && !encontrado)
		{
			if(actual.comparar(pCom)==0)
			{
				encontrado=true;
			}
			else
			{
				actual=actual.darSiguiente();
			}
		}
		return actual;
	}

}
