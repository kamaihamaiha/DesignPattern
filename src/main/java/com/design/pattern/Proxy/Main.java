package com.design.pattern.Proxy;

/**
 * @Author: kk
 * @Date: 2019-10-30 10:19
 * @Description: 代理模式
 * 如，海外代购电脑。
 */
public class Main {

    public static void main(String[] args) {
        ComputerScalper computerScalper = new ComputerScalper();
        computerScalper.buy();
    }
}
