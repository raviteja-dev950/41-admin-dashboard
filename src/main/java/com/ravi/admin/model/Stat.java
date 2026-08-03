package com.ravi.admin.model;
public class Stat {
    private String title; private String value; private String icon; private String color;
    public Stat(String t, String v, String i, String c){ title=t; value=v; icon=i; color=c; }
    public String getTitle(){return title;} public String getValue(){return value;}
    public String getIcon(){return icon;} public String getColor(){return color;}
}