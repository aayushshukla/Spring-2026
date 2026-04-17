package com.infosys;

public class Car {

    private String carName;
    private String companyName;
    private  Tyre tyre;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    // toString converts object to string
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", tyre company=" + tyre.getCompanyName() + "tyre age =" + tyre.getLifeOfTyre() +
                '}';
    }

    public static void main(String[] args) {
            Car car = new Car();
            Tyre  tyre = new Tyre();
            tyre.setCompanyName("Apollo");
            tyre.setLifeOfTyre(10);
            car.setCarName("Honda City");
            car.setCompanyName("Honda");
            car.setTyre(tyre);
            System.out.println(car.toString());



    }
}
