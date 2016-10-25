package com.stuart.mvpdemo.model.entity;

import java.util.List;

/**
 * author:Stuart on 2016/10/12 0012.
 * time: 2016/10/12 0012 下午 18:40
 * description:
 */
public class ZhihuDailyLatest {

    /**
     * date : 20161012
     * stories : [{"title":"凌晨两点的北京，有些陌生，有些光怪陆离","ga_prefix":"101218","images":["http://pic3.zhimg.com/0a1e85fb0cb8b20cbbbe438ea1ef49fe.jpg"],"multipic":true,"type":0,"id":8872839},{"images":["http://pic1.zhimg.com/2a3fd2419f64e677e8b74546a38f06c8.jpg"],"type":0,"id":8878108,"ga_prefix":"101217","title":"知乎好问题 · 秋冬季节如何穿毛衣才好看？"},{"title":"天气好冷暖气没来，最适合来一锅正宗猪肉炖粉条啦","ga_prefix":"101216","images":["http://pic2.zhimg.com/b606d20ee625508b5f01211a188e4831.jpg"],"multipic":true,"type":0,"id":8875138},{"images":["http://pic1.zhimg.com/d6cc7048260288ce3f1a611280831d28.jpg"],"type":0,"id":8874133,"ga_prefix":"101215","title":"别被吓到了，正规的「电击疗法」对抑郁症还挺有用"},{"images":["http://pic1.zhimg.com/e50339eccddd595139393fa73a616194.jpg"],"type":0,"id":8877884,"ga_prefix":"101214","title":"私企对员工罚款，这合法吗？"},{"images":["http://pic4.zhimg.com/3614338e0c8abd6451a2d5fec3973b83.jpg"],"type":0,"id":8877625,"ga_prefix":"101213","title":"被南京 50 多条眼镜蛇外逃吓到了，你应该了解这些常识"},{"images":["http://pic2.zhimg.com/b29938a868787e11e658d893204ad6d5.jpg"],"type":0,"id":8853377,"ga_prefix":"101212","title":"大误 · 看完这篇，你也可以写「大误」"},{"images":["http://pic4.zhimg.com/0e41bbf4162027516536b119e3ae8e4b.jpg"],"type":0,"id":8875992,"ga_prefix":"101211","title":"累了一天，晚上就会睡得好，依据在哪儿？"},{"images":["http://pic1.zhimg.com/331b217e9bcc4498f5346f58534268f0.jpg"],"type":0,"id":8876181,"ga_prefix":"101210","title":"RPG 游戏，就是要有迷宫才好玩"},{"images":["http://pic2.zhimg.com/a6621ed6854ac0f4ce0a6378f9d9ce9d.jpg"],"type":0,"id":8870453,"ga_prefix":"101209","title":"关于上瘾这件事，别高估你的意志力"},{"images":["http://pic1.zhimg.com/b963e893f90c70bf3d5485fb539755d0.jpg"],"type":0,"id":8876124,"ga_prefix":"101208","title":"中国股市市值超过欧洲，这能体现经济发展水平吗？"},{"images":["http://pic4.zhimg.com/38f7e8420c11da93164e46dd554474eb.jpg"],"type":0,"id":8876172,"ga_prefix":"101207","title":"曾经风光无限的 Twitter，现在想卖都卖不出去了"},{"images":["http://pic2.zhimg.com/878d002ed4c730853a1339bd94ab5425.jpg"],"type":0,"id":8874855,"ga_prefix":"101207","title":"是的，我们参加的「网络调查」大都没什么用"},{"images":["http://pic4.zhimg.com/80a7fd99c80019c914708ab3b1d02b4f.jpg"],"type":0,"id":8874841,"ga_prefix":"101207","title":"5300 多年前的木乃伊，最近「开口说话」了"},{"images":["http://pic2.zhimg.com/aa4259e42806e1b1ee54e0655b81de21.jpg"],"type":0,"id":8876297,"ga_prefix":"101207","title":"读读日报 24 小时热门 TOP 5 · 中老年相亲族占座"},{"images":["http://pic4.zhimg.com/60e99b008709261e961e6a1b2626da6b.jpg"],"type":0,"id":8874128,"ga_prefix":"101206","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic3.zhimg.com/3b04e1791050bbc513e5a6071abea1a6.jpg","type":0,"id":8878108,"ga_prefix":"101217","title":"知乎好问题 · 秋冬季节如何穿毛衣才好看？"},{"image":"http://pic1.zhimg.com/66cc767e1a044275635a1401d98f1bbc.jpg","type":0,"id":8877625,"ga_prefix":"101213","title":"被南京 50 多条眼镜蛇外逃吓到了，你应该了解这些常识"},{"image":"http://pic4.zhimg.com/7c29e77ce16c0a9b81145710b326b397.jpg","type":0,"id":8876172,"ga_prefix":"101207","title":"曾经风光无限的 Twitter，现在想卖都卖不出去了"},{"image":"http://pic4.zhimg.com/88befc98d0bc45bacac4334e5fa3aea3.jpg","type":0,"id":8874855,"ga_prefix":"101207","title":"是的，我们参加的「网络调查」大都没什么用"},{"image":"http://pic2.zhimg.com/647842c6b3f6b931d116e55405ae6fb9.jpg","type":0,"id":8874841,"ga_prefix":"101207","title":"5300 多年前的木乃伊，最近「开口说话」了"}]
     */

    private String date;
    /**
     * title : 凌晨两点的北京，有些陌生，有些光怪陆离
     * ga_prefix : 101218
     * images : ["http://pic3.zhimg.com/0a1e85fb0cb8b20cbbbe438ea1ef49fe.jpg"]
     * multipic : true
     * type : 0
     * id : 8872839
     */

    private List<StoriesBean> stories;
    /**
     * image : http://pic3.zhimg.com/3b04e1791050bbc513e5a6071abea1a6.jpg
     * type : 0
     * id : 8878108
     * ga_prefix : 101217
     * title : 知乎好问题 · 秋冬季节如何穿毛衣才好看？
     */

    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
