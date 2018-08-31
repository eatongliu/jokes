package com.soso.jokes.hot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by liuyutong on 2018/7/12.
 */
@Document(collection = "jokes")
public class Joke implements Serializable{

    private String jokeId;
    private String username;
    private String joke;
    private Integer likes;
    private List<String> imgs;
    private String type;
    private Long createDate;
    private Long crawlDate;

    public String getJokeId() {
        return jokeId;
    }

    public void setJokeId(String jokeId) {
        this.jokeId = jokeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getCrawlDate() {
        return crawlDate;
    }

    public void setCrawlDate(Long crawlDate) {
        this.crawlDate = crawlDate;
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "jokeId='" + jokeId + '\'' +
                ", username='" + username + '\'' +
                ", joke='" + joke + '\'' +
                ", likes=" + likes +
                ", imgs=" + imgs +
                ", type='" + type + '\'' +
                ", createDate=" + createDate +
                ", crawlDate=" + crawlDate +
                '}';
    }
}
