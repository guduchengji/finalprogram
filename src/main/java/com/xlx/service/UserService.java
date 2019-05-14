package com.xlx.service;

import com.xlx.entity.User;

public interface UserService {
    void add(User user);
    void delete(User user);

    /**
     * //5.14新增单点查询
     * @param user
     * @return
     */
    User queryOne(User user);
}
