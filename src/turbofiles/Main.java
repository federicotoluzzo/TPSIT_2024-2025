package turbofiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAX_THREADS = 24;
        final int N_ITERATIONS = 100 * (int) Math.pow(2, 10); // 100GiB total
        Thread[] threads = new Thread[MAX_THREADS];

        for (int j = MAX_THREADS; j > 0; j--) {
            String mainFolder = "files/" + j;
            createFolder(mainFolder); // Create the main folder for this iteration

            long start = System.currentTimeMillis();
            for (int i = MAX_THREADS - 1; i >= 0; i--) {
                int finalI = i;
                int finalJ = j;
                threads[i] = new Thread(() -> {
                    for (int k = N_ITERATIONS * finalI / finalJ; k < N_ITERATIONS * (finalI + 1) / finalJ; k++) {
                        String subFolder = mainFolder + "/" + k;
                        createFolder(subFolder);
                        createFile(subFolder, (int) Math.pow(2, 20));
                    }
                });
                threads[i].start();
            }

            for (int i = 0; i < j; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            long end = System.currentTimeMillis();
            System.out.printf("Tempo impiegato per scrivere 100GiB di dati con %d thread: %d secondi%n", j, (end - start) / 1000);

            // Delete the main folder and its contents after the iteration
            deleteFolder(new File(mainFolder));
        }
    }

    public static void createFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs(); // Create the directory structure if it does not exist
        }
    }

    public static void createFile(String path, int size) {
        createFolder(path); // Ensure the directory exists
        File file = new File(path + "/numeri.txt");

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < size; i++) {
                writer.write(' ');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFolder(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file); // Recursively delete subfolders and files
                }
            }
        }
        folder.delete(); // Delete the folder itself
    }
}
