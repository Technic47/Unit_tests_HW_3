package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seminars.third.tdd.UserRole.ADMIN;

public class UserRepositoryTest {
    UserRepository repo;

    @BeforeEach
    void setUp() {
        this.repo = new UserRepository();
    }

    @Test
    void testRepoExist(){
        List<User> testList = this.repo.getRepo();
        assertThat(testList).isNotNull();
    }

    @Test
    void testAddUserTrue() {
        User userTrue = new User("first", "pass");
        userTrue.isAuthenticated("first", "pass");
        assertTrue(this.repo.addUser(userTrue));
    }

    @Test
    void testAddUserFalse() {
        User userFalse = new User("second", "pass2");
        assertFalse(this.repo.addUser(userFalse));
    }

    @Test
    void testCheckForAdmins(){
        User user1 = new User("first", "pass");
        User user2 = new User("second", "pass");
        user1.setUserRole(ADMIN);
        user1.isAuthenticated("first", "pass");
        user2.isAuthenticated("second", "pass");

        this.repo.addUser(user1);
        this.repo.addUser(user2);
        this.repo.checkForAdmins();

        assertThat(this.repo.getRepo().size()).isEqualTo(1);
    }
}
