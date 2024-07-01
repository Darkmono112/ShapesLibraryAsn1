package shapes
import kotlin.test.Test
import kotlin.test.assertEquals
import org.example.shapes.*
class LineTest {

    private var line = Line(Point(6.0,5.0), Point(8.0,-4.0))

    @Test
    fun testSlope(){
        assertEquals(-4.5, line.slope())
    }

    @Test
    fun moveLine(){

        line.move(-5.0,7.0)
        //points should move in sync
        assertEquals(1.0, line.start.x)
        assertEquals(12.0, line.start.y)
        assertEquals(3.0, line.end.x)
        assertEquals(3.0, line.end.y)

        //Slope should stay the same
        assertEquals(-4.5, line.slope())


    }


}