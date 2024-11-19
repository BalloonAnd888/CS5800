package HW7.MementoAndMediator.src.main.java.org;

import java.util.ArrayList;

public class ChatHistory {
    private ArrayList<Message> chatHistory;

    public ChatHistory() {
        this.chatHistory = new ArrayList<>();
    }

    public void addMessage(Message message) {
        this.chatHistory.add(message);
    }

    public Message undoLastMessage() {
        if (!chatHistory.isEmpty()) {
            return chatHistory.remove(chatHistory.size() - 1);
        }
        return null;
    }

    public Message getLastMessage() {
        if (!chatHistory.isEmpty()) {
            return chatHistory.get(chatHistory.size() - 1);
        }
        return null;
    }

    public ArrayList<Message> getChatHistory() {
        return new ArrayList<>(chatHistory);
    }

}
