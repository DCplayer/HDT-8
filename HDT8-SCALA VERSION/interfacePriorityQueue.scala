/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos - Ing. Douglas Barrios
* Christian Fernando Morales López - 15015
* 03/10/16 - SCALA VERSION OF INTERFACE interfacePriorityQueue
* Utiliza Comparable <E> de Java
 */

trait interfacePriorityQueue[E <: Comparable[E]] {

  def getFirst(): E

  def remove(): E

  def add(value: E): Unit

  def isEmpty(): Boolean

  def size(): Int

  def clear(): Unit
}
