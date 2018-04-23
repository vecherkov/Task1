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
        int[] arrayOld = t.clone();
        for(int i = t.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( t[j] > t[j+1] ){
                int tmp = t[j];
                t[j] = t[j+1];
                t[j+1] = tmp;
            }
        }
    }
        for (int i = 0; i < arrayOld.length; i++) {
            if(arrayOld[i] == t[0])
            return i+1;
        }
        return 1;
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