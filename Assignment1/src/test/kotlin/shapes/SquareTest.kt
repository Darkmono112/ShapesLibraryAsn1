package shapes

import org.example.shapes.*
import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {

    private var square = Square(Point(10.0,25.0), 30.0)


    @Test
    fun areaTest(){
        assertEquals(30.0,square.width)
        assertEquals(30.0, square.length)

        assertEquals(30.0*30.0, square.area() )
    }

    @Test
    fun moveTest() {
        square.move(20.0, 20.0)
        assertEquals(30.0,square.topLeft.x )
        assertEquals(45.0, square.topLeft.y)
        assertEquals(60.0, square.bottomRight.x)
        assertEquals(15.0, square.bottomRight.y)
    }


}