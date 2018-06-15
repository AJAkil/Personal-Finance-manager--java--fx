package sample;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MaintainUser {

    public HashMap<String,USER> usertable = new HashMap<>();


    public HashMap<String, USER> getUsertable() {
        return usertable;
    }

    public void setUsertable(HashMap<String, USER> usertable) {
        this.usertable = usertable;
    }

    public String getname() {
        return name;
    }

    public void setStr(String str) {
        this.name = str;
    }

    String name;

    public void getentry(USER uobj) {
        name = uobj.getName();
        if (name != null) {
            if (uobj != null) {
                usertable.put(name, uobj);
                System.out.println("Put in to the hashtable");
            } else {
                System.out.println("uobj is null");
            }

        } else {
            System.out.println("Error name is null");
        }


    }

    public String GiveUserName(String keyobj){
        if(usertable.get(keyobj)!=null)
            return usertable.get(keyobj).getName();

        return "ERROR";
    }


    public String GiveUserpassword(String keyobj){
        if(usertable.get(keyobj)!=null)
            return usertable.get(keyobj).getLoginpass();

        return "ERROR";
    }

    public void PrintEverything(){
        System.out.println("calling print everything");
        Set set = usertable.keySet(); // get set view of keys
        Iterator<String> itr = set.iterator();     // get iterator
        while(itr.hasNext()) {
            name = itr.next();
            System.out.println(name + ": " + usertable.get(name).getLoginpass());
        }
    }

    public String GiveNameofUser(){
        Set set = usertable.keySet(); // get set view of keys
        Iterator<String> itr = set.iterator();     // get iterator
        return itr.next();
    }



}
