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
            //如果记录存在，那么查找出来，然后减少累计
            Blacklist queryByPhone = blacklistMapper.queryByPhone(blacklist);
            if (queryByPhone==null)return true;
            Long weights = queryByPhone.getWeights();
            queryByPhone.setWeights(weights-1);
            Object cc=weights-1==0?blacklistMapper.delete(queryByPhone):blacklistMapper.updateByPrimaryKey(queryByPhone);
            blacklistMapper.delete(blacklist);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Blacklist queryByPhone(Blacklist blacklist) {
        return blacklistMapper.queryByPhone(blacklist);
    }
}
