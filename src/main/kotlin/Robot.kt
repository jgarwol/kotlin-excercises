import kotlin.random.Random

class Robot {
    var reset: Boolean = false

    private companion object Generator {

        var random = Random(123)
        val used: MutableSet<String> = mutableSetOf()
        private fun generateRandonName(): String {
            var random = randomName()
            while (random in used) {
                random = randomName()
            }
            used.add(random)
            return random
        }

        private fun randomName(): String {
            val chars = CharRange('A', 'Z').toList()
            val _name = "" + chars[random.nextInt(chars.size)] +
                    chars[random.nextInt(chars.size)] +
                    random.nextInt(10) +
                    random.nextInt(10) +
                    random.nextInt(10)
            return _name
        }
    }

    var _name: String = generateRandonName()
    val name: String
        get() {

            if (reset) {
                _name = generateRandonName()
                reset = false
            }
            return _name
        }


    fun reset() {
        reset = true
    }
}