package model;

public class Neuron {
	private double x;
	private double y;
	private double teta1;
	private double teta2;
	
	public Neuron(double x, double y, double teta1, double teta2){
		this.x = x;
		this.y = y;
		this.teta1 = teta1;
		this.teta2 = teta2;
	}
	
	public double getXconverti(int largeur)
	{
		return x+largeur/2.0;
	}
	
	public double getYconverti(int hauteur)
	{
		return hauteur/2.0-y;
	}
	
}
