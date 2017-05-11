package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;

public class ControllerBoutonDeplacer implements ActionListener {
	
	private JButton btn;
	private Model model;
	
	public ControllerBoutonDeplacer(JButton btn,Model m)
	{
		this.btn = btn;
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.model.deplacementBras();
		
	}

}
