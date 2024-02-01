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
    WINK(0x1), DOUBLE_BLINK(0x10), CLOSE_YOUR_EYES(0x100), JUMP(0x1000), REVERSE(0x10000)
}