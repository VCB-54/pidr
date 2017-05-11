package controller;

import model.Model;
import view.PanelArm;

public class ControllerArm {
	Model model;
	PanelArm panelArm;
	
	
	public void setModel(Model m){
		model = m;
	}
	public void setView(PanelArm pa){
		panelArm = pa;
	}
	public Model getModel(){
		return model; 
	}
	
	public PanelArm getView(){
		return panelArm;
	}
	
}
