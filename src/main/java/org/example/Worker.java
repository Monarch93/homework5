package org.example;

public class Worker {
    private String fio;
    private String position;
    private int age;
    private String email;
    private String phoneNumber;
    private int salary;

    public int getAge() {
        return age;
    }

    public Worker(String fio, String position, String email, int age, String phoneNumber, int salary) {
        this.fio = fio;
        this.email = email;
        this.age = age;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("ФИО: "+ fio + "; " + "Электронная почта: " + email + "; " + "Возраст: " + age + "; " + "Оклад: " + salary + "; " + "Телефон: " + phoneNumber + "; " + "Должность: " + position + "; ");
    }
}
