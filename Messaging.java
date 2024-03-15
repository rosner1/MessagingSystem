import java.util.ArrayList;

public class Messaging {
    private ArrayList<User> allUsers;

    public Messaging(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
}
