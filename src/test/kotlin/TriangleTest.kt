import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TriangleTest {
    @Test()
    fun `triangle inequality violation - first is greater then sum of others `() {
        assertThrows<IllegalArgumentException> {  Triangle(3, 1, 1) }
    }
    @Test
    fun `isosceles - no sides are equal`() {
        assertFalse(Triangle(2, 3, 4).isIsosceles)
    }

    @Test
    fun `equilateral - sides may be floats`() {
        assertTrue(Triangle(0.5, 0.5, 0.5).isEquilateral)
    }

    @Test
    fun `isosceles - sides may be floats`() {
        assertTrue(Triangle(0.5, 0.4, 0.5).isIsosceles)
    }
}