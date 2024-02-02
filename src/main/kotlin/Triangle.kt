class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init{
        require (a.toDouble() + b.toDouble() > c.toDouble()) { "a + b > c" }
        require (a.toDouble() + c.toDouble() > b.toDouble()) { "a + c > b" }
        require (c.toDouble() + b.toDouble() > a.toDouble()) { "c + b > a" }
    }

    val isEquilateral: Boolean = a == b && b == c
    val isIsosceles: Boolean =  a == b || b == c || a == c
    val isScalene: Boolean = a != b && b != c && a != c
}
