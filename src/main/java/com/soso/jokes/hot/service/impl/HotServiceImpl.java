package com.soso.jokes.hot.service.impl;

import com.soso.jokes.hot.dao.HotDao;
import com.soso.jokes.hot.entity.Joke;
import com.soso.jokes.hot.service.HotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
@Service
public class HotServiceImpl implements HotService {
    @Autowired
    private HotDao hotDao;

    @Override
    public List<Joke> hotJokePage(Integer offset, Integer limit) {
        return hotDao.findPage(offset, limit);
    }

    @Override
    public Long totalCount(){
        return hotDao.totalCount();
    }
}
