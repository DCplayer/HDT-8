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

        Vector pacientela = new Vector();

        FileReader in = new FileReader("C:/test.txt");
        BufferedReader br = new BufferedReader(in);

        String[] temporal;
        String limitante = ",";
        String linea;
        while ((linea = br.readLine()) != null) {
            temporal = linea.split(limitante);
            char ultimo = temporal[2].charAt(0);
            Paciente paci = new Paciente(temporal[0], temporal[1], ultimo);
            pacientela.addElement(paci);
            linea = br.readLine();
        }
        in.close();

    }
}