package model.logic;

import java.io.File;
import java.io.FileReader;

import model.data_structures.ArregloDinamico;
import model.data_structures.Comparendo;
import model.data_structures.IListaEncadenada;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;



/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private IListaEncadenada datos;
	
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = (IListaEncadenada) datos.darPrimero();
	}
	
	
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */

	
	public JsonObject processingJSONFile(File pArchivo) 
	{
		JsonObject json=null;
		try{
			Gson g = new Gson();
			FileReader archivo = new FileReader(pArchivo);
			JsonReader r = new JsonReader (archivo);
			json = g.fromJson(r, JsonObject.class);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return json;
	}
	

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(Comparendo dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Comparendo buscar(Comparendo dato)
	{
		return datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public Comparendo eliminar(Comparendo dato)
	{
		return datos.eliminar(dato);
	}
	
}
