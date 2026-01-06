package entity;
public class Person {
    private String name;
    private int age;
    private Passport passports[];

    public Person() {
        passports = new Passport[5];
    }

    public Person(String name, int age, int size) {
        this.name = name;
        this.age = age;
        passports = new Passport[size];
    }

    public void addPassport(int pos, Passport p) {
        if (pos >= 0 && pos < passports.length) {
            passports[pos] = p;
        } else {
            System.out.println("Invalid position");
        }
    }

    public void deletePassport(int pos) {
        if (pos >= 0 && pos < passports.length) {
            passports[pos] = null;
            System.out.println("Passport deleted at position " + pos);
        }
    }

    public void showPassports() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("----- Passport List -----");
        for (int i = 0; i < passports.length; i++) {
            if (passports[i] != null) {
                System.out.println("Passport Index: " + i);
                passports[i].showPassportInfo();
            }
        }
        System.out.println("-------------------------");
    }
}
