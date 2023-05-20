package USC.ClinicaVet.UI;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


public class PanelDatos extends JPanel implements ActionListener {
	
	JLabel lblMedicos, lblFecha, lblNomMascota;
	JTextField txtFecha, txtNomMascota;
	JComboBox<String> cmbMedicos;
	JButton botonGuardar;
	
	public PanelDatos(VentanaPpal pVentanaPpal)
	{		
		//crear elementos de UI
		lblMedicos = new JLabel("Medicos");
		lblFecha = new JLabel("Fecha");
		lblNomMascota = new JLabel("Nombre Mascota");
		txtFecha = new JTextField();
		txtNomMascota = new JTextField();
		cmbMedicos = new JComboBox<String>();
		botonGuardar = new JButton("Guardar");
		
		//adicionar etiqueta y listener al botón:
		botonGuardar.addActionListener(this);
		botonGuardar.setActionCommand("GUARDAR");
		
		//establecer diagramación del panel:
		this.setLayout(new GridLayout(4,2));
		
		this.add(lblMedicos);
		this.add(cmbMedicos);
		this.add(lblFecha);
		this.add(txtFecha);
		this.add(lblNomMascota);
		this.add(txtNomMascota);	
		this.add(new JLabel(""));
	}
	
	//Adicionar la lista de médicos que se cargó desde el modelo en el comboBox
	public void mostrarMedicos(String[] listaMedicos)
	{
		for(String medico: listaMedicos)
			cmbMedicos.addItem(medico);
		
		this.repaint();
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
	}
	
	

}
