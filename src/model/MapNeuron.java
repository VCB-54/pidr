package model;

import java.util.ArrayList;

public class MapNeuron extends ArrayList<Neuron>{
	public MapNeuron(){
		super();
	}
	
	public MapNeuron getNplusProche(Neuron neuron, int n){
		MapNeuron ne = new MapNeuron();
		Neuron winner = this.get(0);
		for(int i = 0; i < n;i++){
			for(Neuron neu : this){
				if(neuron.distance(neu) < neuron.distance(winner) && !ne.contains(neu)){
					winner = neu;
				}
			}
			ne.add(winner);
		}
		return ne;
	}
}
