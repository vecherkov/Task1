import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the solve function below.
     */
    private static int solve(int[] t) {

        int id = 0;
        int countMax = 0;
        int count = 0;

        for (int i = t.length-1; i > 0; i--) {
            if (t[i] >= t[i-1]) {
                count++;
            } else {
                if(countMax < count){
                    countMax = count;
                    count = 0;
                    id = i;
                }

            }
        }

        return id+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int tCount = Integer.parseInt(scanner.nextLine().trim());

        int[] t = new int[tCount];

        String[] tItems = scanner.nextLine().split(" ");

        for (int tItr = 0; tItr < tCount; tItr++) {
            int tItem = Integer.parseInt(tItems[tItr].trim());
            t[tItr] = tItem;
        }

        int id = solve(t);
        System.out.println(id);

/*        bufferedWriter.write(String.valueOf(id));
        bufferedWriter.newLine();

        bufferedWriter.close();*/
    }
}