package com.infosys;

public class Tyre {
   // class variable is a variable declared inside a class but outside any method
    // they have scope in whole class
    // class variable get auto intialize
    // int, byte , shot , long -- 0
    // float , double -- 0.0
    // char = ''   , boolean - false
    // non primitive data type = Null
    private String companyName;
    private int lifeOfTyre;
   // this is a reference to current class object
    //  this is useful when local variable and class variable have same name
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getLifeOfTyre() {
        return lifeOfTyre;
    }

    public void setLifeOfTyre(int lifeOfTyre) {
        this.lifeOfTyre = lifeOfTyre;
    }
}
