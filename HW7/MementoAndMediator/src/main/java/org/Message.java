package HW7.MementoAndMediator.src.main.java.org;

import java.sql.Array;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Message {
    private String sender;
    private ArrayList<String> recipients;
    private Date timestamp;
    private String message;

    public Message(String sender, ArrayList<String> recipients, String message) {
        this.sender = sender;
        this.recipients = recipients;
        this.timestamp = new Date();
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public ArrayList<String> getRecipients() {
        return recipients;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + sender + " -> " + recipients + ": " + message;

    }
}
