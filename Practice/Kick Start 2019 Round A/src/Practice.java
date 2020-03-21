import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int nTest = Integer.parseInt(in.readLine());
        for (int i = 0; i < nTest; i++) {
            String[] TestCase = in.readLine().split(" ");

            int n = Integer.parseInt(TestCase[0]);
            int m = Integer.parseInt(TestCase[1]);
            int[] scores = Arrays.stream(Arrays.copyOfRange(TestCase,2,TestCase.length)).mapToInt(Integer::parseInt).toArray();

            int answer = Solver.solve(n, m, scores);

        }
    }
}
class Solver{
    public static int solve(int n, int m, int[] scores) {
        int answer = 0;
        return answer;
    }

}
