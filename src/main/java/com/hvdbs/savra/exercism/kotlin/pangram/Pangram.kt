import java.util.*
import java.util.regex.Pattern

object Pangram {
    private val A_ASCII_CODE = 97

    fun isPangram(input: String): Boolean {
        val result = IntArray(26)
        var isPangram = true

        input.replace(Pattern.compile("[^a-zA-Z]").toRegex(), "")
            .lowercase(Locale.getDefault())
            .forEach { chr ->
                if ((chr.code) in A_ASCII_CODE..A_ASCII_CODE + 26) {
                    result[chr.code - A_ASCII_CODE] = 1
                }
            }

        result.forEach { v ->
            if (v != 1) {
                isPangram = false
            }
        }

        return isPangram
    }
}
