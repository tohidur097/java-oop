import entity.*;
public class Start {
    public static void main(String[] args) {

        Person p1 = new Person("Hasin Raihan", 21, 5);

        p1.addPassport(0, new Passport("25-62622-2", "23 Dec 2029", 48));
        p1.addPassport(1, new Passport("11-09-2022", "01 Oct 2025", 64));
        p1.addPassport(2, new Passport("BD-998877", "12 Aug 2030", 32));
        p1.addPassport(3, new Passport("BD-556677", "15 May 2032", 40));
        p1.addPassport(4, new Passport("BD-112233", "20 Jan 2035", 50));

       // p1.showPassports();


        p1.deletePassport(2);
		p1.deletePassport(3);
		p1.deletePassport(4);
        p1.showPassports();
    }
}
