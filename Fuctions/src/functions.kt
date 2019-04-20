fun main(args: Array<String>) {

    printThiss()
    println(summ(2,3))
    println(summ2(4))
    println(summ2(4,6))
    println(summ2(b = 2, a = 4))
    println(divide(23F))
    println(divide(numerator = 23F,denominator = 21F))

}


fun printThiss(){
    println("hello")
}

fun summ(a:Int,b:Int):Int{

    return a+b
}
fun summ2(a:Int,b:Int = 3):Int{

    return a+b
}
fun divide(numerator:Float,denominator:Float=1F):Float{
    return numerator/denominator
}