package model;

import java.util.ArrayList;

import view.PanelArm;

public class MapNeuron extends ArrayList<Neuron>{
	
	int nb_neurones = 10; //changer ce param pour + ou - de neurones
	
	public MapNeuron(Boolean init){
		super();
		if(init)
		{
			this.initialiser();
		}
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
	
	
	public MapNeuron copie()
	{
		MapNeuron res = new MapNeuron(false);
		for(Neuron n : this)
		{
			res.add(n);
		}
		return res;
	}
	
	public MapNeuron getNplusProche(Neuron neuron, int n){
		
		MapNeuron resultat = new MapNeuron(false);
		MapNeuron copie = this.copie();
		
		for(int k = 0; k < n ; k++)
		{
			double distance = 10000;
			int position = -1;
			for(int i = 0 ; i < copie.size() ; i ++)
			{
				if(copie.get(i).distance(neuron) < distance && copie.get(i) != neuron)
				{
					position = i;
					distance = copie.get(i).distance(neuron);
				}
			}
			resultat.add(copie.get(position));
			copie.remove(copie.get(position));
		}
		return resultat;
	}
}
