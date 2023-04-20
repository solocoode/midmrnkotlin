class Wanafunzi(val name:String, val age:Int, val gender:String){

}

fun main(args: Array<String>) {
    val stu=Wanafunzi("Solomon",19,"Male")
    println("My name is ${stu.name} and I am ${stu.age} years old, I am ${stu.gender}")
}
//we are constructing based on the argument in the class