package model;

public class Neuron {
	private double x;
	private double y;
	private double teta1;//epaule
	private double teta2;//coude
	
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

	public double getNeuronX(){
		return x;
	}
	public double getNeuronY(){
		return y;
	}
	public double distance(Neuron n){
		return Math.sqrt(Math.pow(x-n.getNeuronX(), 2)+Math.pow(n.getNeuronY()-y, 2));
	}

}
