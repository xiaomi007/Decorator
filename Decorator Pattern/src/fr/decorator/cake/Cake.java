package fr.decorator.cake;

/**
 * 
 * @author Damien
 *The cake class is the class we want to decorate.
 *Basically, extends from the top hierarchy Pastry will override the abstract function from it.
 *TODO
 */
public class Cake extends Pastry {

	@Override
	public String bake() {
		// TODO Auto-generated method stub
		return "I'm a cake composed with : \n";
	}

}
