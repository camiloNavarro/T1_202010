package model.data_structures;

public class Comparendo <T extends Comparable>
{
	private Comparendo <T> siguiente;
	private int objectId;
	private String fecha;
	private String medio;
	private String clase;
	private String tipo;
	private String infraccion;
	private String descripcion;
	private String localidad;
	
	public Comparendo(int pOb, String pFecha, String pMed, String pClas, String pTip, String pInfra, String pDes, String pLocal)
	{
		siguiente =null;
		objectId = pOb;
		fecha = pFecha;
		medio = pMed;
		clase = pClas;
		tipo = pTip;
		infraccion = pInfra;
		descripcion = pDes;
		localidad = pLocal;
	}
	
	public int darObjeto()
	{
		return objectId;
	}
	
	public Comparendo<T> darSiguiente()
	{
		return siguiente;
	}
	
	public void cambiarSiguiente(Comparendo<T> pCompa)
	{
		siguiente = pCompa;
	}
	public int comparar(Comparendo<T> pCompa)
	{
		int resultado=0;
		if(this.darObjeto()>pCompa.darObjeto())
		{
			resultado = 1;
		}
		else if(this.darObjeto()==pCompa.darObjeto())
		{
			resultado = 0;
		}
		else
		{
			resultado = -1;
		}
		return resultado;
	}
	
}
