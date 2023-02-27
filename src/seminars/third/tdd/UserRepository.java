package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static seminars.third.tdd.AuthenticationStatus.FAIL;
import static seminars.third.tdd.UserRole.ADMIN;

public class UserRepository {
    private List<User> repo;

    public boolean addUser(User newUser) {
        if (newUser.getAuthenticationStatus() == AuthenticationStatus.PASS) {
            return repo.add(newUser);
        }
        return false;
    }

    public UserRepository() {
        this.repo = new ArrayList<>();
    }

    public List<User> getRepo() {
        return repo;
    }

    public void checkForAdmins() {
        this.repo = this.repo.stream()
                .filter(u -> u.getUserRole() == ADMIN)
                .collect(Collectors.toList());
    }
}
