package shapes

import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest{

    private var circle = Circle(Point(0.0,0.0), 10.0)

    @Test
    fun testArea(){
        assertEquals(Math.PI * 10*10, circle.area())
    }
    @Test
    fun testMove(){
        circle.move(10.0,10.0)
        assertEquals(10.0, circle.center.x)
        assertEquals(10.0, circle.center.y)
    }




}