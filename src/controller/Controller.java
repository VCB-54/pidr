package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Arm;
import model.Model;
import view.ViewArm;

public class Controller implements ActionListener{
	private Model model;
	private ViewArm view;
	
	public void setModel(Model m){
		model = m;
	}
	
	public void setView(ViewArm v){
		view = v;
	}
	public Model getModel(){
		return model;
	}
	public ViewArm getViewArm(){
		return view;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
