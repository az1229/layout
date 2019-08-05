package ks.service.impl;


import ks.domain.User;
import ks.mapper.UserMapper;
import ks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void Feedback(User user) {
        this.userMapper.insert(user);
    }

}
