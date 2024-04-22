package oops

fun main() {

    val c = Car()
    println(c.hasEngine())


}

open class Vehicle {

    open fun hasEngine() : Boolean {
        return true
    }
}

class Car : Vehicle() {

    override fun hasEngine(): Boolean {
        return super.hasEngine()
    }
}

class Student(val name: String)

class Course(val title: String)