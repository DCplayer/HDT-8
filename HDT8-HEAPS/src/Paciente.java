/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos - Ing. Douglas Barrios
* Christian Fernando Morales López - 15015
* Diego Castañenda - 15151
* 03/10/16 - CLASS PACIENTE
*/

public class Paciente implements Comparable<Paciente> {

    /**
     * Atributo para el nombre
     */
    public String nombre;

    /**
     * Atributo para el diagnostico
     */
    public String diagnostico;

    /**
     * Atributo para la prioridad, dado por las letras
     */
    public char prioridad;

    /**
     * metodo constructor del paciente
     * @param nombre
     * @param diagnostico
     * @param prioridad
     */
    public Paciente(String nombre, String diagnostico, char prioridad){
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.prioridad = prioridad;
    }

    /**
     * metodo que obtiene la prioridad
     * @return caracter de la prioridad
     */
    public char getPrioridad() {
        return prioridad;
    }       

    /**
     * metodo que obtiene el diagnostico
     * @return devuelve un string con el diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * devuelve el nombre
     * @return un string con el nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    /**
     * metodo para determinar cual es el mas grande, mediante los codigos ascii de los caracteres
     */
    public int compareTo(Paciente o) {
        int propio = (int)this.prioridad;
        int ajeno = (int)o.getPrioridad();
        if(propio >= ajeno){
            return 0;
        }else{
            return 1;
            }

    }
    
    @Override
    /**
     * metodo para poder imprimir los datos del paciente
     */
    public String toString(){
        return this.nombre + "," +this.diagnostico + ", " + String.valueOf(this.prioridad);
    }
}
