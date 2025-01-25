package turbofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int N_THREADS = 1;
        final int N_ITERATIONS = 10 * (int) Math.pow(2, 10);
        Thread[] threads = new Thread[N_THREADS];
        long start = System.currentTimeMillis();
        for (int i = 0; i < N_THREADS; i++) {
            int finalI = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = N_ITERATIONS * finalI / N_THREADS; j < N_ITERATIONS * (finalI + 1) / N_THREADS; j++) {
                        makeFolder("C:\\Users\\federico.toluzzo\\IdeaProjects\\TPSIT_2024-2025\\src\\turbofiles\\files", String.valueOf(j));
                        makeFile(String.valueOf(j), (int) Math.pow(2, 20));
                    }
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < N_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long end = System.currentTimeMillis();

        System.out.printf("Tempo impiegato : %d secondi", (end - start)/1_000);
    }

    public static void makeFolder(String path, String name){
        File folder = new File(path + "/" + name);
        folder.mkdir();
    }

    public static void makeFile(String path, int size){
        FileWriter file = null;
        try {
            file = new FileWriter("C:\\Users\\federico.toluzzo\\IdeaProjects\\TPSIT_2024-2025\\src\\turbofiles\\files\\" + path + "\\numeri.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Random r = new Random();
        for (int i = 0; i < size; i++){
            try {
                file.write(' ');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
