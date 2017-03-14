package com.esha.service;

import com.Demo2.My_parent;
import com.esha.dao.CreatesubscriptionDao;

public class Create {
public boolean createService(My_parent myParent) throws Exception{
        
        CreatesubscriptionDao createSubscriptionDao = new CreatesubscriptionDao();
        if(createSubscriptionDao.exit(myParent)){
            createSubscriptionDao.add(myParent);
            return true;
        }
        else
            System.out.println("**Cannot be added-------- User Adready Exist**");
            
        return false;
    }
}
