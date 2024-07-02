package shapes
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PointTest {

    private val point = Point(1.2,56.5)

    @Test
    fun testGet() {
        assertEquals(1.2, point.x)
        assertEquals(56.5,point.y)

    }

    @Test
    fun testMove(){
        point.move(-3.0,5.0)

        assertEquals(1.2-3.0, point.x)
        assertEquals(56.5+5.0,point.y)
    }

    @Test
    fun testClone(){
        val clonePoint: Point = point.clone()
        assertEquals(point.x , clonePoint.x)
        clonePoint.move(2.0,2.0)
        assertNotEquals(point.x, clonePoint.x )
    }

}