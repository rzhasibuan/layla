package SeterAndGetter;

public class User{
    public static void main(String[] args) {
        SeterAndGetter reza = new SeterAndGetter();
        reza.setAge("25");
        reza.setNameUser("reza afri suhangga hasibuan");
        reza.setGander("male");

        System.out.println("Gander " + reza.getGenderUser());
        System.out.println("name user " + reza.getNameUser());
        System.out.println("age " + reza.getAgeUSer());
    }
}
