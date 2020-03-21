import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int nTest = Integer.parseInt(in.readLine());
        for (int i = 0; i < nTest; i++) {

            String[] TestCase = in.readLine().split(" ");

            int n = Integer.parseInt(TestCase[0]);
            int p = Integer.parseInt(TestCase[1]);
            /*
            int[] scores = Arrays.stream(Arrays.copyOfRange(TestCase,2,TestCase.length)).mapToInt(Integer::parseInt).toArray();
             */
            int[] scores = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(scores);
            int answer = Solver.solve(n, p, scores);
            System.out.println("Case #" + (i+1) + ": " +answer);

        }
    }
}
class Solver{
    public static int solve(int n, int p, int[] scores) {
        int min_time = 10000;
        for (int i = 0; i < n-p+1; i++) {
            int[] div = Arrays.copyOfRange(scores,i,i+p);
            int time = p * div[div.length - 1] - IntStream.of(div).sum();
            if (min_time > time){
                min_time = time;
            }
        }
        return min_time;
    }

}
