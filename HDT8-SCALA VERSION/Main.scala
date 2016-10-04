/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos - Ing. Douglas Barrios
* Christian Fernando Morales López - 15015
* 03/10/16 - SCALA VERSION OF CLASS MAIN
* Las librerias de Java son compatibles con Scala
*/

import java.nio._
import java.io._
import java.util._
import scala.collection.JavaConversions._

object main {

  def main(args: Array[String]) {
    val pacientes = new Vector[Paciente]()
    val in = new FileReader("C:/Users/ING MIGUEL MORALES/Documents/NetBeansProjects/HDT-8/HDT8-HEAPS/src/pacientes.txt")
    val br = new BufferedReader(in)
    var linea: String = null
    var temporal: Array[String] = null
    val limitante = ","
    while ((linea = br.readLine()) != null) {
      temporal = linea.split(limitante)
      val ultimo = temporal(2).charAt(0)
      pacientes.add(new Paciente(temporal(0), temporal(1), ultimo))
    }
    in.close()
    println("Se muestra la lista de pacientes segun su orden de ingreso")
    println("-------------------------------------------------------------------------------------------")
    for (i <- 0 until pacientes.size) {
      println(i + 1 + ". " + pacientes.get(i))
    }
    println("")
    println("Se muestra la lista de pacientes segun su orden de urgencia")
    println("-------------------------------------------------------------------------------------------")
    val pacientela = new VectorHeap[Paciente](pacientes)
    for (i <- 0 until pacientes.size) {
      println(i + 1 + ". " + pacientela.remove().toString)
    }
  }
}
