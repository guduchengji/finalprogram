package com.xlx.dao;

import com.xlx.entity.Blacklist;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BlacklistMapper extends Mapper<Blacklist> {
    Blacklist queryByPhone(Blacklist blacklist);
}