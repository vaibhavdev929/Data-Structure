fun g(a: Int, b: Int) = a + b

fun g1() {
    print("print data1")
}

fun g2(a: Int, b: Int) {
    print("print data2")
}

fun main(args: Array<String>) {
//     h2(::g2,::g1,::g)
    printLambda(::lambdai)
}

fun hi(lam: (Int, Int) -> Int, lam1: () -> Unit, lam2: () -> Unit) {
    println(lam(2, 3))
    lam1()
    lam2()
}

fun h2(lam1: (Int, Int) -> Unit, lam2: () -> Unit, lam3: (Int, Int) -> Unit) {

}

val lambda: (a: Int, b: Int) -> Unit = { a, b ->
    
}

fun lambdai(a: Int, b: Int) {
    println(a + b)
}

fun printLambda(lam: (Int, Int) -> Unit) {
    lam(3, 4)
}