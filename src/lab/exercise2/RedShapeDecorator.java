
package lab.exercise2;

/**
 *
 * @author CPere
 */
public class RedShapeDecorator extends ShapeDecorator{
    
    public RedShapeDecorator(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
         color();
    }
    
    @Override
    public void draw(){
    super.draw();
    }

    @Override
    public void color() {
        System.out.println("Border Color: Red");
    }
    
}
