import task1.Names;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        String names = new Names().format(new String[]{"Ivan", "Bob", "Semen", "Alex", "Max"});

        System.out.println(names);
    }
}
