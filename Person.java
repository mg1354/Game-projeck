package game;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String name;
	Room place;
	Room[] places;
	Object[] basket = new Object[1];

	Person(String name, Room place, Object a, Room[] rooms) {

		this.name = name;
		basket[0] = a;
		this.place = place;
		this.places = rooms;

	}

	public String toString() {

		return "Person: " + this.name + "\n place: " + place.name + "\n Basket: " + Arrays.toString(basket);
	}

	public void change() {
//		System.out.println("change");
	
		Object x = basket[0];

		Random ran = new Random();
        int i = ran.nextInt(3)	;

		basket[0] = place.appliance[i];
//		System.out.println(place);
		place.appliance[i] = x;

	}

	public void walk() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
//		System.out.println("walking");

		int i = (int) (Math.random() * 10);
		if ((i < 5 && place.number > 0) || place.number == this.places.length - 1) {

			// place.number--;
			this.place = this.places[this.place.number--];

		} else {
			this.place = this.places[this.place.number++];
		}
		change();

	}
}
