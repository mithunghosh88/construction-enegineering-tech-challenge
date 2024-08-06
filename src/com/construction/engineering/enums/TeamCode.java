package com.construction.engineering.enums;

public enum TeamCode {
    RED_TEAM(1,"RedTeam"),BLUE_TEAM(2,"BlueTeam"),YELLOW_TEAM_3(3,"YellowTeam3");

    private int code;
    private String value;
    private TeamCode(int code,String value){
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
