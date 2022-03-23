package jread;

import java.io.*;
//write

public class Jread {

    public static void main(String[] args) {
        try (FileWriter f = new FileWriter("D:\\New folder\\1.txt");) {
            f.write("sadik  " + 500 + " " + 100 + "\n " + 200 + " " + 000 + "\n " + 600);//aga obj

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
