package simp_interact;

import java.util.Random;

public class Character{
	Random rng = new Random();
	
	private Dialogue personality;
	private String name; //name of the character
	
	public Character(){
		if(rng.nextInt(2) == 0){
			personality = new Snooty();
		}else{
			personality = new Lazy();
		}
		name = personality.getname();
	}
	
	public void sayHi(){
		personality.sayHi(name);
	}
	
	public void speak(){
		personality.speak();
	}
	
	public String name(){
		return name;
	}
}
