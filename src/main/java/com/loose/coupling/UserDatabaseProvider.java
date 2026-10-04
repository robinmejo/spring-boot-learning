package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override 
    public String getUserDetails(){
        //Direct acces databse from here
        return "User Details From Database";
    }    
}
