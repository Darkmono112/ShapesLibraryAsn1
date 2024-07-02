package shapes



class Square(
    topLeft: Point,
    sideLength:Double
): Rectangle(topLeft, Point(topLeft.x+sideLength, topLeft.y - sideLength))