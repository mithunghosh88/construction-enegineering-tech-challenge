package com.construction.engineering.enums;

public enum ProjectCode {
    PROJECT_APPLE(1,"ProjectApple"),PROJECT_BANANA(2,"ProjectBanana"),
    PROJECT_CARROT(3,"ProjectCarrot"),PROJECT_DATE(4,"ProjectDate"),
    PROJECT_EGG(5,"ProjectEgg");

    private int code;
    private String value;
    private ProjectCode(int code,String value){
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
