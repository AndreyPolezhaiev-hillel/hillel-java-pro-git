package com.hillel.polezhaiev.homework3;


public class Main {
        public static void main(String[] args) {
            Employee person1 = new Employee("Andrey", "Polezhaiev", "junior java developer",
                    "hillelpolezhaiev@gmail.com", "097684987", 18);

            Employee person2 = new Employee("Andrey", "Polezhaiev", "middle java developer",
                    "this.email@gmail.com", "0576556753", 23);


            person1.printInfo();
            System.out.println();
            person2.printInfo();

            SameName person3 = new SameName("Artem");
            com.hillel.polezhaiev.SameName person4 = new com.hillel.polezhaiev.SameName(23456789);

            System.out.println();
            System.out.println(person1.getEmail());
            System.out.println(person2.getName());
            System.out.println(person3.getName());
            System.out.println(person4.getMoney());


        }
    }

