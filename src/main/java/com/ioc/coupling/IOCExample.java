package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main (String[] args){
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");
       UserManager userManagerwithNewDB=(UserManager)context.getBean("userDataProvideruserManager");
       System.out.println(userManagerwithNewDB.getUserInfo());
    //    UserDataProvider databaseProvider=new UserDatabaseProvider();
    //    UserManager userManagerwithNewDB=new UserManager(databaseProvider);
    //    System.out.println(userManagerwithNewDB.getUserInfo());

       UserManager userManagerWithWS=(UserManager)context.getBean("newDatabaseProvideuserManager");
       System.out.println(userManagerWithWS.getUserInfo());
    //    UserDataProvider webservicProvider=new webServiceDataProvider();
    //    UserManager userManagerWithWS=new UserManager(webservicProvider);
    //    System.out.println(userManagerWithWS.getUserInfo());

       UserManager userManagerwithLatestDB=(UserManager)context.getBean("webServiceDataProvideruserManager");
       System.out.println(userManagerwithLatestDB.getUserInfo());

    //    UserDataProvider newDatabaseProvider=new NewDatabaseProvider();
    //    UserManager userManagerwithLatestDB=new UserManager(newDatabaseProvider);
    //    System.out.println(userManagerwithLatestDB.getUserInfo());
    }
}
