package com.loose.coupling;

public class NewDatabaseProvide implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "New data from new Datatbase";
    }

}
