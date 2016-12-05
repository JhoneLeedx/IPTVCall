package com.xyt.jhonelee.iptvcall.bean;

import java.util.List;

/**
 * Created by JhoneLee on 2016/12/5.
 */

public class Day {
    /**
     * category : ["iOS","Android","前端","福利","休息视频"]
     * error : false
     * results : {"Android":[{"_id":"584186c7421aa939b58d31cd","createdAt":"2016-12-02T22:35:51.517Z","desc":"美团：常见性能优化策略的总结","publishedAt":"2016-12-05T11:40:51.351Z","source":"web","type":"Android","url":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=2651745738&idx=1&sn=413a287d6919daed31a5b3192edab3af&chksm=bd12b4878a653d91916ee74556c1eab20423ce1ee060fe4eab8ce1c46c80cc2d59afe85bd601&scene=0#rd","used":true,"who":null},{"_id":"584415e4421aa939bb4637f0","createdAt":"2016-12-04T21:11:00.62Z","desc":"干货IO 3.0，GankIO的第三方客户端，含有搜索，最新的闲读，及收藏功能。 ","images":["http://img.gank.io/918d1f3d-a553-4856-974c-5bd5abfd5b97"],"publishedAt":"2016-12-05T11:40:51.351Z","source":"web","type":"Android","url":"https://github.com/burgessjp/GanHuoIO/blob/master/README.md","used":true,"who":"solid"},{"_id":"5844d3b0421aa939b58d31d9","createdAt":"2016-12-05T10:40:48.204Z","desc":"Android 智能 Scheduler，根据用户手机场景，决定任务执行方式。","publishedAt":"2016-12-05T11:40:51.351Z","source":"chrome","type":"Android","url":"https://github.com/hypertrack/smart-scheduler-android","used":true,"who":"代码家"}],"iOS":[{"_id":"583d03fb421aa939b58d31a7","createdAt":"2016-11-29T12:28:43.726Z","desc":"在 Instagram 团队重写他们全新的 iOS Feed 的过程中，他们积累了大量的经验，遇到的坑无疑已经超出了他们的预料，比如说集合视图、差异化 (Diffing) 以及冗长代码所带来的危险之处。在本次 try! Swift 讲演之中，Ryan Nystrom 向我们分享了如何才能进行一次成功的重构，并且向我们介绍了 Instagram 的一个很赞的开源组件：IGListKit。","images":["http://img.gank.io/5bc973a7-2447-4d90-8cc0-0ae2262d57db"],"publishedAt":"2016-12-05T11:40:51.351Z","source":"chrome","type":"iOS","url":"https://realm.io/cn/news/tryswift-ryan-nystrom-refactoring-at-scale-lessons-learned-rewriting-instagram-feed/","used":true,"who":"beeender"},{"_id":"58412a25421aa939b58d31cb","createdAt":"2016-12-02T16:00:37.233Z","desc":"像Android R文件一样管理资源","publishedAt":"2016-12-05T11:40:51.351Z","source":"chrome","type":"iOS","url":"https://github.com/mac-cain13/R.swift","used":true,"who":"Dear宅学长"}],"休息视频":[{"_id":"5844debf421aa939b58d31da","createdAt":"2016-12-05T11:27:59.611Z","desc":"最近超火的一则公益广告，主题相当棒。","publishedAt":"2016-12-05T11:40:51.351Z","source":"chrome","type":"休息视频","url":"https://v.qq.com/x/page/w0352quxhpx.html","used":true,"who":"代码家"}],"前端":[{"_id":"58443ccf421aa939b58d31d7","createdAt":"2016-12-04T23:57:03.456Z","desc":"简单几步助你优化React应用包体","publishedAt":"2016-12-05T11:40:51.351Z","source":"web","type":"前端","url":"https://segmentfault.com/a/1190000007692543","used":true,"who":"王下邀月熊(Chevalier)"}],"福利":[{"_id":"5844b8dd421aa939befafb03","createdAt":"2016-12-05T08:46:21.259Z","desc":"12-5","publishedAt":"2016-12-05T11:40:51.351Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034gw1fafmi73pomj20u00u0abr.jpg","used":true,"who":"daimajia"}]}
     */

    private boolean error;
    private ResultsBeans results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ResultsBeans getResults() {
        return results;
    }

    public void setResults(ResultsBeans results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class ResultsBeans{
        private List<ResultsBean> Android;
        private List<ResultsBean> iOS;
        private List<ResultsBean> video;
        private List<ResultsBean> html;
        private List<ResultsBean> fuli;

        public List<ResultsBean> getAndroid() {
            return Android;
        }

        public List<ResultsBean> getiOS() {
            return iOS;
        }

        public List<ResultsBean> getVideo() {
            return video;
        }

        public List<ResultsBean> getHtml() {
            return html;
        }

        public List<ResultsBean> getFuli() {
            return fuli;
        }
    }
}
