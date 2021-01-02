package com.company;

public class Computer {
    private int yearMade;
    private String brandName;
    private int modelNumber;
    private String cpu;

    Computer(){
    }

    Computer(int year, String brand){
        this.yearMade = year;
        this.brandName = brand;
    }

    Computer(int year, String brand, int model){
        this.yearMade = year;
        this.brandName = brand;
        this.modelNumber = model;
    }

    public int getYear(){
        return yearMade;
    }
    public int getModelNumber(){
        return modelNumber;
    }
    public String getBrandName(){
        return brandName;
    }

    public void setYear(int yearMade){
        this.yearMade = yearMade;
    }
    public void setModelNumber(int modelNumber){
        this.modelNumber = modelNumber;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public boolean isObsolete(){
        System.out.println("Your computer is obsolete!");
        return true;
    }
    public boolean isNotObsolete(){
        System.out.println("Your computer is not obsolete.");
        return false;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public String cpuType(){
        this.cpu = cpu;
        return cpu;
    }

}
