package com.company.jones;

import java.util.ArrayList;

public class Collection {
    private ArrayList<ContactInfo> book =new ArrayList<ContactInfo>();

    public Collection() {
        ArrayList<ContactInfo> book =new ArrayList<ContactInfo>();
    }
    public void addInfo(ContactInfo info){
        this.book.add(info);
    }
    public void sendAll(){
        for (ContactInfo item : this.book){
            System.out.println(item.toString());
        }
    }
}
