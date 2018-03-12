package service.impl;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User add(User user) {
        userRepository.save(user);
        return null;
    }
}
