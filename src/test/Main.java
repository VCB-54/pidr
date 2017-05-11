package test;

import controller.Controller;
import model.Model;
import view.ViewArm;

public class Main {

	public static void main(String[] args) {
		Model m = new Model();
		Controller c = new Controller();
		ViewArm v = new ViewArm(c);
		c.setModel(m);
		c.setView(v);

	}

}
