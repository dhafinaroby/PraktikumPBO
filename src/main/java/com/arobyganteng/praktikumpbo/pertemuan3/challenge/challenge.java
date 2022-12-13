package com.arobyganteng.praktikumpbo.pertemuan3.challenge;

public class challenge {
    
    //atribut
    private String name;
    private int visitorsToday;
    private int yearBuilt;
    
    // Constructor I
    public challenge(){}
    
    //Constructor II
    public challenge(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    
    
    //Method mencetak semua atribut
    public void showProfile(){
        System.out.println("Name            : " + name);
        System.out.println("Visitors Today  : " + visitorsToday);
        System.out.println("year Built      : " + yearBuilt);
        System.out.println();
    }

    // [Alt] + [Insert] -> Getter and Setter -> Select All

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
