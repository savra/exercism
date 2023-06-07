fun transcribeToRna(dna: String): String = dna.splitToSequence("").map { s: String ->
    when (s) {
        "G" -> "C"
        "C" -> "G"
        "T" -> "A"
        "A" -> "U"
        else -> { ""
        }
    }
}.joinToString("")

