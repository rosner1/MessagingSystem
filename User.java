import java.util.ArrayList;
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private ArrayList<User> contacts;

    public User(String username, String password, String firstName, String lastName, ArrayList<User> contacts) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<User> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<User> contacts) {
        this.contacts = contacts;
    }
}