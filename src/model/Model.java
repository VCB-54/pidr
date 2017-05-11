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
}
