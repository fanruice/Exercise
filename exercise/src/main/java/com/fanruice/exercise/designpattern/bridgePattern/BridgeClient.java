package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 客户端
 */
public class BridgeClient {

    public static void main(String[] args) {
        //房地产公司挣钱
        HouseCorp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();
        //公共公司挣钱
        //通过修改一条语句就可以实现生产产品的转换
        //Corp类和Prodect类都可以自由的扩展，我们只需要修改客户端的代码即可。
        CommonCorp commonCorp = new CommonCorp(new Ipad());
        commonCorp.makeMoney();
        commonCorp = new CommonCorp(new Clothes());
        commonCorp.makeMoney();

    }
}
