

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Vector;

public class VectorHeapTest {
    @Test
    public void testAdd(){

        Vector<Paciente> pacientes = new Vector<Paciente>();

        Paciente paciente = new Paciente ("Christian Diaz", "Dolor de estomago", 'C');
        VectorHeap<Paciente> hospital = new VectorHeap<Paciente>(pacientes);
        hospital.add(paciente);
        Paciente Resultado = hospital.getFirst();
        assertEquals(Resultado, paciente);

    }

    @Test
    public void testRemove()
    {
        Vector<Paciente> pacientes = new Vector<Paciente>();


        Paciente paciente = new Paciente ("Christian Diaz", "Dolor de estomago", 'C');
        VectorHeap<Paciente> hospital = new VectorHeap<Paciente>(pacientes);
        hospital.add(paciente);
        Paciente Resultado = hospital.remove();
        assertEquals(Resultado, paciente);

    }
}
