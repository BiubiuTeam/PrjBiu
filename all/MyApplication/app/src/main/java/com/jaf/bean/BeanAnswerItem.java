package com.jaf.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by jarrah on 2015/4/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BeanAnswerItem {

//    private otherAnsData=(null)

    private String ans;
    private String nick;
    private String selfLocDesc;
    private String toNick;

    private int ansId;
    private int isImpeach;
    private int isMine;
    private int isQuester;
    private int likeFlag;
    private int likeNum;
    private int pubTime;
    private int unlikeNum;


    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSelfLocDesc() {
        return selfLocDesc;
    }

    public void setSelfLocDesc(String selfLocDesc) {
        this.selfLocDesc = selfLocDesc;
    }

    public String getToNick() {
        return toNick;
    }

    public void setToNick(String toNick) {
        this.toNick = toNick;
    }

    public int getAnsId() {
        return ansId;
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public int getIsImpeach() {
        return isImpeach;
    }

    public void setIsImpeach(int isImpeach) {
        this.isImpeach = isImpeach;
    }

    public int getIsMine() {
        return isMine;
    }

    public void setIsMine(int isMine) {
        this.isMine = isMine;
    }

    public int getIsQuester() {
        return isQuester;
    }

    public void setIsQuester(int isQuester) {
        this.isQuester = isQuester;
    }

    public int getLikeFlag() {
        return likeFlag;
    }

    public void setLikeFlag(int likeFlag) {
        this.likeFlag = likeFlag;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getPubTime() {
        return pubTime;
    }

    public void setPubTime(int pubTime) {
        this.pubTime = pubTime;
    }

    public int getUnlikeNum() {
        return unlikeNum;
    }

    public void setUnlikeNum(int unlikeNum) {
        this.unlikeNum = unlikeNum;
    }
}