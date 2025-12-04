class cal {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        cal a = new cal();

        System.out.println(a.add(2, 3));
        System.out.println(a.add(2, 3, 4));
    }
}
