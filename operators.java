public class operators {
    public static void main(String[] args) {
        int a = 5 + 3;
        int b = 10 - 6;
        int c = 6 * 6;
        int d = 10 / 3;
        double e = 10.0 / 3.0;
        int f = 100 % 3;

        a++;
        a--;
        ++a;
        --a;
        int z = 1;
        System.out.println(z++ + --z);
        // 1 + 1
        System.out.println(++z + z--);
        // 2+2
    }
}
