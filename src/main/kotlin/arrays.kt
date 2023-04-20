fun main(args: Array<String>) {
    var myarr= arrayOf("John", "Mike","Joan", "Solomon", 67, false, 't')
    var myarr1= arrayOf(3,33,9,7,5,1,0,5,7 )
    myarr[2]="Purity"
    println("My name is ${myarr[1]}")
    println("My name is "+myarr[2])
    println("My array size is "+myarr1.size)
    println("My sorted array is "+myarr1.sorted()   )
}