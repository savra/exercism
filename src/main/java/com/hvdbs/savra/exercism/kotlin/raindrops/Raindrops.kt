object Raindrops {

    fun convert(n: Int): String {
        var result = ""

        if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
            return n.toString()
        }

        if (n % 3 == 0) {
            result += "Pling"
        }

        if (n % 5 == 0) {
            result += "Plang"
        }

        if (n % 7 == 0) {
            result += "Plong"
        }

        return result
    }
}
