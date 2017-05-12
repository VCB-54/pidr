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
	public double[] conversionTtoG(int hauteur, int largeur){
		double[] a = new double[2];
		a[0]=x+largeur/2;
		a[1]=hauteur/2-y;
		return a;
	}
}
