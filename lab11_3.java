import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriterDemo {
    public static void main(String[] args) {
        String filename = "binaryfile.dat";
        int fileSize = 1000000; // 1 MB
        int bufferSize = 1024; // 1 KB

        Thread writerThread = new Thread(new FileWriterTask(filename, fileSize, bufferSize));
        writerThread.start();

        // Demonstrate interrupting the thread
        try {
            Thread.sleep(100); // Wait for a while before interrupting
            writerThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrate joining the thread
        try {
            writerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File writing completed.");
    }

    static class FileWriterTask implements Runnable {
        private String filename;
        private int fileSize;
        private int bufferSize;

        public FileWriterTask(String filename, int fileSize, int bufferSize) {
            this.filename = filename;
            this.fileSize = fileSize;
            this.bufferSize = bufferSize;
        }

        @Override
        public void run() {
            try (FileOutputStream fos = new FileOutputStream(filename)) {
                byte[] buffer = new byte[bufferSize];
                int bytesWritten = 0;

                while (bytesWritten < fileSize && !Thread.currentThread().isInterrupted()) {
                    fos.write(buffer);
                    bytesWritten += bufferSize;
                    Thread.yield(); // Yield control to other threads
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
