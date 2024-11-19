package HW7.MementoAndMediator.src.main.java.org;

public class MessageMemento {
    private String message;
    private long timeStamp;

    public MessageMemento(String message, long timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
