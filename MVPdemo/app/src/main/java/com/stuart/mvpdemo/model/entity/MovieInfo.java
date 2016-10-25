package com.stuart.mvpdemo.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * author:Stuart on 2016/9/28 0028.
 * time: 2016/9/28 0028 上午 11:08
 * description:
 */
public class MovieInfo {


    /**
     * date : 9月23日 - 9月25日
     * subjects : [{"box":35000000,"new":true,"rank":1,"subject":{"rating":{"max":10,"average":7.2,"stars":"40","min":0},"genres":["动作","西部"],"title":"豪勇七蛟龙","casts":[{"alt":"https://movie.douban.com/celebrity/1054431/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/608.jpg","large":"https://img1.doubanio.com/img/celebrity/large/608.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/608.jpg"},"name":"丹泽尔·华盛顿","id":"1054431"},{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1408271589.94.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1408271589.94.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1408271589.94.jpg"},"name":"克里斯·普拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1025059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/33442.jpg","large":"https://img3.doubanio.com/img/celebrity/large/33442.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/33442.jpg"},"name":"马特·波莫","id":"1025059"}],"collect_count":322,"original_title":"The Magnificent Seven","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1013907/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1459145342.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1459145342.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1459145342.51.jpg"},"name":"安东尼·福奎阿","id":"1013907"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2377443025.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2377443025.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2377443025.jpg"},"alt":"https://movie.douban.com/subject/10774184/","id":"10774184"}},{"box":21805000,"new":true,"rank":2,"subject":{"rating":{"max":10,"average":7.7,"stars":"40","min":0},"genres":["喜剧","动画"],"title":"逗鸟外传：萌宝满天飞","casts":[{"alt":"https://movie.douban.com/celebrity/1025187/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/48146.jpg","large":"https://img3.doubanio.com/img/celebrity/large/48146.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/48146.jpg"},"name":"安迪·萨姆伯格","id":"1025187"},{"alt":"https://movie.douban.com/celebrity/1360587/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1472976828.3.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1472976828.3.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1472976828.3.jpg"},"name":"凯蒂·克朗","id":"1360587"},{"alt":"https://movie.douban.com/celebrity/1031847/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1396501988.66.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1396501988.66.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1396501988.66.jpg"},"name":"凯尔希·格兰莫","id":"1031847"}],"collect_count":4304,"original_title":"Storks","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1031179/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/19194.jpg","large":"https://img3.doubanio.com/img/celebrity/large/19194.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/19194.jpg"},"name":"尼古拉斯·斯托勒","id":"1031179"},{"alt":"https://movie.douban.com/celebrity/1298729/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1370511874.76.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1370511874.76.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1370511874.76.jpg"},"name":"道格·斯威特兰德","id":"1298729"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2378515005.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2378515005.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2378515005.jpg"},"alt":"https://movie.douban.com/subject/26374205/","id":"26374205"}},{"box":13830000,"new":false,"rank":3,"subject":{"rating":{"max":10,"average":8.3,"stars":"45","min":0},"genres":["剧情","传记"],"title":"萨利机长","casts":[{"alt":"https://movie.douban.com/celebrity/1054450/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/551.jpg","large":"https://img3.doubanio.com/img/celebrity/large/551.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/551.jpg"},"name":"汤姆·汉克斯","id":"1054450"},{"alt":"https://movie.douban.com/celebrity/1053577/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/522.jpg","large":"https://img3.doubanio.com/img/celebrity/large/522.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/522.jpg"},"name":"艾伦·艾克哈特","id":"1053577"},{"alt":"https://movie.douban.com/celebrity/1053572/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/516.jpg","large":"https://img3.doubanio.com/img/celebrity/large/516.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/516.jpg"},"name":"劳拉·琳妮","id":"1053572"}],"collect_count":2003,"original_title":"Sully","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1054436/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/33310.jpg","large":"https://img3.doubanio.com/img/celebrity/large/33310.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/33310.jpg"},"name":"克林特·伊斯特伍德","id":"1054436"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2363503306.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2363503306.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2363503306.jpg"},"alt":"https://movie.douban.com/subject/26416603/","id":"26416603"}},{"box":4520000,"new":false,"rank":4,"subject":{"rating":{"max":10,"average":8.1,"stars":"40","min":0},"genres":["喜剧","爱情"],"title":"BJ单身日记3：BJ的孩子","casts":[{"alt":"https://movie.douban.com/celebrity/1054418/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/591.jpg","large":"https://img3.doubanio.com/img/celebrity/large/591.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/591.jpg"},"name":"蕾妮·齐薇格","id":"1054418"},{"alt":"https://movie.douban.com/celebrity/1031223/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1497.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1497.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1497.jpg"},"name":"科林·费尔斯","id":"1031223"},{"alt":"https://movie.douban.com/celebrity/1013769/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/15889.jpg","large":"https://img1.doubanio.com/img/celebrity/large/15889.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/15889.jpg"},"name":"帕特里克·德姆西","id":"1013769"}],"collect_count":1157,"original_title":"Bridget Jones's Baby","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1290729/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"沙朗·马奎尔","id":"1290729"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2329060490.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2329060490.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2329060490.jpg"},"alt":"https://movie.douban.com/subject/3868141/","id":"3868141"}},{"box":4144989,"new":false,"rank":5,"subject":{"rating":{"max":10,"average":7.5,"stars":"40","min":0},"genres":["剧情","传记","惊悚"],"title":"斯诺登","casts":[{"alt":"https://movie.douban.com/celebrity/1101703/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/3517.jpg","large":"https://img1.doubanio.com/img/celebrity/large/3517.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/3517.jpg"},"name":"约瑟夫·高登-莱维特","id":"1101703"},{"alt":"https://movie.douban.com/celebrity/1040526/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/42217.jpg","large":"https://img1.doubanio.com/img/celebrity/large/42217.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/42217.jpg"},"name":"谢琳·伍德蕾","id":"1040526"},{"alt":"https://movie.douban.com/celebrity/1049558/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/21514.jpg","large":"https://img3.doubanio.com/img/celebrity/large/21514.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/21514.jpg"},"name":"梅丽莎·里奥","id":"1049558"}],"collect_count":453,"original_title":"Snowden","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1054513/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/659.jpg","large":"https://img1.doubanio.com/img/celebrity/large/659.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/659.jpg"},"name":"奥利佛·斯通","id":"1054513"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2341351626.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2341351626.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2341351626.jpg"},"alt":"https://movie.douban.com/subject/25900819/","id":"25900819"}},{"box":3950000,"new":false,"rank":6,"subject":{"rating":{"max":10,"average":4.3,"stars":"25","min":0},"genres":["惊悚","恐怖"],"title":"布莱尔女巫","casts":[{"alt":"https://movie.douban.com/celebrity/1339675/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/26pxNmeTN2gcel_avatar_uploaded1397222795.96.jpg","large":"https://img3.doubanio.com/img/celebrity/large/26pxNmeTN2gcel_avatar_uploaded1397222795.96.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/26pxNmeTN2gcel_avatar_uploaded1397222795.96.jpg"},"name":"考莉·赫尔南德斯","id":"1339675"},{"alt":"https://movie.douban.com/celebrity/1337331/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1389337756.33.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1389337756.33.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1389337756.33.jpg"},"name":"詹姆斯·艾伦·麦克卡尼","id":"1337331"},{"alt":"https://movie.douban.com/celebrity/1362446/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1474264507.21.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1474264507.21.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1474264507.21.jpg"},"name":"布兰登·斯考特","id":"1362446"}],"collect_count":158,"original_title":"Blair Witch","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1306635/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/50983.jpg","large":"https://img3.doubanio.com/img/celebrity/large/50983.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/50983.jpg"},"name":"亚当·温加德","id":"1306635"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2368775301.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2368775301.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2368775301.jpg"},"alt":"https://movie.douban.com/subject/26377033/","id":"26377033"}},{"box":3800000,"new":false,"rank":7,"subject":{"rating":{"max":10,"average":7.8,"stars":"40","min":0},"genres":["剧情","悬疑","恐怖"],"title":"屏住呼吸","casts":[{"alt":"https://movie.douban.com/celebrity/1010537/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/24310.jpg","large":"https://img3.doubanio.com/img/celebrity/large/24310.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/24310.jpg"},"name":"史蒂芬·朗","id":"1010537"},{"alt":"https://movie.douban.com/celebrity/1317357/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/39560.jpg","large":"https://img3.doubanio.com/img/celebrity/large/39560.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/39560.jpg"},"name":"简·拉维","id":"1317357"},{"alt":"https://movie.douban.com/celebrity/1171930/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/25979.jpg","large":"https://img1.doubanio.com/img/celebrity/large/25979.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/25979.jpg"},"name":"迪兰·明奈特","id":"1171930"}],"collect_count":2130,"original_title":"Don't Breathe","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1208843/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1354601338.2.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1354601338.2.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1354601338.2.jpg"},"name":"费德·阿尔瓦雷兹","id":"1208843"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2373595901.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2373595901.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2373595901.jpg"},"alt":"https://movie.douban.com/subject/26704620/","id":"26704620"}},{"box":3110000,"new":false,"rank":8,"subject":{"rating":{"max":10,"average":6.7,"stars":"35","min":0},"genres":["喜剧","动作","冒险"],"title":"X特遣队","casts":[{"alt":"https://movie.douban.com/celebrity/1027138/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/31885.jpg","large":"https://img3.doubanio.com/img/celebrity/large/31885.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/31885.jpg"},"name":"威尔·史密斯","id":"1027138"},{"alt":"https://movie.douban.com/celebrity/1013764/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/8496.jpg","large":"https://img3.doubanio.com/img/celebrity/large/8496.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/8496.jpg"},"name":"杰瑞德·莱托","id":"1013764"},{"alt":"https://movie.douban.com/celebrity/1272303/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1389939796.3.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1389939796.3.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1389939796.3.jpg"},"name":"玛格特·罗比","id":"1272303"}],"collect_count":13065,"original_title":"Suicide Squad","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1319045/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/47469.jpg","large":"https://img1.doubanio.com/img/celebrity/large/47469.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/47469.jpg"},"name":"大卫·阿耶","id":"1319045"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2363084076.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2363084076.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2363084076.jpg"},"alt":"https://movie.douban.com/subject/3569910/","id":"3569910"}},{"box":2500000,"new":false,"rank":9,"subject":{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","悬疑","惊悚"],"title":"当树枝折断时","casts":[{"alt":"https://movie.douban.com/celebrity/1013859/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/41464.jpg","large":"https://img3.doubanio.com/img/celebrity/large/41464.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/41464.jpg"},"name":"摩里斯·切斯塔特","id":"1013859"},{"alt":"https://movie.douban.com/celebrity/1036471/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/16185.jpg","large":"https://img3.doubanio.com/img/celebrity/large/16185.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/16185.jpg"},"name":"雷吉娜·赫尔","id":"1036471"},{"alt":"https://movie.douban.com/celebrity/1350982/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1438523153.57.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1438523153.57.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1438523153.57.jpg"},"name":"洁丝·辛克莱","id":"1350982"}],"collect_count":15,"original_title":"When the Bough Breaks","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1045335/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/6133.jpg","large":"https://img3.doubanio.com/img/celebrity/large/6133.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/6133.jpg"},"name":"强·卡萨","id":"1045335"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2361858542.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2361858542.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2361858542.jpg"},"alt":"https://movie.douban.com/subject/3578943/","id":"3578943"}},{"box":1103000,"new":false,"rank":10,"subject":{"rating":{"max":10,"average":8.1,"stars":"40","min":0},"genres":["剧情","动画"],"title":"魔弦传说","casts":[{"alt":"https://movie.douban.com/celebrity/1018991/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/44470.jpg","large":"https://img3.doubanio.com/img/celebrity/large/44470.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/44470.jpg"},"name":"查理兹·塞隆","id":"1018991"},{"alt":"https://movie.douban.com/celebrity/1328167/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1433670947.85.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1433670947.85.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1433670947.85.jpg"},"name":"阿特·帕金森","id":"1328167"},{"alt":"https://movie.douban.com/celebrity/1006956/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/28941.jpg","large":"https://img3.doubanio.com/img/celebrity/large/28941.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/28941.jpg"},"name":"拉尔夫·费因斯","id":"1006956"}],"collect_count":2005,"original_title":"Kubo and the Two Strings","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1305796/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1471358307.31.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1471358307.31.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1471358307.31.jpg"},"name":"特拉维斯·奈特","id":"1305796"}],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2294106717.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2294106717.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2294106717.jpg"},"alt":"https://movie.douban.com/subject/26287884/","id":"26287884"}},{"box":1100000,"new":false,"rank":11,"subject":{"rating":{"max":10,"average":7.8,"stars":"40","min":0},"genres":["剧情","犯罪"],"title":"赴汤蹈火","casts":[{"alt":"https://movie.douban.com/celebrity/1053621/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/545.jpg","large":"https://img3.doubanio.com/img/celebrity/large/545.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/545.jpg"},"name":"克里斯·派恩","id":"1053621"},{"alt":"https://movie.douban.com/celebrity/1040512/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/2150.jpg","large":"https://img3.doubanio.com/img/celebrity/large/2150.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/2150.jpg"},"name":"本·福斯特","id":"1040512"},{"alt":"https://movie.douban.com/celebrity/1036313/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/3551.jpg","large":"https://img3.doubanio.com/img/celebrity/large/3551.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/3551.jpg"},"name":"杰夫·布里吉斯","id":"1036313"}],"collect_count":319,"original_title":"Hell or High Water","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1045234/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/26143.jpg","large":"https://img3.doubanio.com/img/celebrity/large/26143.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/26143.jpg"},"name":"大卫·马肯兹","id":"1045234"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2351955874.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2351955874.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2351955874.jpg"},"alt":"https://movie.douban.com/subject/26389148/","id":"26389148"}}]
     * title : 豆瓣电影北美票房榜
     */

    private String date;
    private String title;
    /**
     * box : 35000000
     * new : true
     * rank : 1
     * subject : {"rating":{"max":10,"average":7.2,"stars":"40","min":0},"genres":["动作","西部"],"title":"豪勇七蛟龙","casts":[{"alt":"https://movie.douban.com/celebrity/1054431/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/608.jpg","large":"https://img1.doubanio.com/img/celebrity/large/608.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/608.jpg"},"name":"丹泽尔·华盛顿","id":"1054431"},{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1408271589.94.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1408271589.94.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1408271589.94.jpg"},"name":"克里斯·普拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1025059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/33442.jpg","large":"https://img3.doubanio.com/img/celebrity/large/33442.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/33442.jpg"},"name":"马特·波莫","id":"1025059"}],"collect_count":322,"original_title":"The Magnificent Seven","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1013907/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1459145342.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1459145342.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1459145342.51.jpg"},"name":"安东尼·福奎阿","id":"1013907"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2377443025.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2377443025.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2377443025.jpg"},"alt":"https://movie.douban.com/subject/10774184/","id":"10774184"}
     */

    private List<SubjectsBean> subjects;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        private int box;
        @SerializedName("new")
        private boolean newX;
        private int rank;
        /**
         * rating : {"max":10,"average":7.2,"stars":"40","min":0}
         * genres : ["动作","西部"]
         * title : 豪勇七蛟龙
         * casts : [{"alt":"https://movie.douban.com/celebrity/1054431/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/608.jpg","large":"https://img1.doubanio.com/img/celebrity/large/608.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/608.jpg"},"name":"丹泽尔·华盛顿","id":"1054431"},{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1408271589.94.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1408271589.94.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1408271589.94.jpg"},"name":"克里斯·普拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1025059/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/33442.jpg","large":"https://img3.doubanio.com/img/celebrity/large/33442.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/33442.jpg"},"name":"马特·波莫","id":"1025059"}]
         * collect_count : 322
         * original_title : The Magnificent Seven
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1013907/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/1459145342.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1459145342.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1459145342.51.jpg"},"name":"安东尼·福奎阿","id":"1013907"}]
         * year : 2016
         * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2377443025.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2377443025.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2377443025.jpg"}
         * alt : https://movie.douban.com/subject/10774184/
         * id : 10774184
         */

        private SubjectBean subject;

        public int getBox() {
            return box;
        }

        public void setBox(int box) {
            this.box = box;
        }

        public boolean isNewX() {
            return newX;
        }

        public void setNewX(boolean newX) {
            this.newX = newX;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public SubjectBean getSubject() {
            return subject;
        }

        public void setSubject(SubjectBean subject) {
            this.subject = subject;
        }

        public static class SubjectBean {
            /**
             * max : 10
             * average : 7.2
             * stars : 40
             * min : 0
             */

            private RatingBean rating;
            private String title;
            private int collect_count;
            private String original_title;
            private String subtype;
            private String year;
            /**
             * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2377443025.jpg
             * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2377443025.jpg
             * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2377443025.jpg
             */

            private ImagesBean images;
            private String alt;
            private String id;
            private List<String> genres;
            /**
             * alt : https://movie.douban.com/celebrity/1054431/
             * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/608.jpg","large":"https://img1.doubanio.com/img/celebrity/large/608.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/608.jpg"}
             * name : 丹泽尔·华盛顿
             * id : 1054431
             */

            private List<CastsBean> casts;
            /**
             * alt : https://movie.douban.com/celebrity/1013907/
             * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/1459145342.51.jpg","large":"https://img3.doubanio.com/img/celebrity/large/1459145342.51.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/1459145342.51.jpg"}
             * name : 安东尼·福奎阿
             * id : 1013907
             */

            private List<DirectorsBean> directors;

            public RatingBean getRating() {
                return rating;
            }

            public void setRating(RatingBean rating) {
                this.rating = rating;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getCollect_count() {
                return collect_count;
            }

            public void setCollect_count(int collect_count) {
                this.collect_count = collect_count;
            }

            public String getOriginal_title() {
                return original_title;
            }

            public void setOriginal_title(String original_title) {
                this.original_title = original_title;
            }

            public String getSubtype() {
                return subtype;
            }

            public void setSubtype(String subtype) {
                this.subtype = subtype;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public ImagesBean getImages() {
                return images;
            }

            public void setImages(ImagesBean images) {
                this.images = images;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getGenres() {
                return genres;
            }

            public void setGenres(List<String> genres) {
                this.genres = genres;
            }

            public List<CastsBean> getCasts() {
                return casts;
            }

            public void setCasts(List<CastsBean> casts) {
                this.casts = casts;
            }

            public List<DirectorsBean> getDirectors() {
                return directors;
            }

            public void setDirectors(List<DirectorsBean> directors) {
                this.directors = directors;
            }

            public static class RatingBean {
                private int max;
                private double average;
                private String stars;
                private int min;

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public double getAverage() {
                    return average;
                }

                public void setAverage(double average) {
                    this.average = average;
                }

                public String getStars() {
                    return stars;
                }

                public void setStars(String stars) {
                    this.stars = stars;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }
            }

            public static class ImagesBean {
                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }

            public static class CastsBean {
                private String alt;
                /**
                 * small : https://img1.doubanio.com/img/celebrity/small/608.jpg
                 * large : https://img1.doubanio.com/img/celebrity/large/608.jpg
                 * medium : https://img1.doubanio.com/img/celebrity/medium/608.jpg
                 */

                private AvatarsBean avatars;
                private String name;
                private String id;

                public String getAlt() {
                    return alt;
                }

                public void setAlt(String alt) {
                    this.alt = alt;
                }

                public AvatarsBean getAvatars() {
                    return avatars;
                }

                public void setAvatars(AvatarsBean avatars) {
                    this.avatars = avatars;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public static class AvatarsBean {
                    private String small;
                    private String large;
                    private String medium;

                    public String getSmall() {
                        return small;
                    }

                    public void setSmall(String small) {
                        this.small = small;
                    }

                    public String getLarge() {
                        return large;
                    }

                    public void setLarge(String large) {
                        this.large = large;
                    }

                    public String getMedium() {
                        return medium;
                    }

                    public void setMedium(String medium) {
                        this.medium = medium;
                    }
                }
            }

            public static class DirectorsBean {
                private String alt;
                /**
                 * small : https://img3.doubanio.com/img/celebrity/small/1459145342.51.jpg
                 * large : https://img3.doubanio.com/img/celebrity/large/1459145342.51.jpg
                 * medium : https://img3.doubanio.com/img/celebrity/medium/1459145342.51.jpg
                 */

                private AvatarsBean avatars;
                private String name;
                private String id;

                public String getAlt() {
                    return alt;
                }

                public void setAlt(String alt) {
                    this.alt = alt;
                }

                public AvatarsBean getAvatars() {
                    return avatars;
                }

                public void setAvatars(AvatarsBean avatars) {
                    this.avatars = avatars;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public static class AvatarsBean {
                    private String small;
                    private String large;
                    private String medium;

                    public String getSmall() {
                        return small;
                    }

                    public void setSmall(String small) {
                        this.small = small;
                    }

                    public String getLarge() {
                        return large;
                    }

                    public void setLarge(String large) {
                        this.large = large;
                    }

                    public String getMedium() {
                        return medium;
                    }

                    public void setMedium(String medium) {
                        this.medium = medium;
                    }
                }
            }
        }
    }
}
