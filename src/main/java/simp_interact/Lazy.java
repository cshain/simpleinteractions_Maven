package simp_interact;

public class Lazy extends Dialogue{
	public Lazy(){
		catchphrase = "yes? Hmm";
		names = new String[] {"Filbert", "Kyle", "Roland", "Phillip"};
		greetings = new String[]{
				"Hiya! So how's it going, " + catchphrase + "?", 
				"Hey! What's up now, " + catchphrase + "?", 
				"Hi. What's happening?"};
		statements = new String[]{
				"When the weather is like this, I just get a huge craving for creamed corn!",
				"Last night, I dreamed I had to take part in an epic kung fu session ... inside of a sauna, " + catchphrase + "!",
				"My space heater disappeared, " + catchphrase + "! Do you think everyone's space heater has disappeared?"};
		requests = new String[]{
				"Hmmmm, this mahogany sidetable was mistakenly delivered to my house, will you take it off my hands?",
				"I've heard this town has the best apples! Could you bring me one to try, " + catchphrase + "?",
				"Do you think I say \"" + catchphrase + "\" too much, " + catchphrase + "? Oh, see?! Can you give me a new catchphrase?"};
	}

	@Override
	void sayHi(String name) {
		System.out.println("Hiya! I'm " + name + ". Nice to meet you, we should hang out!");
	}

	@Override
	protected void resetCatchphrase() {
		greetings = new String[]{
				"Hiya! So how's it going, " + catchphrase + "?", 
				"Hey! What's up now, " + catchphrase + "?", 
				"Hi. What's happening?"};
		statements = new String[]{
				"When the weather is like this, I just get a huge craving for creamed corn!",
				"Last night, I dreamed I had to take part in an epic kung fu session ... inside of a sauna, " + catchphrase + "!",
				"My space heater disappeared, " + catchphrase + "! Do you think everyone's space heater has disappeared?"};
		requests = new String[]{
				"Hmmmm, this mahogany sidetable was mistakenly delivered to my house, will you take it off my hands?",
				"I've heard this town has the best apples! Could you bring me one to try, " + catchphrase + "?",
				"Do you think I say \"" + catchphrase + "\" too much, " + catchphrase + "? Oh, see?! Can you give me a new catchphrase?"};
	}
}
