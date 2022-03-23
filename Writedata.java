//write data 476
package writedata;

import java.io.*;
public class Writedata {
    
    public static void main(String[] args)throws IOException{
        File f =new File ("C:\\Users\\12\\Desktop\\New folder\\40000.txt");//File class tai F boro hater
        if (f.exists()) {
            System.out.println("File alrady exists");
            System.exit(1);
        }
       //create a file
       PrintWriter output = new PrintWriter(f);
       //writ formatted output to the file
       output.print("sadik hasan bogura");
       output.println(50000);
       output.print("rana vai bogura");
       output.println(60000);
       //close the file
       output.close();
    }
    
}
