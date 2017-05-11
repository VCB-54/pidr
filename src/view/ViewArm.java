package view;
import controller.Controller;
import controller.ControllerArm;
import controller.ControllerBoutonDeplacer;
import model.Model;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewArm extends JFrame{
	
	Controller controller;
	PanelArm pa;
	JButton deplacer = new JButton("Deplacer");
	
	public ViewArm (Controller c){
		controller = c;

		this.setSize(new Dimension(700,600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		
		
		deplacer.setName("Deplacer");
		deplacer.addActionListener(new ControllerBoutonDeplacer(deplacer,c.getModel()));
		
		ControllerArm ca = new ControllerArm();
		ca.setModel(controller.getModel());
		
		this.setLayout(new BorderLayout());
		
		pa = new PanelArm(ca);	
		this.add(pa,BorderLayout.CENTER);
		this.add(deplacer,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

	}




	
}
