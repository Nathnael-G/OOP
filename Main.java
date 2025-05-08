public class Main{
    public static void main(String[] args) {
        User u = new User("nati", "Gold");
        User u2 = new User("nati", "silver");
        System.out.println(u.equals(u2));
    }
}