package com.buka.partnermatchingbackend.service;

import com.buka.partnermatchingbackend.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
/*用户服务测试*/
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Test
    public void searchUserByTags(){
        List<String> list = Arrays.asList("java","python");
        List<User> userList = userService.searchUserByTags(list);
        Assert.assertNotNull(userList);
    }
}
