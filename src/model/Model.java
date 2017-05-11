package model;

import java.util.Observable;

public class Model extends Observable {
	
	private Arm arm;
	private MapNeuron mapNeuron;
	
	public Model(Arm a, MapNeuron mn){
		arm = a;
		mapNeuron = mn;
	}
	
	public Model(){
		arm = new Arm();
		mapNeuron = new MapNeuron();
	}
	
	public Arm getArm()
	{
		return this.arm;
	}
	
	public void deplacementBras(double epaule, double coude)
	{
		this.arm.setCoude(coude);
		this.arm.setEpaule(epaule);
		
		setChanged();
		notifyObservers();
	}
	
	public double[] conversionTtoG(int hauteur, int largeur){
		double[] a = new double[4];
		a[0]=this.arm.getXcoude()+largeur/2;
		a[1]=hauteur/2-this.arm.getYcoude();
		a[2]=this.arm.getXarm()+largeur/2;
		a[3]=hauteur/2-this.arm.getYarm();
		return a;
	}
}
