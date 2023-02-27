package seminars.third.tdd;

import java.util.Objects;

import static seminars.third.tdd.AuthenticationStatus.FAIL;
import static seminars.third.tdd.AuthenticationStatus.PASS;
import static seminars.third.tdd.UserRole.USER;

public class User {
    public String name;
    public String pass;
    public AuthenticationStatus authenticationStatus;
    private UserRole userRole;

    public boolean isAuthenticated(String login, String pass) {
        if (Objects.equals(login, this.name) && Objects.equals(pass, this.pass)) {
            this.authenticationStatus = PASS;
            return true;
        } else {
            return false;
        }
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
        this.authenticationStatus = FAIL;
        this.userRole = USER;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
