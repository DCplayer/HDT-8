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

object Main {

  def main(args: Array[String]) {
    val pacientela = new Vector()
    val in = new FileReader("C:/test.txt")
    val br = new BufferedReader(in)
    var temporal: Array[String] = null
    val limitante = ","
    var linea: String = null
    while ((linea = br.readLine()) != null) {
      temporal = linea.split(limitante)
      val ultimo = temporal(2).charAt(0)
      val paci = new Paciente(temporal(0), temporal(1), ultimo)
      pacientela.addElement(paci)
      linea = br.readLine()
    }
    in.close()
  }
}
