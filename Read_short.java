package read_short;

//import java.io.FileReader;
import java.io.*;

public class Read_short {

    public static void main(String[] args) {
//        try ( FileWriter write = new FileWriter("D:\\New folder\\rr.dat");) {
//            write.write("sadik " + 100 +"\n");
//            write.write("Ali " + 1001);
//
//        } catch (Exception e) {
//        }
        char[] readAr = new  char[100];//100 charter rakbo
        try (FileReader read = new FileReader("D:\\New folder\\rr.dat");){
            read.read(readAr);
            System.out.println(readAr);
        } catch (Exception e) {
//            System.out.println("file not found");
        }

    }

}
