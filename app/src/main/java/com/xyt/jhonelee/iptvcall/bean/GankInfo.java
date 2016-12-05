package com.xyt.jhonelee.iptvcall.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JhoneLee on 2016/11/29.
 */

public class GankInfo implements Parcelable {
    /**
     * error : false
     * results : [{"_id":"583bf8f0421aa9710cf54c45","createdAt":"2016-11-28T17:29:20.600Z","desc":"iOS平台键盘再也不会挡住输入控件","images":["http://img.gank.io/c9bdeea9-d931-4daf-a599-38fcdc40e39f"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"web","type":"iOS","url":"https://github.com/netyouli/WHC_KeyboardManager","used":true,"who":"吴海超(WHC)"},{"_id":"583c0452421aa9710cf54c47","createdAt":"2016-11-28T18:17:54.556Z","desc":"六种二维码生成的样式","images":["http://img.gank.io/2f0b6c5f-6de7-4ba3-94ad-98bf721ee447"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"web","type":"Android","url":"https://github.com/vivian8725118/ZXingDemo/","used":true,"who":"Vivian"},{"_id":"583c3aaf421aa971108b6595","createdAt":"2016-11-28T22:09:51.637Z","desc":"漂亮的日期选择，支持日历模式和Picker模式","images":["http://img.gank.io/b9e4b287-4c50-48f2-bed3-f2be6bb6fff9"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"web","type":"iOS","url":"https://github.com/kRadius/HYYCalendar","used":true,"who":null},{"_id":"583c4905421aa971108b6596","createdAt":"2016-11-28T23:11:01.857Z","desc":"原来这才是撩妹的正确打开方式, 套路太深","publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"休息视频","url":"https://v.qq.com/x/page/f0349zm9srt.html","used":true,"who":"daimajia"},{"_id":"583c4dc6421aa9710cf54c4a","createdAt":"2016-11-28T23:31:18.761Z","desc":"Java设计模式之单例模式","publishedAt":"2016-11-29T11:38:58.378Z","source":"web","type":"Android","url":"http://www.haotianyi.win/2016/11/java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E4%B9%8B%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.html","used":true,"who":"HaoTianYi"},{"_id":"583cc2bf421aa971108b6599","createdAt":"2016-11-29T07:50:23.705Z","desc":"11-29","publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1fa8n634v0vj20u00qx0x4.jpg","used":true,"who":"daimajia"},{"_id":"583ce4dd421aa939befafac7","createdAt":"2016-11-29T10:15:57.829Z","desc":"验证码图片 ImageView，相当实用！","images":["http://img.gank.io/940c9fd7-3c57-4152-b496-271bca9f20ae"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"Android","url":"https://github.com/jineshfrancs/CaptchaImageView","used":true,"who":"代码家"},{"_id":"583ce5df421aa939bb4637bc","createdAt":"2016-11-29T10:20:15.562Z","desc":"超漂亮的，支持展开菜单的 Fab 按钮。","images":["http://img.gank.io/76f6993b-d103-40e0-8c30-fb1d246e23a0"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"Android","url":"https://github.com/JoaquimLey/faboptions","used":true,"who":"嗲马甲"},{"_id":"583ce6d8421aa939bb4637bd","createdAt":"2016-11-29T10:24:24.521Z","desc":"类似 Google Inbox 的实现，做的不错","images":["http://img.gank.io/bc5b51d8-2974-4c87-a6ec-8ccc451aea0b"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"Android","url":"https://github.com/memfis19/Cadar","used":true,"who":"代码家"},{"_id":"583ce75a421aa939bb4637bf","createdAt":"2016-11-29T10:26:34.811Z","desc":"有人把 Chrome 的恐龙游戏搬到了 TouchBar 上！","images":["http://img.gank.io/6993e497-872e-44c5-a36c-952d75a8316f"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"iOS","url":"https://github.com/yuhuili/TouchBarDino","used":true,"who":"代码家"},{"_id":"583ce8fb421aa939befafac9","createdAt":"2016-11-29T10:33:31.48Z","desc":"iOS 信用卡输入效果","images":["http://img.gank.io/0c21e0c1-7d05-42c9-b6b4-79f6aee30198"],"publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"iOS","url":"https://github.com/orazz/CreditCardForm-iOS","used":true,"who":"代码家"},{"_id":"583cea2c421aa939b83535f5","createdAt":"2016-11-29T10:38:36.763Z","desc":"蚂蚁金服推出的一套设计规范和组件集合","publishedAt":"2016-11-29T11:38:58.378Z","source":"chrome","type":"前端","url":"https://ant.design/docs/react/introduce","used":true,"who":"代码家"},{"_id":"583129bf421aa929ac960afc","createdAt":"2016-11-20T12:42:39.884Z","desc":"Android 实现视屏播放器、边播边缓存功能、外加铲屎（IJKPlayer）","images":["http://img.gank.io/8196d110-32cf-41bc-86c6-801af152a743"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"Android","url":"http://www.jianshu.com/p/9fe377dd9750","used":true,"who":"Jason"},{"_id":"5831b1f4421aa929ac960b00","createdAt":"2016-11-20T22:23:48.641Z","desc":"【单身狗慎入】经典表白镜头混剪","publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av1774863/","used":true,"who":"lxxself"},{"_id":"5838322e421aa91cb7afe7ed","createdAt":"2016-11-25T20:44:30.469Z","desc":"linux 下 使用vim聊qq以及微信，对于没有gui的用户来说，也许是福利。","images":["http://img.gank.io/4af93c14-5683-4a18-93d5-1734604396bc"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"web","type":"拓展资源","url":"https://github.com/wsdjeg/vim-chat","used":true,"who":"Wang Shidong"},{"_id":"583a2a98421aa91cb7afe7f4","createdAt":"2016-11-27T08:36:40.493Z","desc":"很赞的登录注册布局","images":["http://img.gank.io/dacc7f4c-3872-4c00-b669-3ab13b430e01"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"Android","url":"https://github.com/irfaan008/OnePageSigninSignup","used":true,"who":"蒋朋"},{"_id":"583a6816421aa91cb7afe7f5","createdAt":"2016-11-27T12:59:02.254Z","desc":"EasyProxy,简单易用的TCP代理","publishedAt":"2016-11-28T11:32:07.534Z","source":"web","type":"拓展资源","url":"http://xsank.com/2016/11/25/EasyProxy%E4%B9%8Bgolang%E5%88%9D%E6%AD%A5%E5%AD%A6%E4%B9%A0/","used":true,"who":"xsank"},{"_id":"583b7e97421aa9711460f744","createdAt":"2016-11-28T08:47:19.286Z","desc":"清晰灵活简单易用的应用更新库","images":["http://img.gank.io/9d7deebb-3fa8-43dc-a36c-81a11044b394"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"web","type":"Android","url":"https://github.com/czy1121/update","used":true,"who":"ezy"},{"_id":"583b8285421aa9710cf54c3b","createdAt":"2016-11-28T09:04:05.479Z","desc":"11-28","publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1fa7jol4pgvj20u00u0q51.jpg","used":true,"who":"daimajia"},{"_id":"583b99d1421aa9710cf54c3e","createdAt":"2016-11-28T10:43:29.756Z","desc":"目测是目前来看做 Blur 效果速度最快的库","images":["http://img.gank.io/f826f969-027d-43d6-bb00-a89684e37346"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"Android","url":"https://github.com/wonderkiln/blurkit-android","used":true,"who":"嗲马甲"},{"_id":"583b9a1e421aa9711460f748","createdAt":"2016-11-28T10:44:46.764Z","desc":"p2p vpn，路子很野，不知道会不会发展起来，PS. Rust 实现","publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"拓展资源","url":"https://github.com/dswd/vpncloud.rs","used":true,"who":"代码家"},{"_id":"583b9a54421aa971108b658e","createdAt":"2016-11-28T10:45:40.970Z","desc":"Vue 实现的 Markdown 编辑器","images":["http://img.gank.io/85faeba8-c2f3-46bc-b04e-568d1da8f9b0"],"publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"前端","url":"https://github.com/egoist/eme","used":true,"who":"代码家"},{"_id":"583b9aab421aa971108b658f","createdAt":"2016-11-28T10:47:07.234Z","desc":"Material CSS 框架","publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"前端","url":"https://github.com/Dogfalo/materialize","used":true,"who":"css"},{"_id":"583ba071421aa9710cf54c40","createdAt":"2016-11-28T11:11:45.849Z","desc":"自动滚动Label","publishedAt":"2016-11-28T11:32:07.534Z","source":"chrome","type":"iOS","url":"https://github.com/cbess/AutoScrollLabel","used":true,"who":"Dear宅学长"},{"_id":"583681d6421aa91cb2f08643","createdAt":"2016-11-24T13:59:50.238Z","desc":"在没有越狱的情况下查看APP的InfoPlist","images":["http://img.gank.io/6e277e4d-3bc9-4286-b793-979e6f80aeeb","http://img.gank.io/d016f99a-7e06-44d3-bf5f-55360f65833c"],"publishedAt":"2016-11-25T11:29:49.832Z","source":"chrome","type":"iOS","url":"https://github.com/cyanzhong/Retriever","used":true,"who":"Dear宅学长"},{"_id":"5836a7fc421aa91cb7afe7e0","createdAt":"2016-11-24T16:42:36.919Z","desc":"支持https的ijkplayer播放器","images":["http://img.gank.io/22aa7a50-de1f-4697-8eb8-7bcc247cce58"],"publishedAt":"2016-11-25T11:29:49.832Z","source":"web","type":"Android","url":"https://github.com/l123456789jy/ijkplayer","used":true,"who":"Lazy"},{"_id":"58378c0f421aa91cade7a57d","createdAt":"2016-11-25T08:55:43.173Z","desc":"11-25","publishedAt":"2016-11-25T11:29:49.832Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1fa42ktmjh4j20u011hn8g.jpg","used":true,"who":"dmj"},{"_id":"5837945d421aa91caf16ffb1","createdAt":"2016-11-25T09:31:09.109Z","desc":"致25岁还一无是处的你！","publishedAt":"2016-11-25T11:29:49.832Z","source":"chrome","type":"休息视频","url":"https://v.qq.com/x/page/e0347yc8kg6.html","used":true,"who":"lxxself"},{"_id":"5837a0f9421aa91cade7a580","createdAt":"2016-11-25T10:24:57.629Z","desc":"让 ajax 请求变得更简单","images":["http://img.gank.io/eee3a9bf-8795-431e-b16b-b123d38af1f8"],"publishedAt":"2016-11-25T11:29:49.832Z","source":"chrome","type":"前端","url":"https://github.com/LeadDyno/intercooler-js","used":true,"who":"代码家"},{"_id":"5837a183421aa91cb2f0864e","createdAt":"2016-11-25T10:27:15.703Z","desc":"自动在多个 iOS 模拟器上运行 XCTest 测试","images":["http://img.gank.io/c3084a01-bf96-4982-b7d9-81af59aad0c4"],"publishedAt":"2016-11-25T11:29:49.832Z","source":"chrome","type":"iOS","url":"https://github.com/plu/pxctest","used":true,"who":"代码家"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.error ? (byte) 1 : (byte) 0);
        dest.writeList(this.results);
    }

    public GankInfo() {
    }

    protected GankInfo(Parcel in) {
        this.error = in.readByte() != 0;
        this.results = new ArrayList<ResultsBean>();
        in.readList(this.results, ResultsBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<GankInfo> CREATOR = new Parcelable.Creator<GankInfo>() {
        @Override
        public GankInfo createFromParcel(Parcel source) {
            return new GankInfo(source);
        }

        @Override
        public GankInfo[] newArray(int size) {
            return new GankInfo[size];
        }
    };
}
