package HW7.MementoAndMediator.src.test.java;

import HW7.MementoAndMediator.src.main.java.org.ChatServer;
import HW7.MementoAndMediator.src.main.java.org.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testGetName() {
        ChatServer testServer = new ChatServer();
        User testUser = new User("Tommy", testServer);
        assertEquals("Tommy", testUser.getName());
    }
}
