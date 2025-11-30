package Service.MethodParameters;

import Entity.Role;

public class UserParameters {

    public UserParameters () {}

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private Role role;
    private String password;

    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public Role getRole() {
        return role;
    }
    public String getEmail() {
        return email;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
}
