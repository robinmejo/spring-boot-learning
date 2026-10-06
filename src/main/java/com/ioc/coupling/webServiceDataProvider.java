package com.ioc.coupling;

public class webServiceDataProvider implements UserDataProvider {
    
    @Override
    public String getUserDetails(){
        return "Web service data provider";
    }
}
