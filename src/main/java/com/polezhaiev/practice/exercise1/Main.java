
package com.polezhaiev.practice.exercise1;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Andrey", "Polezhaiev", "junior java developer",
                                       "hillelpolezhaiev@gmail.com", "097684987", 18);

        Employee person2 = new Employee("Andrey", "Polezhaiev", "middle java developer",
                                        "this.email@gmail.com", "0576556753", 23);


        System.out.println();
        person.start();             //first person's car
        System.out.println();
        person2.start();            //second person's car

        System.out.println();
        System.out.println();

        person.printInfo();
        System.out.println();
        person2.printInfo();

    }
}
