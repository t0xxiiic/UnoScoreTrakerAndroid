package com.example.unoscorecounter;

public class PlayerItem {
    private String Fname, Lname;

    public PlayerItem(String firstName, String lastName){
        Fname = firstName;
        Lname = lastName;
    }

    public String getFname(){
        return Fname;
    }

    public String getLname(){
        return Lname;
    }
}
