// 整数 n を引数に取り階乗を返すメソッド fact を完成させなさい。

public class Fact {
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int f = fact(n);
        System.out.printf("f(%d) = %d\n", n, f);
    }
}
