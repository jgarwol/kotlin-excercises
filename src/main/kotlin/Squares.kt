import java.lang.Math.abs

class Squares(val n : Int) {

    fun sumOfSquares() : Int {
        return (1..n).map { v -> v*v }.sum()
    }

    fun squareOfSum() : Int {
        val sum = (1..n).sum()
        return sum*sum
    }

    fun difference() : Int {
        return abs(squareOfSum()-sumOfSquares())
    }
}