package shapes

import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {

    //triangle with a know area of 2
    private var triangle = Triangle(Point(0.0,0.0), Point(1.0,2.0), Point(2.0,0.0) )

    @Test
    fun move() {
        triangle.move(0.0,10.0)
        assertEquals(0.0 , triangle.pointA.x)
        assertEquals(10.0 , triangle.pointA.y)
        assertEquals(1.0 , triangle.pointB.x)
        assertEquals(12.0 , triangle.pointB.y)
        assertEquals(2.0 , triangle.pointC.x)
        assertEquals(10.0 , triangle.pointC.y)

        triangle.move(45.0,345.0)

        assertEquals(0.0+45 , triangle.pointA.x)
        assertEquals(10.0+345.0 , triangle.pointA.y)
        assertEquals(1.0+45 , triangle.pointB.x)
        assertEquals(12.0+345.0 , triangle.pointB.y)
        assertEquals(2.0+45 , triangle.pointC.x)
        assertEquals(10.0+345.0 , triangle.pointC.y)
    }

    @Test
    fun area() {
        assertEquals(2.0, triangle.area())
        triangle.move(24.0,24.0)
        assertEquals(2.0, triangle.area())


    }
}