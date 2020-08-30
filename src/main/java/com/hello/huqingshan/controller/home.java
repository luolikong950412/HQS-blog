package com.hello.huqingshan.controller;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.UserService;
import com.hello.huqingshan.util.Jwt;
import com.hello.huqingshan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//这个注解集合了@rest和@reponsebody,@reponsebody和获取json数据的@requestbody不一样
@RestController
public class home {
    //不能直接new service，否则可能会造成空指针异常，虽然不知道为什么
    //这个是注解字段吗
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Result<List<User>> hello(){

        UserService userService = new UserService();
        List<User> userList = userService.finduser();

        //通过jackson把javabean序列化为json对象
        Result<List<User>> result = new Result<>(userList,"success",200,null);
        return result;
    }

    @RequestMapping(value = "/home/{name}",method = RequestMethod.POST)
    public Result<String> home(@PathVariable(value = "name")String name ){
        Result<String> results = new Result<>(name,"success",200,null);
        return results;
    }

    //@RequestBody String username这样是直接输出json对象
    //也可以在@RequestBody的时候使用对象，jackson回反序列化为一个javabean，再获取对象的值
    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public Result<String> token(@RequestBody User user){
        String username = user.getUsername();

        String jwt = Jwt.generateJwt(username);
        Result<String> result = new Result<>(null,"success",200,jwt);
        System.out.println(Jwt.parsingJwt(jwt));
        System.out.println(user);
        return result;
    }

    @RequestMapping(value = "/mybatis",method = RequestMethod.GET)
    public List<User> mybatis(){
        List<User> list = userService.getuser();
        return list;
    }
}
