package simp_interact;

public class Snooty extends Dialogue{
	public Snooty(){
		catchphrase = "darling";
		names = new String[]{"Barbara", "Tanya", "Olivia", "Dierdre"};
		greetings = new String[]{
				"Oh, it's you. Aren't you busy, " + catchphrase + "!", 
				"Hello! Need something?", 
				"What can I do for you, " + catchphrase + "?"};
		statements = new String[]{
				"Do you ever get a song stuck in your head? It's driving me mad, " + catchphrase + "!",
				"How do I look today? I agree it's a bit gaudy. A beauty like mine requires a more subtle style.",
				"If you've been wanting to jazz up your place a little, you should get some designer drapes. I know that really helped my house look way better," + catchphrase + "!"};
		requests = new String[]{
				"I have a little interior-design problem, and I'm hoping you can help me figure it out. Can you find something small for my house?",
				"I'm so hungry. I passed by a peach tree earlier, and they looked really good. Would you mind getting one for me, " + catchphrase + "?",
				"My friend told me that saying \"" + catchphrase + "\" is sooooo last year. Could you give me something else to say?"};
	}

	@Override
	void sayHi(String name) {
		System.out.println("Oh, hello. I'm " + name + ". Pleasure.");
	}

	@Override
	protected void resetCatchphrase() {
		greetings = new String[]{
				"Oh, it's you. Aren't you busy, " + catchphrase + "!", 
				"Hello! Need something?", 
				"What can I do for you, " + catchphrase + "?"};
		statements = new String[]{
				"Do you ever get a song stuck in your head? It's driving me mad, " + catchphrase + "!",
				"How do I look today? I agree it's a bit gaudy. A beauty like mine requires a more subtle style.",
				"If you've been wanting to jazz up your place a little, you should get some designer drapes. I know that really helped my house look way better," + catchphrase + "!"};
		requests = new String[]{
				"I have a little interior-design problem, and I'm hoping you can help me figure it out. Can you find something small for my house?",
				"I'm so hungry. I passed by a peach tree earlier, and they looked really good. Would you mind getting one for me, " + catchphrase + "?",
				"My friend told me that saying \"" + catchphrase + "\" is sooooo last year. Could you give me something else to say?"};
	}
}
