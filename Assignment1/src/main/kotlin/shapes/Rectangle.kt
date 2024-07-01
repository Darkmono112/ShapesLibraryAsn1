package org.example.shapes

import kotlin.math.abs


open class Rectangle (topLeft:Point, bottomRight:Point): Moveable, Area {

    init{
        require(topLeft.x != bottomRight.x && topLeft.y != bottomRight.y)
    }

    var topLeft:Point = topLeft
        private set
    var bottomRight:Point = bottomRight
        private set
    var length: Double = abs(topLeft.x - bottomRight.x)
        private set
    var width: Double = abs(topLeft.y - bottomRight.y)
        private set

    override fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX,deltaY)
        bottomRight.move(deltaX,deltaY)
    }

    override fun area():Double {
        return length*width
    }
}