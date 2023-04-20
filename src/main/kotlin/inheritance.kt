open class MyParentClass{
    val dad="He likes playing soccer"
    val mum="She likes cooking"
}
class MyBoyClass:MyParentClass(){
    fun Myboy(){
        println(dad)
    }
}
class MyGirlClass:MyParentClass(){
    fun Mygirl(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val kijana=MyBoyClass()
    kijana.Myboy()
    val  msichana=MyGirlClass()
    msichana.Mygirl()
}