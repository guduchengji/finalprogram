package com.xlx.controller;

import com.xlx.entity.Blacklist;
import com.xlx.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("blacklist")
public class BlacklistController {
    @Autowired
    private BlacklistService blacklistService;
    @ResponseBody
    @RequestMapping("query")
    public List<Blacklist> query(){
        return blacklistService.queryAll();
    }
    @ResponseBody
    @RequestMapping("add")
    public List<Blacklist> add(){
        return blacklistService.queryAll();
    }
    @ResponseBody
    @RequestMapping("delete")
    public List<Blacklist> delete(Blacklist blacklist){
        return blacklistService.queryAll();
    }
}
