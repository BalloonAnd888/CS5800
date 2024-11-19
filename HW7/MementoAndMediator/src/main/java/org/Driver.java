package HW7.MementoAndMediator.src.main.java.org;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User tommy = new User("Tommy", server);
        User alan = new User("Alan", server);
        User stanley = new User("Stanley", server);

        server.registerUser(tommy);
        server.registerUser(alan);
        server.registerUser(stanley);

        ArrayList<String> receivers = new ArrayList<String>();
        receivers.add("Alan");
        receivers.add("Stanley");

        tommy.sendMessage(receivers, "Hello Sir Alan");
        alan.sendMessage(receivers, "Hi Tommy Le Legend");
        stanley.sendMessage(receivers, "Hi good sir");
        alan.sendMessage(receivers, "Hi Stanley");

        System.out.println("Alan's Chat History");
        for (Message message : alan.getChatHistory().getChatHistory()) {
            System.out.println(message);
        }

        stanley.undoLastMessage();
        System.out.println("Stanley's Chat History");
        for (Message message : stanley.getChatHistory().getChatHistory()) {
            System.out.println(message);
        }

        server.blockUser("Alan");

        stanley.sendMessage(receivers, "Hi Alan");

        System.out.println("\nMessages involving Alan:");
        searchMessagesByUser iterator = new searchMessagesByUser(alan.getChatHistory().getChatHistory(), alan);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
