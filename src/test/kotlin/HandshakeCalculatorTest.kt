
import kotlin.test.Test
import kotlin.test.assertEquals

class HandshakeCalculatorTest {

    @Test
    fun testReversingASingleActionYieldsTheSameAction() {
        assertEquals(
            listOf(Signal.JUMP),
            HandshakeCalculator.calculateHandshake(24)
        )
    }
}