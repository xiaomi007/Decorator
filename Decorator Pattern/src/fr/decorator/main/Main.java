package fr.decorator.main;

import fr.decorator.cake.Cake;
import fr.decorator.cake.Pastry;
import fr.decorator.layer.Caramel;
import fr.decorator.layer.Chocalate;
import fr.decorator.layer.Cream;

/**
 * 
 * @author Damien 
 * 		   The Purpose of the Decorator Pattern is to dynamically add
 *         Functions to an objet. In this example, we will make a basic cake
 *         (which will add an inheritence to the decorator and redefine their
 *         functions) then we will add function. First we need to have the same
 *         type for the object which need to be decorate and the others objects
 *         which will decorate to use the polymorphism.
 *         
 *         Pastry 	: Abstract Component
 *         Cake		: Concrete Component
 *         Layers	: Abstract Decorator
 *         Chocolate: Concrete Decorator
 *         Caramel	: Concrete Decorator
 *         Cream	: Concrete Decorator
 * 
 */

public class Main {

	public static void main(String[] args) {

		Pastry makeTheCake = new Chocalate(new Cream(new Caramel(new Cake())));
		System.out.println(makeTheCake.bake());

	}

}
