import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class RobotTest{

    @Test
    fun isRandom() {
        val iterations = 100000
        val names = (0 until iterations).map { Robot().name }
        assertEquals(iterations, names.size)
        assertEquals(iterations, names.distinct().size)
    }
}
