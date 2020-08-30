package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//为什么没有这个不能被autowride
//为什么需要这个，没有这个会报空指针错误
@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> finduser(){
        User userone = new User(
                "huqingshan",
                "huqingshan",
                4,
                true,
                LocalDateTime.now());
        User usertwo = new User(
                "root",
                "root",
                5,
                true,
                LocalDateTime.now()
        );
        List<User> userList = new ArrayList<>();
        userList.add(userone);
        userList.add(usertwo);
        return userList;
    }

    public List<User> getuser(){

            List<User> list = userMapper.selectUser();
            return list;
    }
}
