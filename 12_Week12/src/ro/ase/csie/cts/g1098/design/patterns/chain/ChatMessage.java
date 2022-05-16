package ro.ase.csie.cts.g1098.design.patterns.chain;

public class ChatMessage {

	String text;
	int priority;
	String destination;
	
	public ChatMessage(String text, int priority, String destination) {
		super();
		this.text = text;
		this.priority = priority;
		this.destination = destination;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
