package com.introtoandroid.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

public class Student extends AppCompatActivity {
    private String fName;
    private String lName;
    private String major;

    Student (String fn, String ln, String m) {
        fName = fn;
        lName = ln;
        major = m;
    }

    public String getFirst(){
        return fName;
    }
    public void setFirst(String temp){
        fName = temp;
    }

    public String getLast(){
        return lName;
    }
    public void setLast(String temp){
        lName = temp;
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String temp){
        major = temp;
    }
}
