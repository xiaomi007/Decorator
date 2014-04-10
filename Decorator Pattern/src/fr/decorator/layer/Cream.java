package fr.decorator.layer;

import fr.decorator.cake.Pastry;

public class Cream extends Layers {

	public Cream(Pastry p) {
	    super(p);
	    this.name = "a layer of Cream \n";
    }

}
