
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WordCountTest{
    @Test
    fun test1() {
        val phrase = WordCount.phrase("\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled.")
        assertEquals(
            mapOf("123" to 1,
                "agent" to 1,
                "cried" to 1,
                "fled" to 1,
                "i" to 1,
                "password" to 2,
                "so" to 1,
                "special" to 1,
                "that's" to 1,
                "the" to 2), phrase)
    }
    @Test
    fun test2() {
        val phrase = WordCount.phrase("one,two,three")
        assertEquals(
            mapOf("one" to 1,
                "two" to 1,
                "three" to 1), phrase)
    }

    @Test
    fun `various separators`() =
        assertEquals(
            WordCount.phrase(",\n,one,\n ,two \n 'three'"),
            mapOf(
            "one" to 1,
            "two" to 1,
            "three" to 1)
        )
}

