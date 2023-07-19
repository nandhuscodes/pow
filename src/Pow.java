import java.util.Scanner;

public class Pow {
    static int findPow(int A, int B, int C){
        if (B == 0) {
            return 1;
        } else if (B == 1) {
            return A % C;
        }
        int half = B / 2;
        int result = findPow(A, half, C);
        result = (result * result) % C;
        if (B % 2 == 1) {
            result = (result * A) % C;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findPow(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
