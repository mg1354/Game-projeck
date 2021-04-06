package game;

import java.io.Serializable;

public class Object implements Serializable {
   
	private static final long serialVersionUID = 1L;
	String name;
    
	
	
	Object(String Name ){
		
		name = Name;
		
		
	}
	
	public String toString() {
	
		return name ;
	}

}
