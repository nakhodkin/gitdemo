import java.time.LocalDateTime;

public class Main {

    private static final String GREETING_MESSAGE = "Hello world!";

    public static void main(String[] args) {
        printGreeting(LocalDateTime.now());
    }

    private static void printGreeting(LocalDateTime dateTime) {
        System.out.println(dateTime.toLocalDate() + ": " + GREETING_MESSAGE);
    }
}