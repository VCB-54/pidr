package model;

import java.util.ArrayList;

import view.PanelArm;

public class MapNeuron extends ArrayList<Neuron>{
	
	int nb_neurones = 50; //changer ce param pour + ou - de neurones
	
	public MapNeuron(){
		super();
		this.initialiser();
	}
	
	
	
	private void initialiser()
	{
		for(int i = 0 ; i < nb_neurones ; i ++)
		{
			double x = -PanelArm.HAUTEUR/2.0 + (Math.random() * (PanelArm.HAUTEUR/2.0 - (-PanelArm.HAUTEUR/2.0)));
			double y = -PanelArm.LARGEUR/2.0 + (Math.random() * (PanelArm.LARGEUR/2.0 - (-PanelArm.HAUTEUR/2.0)));
			double randomEpaule = (Math.random() * (Math.PI*2));
			double randomCoude = (Math.random() * (Math.PI*2));
			this.add(new Neuron(x,y,randomEpaule,randomCoude));
		}
	}
}
