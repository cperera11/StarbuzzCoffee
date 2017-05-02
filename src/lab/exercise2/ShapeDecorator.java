
package lab.exercise2;

/**
 *
 * @author CPere
 */
public abstract class ShapeDecorator implements Shape {
    private Shape shapeToBeDecorated;

    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
    
    
    @Override
     public void draw(){
     shapeToBeDecorated.draw();
     }
     
    public abstract void color (); 
     
}

    
    

