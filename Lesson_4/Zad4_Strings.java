public class Zad4_Strings {
    public static void main(String[] args)
    {
        String myName = "Borislav";
        String myName2 = "BORISLAV";
        System.out.println(myName.equals(myName2));
        System.out.println(myName.equalsIgnoreCase(myName2));
        System.out.println(myName.compareTo(myName2));
        String firstName = "Borislav";
        String lastName = "Pavlov";
        System.out.println(firstName + " " + lastName);
        int age = 41;
        System.out.printf("%s %s is a %d age person.\n", firstName, lastName, age);
        String firstName1 = "Dilyana";
        String lastName1 = "Mincheva";
        int age1 = 40;
        System.out.printf("%s %s is a %d age person.", firstName1, lastName1, age1);
    }
}
