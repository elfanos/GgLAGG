package com.example.rallmo.gglagg;

import android.util.Log;

import java.io.InputStreamReader;

/**
 * Created by rallmo on 2015-05-20.
 */
public abstract class GetHTTPINFO implements AsyncResponse {

    String inputString = "";
    String cords = "";
    String phoneNumber;

    public GetHTTPINFO(){

    }

    public GetHTTPINFO(String inputString){

        this.inputString = inputString;

    }

    public void getHTTP() {


        HttpConnect test = new HttpConnect();
        test.listener = this;

        test.execute();

        test.listener.processFinish(inputString);
        Log.e("msgINput", inputString);

        //String[] s = inputString.split(";");

        //Log.e("s1:", s.toString());

       /* Log.e("s1:", s1);
        Log.e("s2:", s2);*/





        //findCords(inputString);



    }

    public String getCords() {

        return cords;
    }

    public void setCords(String cords) {
        this.cords = cords;

    }

    public void findCords(String inputString) {

       /* String cordString = "";


        Log.e("msg", "split1");
            String[] parts = inputString.split(";");
            String phoneNumber = parts[0];
            String part2 = parts[1];


        Log.e("msg", "split2");

            String[] cordParts = part2.split(",");
            String longitude = cordParts[0];
            String latitude = cordParts[1];

        Log.e("msg", "split3");
            Log.e("Longitude", longitude);
        Log.e("msg", "split4");
            Log.e("Latitude", latitude);
        Log.e("msg", "split5");*/






    }

}




