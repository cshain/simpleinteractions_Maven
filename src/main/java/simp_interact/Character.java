package simp_interact;

import java.util.Random;

public class Character{
	Random rng = new Random();
	
	private Dialogue personality;
	private String name;
	
	public Character(){
		if(rng.nextInt(2) == 0){
			personality = new Snooty();
		}else{
			personality = new Lazy();
		}
		
		name = personality.names[rng.nextInt(4)];
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
