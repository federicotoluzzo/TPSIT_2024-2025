// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class mana {

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

        int N = Integer.parseInt(next());
        int K = Integer.parseInt(next());

        int[] C = new int[N];
        for (int i = 0; i < N; ++i)
            C[i] = Integer.parseInt(next());

        long M = 0;


        // INSERT YOUR CODE HERE
/*
        int[] deck = new ArrayList<>();

        for (int card : C){
            deck.add(card);
        }

        int[] hand = {deck.remove(0), deck.remove(0)};

        for (int i = 0; i < K; ++i) {
            if(hand[0] < hand[1]) {
                M += hand[0];
                deck.add(hand[0]);
                hand[0] = deck.remove(0);
            } else {
                M += hand[1];
                deck.add(hand[1]);
                hand[1] = deck.remove(0);
            }
        }*/

        int top = 2;

        int card1 = 0;
        int card2 = 1;



        for (int i = 0; i < K; ++i) {
            if(top == N) {
                top = 0;
            }
            if(top == card1 || top == card2) {
                top++;
                if(top == card1 || top == card2) {
                    top++;
                }
            }

            if(C[card1] < C[card2]) {
                M += C[card1];
                card1 = top++;
            } else {
                M += C[card2];
                card2 = top++;
            }
        }

        writer.write(String.valueOf(M));
        writer.write('\n');

        writer.flush();
    }

    static String next() throws IOException {
        while (!scn.hasMoreTokens()) scn = new StringTokenizer(reader.readLine());
        return scn.nextToken();
    }

    static BufferedReader reader;
    static StringTokenizer scn;
}
