package com.esha.service;

import com.Demo2.My_parent;
import com.esha.dao.CancelsubscriptionDao;

public class Cancel {
public boolean cancelService(My_parent myParent) throws Exception{
        
        CancelsubscriptionDao cancelSubscriptionDao = new CancelsubscriptionDao();
        if(!cancelSubscriptionDao.AccountIdentifier(myParent)){
            cancelSubscriptionDao.cancel(myParent);
            return true;
        }
        else
            System.out.println("**--Cannot be Deleted as User doesnot Exist--**");
        
        return false;
    }

}
