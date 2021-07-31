package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double vMagnitude, String vLocation, long vTimeInMilliseconds, String vUrl){
        mMagnitude=vMagnitude;
        mLocation=vLocation;
        mTimeInMilliseconds=vTimeInMilliseconds;
        mUrl=vUrl;
    }
    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl(){ return mUrl;}
}
