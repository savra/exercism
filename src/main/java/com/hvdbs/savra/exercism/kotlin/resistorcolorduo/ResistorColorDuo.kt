
object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return colors.asSequence()
            .take(2)
            .map { color: Color -> color.ordinal }
            .joinToString("")
            .toInt()
    }
}
