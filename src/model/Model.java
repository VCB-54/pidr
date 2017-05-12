package model;

import java.util.Observable;

import view.PanelArm;

public class Model extends Observable {
	
	private Arm arm;
	private MapNeuron mapNeuron;
	private double xCoude,yCoude,xMain,yMain;
	
	public Model(Arm a, MapNeuron mn){
		arm = a;
		mapNeuron = mn;
	}
	
	public Model(){
		arm = new Arm();
		mapNeuron = new MapNeuron();
	}
	
	public MapNeuron getMapNeuron()
	{
		return this.mapNeuron;
	}
	public Arm getArm()
	{
		return this.arm;
	}
	
	public void deplacementBras()
	{
		randBras();
		this.conversionTtoG(PanelArm.HAUTEUR,PanelArm.LARGEUR,10.0);
		setChanged();
		notifyObservers();
	}
	
	public void randBras()
	{
		
		double randomEpaule = (Math.random() * (Math.PI*2));
		double randomCoude = (Math.random() * (Math.PI*2));

		
		this.arm.setCoude(randomCoude);
		this.arm.setEpaule(randomEpaule);
	}
	
	public void conversionTtoG(int hauteur, int largeur, double echelle){
		xCoude= (this.arm.getXcoude() * echelle +largeur/2.0) ;
		yCoude= (hauteur/2.0-this.arm.getYcoude() * echelle) ;
		xMain= (this.arm.getXarm()* echelle+largeur/2.0) ;
		yMain= (hauteur/2.0-this.arm.getYarm()* echelle) ;
	}
	

	public double getxCoude() {
		return xCoude;
	}

	public void setxCoude(double xCoude) {
		this.xCoude = xCoude;
	}

	public double getyCoude() {
		return yCoude;
	}

	public void setyCoude(double yCoude) {
		this.yCoude = yCoude;
	}

	public double getxMain() {
		return xMain;
	}

	public void setxMain(double xMain) {
		this.xMain = xMain;
	}

	public double getyMain() {
		return yMain;
	}

	public void setyMain(double yMain) {
		this.yMain = yMain;
	}
	
	
}
