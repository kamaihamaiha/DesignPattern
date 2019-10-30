package com.design.pattern.Proxy;

/**
 * @Author: kk
 * @Date: 2019-10-30 10:17
 * @Description: 电脑黄牛
 */
public class ComputerScalper implements Scalper {
    @Override
    public void buy() {
        // 电脑黄牛，接到了一个电脑消费者到购买订单
        ACustomer aCustomer = new ACustomer();
        aCustomer.buy();
        buyComputer();
    }

    private void buyComputer(){
        System.out.println("从八通道购买，便宜实惠！");
    }
}
