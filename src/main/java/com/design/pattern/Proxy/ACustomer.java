package com.design.pattern.Proxy;

/**
 * @Author: kk
 * @Date: 2019-10-30 10:15
 * @Description: 某一个具体到消费者
 */
public class ACustomer implements Scalper {
    @Override
    public void buy() {
        System.out.println("想买一个美版到 Thinkpad X1 隐士");
    }
}
