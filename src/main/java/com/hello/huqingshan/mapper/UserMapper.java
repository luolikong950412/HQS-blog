package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUser();

}
