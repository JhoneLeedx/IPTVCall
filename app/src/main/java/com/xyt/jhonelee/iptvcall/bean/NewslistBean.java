package com.xyt.jhonelee.iptvcall.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by JhoneLee on 2016/12/5.
 */

public class NewslistBean implements Parcelable {

    /**
     * ctime : 2016-03-06 14:11
     * title : Beautyleg &#8211; Arvi 私房美腿写真
     * description : 美女图片
     * picUrl : http://m.xxxiao.com/wp-content/uploads/sites/3/2015/05/m.xxxiao.com_e7e731faf790487ccaf90d11774fae6b-760x500.jpg
     * url : http://m.xxxiao.com/1353
     */
    private String ctime;
    private String title;
    private String description;
    private String picUrl;
    private String url;

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.ctime);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.picUrl);
        dest.writeString(this.url);
    }

    public NewslistBean() {
    }

    protected NewslistBean(Parcel in) {
        this.ctime = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.picUrl = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<NewslistBean> CREATOR = new Parcelable.Creator<NewslistBean>() {
        @Override
        public NewslistBean createFromParcel(Parcel source) {
            return new NewslistBean(source);
        }

        @Override
        public NewslistBean[] newArray(int size) {
            return new NewslistBean[size];
        }
    };
}
