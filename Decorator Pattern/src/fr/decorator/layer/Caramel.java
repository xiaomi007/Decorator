package fr.decorator.layer;

import fr.decorator.cake.Pastry;

public class Caramel extends Layers{

	public Caramel(Pastry p) {
	    super(p);
	    this.name = "a layer of Caramel \n";
    }

}
