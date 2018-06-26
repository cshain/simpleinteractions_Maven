package simp_interact;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Character villager = new Character();
		String name = "Someone";
		String input;
		
		while(true){
			System.out.println("\n" + name + " stands in front of you. Do you want to say Hi?\n(Y/N)");
			input = reader.next();
			System.out.println("");
			if(input.equalsIgnoreCase("Y")){
				System.out.println(name + ":");
				if(name.equals("Someone")){
					villager.sayHi();
					name = villager.name();
				}else{
					villager.speak();
				}
			}else{
				break;
			}
		}
		System.out.println("Bye!");
		reader.close();
	}
}
