class Students{
//    member data
    val number:Int=9
    val number1:Int=78
//    member function
    fun calculateSquare():Int{
        return number*number
    }
    fun calculateDifference():Int{
        return number1-number
    }
    fun calculateDivision():Int{
        return number1/number
    }
    fun calculateSum():Int{
        return number1+number
    }
}

fun main(args: Array<String>) {
//    creating object
    val myobj=Students()
    println(myobj.calculateSquare())
    println(myobj.calculateDifference())
    println(myobj.calculateDivision())
    println(myobj.calculateSum())
}