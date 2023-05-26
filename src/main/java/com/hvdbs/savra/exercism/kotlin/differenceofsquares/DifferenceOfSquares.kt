import kotlin.math.ceil
import kotlin.math.pow

class Squares(val n: Int) {
    fun sumOfSquares(): Int {
        var sum = 0;

        for(i in 1..n) {
            sum += i.toDouble().pow(2.0).toInt()
        }

        return sum;
    }

    fun squareOfSum(): Int {
        var tmp = (1 + n) * (n / 2)

        if (n % 2 != 0) {
            tmp += ceil(n / 2.0).toInt()
        }

        return tmp.toDouble().pow(2).toInt()
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
