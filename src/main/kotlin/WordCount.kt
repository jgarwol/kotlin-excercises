object WordCount {

    fun phrase(phrase: String): Map<String, Int> {

        return phrase.split("[\\s,]+".toRegex())
            .map { it.lowercase()
                .replace("[^a-z0-9']".toRegex(), "")
                .replace("'$|^'".toRegex(), "")
            }.filter { it.isNotBlank() }
            .groupingBy { it }
            .eachCount()


    }
}