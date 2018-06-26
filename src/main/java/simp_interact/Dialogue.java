package simp_interact;

import java.util.Random;
import java.util.Scanner;

public abstract class Dialogue {
	Random rng = new Random();
	Scanner reader = new Scanner(System.in);
	
	//Initialized (Same across personalities)
	protected String[] accepted = new String[] {"Great, thanks!", "Thank you so much!", "Thank you!"};
	protected String[] denied = new String[] {"Oh... okay. Bye, then.", "Okay, bye.", "Fine, then..."};
	
	//Uninitialized (Different across personalities)
	String[] names;
	protected String catchphrase;
	protected String[] greetings;
	protected String[] statements;
	protected String[] requests;
	
	abstract void sayHi(String name);
	
	public void speak(){
		String input;
		System.out.println(greetings[rng.nextInt(3)] + "\n(Type Hi to continue or Bye to exit the conversation)");
		input = reader.next();
		System.out.println("");
		if(input.equalsIgnoreCase("Hi")){
			if(rng.nextInt(2) == 0){
				System.out.println(statements[rng.nextInt(3)]);
			}else{
				int request = rng.nextInt(3);
				System.out.println(requests[request] + "\n(Y/N)");
				input = reader.next();
				System.out.println("");
				if(input.equalsIgnoreCase("Y")){
					if(request != 2){
						System.out.println(accepted[rng.nextInt(3)]);
					}else{
						System.out.println(accepted[rng.nextInt(3)] + " What is it?\nEnter a catchphrase!");
						reader.nextLine();
						catchphrase = reader.nextLine();
						System.out.println("");
						System.out.println("That's perfect! Thanks, " + catchphrase + "!");
						resetCatchphrase();
					}
				}else{
					System.out.println(denied[rng.nextInt(3)]);
				}
			}
		}else{
			System.out.println(denied[rng.nextInt(3)]);
		}
	};
	
	protected abstract void resetCatchphrase();
}
