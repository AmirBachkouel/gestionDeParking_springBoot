package Service.MethodParameters;

import Entity.Role;
import lombok.Getter;

@Getter
public class UserParameters {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private Role role;
    private String password;

    public UserParameters() {}
    public UserParameters (String firstName, String lastName,Role role) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.role      = role;
    }
    public UserParameters (int id, String firstName, String lastName, String email, Role role) {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
        this.role      = role;
    }
}
