//read data
package read_data;

import java.io.*;
import java.util.Scanner;
        
public class Read_data {

    public static void main(String[] args)throws Exception{
        //create a file instance
        File f = new File("C:\\Users\\12\\Desktop\\New folder\\40000.txt");
        //create a Scanner for the file
        Scanner input = new Scanner(f);
        //read data from a file
        while (input.hasNext()){
            String firstname = input.next();
            String midelname = input.next();
            String lastname = input.next();
            int score = input.nextInt();
            System.out.println(firstname+" "+midelname+" "+lastname+" "+score);
        }
//       close file
input.close();

    }
    
}
