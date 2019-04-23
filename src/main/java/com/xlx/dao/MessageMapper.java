package com.xlx.dao;

import com.xlx.entity.Message;
import java.util.List;

public interface MessageMapper {
    int insert(Message record);

    List<Message> selectAll();
}