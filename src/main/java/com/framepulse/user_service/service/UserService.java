package com.framepulse.user_service.service;

import com.framepulse.common.service.AbstractService;
import com.framepulse.user_service.entity.User;
import com.framepulse.user_service.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService extends AbstractService<User, String, UserRepository> {

    @Override
    public User save(User user) {
        if(user.getActive()==null) {
            user.setActive(true);
        }
        return repository.save(user);
    }
}
