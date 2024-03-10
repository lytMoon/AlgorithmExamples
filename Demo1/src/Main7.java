import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = scanner.nextInt();

        String result = removeDigits(S, N);
        System.out.println(result);
    }

    public static String removeDigits(String S, int N) {
        if (N >= S.length()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < N; i++) {
            int j = 0;
            while (j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1)) {
                j++;
            }
            sb.deleteCharAt(j);
        }

        // Remove leading zeros
        int index = 0;
        while (index < sb.length() - 1 && sb.charAt(index) == '0') {
            index++;
        }
        sb.delete(0, index);

        // Add leading zeros if necessary
        if (sb.length() == 0) {
            sb.append("0");
        } else {
            while (sb.length() < S.length() - N) {
                sb.insert(0, "0");
            }
        }

        return sb.toString();
    }
}