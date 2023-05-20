package USC.ClinicaVet.UI;

import USC.ClinicaVet.Model.*;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame {
	
	PanelDatos miPanelDatos;
	ClinicaVet miClinicaVet;
	String[] medicos;
	
	
	public VentanaPpal()
	{
		this.setSize(800, 600);
		this.setTitle("Mi primer JFrame");
		this.setBackground(Color.BLACK);
		miPanelDatos = new PanelDatos();
		this.add(miPanelDatos);
		
		miClinicaVet = new ClinicaVet();
		miClinicaVet.CargarEspecialistas("./data/medicos.csv");
		medicos = (String[]) miClinicaVet.getEspecialistas().toArray();
	}	
	
	public static void main(String[] args)
	{
		VentanaPpal miAplicacion = new VentanaPpal();
		miAplicacion.setVisible(true);		
	}	

}
