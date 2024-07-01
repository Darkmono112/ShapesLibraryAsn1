package shapes
import org.example.shapes.*
import kotlin.test.Test
import kotlin.test.assertEquals

class EllipseTest {
    private var ellipse = Ellipse(Point(0.0,0.0),5.0,5.0)


    @Test
    fun testArea(){
        assertEquals(Math.PI*5.0*5.0, ellipse.area())
    }

    @Test
    fun testMove(){
        ellipse.move(10.0,10.0)
        assertEquals(10.0 , ellipse.center.x)
        assertEquals(10.0 , ellipse.center.y)
    }


}