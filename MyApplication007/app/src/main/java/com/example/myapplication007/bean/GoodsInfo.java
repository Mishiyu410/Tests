package com.example.myapplication007.bean;

import com.example.myapplication007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "郁金香", "白桃", "四娃羊", "笑脸", "小熊", "海洋","小熊","波点怪兽"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "小羊山坡羊猫伞娃郁金香原创插画软萌手机壳",
            "壳空间原创白桃适用苹果手机壳",
            "小羊山坡四娃羊与插画可爱温馨治愈原创手机壳",
            "气囊全包防摔手机壳-笑脸happy，nice",
            "原创渐变色手机壳小熊全包软壳",
            "荧光手机壳冷淡风ins可爱原创小众",
            "原创可爱手机壳韩国保护套小熊全包",
            "北海道实验室原创日系波点怪兽冷淡适用苹果手机壳"


    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {39, 48, 39, 10, 32, 23,20,35};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.oo, R.drawable.tt, R.drawable.thth,
            R.drawable.ff, R.drawable.fifi, R.drawable.ss,
            R.drawable.sese, R.drawable.ee
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.o, R.drawable.t, R.drawable.th,
            R.drawable.f, R.drawable.fi, R.drawable.s,
            R.drawable.se, R.drawable.s
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
