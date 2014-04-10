package fr.decorator.layer;

import fr.decorator.cake.Pastry;

public class Layers extends Pastry {

	protected Pastry pastry;
	protected String name;
	
	public Layers(Pastry p){
		this.pastry = p;
	}
	
	@Override
	public String bake() {
		String str = pastry.bake();
		return str + name;
	}

}
