public class Rectangle {
   private float length, width;
   public Rectangle() {
      setLength( (float) 1);
      setWidth( (float) 1);
}
public Rectangle(float l, float w) {
   setLength(l);
   setWidth(w);
 }
public float getLength() { return length; }
public float getWidth() { return width; }
public void setLength(float l) {
   length = l;
   if ( l < 0.0 || l > 20.0 )
        length = (float) 0.0;
}
public void setWidth(float w) {
    width= w;
    if ( w < 0.0 || w > 20.0 )
       width = (float) 0.0;
}
public float area() { return length * width; }
public boolean square() { return length == width; }
}

