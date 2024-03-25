package homework;

public class Reporter {
    private User user;

    public Reporter() {
    }

    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}