package com.construction.engineering.enums;

public enum GeoZone {
    US_WEST(1,"us_west"),US_EAST(2,"us_east"),EU_WEST(3,"eu_west");

    private int code;
    private String value;
    private GeoZone(int code,String value){
        this.code = code;
        this.value = value;
    }
    public int getCode(){
        return this.code;
    }
    public String getValue(){
        return this.value;
    }
}
