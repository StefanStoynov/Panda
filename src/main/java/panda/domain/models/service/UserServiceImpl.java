package panda.domain.models.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.modelmapper.ModelMapper;
import panda.domain.entities.User;
import panda.repository.UserRepository;
import panda.service.UserService;

import javax.inject.Inject;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Inject
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void userRegister(UserServiceModel userServiceModel) {
        User user = this.modelMapper.map(userServiceModel, User.class);
        //user password hash
        user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
        //user set role using private method bellow
        this.setUserRole(user);
        //user save
        this.userRepository.save(user);
    }

    @Override
    public UserServiceModel userLogin(UserServiceModel userServiceModel) {
        return null;
    }

    // method witch setting user with role
    private void setUserRole(User user){
        user.setRole(this.userRepository.size() == 0 ? "Admin" : "User");
    }
}
