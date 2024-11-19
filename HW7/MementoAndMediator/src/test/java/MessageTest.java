package HW7.MementoAndMediator.src.test.java;

import HW7.MementoAndMediator.src.main.java.org.Message;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Test
    public void testGetSender() {
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("Paul");
        recipients.add("Jacob");

        Message message = new Message("Nick", recipients, "Hello");

        assertEquals("Nick", message.getSender());
    }

    @Test
    public void testGetRecipients() {
        ArrayList<String> recipients = new ArrayList<>();
        recipients.add("Paul");
        recipients.add("Jacob");

        Message message = new Message("Nick", recipients, "Hello");

        assertEquals(recipients, message.getRecipients());
    }
}
