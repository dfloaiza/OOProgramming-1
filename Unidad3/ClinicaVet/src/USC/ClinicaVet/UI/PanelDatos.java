package USC.ClinicaVet.UI;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelDatos extends JPanel {
	
	JLabel lblEspecialidad, lblMedico, lblMascota, lblFecha;
	JButton btnReservar;
	JTextField txtNomMascota, txtFecha;
	JComboBox<String> cmbEspecialidades, cmbMedico;
		
	public PanelDatos()
	{
		//Instanciar los elementos de UI:
		lblEspecialidad = new JLabel("Especialidad:");
		lblMedico = new JLabel("Medico");
		lblMascota = new JLabel("Nombre de Mascota");
		lblFecha = new JLabel("Fecha:");
		
		btnReservar = new JButton("Reservar");
		
		txtNomMascota = new JTextField();
		txtFecha = new JTextField();
		
		cmbEspecialidades = new JComboBox<String>();
		cmbMedico = new JComboBox<String>();
		
		//establecer layout del panel:
		this.setLayout(new GridLayout(5, 2));
		
		this.add(lblEspecialidad);
		this.add(cmbEspecialidades);
		this.add(lblMedico);
		this.add(cmbMedico);
		this.add(lblMascota);
		this.add(txtNomMascota);
		this.add(lblFecha);
		this.add(txtFecha);
		this.add(new JLabel(""));
		this.add(btnReservar);
	}

}
