package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.ControllerArm;
import model.Model;

public class PanelArm extends JPanel implements Observer{
	
	private ControllerArm controllerArm;
	private int hauteur;
	private int largeur;
	private Color default_color;
	
	public static final int HAUTEUR = 500;
	public static final int LARGEUR = 500;
	
	//Param a changer si on veut changer l'epaisseur du bras
	int epaisseurBras = 6;

	
	
	public PanelArm(ControllerArm ca){
		controllerArm = ca;
		this.controllerArm.getModel().addObserver(this);

		default_color = this.getBackground();
	
		this.setSize(new Dimension(500,500));
		hauteur = this.getHeight();
		largeur = this.getWidth();

	}
	

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawLine(0, hauteur/2 , largeur, hauteur/2);//absisse
		g.drawLine(largeur/2, 0, largeur/2, hauteur);
		for(int i = 0; i <= largeur ; i+=50){
			g.drawLine(i, hauteur/2+10, i, hauteur/2-10);
		}
		for(int i = 0; i <= hauteur ; i+=50){
			g.drawLine(largeur/2+10,i , largeur/2-10, i);
		}
	
		
	}

	//supprime l'ancien bras
	public void clear(Graphics g)
	{
		g.setColor(default_color);
		for(int i = 0 ; i < hauteur; i++)
		{
			for(int j = 0 ; j < largeur ; j++)
			{
				g.drawLine(i, j, i, j);
			}
		}
		g.setColor(Color.black);
		g.drawLine(0, hauteur/2 , largeur, hauteur/2);//absisse
		g.drawLine(largeur/2, 0, largeur/2, hauteur);
		for(int i = 0; i <= largeur ; i+=50){
			g.drawLine(i, hauteur/2+10, i, hauteur/2-10);
		}
		for(int i = 0; i <= hauteur ; i+=50){
			g.drawLine(largeur/2+10,i , largeur/2-10, i);
		}
	}
	
	public void drawArm(double x1, double y1, double x2, double y2,Graphics g)
	{
		clear(g);
		
		g.setColor(Color.GREEN);
		int size = epaisseurBras/2;
		for(int i = - size ; i < size ; i ++)
		{
			g.drawLine(hauteur/2 +i,largeur/2  ,(int) x1 + i, (int) y1 );
			g.drawLine((int) x1 + i, (int) y1 , (int) x2 + i, (int) y2 );
		}
	}	
	

	
	@Override
	public void update(Observable o, Object arg) {
		Model m = (Model) o;
		drawArm(m.getxCoude(), m.getyCoude(), m.getxMain(), m.getyMain(),getGraphics());
		
	}
	

}
