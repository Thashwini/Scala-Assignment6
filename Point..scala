import math.{sqrt,pow}
object MyApp extends App{
  val p1 = Point(2,4)
  val p2 = Point(4,6)
  val p3 = p1.add(p2)
  val p4 = p1.move(2,3)
  val p6 = p1.distance(p2)
  val p8 = p1.inverse()

  println("Point p1 : " + p1)
  println("Point p2 : " + p2)
  println("Addition of p1 and p2 : " + p3)
  println("Moved to Point : " + p4)
  println("Distance between point p1 and p2 : " + p6)
  println("Inverse of Point p1 : " + p8)
}

case class Point(a:Int,b:Int){
  def x:Int = a
  def y:Int = b

  def add(p:Point)=Point(this.x+p.x,this.y+p.y)

  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

  def distance(p: Point):Double =sqrt(pow(this.x-p.x,2)+pow(this.y-p.y,2))

  def inverse()=Point(this.y,this.x)

}
