package SRP.Example3.ProblamaticCode;

// This class does not follow SRP
public class UserManager {
    public void createUser(String username) {
        System.out.println("User Created" + username);
    }

    public void deleteUser(String username) {
        System.out.println("User Deleted" + username);
    }

    public void logUserActivity(String username) {
        System.out.println("No Log Activity" + username);
    }
}
