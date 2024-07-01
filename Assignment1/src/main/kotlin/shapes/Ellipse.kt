package org.example.shapes

open class Ellipse(center:Point, xRadii:Double, yRadii:Double):Moveable, Area {
    init{
        require(xRadii > 0.0 && yRadii > 0.0)
    }
    var center = center
        private set
    var xRadii = xRadii
        private set
    var yRadii = yRadii
        private set


    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX,deltaY)
    }

    override fun area(): Double {
        return Math.PI * xRadii * yRadii
    }
}