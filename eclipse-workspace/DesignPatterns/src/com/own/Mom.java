package com.own;


public interface Mom {
	
	public void calling();

}
/*defining an interface (or an abstract class) that declares a method for creating objects.*/


/*
absolutely! The main motive is to allow client code to create objects through a common
interface (or abstract class) without specifying their concrete classes.

 
This promotes flexibility and extensibility, as the actual instantiation details are delegated to
subclasses, enabling easy addition of new classes without modifying existing client code.*/