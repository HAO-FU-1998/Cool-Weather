package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;

    @SerializedName("hum")
    public String aqi;

    @SerializedName("pcpn")
    public String pm25;



}
