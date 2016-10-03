import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {



        FileReader in = new FileReader("C:/test.txt");
        BufferedReader br = new BufferedReader(in);

        String[] temporal;
        String limitante = ",";
        String linea;
        while ((linea = br.readLine()) != null) {
            temporal = linea.split(limitante);

        }
        in.close();

    }
}