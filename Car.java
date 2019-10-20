package encapsulation4;

public class Car {
	public static void main (String [] args) {
		instructions obj1 = new instructions();
		instructions obj = new instructions();
		
		System.out.println(obj.getwheels());
		// we accessd the wheels var through get method
		obj.setwheels(10);
		System.out.println(obj.getwheels()); 
		
		System.out.println(obj1.getwheels()); //because it is not static var. 
		// the value of the wheels will change in specific contianor wont effect other objects ** if static variable when change the value will change everywhere
	}
	

}
