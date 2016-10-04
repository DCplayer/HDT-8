/**
 * Created by DiegoC on 02/10/2016.
 */
public class Paciente implements Comparable<Paciente> {
    public String nombre;
    public String diagnostico;
    public char prioridad;

    public Paciente(){
        
    }
    public Paciente(String nombre, String diagnostico, char prioridad){
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.prioridad = prioridad;
    }
    public char getPrioridad() {
        return prioridad;
    }
    
    public void setter(String nombre, String diagnostico, char prioridad){
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.prioridad = prioridad;
    }            

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Paciente o) {
        int propio = (int)this.prioridad;
        int ajeno = (int)o.getPrioridad();
        if(propio >= ajeno){
            return 0;
        }else{
            return 1;
            }

    }
    
    public String toString(){
        return this.nombre + this.diagnostico + String.valueOf(this.prioridad);
    }
}
