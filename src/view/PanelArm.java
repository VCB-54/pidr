package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import controller.ControllerArm;

public class PanelArm extends JPanel{
	private ControllerArm controllerArm;
	private int hauteur;
	private int largeur;
	
	public PanelArm(ControllerArm ca){
		controllerArm = ca;
		this.setBackground(Color.red);
		this.setSize(new Dimension(500,500));
		hauteur = this.getHeight();
		largeur = this.getWidth();
		System.out.println(hauteur + " -- " + largeur) ;
	}
	
	public void paintComponent(Graphics g)
	{
		this.setBackground(Color.red);
		g.drawLine(0, hauteur/2 , largeur, hauteur/2);//absisse
		g.drawLine(largeur/2, 0, largeur/2, hauteur);
		for(int i = 0; i <= largeur ; i+=50){
			g.drawLine(i, hauteur/2+10, i, hauteur/2-10);
		}
		for(int i = 0; i <= hauteur ; i+=50){
			g.drawLine(largeur/2+10,i , largeur/2-10, i);
		}
	}
}
