// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class indexing {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // uncomment the two following lines if you want to read/write from files
        // fin = new FileInputStream("input.txt");
        // fout = new FileOutputStream("output.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
        reader = new BufferedReader(new InputStreamReader(fin));
        scn = new StringTokenizer(reader.readLine());

        String A = next();

        String B = next();

        StringBuilder C = new StringBuilder();


        // INSERT YOUR CODE HERE

        int i = 0;

        while ((i < A.length() && i < B.length()) && A.charAt(i) == B.charAt(i)){
            C.append(A.charAt(i));
            i++;
        }

        char c = ' ';

        if(A.length() == i) {
            if(A.length() == B.length() - 1){
                writer.write("-1");
                writer.write("\n");
                writer.flush();
            } else{
                writer.write(C.toString());
                writer.write(B.charAt(i));
                writer.write("\n");
                writer.flush();
            }

        } else {
            if((int)A.charAt(i) - (int) B.charAt(i) >= 2) {
                c = (char)(((int)B.charAt(i) + (int) A.charAt(i)) / 2);
                writer.write(C.toString() + c);
                writer.write('\n');
                writer.flush();
            } else {
                C.append((char) (((int) B.charAt(i) + (int) A.charAt(i)) / 2));
                writer.write(C + "z");
                writer.write('\n');
                writer.flush();
            }
        }

        writer.flush();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
