package com.tom

fun main(args: Array<String>) {
    val h = Human()
    h.Hello()

    //參照資料型態 val & var
    //val一旦給了數值就不能改變，var可以改變數值
    var age = 19;
    age = 20;
    var weight : Float = 66.5f;
    //name在13行才要給值，必須在12行給資料型態，在冒號後面打資料型態 name :
    var name : String;
    name = "Jack"

}

class Human {
    fun Hello() {
        println("Hello kotlin")
    }
}