package com.loose.coupling;

public class webServiceDataProvide implements UserDataProvider {
    
    @Override
    public String getUserDetails(){
        return "Web service data provider";
    }
}
