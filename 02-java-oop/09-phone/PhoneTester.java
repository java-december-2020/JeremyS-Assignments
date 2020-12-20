public class PhoneTester {
    public static void main(String [] args){
        Galaxy s9 = new Galaxy("s9", 99, "Verizon", "ring ring ring");
        IPhone iphone10 = new IPhone("x", 100, "AT&T", "Zing");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphone10.displayInfo();
        System.out.println(iphone10.ring());
        System.out.println(iphone10.unlock());
    }
    
}
