package com.design.pattern.Builder;

/**
 * @Author: kk
 * @Date: 2019-10-29 11:43
 * @Description: 建造者模式
 * 消费者去电脑城买组装电脑，工作人员负责组装，完后就取出电脑。
 */
public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        ABuilder builder = new DesktopComputerBuilder();

        worker.startBuildComputer(builder);

        Computer computer = builder.getComputer();

        System.out.println(computer.toString());
    }
}
