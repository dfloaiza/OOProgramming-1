package USC.ClinicaVet.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ClinicaVet {
	
	ArrayList<String> especialistas;
	
		
	public ArrayList<String> getEspecialistas() {
		return especialistas;
	}

	public void setEspecialistas(ArrayList<String> especialistas) {
		this.especialistas = especialistas;
	}

	public ClinicaVet()
	{
		especialistas = new ArrayList<String>();
	}
	
	
	/**
	 * Este método realiza una carga de los especialistas de la 
	 * clínica
	 * @param filePath ruta del archivo plano, csv, desde el cual 
	 * se cargan los datos
	 */
	public void CargarEspecialistas(String filePath)
	{
		try 
		{
			BufferedReader lector = new BufferedReader(new FileReader(filePath));
			String linea = "";
			//String datos[] = new String[2];
			while( (linea = lector.readLine()) != null)
			{
				//linea = lector.readLine().trim();
				//linea = "traumatologia;Pedro Perez"
				//datos = linea.split(";");				
				especialistas.add(linea);			
			}
			lector.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	

}
