package model;

public class Arm {

	private double bras;//l1
	private double avant_bras;//l2
	private double epaule;//teta1
	private double coude;//teta2
	
	public Arm (double b, double ab){
		this.bras = b;
		this.avant_bras = ab;
		this.epaule = 90;
		this.coude = 180;
	}
	public Arm (){
		this.bras = 10.0;
		this.avant_bras = 10.0;
		this.epaule = 90;
		this.coude = 180;
	}
	
	public double getXarm(double epaule, double coude){
		double x;
		x = bras*Math.cos(epaule) + avant_bras*Math.cos(coude);
		return x;
	}
	
	public double getYarm(double epaule, double coude){
		double y;
		y = bras*Math.sin(epaule) + avant_bras*Math.sin(coude);
		return y;
	}
	
	public void setBras(double bras){
		this.bras = bras;
	}
	
	public void setAvantBras(double avantBras){
		this.avant_bras = avantBras;
	}
	
	public void setCoude(double angle){
		this.coude = angle;
	}
	
	public void setEpaule(double angle){
		this.epaule = angle;
	}
	
	//Ne pas oublier de passer le param echelle en tant que double , par exemple 1/5.0, pas 1/5
	public double conversionXarm(double xPannel, int hauteur, int largeur, double echelle)
	{
		return (xPannel-largeur/2)*echelle;
	}
	
	//Ne pas oublier de passer le param echelle en tant que double , par exemple 1/5.0, pas 1/5
	public double conversionYarm(double yPannel, int hauteur, int largeur, double echelle)
	{
		return (hauteur/2-yPannel)*echelle;
	}
	
	public double getRadEnDeg(double rad){
		return rad*360/(2*Math.PI);
	}
	
	public double getDegEnRad(double degre){
		return degre*2*Math.PI/360;
	}
}
