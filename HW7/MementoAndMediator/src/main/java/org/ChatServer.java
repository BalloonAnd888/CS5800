package HW7.MementoAndMediator.src.main.java.org;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatServer {
    private Map<String, User> users;
    private Map<String, Set<String>> blockedUsers;

    public ChatServer() {
        this.users = new HashMap<>();
        this.blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        this.users.put(user.getName(), user);
        this.blockedUsers.put(user.getName(), new HashSet<>());
    }

    public void unregisterUser(User user) {
        this.users.remove(user.getName());
        this.blockedUsers.remove(user.getName());
    }

    public void sendMessage(Message message) {
        String sender = message.getSender();
        for (String recipient : message.getRecipients()) {
            if (users.containsKey(recipient) && !blockedUsers.get(recipient).contains(sender)) {
                users.get(recipient).receiveMessage(message);
            }
        }

    }

    public void blockUser(String userName) {
        if (users.containsKey(userName)) {
            this.blockedUsers.put(userName, new HashSet<>());
        }
    }
}
