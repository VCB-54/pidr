package model;

public class Model {
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
}
