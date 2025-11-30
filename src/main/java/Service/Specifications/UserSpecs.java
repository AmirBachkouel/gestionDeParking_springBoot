package Service.Specifications;

import Entity.Role;
import Entity.User;
import lombok.NonNull;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecs {
    public static Specification<@NonNull User> idEquals(Integer id){
        return (root, query, builder) ->
                id == null ?
                    builder.conjunction() :
                    builder.equal(root.get("id"), id);
    }

    public static Specification<@NonNull User> firstNameEquals(String firstName){
        return (root, query, builder) ->
                firstName == null ?
                        builder.conjunction() :
                        builder.equal(root.get("firstName"), firstName);
    }

    public static Specification<@NonNull User> lastNameEquals(String lastName){
        return (root, query, builder) ->
                lastName == null ?
                        builder.conjunction() :
                        builder.equal(root.get("lastName"), lastName);
    }

    public static Specification<@NonNull User> emailEquals(String email){
        return (root, query, builder) ->
                email == null ?
                        builder.conjunction() :
                        builder.equal(root.get("email"), email);
    }

    public static Specification<@NonNull User> roleEquals(Role role){
        return (root, query, builder) ->
                role == null ?
                        builder.conjunction() :
                        builder.equal(root.get("role"), role);
    }

    public static Specification<@NonNull User> passwordEquals(String password){
        return (root, query, builder) ->
                password == null ?
                        builder.conjunction() :
                        builder.equal(root.get("password"), password);
    }
}
