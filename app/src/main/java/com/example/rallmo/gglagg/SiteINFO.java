package com.example.rallmo.gglagg;

/**
 * Created by rallmo on 2015-05-25.
 */
public class SiteINFO {

    double latitude = 0, longitude = 0;
    String phoneNumber ="";

    public void setPhoneNumber(String PhoneNumber){

        this.phoneNumber = PhoneNumber;

    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setLatitude(double lati){
        this.latitude = lati;
    }
    public double getLatitude(){
        return latitude;
    }
    public void setLongitude(double longi){
        this.longitude = longi;
    }
    public double getLongitude(){
        return longitude;
    }
}
