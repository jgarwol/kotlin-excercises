import Signal.*

object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val signals = mutableListOf<Signal>()
        if (number and WINK.code == WINK.code) signals.add(WINK)
        if (number and DOUBLE_BLINK.code == DOUBLE_BLINK.code) signals.add(DOUBLE_BLINK)
        if (number and CLOSE_YOUR_EYES.code == CLOSE_YOUR_EYES.code) signals.add(CLOSE_YOUR_EYES)
        if (number and JUMP.code == JUMP.code) signals.add(JUMP)
        if (number and REVERSE.code == REVERSE.code){
            return signals.reversed()
        } else {
            return signals
        }

    }
}
enum class Signal(val code: Int) {
    WINK(0b1), DOUBLE_BLINK(0b10), CLOSE_YOUR_EYES(0b100), JUMP(0b1000), REVERSE(0b10000)
}