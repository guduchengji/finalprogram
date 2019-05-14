package com.xlx.service;

import com.xlx.dao.BlacklistMapper;
import com.xlx.entity.Blacklist;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("blacklistService")
public class BlacklistServiceImpl implements BlacklistService {
    @Resource
    private BlacklistMapper blacklistMapper;
    @Override
    public List<Blacklist> queryAll() {
        return blacklistMapper.selectAll();
    }

    @Override
    public Boolean addOne(Blacklist blacklist) {
        try {
            blacklistMapper.insert(blacklist);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteOne(Blacklist blacklist) {
        try {
            blacklistMapper.delete(blacklist);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
