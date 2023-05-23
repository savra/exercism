import java.lang.IllegalArgumentException

object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) {
            throw IllegalArgumentException("left and right strands must be of equal length");
        }

        var result = 0;

        for (i in leftStrand.indices) {
            if (leftStrand.codePointAt(i) != rightStrand.codePointAt(i)) {
                result++;
            }
        }

        return result;
    }
}
