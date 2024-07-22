import java.io.File;

public class FileOrDirectoryChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileOrDirectoryChecker <path>");
            return;
        }

        String path = args[0];
        File fileOrDir = new File(path);

        if (fileOrDir.exists()) {
            if (fileOrDir.isFile()) {
                System.out.println("File size: " + fileOrDir.length() + " bytes");
            } else if (fileOrDir.isDirectory()) {
                System.out.println("Files in directory " + path + ":");
                File[] files = fileOrDir.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
                        }
                    }
                }
            } else {
                System.out.println("Specified path is neither a file nor a directory.");
            }
        } else {
            System.out.println("File or directory not found: " + path);
        }
    }
}
