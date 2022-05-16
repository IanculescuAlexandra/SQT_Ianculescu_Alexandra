package ro.ase.csie.cts.g1098.design.patterns.chain;

public class Main {

	public static void main(String[] args) {
		ChatMessageAbstractHandler filter= new FilterHandler();
		ChatMessageAbstractHandler privateMessage=new PrivateMessageHandler();
		ChatMessageAbstractHandler broadcast = new BroadcastMessageHandler();
		
		filter.setNextHandler(privateMessage);
		privateMessage.setNextHandler(broadcast);
		
		filter.processMessage(new ChatMessage("Hello !", 10, "@everyone"));
		filter.processMessage(new ChatMessage("Hello !", 10, "@john"));
		filter.processMessage(new ChatMessage("It is a stupid game !", 10, "@everyone"));

	}

}
