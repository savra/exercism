object ScrabbleScore {
    fun scoreLetter(c: Char): Int {
        if ("AEIOULNRST".contains(c, true)) {
            return 1;
        } else if ("DG".contains(c, ignoreCase = true)) {
            return 2;
        } else if ("BCMP".contains(c, ignoreCase = true)) {
            return 3;
        } else if ("FHVWY".contains(c, ignoreCase = true)) {
            return 4;
        } else if ("K".contains(c, ignoreCase = true)) {
            return 5;
        } else if ("JX".contains(c, ignoreCase = true)) {
            return 8;
        } else if ("QZ".contains(c, ignoreCase = true)) {
            return 10;
        } else return 0;
    }

    fun scoreWord(word: String): Int {
        var result = 0

        for (i in word.indices) {
            result += scoreLetter(word[i]);
        }

        return result
    }
}