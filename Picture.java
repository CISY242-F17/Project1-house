/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{

    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;
    private Triangle triangle1;
    private Person person1;
    private Circle circle1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        square1 = new Square();
        square1.moveHorizontal(-200);
        square1.moveVertical(-200);
        square1.changeSize(1000);
        square1.makeVisible();
        
        square2 = new Square();
        square2.changeColor("blue");
        square2.moveHorizontal(-150);
        square2.moveVertical(-100);
        square2.changeSize(1000);
        square2.makeVisible();
        
        square3 = new Square();
        square3.changeColor("green");
        square3.moveHorizontal(-100);
        square3.moveVertical(-50);
        square3.changeSize(1000);
        square3.makeVisible();
        
        square4 = new Square();
        square4.changeColor("black");
        square4.moveHorizontal(-50);
        square4.changeSize(1000);
        square4.makeVisible();
        
        triangle1 = new Triangle();
        triangle1.changeSize(60, 70);
        triangle1.moveVertical(-100);
        triangle1.makeVisible();

        circle1 = new Circle();
        circle1.changeColor("black");
        circle1.makeVisible();
        
        person1 = new Person();
        person1.changeSize(60, 30);
        person1.moveHorizontal(100);
        person1.changeColor("magenta");
        person1.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (square1 != null)   // only if it's painted already...
        {
            square1.changeColor("black");
            square2.changeColor("white");
            square3.changeColor("black");
            square4.changeColor("white");
            triangle1.changeColor("black");
            circle1.changeColor("white");
            person1.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (square1 != null)   // only if it's painted already...
        {
            square1.changeColor("red");
            square2.changeColor("blue");
            square3.changeColor("green");
            square4.changeColor("black");
            triangle1.changeColor("green");
            circle1.changeColor("black");
            person1.changeColor("magenta");
            
        }
    }
}
