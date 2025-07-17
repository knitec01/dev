package KMJ.chapter02.ex08;

public class AmericanEx {
    public static void main(String[] args) {
        American american1 = new American("123456-1234567", "SAM");

        System.out.println("american1:" + american1.nation);
        System.out.println("american1:" + american1.ssn);
        System.out.println("american1:" + american1.name);

        American american2 = new American("987456-9874561", "TOM");

        System.out.println("american2:" + american2.nation);
        System.out.println("american2:" + american2.ssn);
        System.out.println("american2:" + american2.name);



        // american2.nation = "USA";
        // american2.ssn = "123-12-1234";

        american2.name = "김자바";
    }
}
