object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val m: MutableMap<String, String> = LinkedHashMap()
        m["00001"] = Signal.WINK.name
        m["00010"] = Signal.DOUBLE_BLINK.name
        m["00100"] = Signal.CLOSE_YOUR_EYES.name
        m["01000"] = Signal.JUMP.name
        m["10000"] = "REVERSE"

        val result: MutableList<Signal> = ArrayList()

        for (i in m.entries) {
            val mask = Integer.parseUnsignedInt(i.key, 2)

            if (number and mask == mask) {
                when (i.value) {
                    "REVERSE" -> return result.reversed()
                    else -> result.add(Signal.valueOf(i.value))
                }
            }
        }

        return result
    }
}
