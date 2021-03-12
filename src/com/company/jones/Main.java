package com.company.jones;

import sun.util.BuddhistCalendar;

public class Main {

    public static void main(String[] args) {
    Collection book1= new Collection();
    BusinessContact cont1=new BusinessContact("name1", "email1", "1111111111");
    book1.addInfo(cont1);
    ContactInfo cont2 =new ContactInfo("name2", "email2");
    book1.addInfo(cont2);
    ContactInfo cont3=new ContactInfo("name3", "email3");
    book1.addInfo(cont3);
    book1.sendAll();
    }
}
