package shapes
import org.example.shapes.*
import kotlin.test.assertEquals
import kotlin.test.Test

class RectTest {

    private var rect = Rectangle(Point(100.0,100.0), Point(50.0,49.0))

    @Test
    fun testMeasurements(){
        assertEquals(50.0 , rect.length)
        assertEquals(51.0 , rect.width)
    }

    @Test
    fun testMove(){
        rect.move(10.0,10.0)
        assertEquals(110.0,rect.topLeft.x )
        assertEquals(110.0,rect.topLeft.y )
        assertEquals(60.0,rect.bottomRight.x)
        assertEquals(59.0,rect.bottomRight.y)
        assertEquals(50.0 , rect.length)
        assertEquals(51.0 , rect.width)
    }


}