package com.example.evidplayer;

public class feedModel {
    int id, likes, comment, propic, view, postVid;
    String name, time, status;

    public feedModel(int id, int likes, int comment, int propic, int view, int postVid, String name, String time, String status) {
        this.id = id;
        this.likes = likes;
        this.comment = comment;
        this.propic = propic;
        this.view = view;
        this.postVid = postVid;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getPropic() {
        return propic;
    }

    public void setPropic(int propic) {
        this.propic = propic;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getPostVid() {
        return postVid;
    }

    public void setPostVid(int postVid) {
        this.postVid = postVid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
