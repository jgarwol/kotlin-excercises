import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class FlattenerTest{
    @Test
    fun `should return same list when source is flat`() {
        val source = listOf(1, 2, 3, 4, 5, 6)
        assertContentEquals(source, Flattener.flatten(source))
    }

    @Test
    fun `should flatten 1 level of nested list`() {
        val source = listOf(1, 2, 3, listOf(4, 5), 6)
        assertContentEquals(listOf(1, 2, 3, 4, 5, 6), Flattener.flatten(source))
    }
}
