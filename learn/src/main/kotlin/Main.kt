#!/usr/bin/env kotlin

import com.sun.tools.javac.code.TypeAnnotationPosition.field

fun main () {
//    println("hello world")
//
//    var a: Byte = Byte.MIN_VALUE
//    var b: Byte = Byte.MAX_VALUE
//    println("smallest byte value : " + a)
//    println("largest byte value : " + b)
//
//    var a1: Short = Short.MIN_VALUE
//    var b1: Short = Short.MAX_VALUE
//    println("smallest Short value : " + a1)
//    println("largest Short value : " + b1)
//
//    var a2: Int = Int.MIN_VALUE
//    var b2: Int = Int.MAX_VALUE
//    println("smallest Int value : " + a2)
//    println("largest Int value : " + b2)
//
//    var a3: Long = Long.MIN_VALUE
//    var b3: Long = Long.MAX_VALUE
//    println("smallest Long value : " + a3)
//    println("largest Long value : " + b3)
//
//    var a4: Float = Float.MIN_VALUE
//    var b4: Float = Float.MAX_VALUE
//    println("smallest Float value : " + a4)
//    println("largest Float value : " + b4)
//
//    var a5: Double = Double.MIN_VALUE
//    var b5: Double = Double.MAX_VALUE
//    println("smallest Double value : " + a5)
//    println("largest Double value : " + b5)
//
//    var id: Int = 1
//    var name = "Ayman"
//    id = 2
//    name = "asser"
//    println(id)
//    println(name)
//    println("my id: ${id}, name: $name")
//    var x: Int = 100
//    var y: Int = 2
//    println(x + y)
//    println(x - y)
//    println(x * y)
//    println(x / y)
//    println(x % y)
//    x += 2
//    x -= 2
//    x *= 2
//    x /= 2
//    x %= 2
//    println(x)



//    val age = 27
//    if (age < 23 && age > 0){
//        if(age <= 12){
//            println(" age = $age its abteday")
//        }else if (age <= 15){println(" age = $age its a3dady")}
//        else if (age <= 18){println(" age = $age its thanwii")}
//        else if (age <= 23){println(" age = $age its gam3a")}
//    } else if (age >= 23 && age<= 26){
//        println(" age = $age its gesh")
//    } else {
//        if (age < 0){
//            println(" age = $age its not real")
//        }else {
//            println(" age = $age its on career")
//        }
//    }



//    var num = 1
////    while (num <= 10){
////        println(num)
////        num++
////    }
//    do{
//        println(num)
//        num++
//    } while (num <= 10)



//    val names = arrayOf("Ahmed", "Ayman", "Harley", "Henkley")
//    val ages = arrayOf(11, 15, 20, 90)
//    val nums : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val cars : Array<String> = arrayOf("dkhjs", "kjk", "skjck", "skjks")
//    names[0] = "Asser"
//    println(names[0])
//    println(names[1])
//    println(names[2])
//    println(names[3])
//    println(ages[0])
//    println(ages[1])
//    println(ages[2])
//    println(ages[3])
//    println(ages[4])
//    println(names.size)


//    val name = "Asser"
//    println(name[0])
//    println(name[1])
//    println(name[2])
//    println(name[3])
//    println(name[4])
//
//    println(name.length)
////    println(name.toUpperCase())
////    println(name.toLowerCase())
//    println(name.contains("Asser"))
//    println(name.startsWith("A"))
//    println(name.endsWith("r"))
//    println(name == "Asser")




//    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
//    val names: Array<String> = arrayOf("ahmed", "ayman", "abdelfath")
//    for (number in numbers) {
//        println(number)
//    }
//    for (i in 1..5){
//        println(i)
//    }
//    for (name in names){
//        println(name)
//    }
//    for (i in names.indices){
//        println(names[i])
//    }
//    for (i in 1 until 5){
//        println(i)
//    }



//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//    println(add(1, 2))
//    fun fullName(fName: String,sName: String, lName: String): String {
//        return "$fName $sName $lName"
//    }
//    println(fullName("ahmed", "ayman", "khalil"))
//    fun person(fName: String, lName: String, age: Int) {
//        println("-name: $fName $lName -age: $age")
//    }
//    person("Asser", "Farouk", 50)
//    fun isAdult(age: Int): Boolean{
//        return age >= 18
//    }
//    println(isAdult(17))
//    val lambdaAdd = {a: Int, b: Int -> a + b}
//    println(lambdaAdd(10, 20))
//    val lambdaSub = {a: Int, b:Int -> a-b}
//    println(lambdaSub(10, 20))
//    val lambdaMult ={a: Int, b: Int -> a*b}
//    println(lambdaMult(10, 20))
//    val lambdaDiv = {a: Int, b:Int -> a/b}
//    println(lambdaDiv(10, 20))
//    val test : (String) -> String = {name -> "$name correct"}
//    val test2 : (Int) -> String = {age -> "$age correct"}
//    val name1 = listOf(1, 2, 3, 4, 5)
//    val name2 = mutableListOf(1, 2, 3, 4, 5)
//    name2.add(6)
//    name2.add(7)
//    name2[0] = 2
//    name2.remove(6)
//    println(name2.contains(2))
//    val numbers1 = setOf(10, 20, 30, 20, 10)
//    val numbers2 = mutableSetOf(10, 20, 30)
//    numbers2.add(50)
//    numbers2.remove(10)
//    println(numbers2)
//    val a = setOf(1, 2, 3, 4, 5)
//    val b = setOf(4,5,6,7,8)
//    println(a union b)
//    val user = mapOf(
//        "id" to 1,
//        "fName" to "ahmed",
//        "lName" to "ayman"
//    )
//    println(user["id"])
//    println(user["fName"])
//    println(user["lName"])
//    println(user.keys)
//    println(user.values)
//
//    val users = mapOf(
//        1 to "Ayman",
//        2 to "Asser",
//        3 to "remo"
//    )
//    val users2 = mutableMapOf(
//        1 to "Ayman",
//        2 to "Asser",
//        3 to "remo"
//    )
//    users2[3] = "rahem ahmed"
//    users2[4] = "hazem elshopky"
//    users2.remove(3)
//    println(users.containsKey(5))
//    println(users.containsKey(3))
//    println(users.containsValue("Ayman"))
//    for ((id, name) in users2) {
//        println("$id -> $name")
//    }
//    for(id in users2.keys) {
//        println("$id -> $id")
//    }
//    for(name in users2.values){
//        println("$name")
//    }
//    val numbersTest = listOf(10, 20, 30, 40, 50, 60, 70, 80)
//    numbersTest.forEach {
//        println(it)
//    }
//    val results = numbersTest.map { it * 1.10 }
//    val results2 = numbersTest.filter {it % 2 == 0}
//    val result3 = numbersTest.filter {it >= 40} .map { it * 10 }
//    println(";ksmcsjonjdnskjnhde")
//    println(result3)
//    val result4 = numbersTest.find {it > 70}
//    val result5= numbersTest.any{it > 80}
//    val result6= numbersTest.all{it > 5}
//    val result7 = numbersTest.sorted()
//    val result8 = numbersTest.sortedDescending()

//    class Student(
//        val name: String,
//        val age: Int
//    )
//    val student = Student("John", 28)
//    println(student.name)
//    println(student.age)
////    student.age = 1
////    student.name = "jony"
//    class Student2(
//    var name: String,
//    var age: Int
//    )
//    val student2 = Student2("ahmed", 24)
//    student2.age = 23
//    student2.name = "ayman"
//    println(student2.name)
//    println(student2.age)
//    class Rectangle(
//        val width: Int,
//        val height: Int
//    ){
//        val area: Int
//            get() = width * height
//    }
//    class Rectangle2(
//        val width: Int,
//        val height: Int
//    ){
//        val area: Int
//            get() = width * height
//    }
//    class Rectangle3(
//        val width: Int,
//        val height: Int
//    ){
//        val area: Int
//            get() = width * height
//    }
//    class Rectangle4(
//        val width: Int,
//        val height: Int
//    ){
//        val area: Int
//            get() = width * height
//    }
//    val rectangle = Rectangle(10,20)
//    println(rectangle.area)
//    class Person{
//        var age:Int = 0
//        set(value) {
//            if (value <= 0){
//                field = value
//            }
//        }
//    }
//    val person = Person()
//    person.age = 25
//    person.age = -25
//    println(person.age)
//    class Account{
//        private var balance = 0
//        fun deposit(amount: Int) {
//            balance += amount
//        }
//    }
//    val account = Account()
//    account.deposit(100)
//    open class Animal{
//        open fun sound (){
//            println("animal sound")
//        }
//    }
//    class Dog : Animal() {
//        override fun sound() {
//            println("dog sound")
//        }
//    }



    class Car {
        var brand : String = ""
        var model: String = ""
        var year : Int = 0
        fun getInfo(): String{
            return "-brand $brand, -model $model, -year $year"
        }

    }
    val myCar = Car()
    myCar.brand = "toyota"
    myCar.model = "hulix"
    myCar.year = 2020
    println(myCar.getInfo())

    class Phone {
        var model: String = ""
        var year: Int = 0
        fun getInfo(): String{
            return "-model $model, -year $year"
        }
    }

    val myPhone = Phone()
    myPhone.model = "iphone 17 pro max"
    myPhone.year = 2025
    println(myPhone.getInfo())

    class Company{
        var name: String = "abc"
            get() = field
            set(value) { field = value }
        fun updateName(newName:String){
            name = newName
        }
    }
    val myCompany = Company()
    myCompany.name="Hulix"
    println(myCompany.name)
    myCompany.updateName("hmada")
    println(myCompany.name)

    class User{
//        mail get lower, set trim -- pass set > 6 -- age > 0
        var mail: String = ""
            get() = field.lowercase()
         set(value) {
            field = value.trim()
        }
        var password: String = ""
            set(value) {
                if (value.length >= 6) field = value else field = "plase pass more than 6 characters"
            }
        var age : Int = 0
            set(value) {
                field = if (value > 0) value else 0
            }
        var gender : Char = 'u'

        fun getInfo(): String{
            return "-username $mail, -pass $password, -age $age -gender $gender"
        }
    }
    val myUser = User()
    myUser.mail ="Hulix@gmail.com"
    myUser.password = "jkdnj"
    myUser.age = 23
    myUser.gender = 'f'
    println(myUser.getInfo())
    println(myUser.mail)
    println(myUser.password)
    println(myUser.age)

    class Add{
        var c : Int = 0
        constructor(a: Int, b: Int){
            c = a + b
        }
    }
    val myAdd = Add(50, 100)
    println(myAdd.c)

}