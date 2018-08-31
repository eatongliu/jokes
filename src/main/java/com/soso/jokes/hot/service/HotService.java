package com.soso.jokes.hot.service;

import com.soso.jokes.hot.entity.Joke;

import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
public interface HotService {
    List<Joke> hotJokePage(Integer offset, Integer limit);

    Long totalCount();
}
