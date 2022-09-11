package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

//    fake user list
    List<User> list = List.of(
            new User(1011L, "Shubham", "9455587665"),
            new User(1012L, "Shashank", "9455500000"),
            new User(1013L, "Harendra", "9455511111"),
            new User(1014L, "Sai", "9455522222")
);
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
