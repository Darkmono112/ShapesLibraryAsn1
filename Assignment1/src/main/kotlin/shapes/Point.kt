package org.example.shapes



class Point(
     x:Double = 0.0  ,
     y:Double = 0.0
):Moveable {

    var x: Double = x
        private set

    var y: Double = y
        private set




    override fun move(deltaX: Double, deltaY: Double) {
        //Moves point according to delta x and delta y
        x += deltaX
        y += deltaY
    }


    public  fun clone(): Point {
        return Point(x,y)
    }

}
