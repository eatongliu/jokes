package com.soso.jokes.hot.dao.impl;

import com.soso.jokes.hot.dao.HotDao;
import com.soso.jokes.hot.entity.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
@Repository
public class HotDaoImpl implements HotDao{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Joke> findPage(Integer offset, Integer limit) {
        Query query = new Query();
        query.with(new Sort(Sort.Direction.DESC,"crawlDate"));
        query.skip(offset).limit(limit);
        return mongoTemplate.find(query, Joke.class);
    }

    @Override
    public long totalCount() {
        Query query = new Query();
        return mongoTemplate.count(query, Joke.class);
    }
}
