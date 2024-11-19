package HW7.MementoAndMediator.src.main.java.org;

import java.util.ArrayList;
import java.util.Iterator;

public class searchMessagesByUser implements Iterator<Message> {
    private ArrayList<Message> messages;
    private User user;
    private int index;
    public searchMessagesByUser(ArrayList<Message> messages, User user) {
        this.messages = messages;
        this.user = user;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < messages.size()) {
            Message currentMessage = messages.get(index);
            if (currentMessage.getSender().equals(user.getName()) ||
                    currentMessage.getRecipients().contains(user.getName())) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Message next() {
        while (index < messages.size()) {
            Message currentMessage = messages.get(index++);
            if (currentMessage.getSender().equals(user.getName()) ||
                    currentMessage.getRecipients().contains(user.getName())) {
                return currentMessage;
            }
        }
        return null;
    }
}
