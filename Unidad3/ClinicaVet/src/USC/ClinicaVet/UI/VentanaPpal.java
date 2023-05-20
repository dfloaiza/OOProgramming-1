package USC.ClinicaVet.UI;

import USC.ClinicaVet.Model.*;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame {
	
	PanelDatos miPanelDatos;
	ClinicaVet miClinicaVet;
	
	
	
	public VentanaPpal()
	{
		this.setSize(800, 600);
		this.setTitle("Mi primer JFrame");
		this.setBackground(Color.BLACK);
		String[] strMedicos;		
		miPanelDatos = new PanelDatos(this);
		this.add(miPanelDatos);		
		miClinicaVet = new ClinicaVet();
		miClinicaVet.CargarEspecialistas("./data/medicos.csv");
		strMedicos = miClinicaVet.getEspecialistas().toArray(new String[0]);
		for(String s: strMedicos)
			System.out.println(s);
		
		miPanelDatos.mostrarMedicos(strMedicos);
	}	
	
	public static void main(String[] args)
	{
		VentanaPpal miAplicacion = new VentanaPpal();
		miAplicacion.setVisible(true);		
	}	

}
