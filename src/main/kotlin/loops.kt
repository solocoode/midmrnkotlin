fun main(args: Array<String>) {
//    for loops
    for (i in 5..9){
        println(i)
    }
    var myarray= arrayOf("erick", 8, true, 'g')

    for (jina in myarray){
        println(jina)
    }
//    while loop
    var num2=10
    while (num2>=5){
        println("loop: $num2")

        num2--
    }
    var num3=5
    while (num3<=10){
        println("loops: $num3")

        num3++
    }
}