package org.example.shapes

import kotlin.math.abs

class Triangle(pointA: Point, pointB:Point, pointC:Point): Moveable, Area {

    init {
        //Make sure the slop is not the same between these sets, otherwise they are on a line
        require((pointA.y-pointB.y)/(pointA.x - pointB.x) != (pointA.y-pointC.y)/(pointA.x - pointC.x))
    }

    var pointA = pointA
        private set
    var pointB = pointB
        private set
    var pointC = pointC
        private set

    override fun move(deltaX: Double, deltaY: Double) {
        pointA.move(deltaX, deltaY)
        pointC.move(deltaX, deltaY)
        pointB.move(deltaX, deltaY)
    }

    override fun area(): Double {
        //Using the determinate to find the area
        return abs(.5*((pointB.x * pointC.y - pointB.y*pointC.x) -
                (pointA.x * pointC.y - pointA.y * pointC.x) +
                (pointA.x*pointB.y - pointA.y * pointB.x)))


    }


}