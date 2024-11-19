package HW7.MementoAndMediator.src.main.java.org;

import java.util.ArrayList;

public class User {
    private String name;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Message latestMessage;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        this.latestMessage = null;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(ArrayList<String> recipients, String message) {
        Message newMessage = new Message(this.name, recipients, message);
        chatHistory.addMessage(newMessage);
        this.latestMessage = newMessage;
        chatServer.sendMessage(newMessage);
    }

    public void receiveMessage(Message message) {
        this.latestMessage = message;
        chatHistory.addMessage(message);
    }

    public void undoLastMessage() {
        if (this.latestMessage != null) {
            chatHistory.undoLastMessage();
            latestMessage = null;
        }
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }
}
