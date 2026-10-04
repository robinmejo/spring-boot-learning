package com.loose.coupling;

public class LooseCouplingExample {
    public static void main (String[] args){
       UserDataProvider databaseProvider=new UserDatabaseProvider();
       UserManager userManagerwithNewDB=new UserManager(databaseProvider);
       System.out.println(userManagerwithNewDB.getUserInfo());

       UserDataProvider webservicProvider=new webServiceDataProvide();
       UserManager userManagerWithWS=new UserManager(webservicProvider);
       System.out.println(userManagerWithWS.getUserInfo());

       UserDataProvider newDatabaseProvider=new NewDatabaseProvide();
       UserManager userManagerwithLatestDB=new UserManager(newDatabaseProvider);
       System.out.println(userManagerwithLatestDB.getUserInfo());
    }
}
