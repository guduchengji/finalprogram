package com.xlx.dao;

import com.xlx.entity.Whitelist;
import java.util.List;

public interface WhitelistMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Whitelist record);

    Whitelist selectByPrimaryKey(Long id);

    List<Whitelist> selectAll();

    int updateByPrimaryKey(Whitelist record);
}