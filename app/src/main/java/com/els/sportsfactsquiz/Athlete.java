package com.els.sportsfactsquiz;

/**
 * Created by ericaschulz on 6/12/16.
 */
public class Athlete {
    public String mTxtName;
    public String mTxtSport;
    public String mTxtAward;
    public boolean isTrue;


    public Athlete(String name, String sport, String award, boolean isTrue) {
        this.mTxtName = name;
        this.mTxtSport = sport;
        this.mTxtAward = award;
        this.isTrue = true;


    }

    public String getmName() {
        return mTxtName;
    }

    public void setmName(String name) {
        mTxtName = name;
    }

    public String getmSport() {
        return mTxtSport;
    }

    public void setmSport(String sport) {
        mTxtSport = sport;

    }

    public String getmAward() {
        return mTxtAward;
    }

    public void setmAward(String award) {
        mTxtAward = award;

    }
}




