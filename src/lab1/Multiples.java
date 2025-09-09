package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;
        int count = multiples(n, a ,b);
        System.out.println(count);

    }


    static int multiples(int n, int a, int b) {
        int num = 0;

        for (int c = 1; c < n; c++) {
            boolean divisibleBya = c % a == 0;
            boolean divisibleByb = c % b == 0;

            // Print our appropriate result.
            if (divisibleBya || divisibleByb) {
                num++;
            }


        }
        return num;
    }
}

