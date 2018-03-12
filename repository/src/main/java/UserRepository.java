


public interface UserRepository {

    List<User> findAll();
    int save(User user);
}
