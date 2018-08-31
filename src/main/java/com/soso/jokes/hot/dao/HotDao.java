package com.soso.jokes.hot.dao;

import com.soso.jokes.hot.entity.Joke;

import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
public interface HotDao {
    List<Joke> findPage(Integer offset, Integer limit);

    long totalCount();
}
