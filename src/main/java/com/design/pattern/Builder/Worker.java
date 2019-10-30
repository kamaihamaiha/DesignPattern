package com.design.pattern.Builder;

/**
 * @Author: kk
 * @Date: 2019-10-29 11:50
 * @Description: 组装电脑到人员
 */
public class Worker {

    /**
     * 构建一个电脑
     * @param aBuilder
     */
    public void startBuildComputer(ABuilder aBuilder){
        aBuilder.buildCPU();
        aBuilder.buildMemory();
        aBuilder.buildHD();
        aBuilder.buildSound();
        aBuilder.buildVideoCard();
        aBuilder.buildMainBoard();
        aBuilder.buildDisplay();
        aBuilder.buildKeyboard();
    }
}
