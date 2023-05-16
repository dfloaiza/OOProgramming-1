package USC.ClinicaVet.UI;

import javax.swing.JFrame;

public class VentanaPpal extends JFrame {
	
	PanelDatos miPanelDatos;
	
	public VentanaPpal()
	{
		this.setSize(800, 600);
		this.setTitle("Clinica Vet - Reserva de Citas");
		
		miPanelDatos = new PanelDatos();	
		this.add(miPanelDatos);
	}
	
	
	public static void main(String args[])
	{
		VentanaPpal miVentana = new VentanaPpal();
		miVentana.setVisible(true);
	}
	

}
