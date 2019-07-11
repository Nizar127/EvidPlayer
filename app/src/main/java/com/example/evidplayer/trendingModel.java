package com.example.evidplayer;

public class trendingModel {
    int id, trendPic;
    String cat_name;

    public trendingModel(int id, int trendPic, String cat_name) {
        this.id = id;
        this.trendPic = trendPic;
        this.cat_name = cat_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrendPic() {
        return trendPic;
    }

    public void setTrendPic(int trendPic) {
        this.trendPic = trendPic;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
}
