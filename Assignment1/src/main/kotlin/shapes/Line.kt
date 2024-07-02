package shapes

class Line(start: Point, end: Point): Moveable {

    init{
        require(start != end )
    }
    var start: Point = start
        private set
    var end: Point = end
        private set

    fun slope():Double {
        return (start.y-end.y)/(start.x - end.x)
    }

    override fun move(deltaX: Double, deltaY: Double) {
        start.move(deltaX,deltaY)
        end.move(deltaX,deltaY)
    }

}