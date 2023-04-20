fun main(args: Array<String>) {
//    if statement
    var num = 5
    if (num < 20) {
        println("its true")
    }
//    if........else statement
    var num2 = 5
    if (num2 > 20) {
        println("its true")
    } else
        println("its false")
//    if elseif...else statement
    var nambari=23
    if (nambari<0){
        println("it is negative")
    }else if (nambari>0 && nambari<10){
        println("its a single digit number")
    }else if (nambari>=10  && nambari<100) {
        println("its a double digit number")
    }else
        println("number has 3 or more digits")
}