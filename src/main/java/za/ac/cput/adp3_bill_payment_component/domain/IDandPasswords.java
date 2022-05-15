package za.ac.cput.adp3_bill_payment_component.domain;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("Tumelo", "Tum123");
        logininfo.put("Chad", "Mrman");
        logininfo.put("Wilbur", "123Welbur");
        logininfo.put("Siphosethu", "Password");
    }

    protected HashMap getLoginInfor(){
        return logininfo;
    }
}
