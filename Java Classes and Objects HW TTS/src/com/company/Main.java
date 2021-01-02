package com.company;
import com.company.Pet;
import com.company.Computer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet pet = new Pet(0,"Spew");
        String newName;

        System.out.print("Please enter a name: ");
        newName = scan.next();
        pet.setName(newName);
        System.out.println("Name: " + pet.getName());
        System.out.println("Age: " + pet.getAge());
        System.out.println("Type: " + pet.getType());

        Computer computer = new Computer();
        String cpuType;
        int computerYear;

        System.out.print("What year was your computer made? ");
        computerYear = scan.nextInt();
        computer.setYear(computerYear);
        if(computerYear < 2000){
            computer.isObsolete();
        }
        else {
            computer.isNotObsolete();
        }
        System.out.print("What's your CPU Type? AMD or Intel? ");
        cpuType = scan.next();
        computer.setCpu(cpuType);
        System.out.println("Your CPU Type is: " + computer.cpuType());



    }
}
