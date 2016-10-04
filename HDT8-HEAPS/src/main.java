import java.nio.*;
import java.io.*;
import java.util.*;

/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos - Ing. Douglas Barrios
* Christian Fernando Morales López - 15015
* Diego Castañenda - 15151
* 03/10/16 - CLASS MAIN
*/

public class main {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Vector<Paciente> pacientes = new Vector<Paciente>();

        FileReader in = new FileReader("C:/Users/ING MIGUEL MORALES/Documents/NetBeansProjects/HDT-8/HDT8-HEAPS/src/pacientes.txt");
        BufferedReader br = new BufferedReader(in);
        String linea;

        String[] temporal;
        String limitante = ",";
        while ((linea = br.readLine()) != null) {
            temporal = linea.split(limitante);
            char ultimo = temporal[2].charAt(0);
            pacientes.add(new Paciente(temporal[0], temporal[1], ultimo));
        }
        in.close();
        
        //Showing patients input
        System.out.println("Se muestra la lista de pacientes segun su orden de ingreso");
        System.out.println("-------------------------------------------------------------------------------------------");
        for(int i =0; i < pacientes.size(); i++){
            System.out.println( i+1 + ". " + pacientes.get(i));
        }
        
        //Showing in order
        System.out.println("");
        System.out.println("Se muestra la lista de pacientes segun su orden de urgencia");
        System.out.println("-------------------------------------------------------------------------------------------");
        VectorHeap<Paciente> pacientela = new VectorHeap<Paciente>(pacientes);
        for(int i =0; i < pacientes.size(); i++){
            System.out.println( i+1 + ". " + pacientela.remove().toString());
        }        

    }
}