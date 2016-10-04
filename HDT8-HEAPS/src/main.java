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

public class main {

    public static void main(String[] args) throws IOException {

        Paciente pas = new Paciente();
        VectorHeap pacientela = new VectorHeap(pas);
        pacientela.clear();

        FileReader in = new FileReader("C:/Users/ING MIGUEL MORALES/Documents/NetBeansProjects/HDT-8/HDT8-HEAPS/src/pacientes.txt");
        BufferedReader br = new BufferedReader(in);

        String[] temporal;
        String limitante = ",";
        String linea;
        while ((linea = br.readLine()) != null) {
            temporal = linea.split(limitante);
            char ultimo = temporal[2].charAt(0);
            pas.setter(temporal[0], temporal[1], ultimo);
            pacientela.add(pas);
            linea = br.readLine();
        }
        in.close();
        
        //Showing in order
        
        System.out.println(pacientela.getFirst().toString());

    }
}