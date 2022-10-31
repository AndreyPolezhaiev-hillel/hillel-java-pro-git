package com.hillel.polezhaiev.homework3;

    public class Employee extends Car{

        private String name;
        private String surname;
        private String position;
        private String email;
        private String number;
        private int age;

        public Employee(String name, String surname, String position, String email, String number, int age) {
            this.name = name;
            this.surname = surname;
            this.position = position;
            this.email = email;
            this.number = number;
            this.age = age;
        }

        public Employee(){};

        public void printInfo(){
            StringBuilder builder = new StringBuilder();
            String info = (builder .append(this.name).append(" ").append(this.surname).append("\n")
                    .append(this.position).append(" ").append("\n")
                    .append(this.email).append("\n")
                    .append(this.number).append("\n")
                    .append(this.age).append("\n")).toString();

            System.out.print(info);
        }

    }

