/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos - Ing. Douglas Barrios
* Christian Fernando Morales López - 15015
* 03/10/16 - SCALA VERSION OF CLASS PACIENTE
*/

class Paciente(var nombre: String, var diagnostico: String, var prioridad: Char)
    extends Comparable[Paciente] {

  def getPrioridad(): Char = prioridad

  def getDiagnostico(): String = diagnostico

  def getNombre(): String = nombre

  override def compareTo(o: Paciente): Int = {
    val propio = this.prioridad.toInt
    val ajeno = o.getPrioridad.toInt
    if (propio >= ajeno) {
      0
    } else {
      1
    }
  }

  override def toString(): String = {
    this.nombre + "," + this.diagnostico + ", " + String.valueOf(this.prioridad)
  }
}
