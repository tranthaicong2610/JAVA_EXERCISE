package session10.baitap.b2;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingStream(File source , File dest ) throws IOException {
        InputStream is = null ;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length ;
            while((length= is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter source file :");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file :");
        String destPath = in.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
//            if (sourceFile.exists()){
//                System.out.println("ao that");
//                throw new IOException();
//            }
//            if(!destFile.exists()){
//                throw new IOException();
//            }
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        }
        catch (IOException e){
            System.out.println("file nguon chua ton tai hoac file dich da ton tai");
            e.printStackTrace();
        }
    }
    // D:\BaiTap\java_exercise\JAVA_EXERCISE\file_test_read_write\test10_bt_b2.txt
    // D:\BaiTap\java_exercise\JAVA_EXERCISE\file_test_read_write\test10_bt_b2_detination.txt
}
