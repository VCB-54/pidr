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
	public double getXarm(){
		double x;
		x = bras*Math.cos(epaule) + avant_bras*Math.cos(coude);
		return x;
	}
	public double getYarm(){
		double y;
		y = bras*Math.sin(epaule) + avant_bras*Math.sin(coude);
		return y;
	}
	
	public double getXcoude()
	{
		return Math.cos(epaule) * bras;
	}
	
	public double getYcoude()
	{
		return Math.sin(epaule) * bras;
	}
	
	
	public void setBras(double bras){
		this.bras = bras;
	}
	
	public void setAvantBras(double avantBras){
		this.avant_bras = avantBras;
	}
	public double getEpaule() {
		return epaule;
	}
	public void setEpaule(double epaule) {
		this.epaule = epaule;
	}
	public double getCoude() {
		return coude;
	}
	public void setCoude(double coude) {
		this.coude = coude;
	}
	
	
}
