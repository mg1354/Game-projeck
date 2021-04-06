package game;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;



public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	Object[] wagon = new Object[3];
	Room location;
	int i ;
	Player(String name, Room location, Object a, Object b, Object c){
		
		this.name  = name;
		this.location = location;
		wagon[0]= a;
		wagon[1]= b;
		wagon[2]= c;
		
	}
	
	public String toString() {
		
		return " Player:  " + this.name +"\n location: "+ location.name + "\n Wagon: " + Arrays.toString(wagon);
	}
	
	
	public void addObject(Object obj) {
		int y=-1;
		int k;
		for (k=0; k<5; k++) {
     		
		     if(obj.equals(location.appliance[k])) {
		    	 y = k ;
		    	 break ;
		     }
		}
		
		int index = getFirstEmptyIndex();
		

		if (index != -1 && y!=-1) {
			this.wagon[index] = obj;
			location.appliance[y] = null;
		
		}else if(index == -1 && y!= -1){
			Random ran = new Random();
	        int j = ran.nextInt(2);	;	
			Object x = this.wagon[j];
			this.wagon[j]=obj;
			location.appliance[y] = x;
			
		}     
		
	}
	
	private int getFirstEmptyIndex() {

		for (i=0; i <wagon.length; i++) {
			if (wagon[i] == null) {
				return i;
			}
		} return -1;

	}
	
}
