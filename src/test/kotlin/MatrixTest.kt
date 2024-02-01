import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class MatrixTest {
    @Test
    fun test1() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.row(0), listOf(9,8,7))

    }

    @Test
    fun test2() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.row(1), listOf(6,5,4))
    }

    @Test
    fun test3() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.row(2), listOf(3,2,1))
    }

    @Test
    fun test4() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.column(0), listOf(9,6,3))
    }

    @Test
    fun test5() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.column(1), listOf(8,5,2))
    }

    @Test
    fun test6() {
        val matrix = Matrix("9 8 7\n6 5 4\n3 2 1")
        assertContentEquals(matrix.column(2), listOf(7,4,1))
    }


}