package Lesson16;


import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\Lias_\\IdeaProjects\\JavaLessons\\Hello");
        if (!startDir.exists()) {
            startDir.mkdir();
        }

        File dir = new File("C:\\Users\\Lias_\\IdeaProjects\\JavaLessons\\");

        File[] allFilesFromDir = dir.listFiles();
        for(File f: allFilesFromDir) {
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("------");
        File[] customFilesFromDir = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().endsWith(".iml")) {
                    return true;
                } return false;
            }
        });
        for (File f: customFilesFromDir) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
