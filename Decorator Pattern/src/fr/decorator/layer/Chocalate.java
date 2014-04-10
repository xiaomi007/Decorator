package fr.decorator.layer;

import fr.decorator.cake.Pastry;

public class Chocalate extends Layers {

	public Chocalate(Pastry p) {
		super(p);
		this.name = "a layer of Chocolate \n";
	}

}
