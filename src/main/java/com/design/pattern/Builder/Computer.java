package com.design.pattern.Builder;


/**
 * @Author: kk
 * @Date: 2019-10-29 11:49
 * @Description:
 */
public class Computer {

    private String cpu;
    private String mainBoard;
    private String memory;
    private String hd;
    private String display;
    private String keyboard;
    private String sound;
    private String videoCard;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                ", hd='" + hd + '\'' +
                ", display='" + display + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", sound='" + sound + '\'' +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }
}
