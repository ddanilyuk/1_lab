public class Main {
    public static void main(String[] args) {

        final char a = 1;
        final char b = 2;
        final char n = 3;
        final char m = 2;
        final int C = 0;
        float S = 0;

        if (C >= a && C <= n) {
            System.out.println("Ділення на нуль:(");
        } else {
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    S = S + (float) (i + j) / (i + C);
                }
            }
            System.out.println(S);
        }

        //task* Змінити один символ, щоб
        //вивело 20 "*"
        int N = 20;
        int Z = 20;

        for (int i = 0; i < N; N--) {
            System.out.print("*");
        }

        System.out.println(" ");
        System.out.println("---------or---------");

        for (int i = 0; -i < Z; Z--) {
            System.out.print("*");
        }
    }
}