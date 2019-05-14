package com.xlx.service;

import com.xlx.dao.UserMapper;
import com.xlx.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public void add(User user) {
        String id = UUID.randomUUID().toString().replace("-", "");
        user.setId(id);
        userMapper.insert(user);
    }

    @Override
    public void delete(User user) {
        userMapper.deleteByPrimaryKey(user);
    }

    /**
     * 5.14添加查询一个用户
     * @param user
     * @return
     */
    @Override
    public User queryOne(User user) {
        return userMapper.selectByPrimaryKey(user.getId());
    }
}
