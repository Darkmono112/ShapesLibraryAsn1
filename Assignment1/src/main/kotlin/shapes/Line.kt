package org.example.shapes

class Line(start:Point, end:Point):Moveable {

    init{
        require(start != end )
    }
    var start: Point = start
        private set
    var end: Point = end
        private set

    fun slope(){
        TODO("Not yet implemented" )
    }

    override fun move(deltaX: Double, deltaY: Double) {
        TODO("Not yet implemented")
    }

}