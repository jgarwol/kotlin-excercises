import java.time.LocalDateTime

fun main(args: Array<String>) {
    val diff = Squares(10).difference()
    println(diff)
    //println(ScrabbleScore.scoreWord("dupa"))
    //println(Gigasecond(LocalDateTime.of(2015, 1, 24, 22, 0,0)).date)

}

fun twofer(name: String = "you"): String {
    return "One for $name, one for me"
}

fun zipit(str1:String, str2:String) : String{
    var distance = 0
    var result : String = ""
    for (p in str1.zip(str2)){
        result = result + p.first + p.second
    }
    return result
}

fun compute(leftStrand: String, rightStrand: String): Int {
    var distance = 0
    for (p in leftStrand.zip(rightStrand)) {
        if (p.first != p.second) distance++
    }
    return distance
}
