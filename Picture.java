/**
 * The image shows a person watching a rocketship launch to the moon
 *
 * 
 * @author  Olive Tamondong
 * @version 09.17.2017
 */
public class Picture
{
    private Square wall1;
    private Square wall2;
    
    private Circle window1;
    private Circle window2;
    
    private Triangle roof;
    
    private Circle moon1;
    private Circle moon2;
    
    private Triangle wing;
    private Triangle fire1;
    private Triangle fire2;
    
    
    private Person person;
    
    
    

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
        wing = new Triangle();
        wing.changeColor("red");
        wing.moveHorizontal(-45);
        wing.moveVertical(-30);
        wing.changeSize(80,120);
        wing.makeVisible();
        
        wall1 = new Square();
        wall1.changeColor("blue");
        wall1.moveHorizontal(-180);
        wall1.moveVertical(-60);
        wall1.changeSize(70);
        wall1.makeVisible();
        
        wall2 = new Square();
        wall2.changeColor("blue");
        wall2.moveHorizontal(-180);
        wall2.moveVertical(0);
        wall2.changeSize(70);
        wall2.makeVisible();
        
        window1 = new Circle();
        window1.changeColor("red");
        window1.moveHorizontal(-80);
        window1.moveVertical(0);
        window1.changeSize(30);
        window1.makeVisible();
        
        window2 = new Circle();
        window2.changeColor("red");
        window2.moveHorizontal(-80);
        window2.moveVertical(50);
        window2.changeSize(30);
        window2.makeVisible();
        
        roof = new Triangle();  
        roof.changeColor("green");
        roof.changeSize(55, 98);
        roof.moveHorizontal(-45);
        roof.moveVertical(-120);
        roof.makeVisible();
        
        fire1 = new Triangle();
        fire1.changeColor("red");
        fire1.moveHorizontal(-60);
        fire1.moveVertical(47);
        fire1.changeSize(20,20);
        fire1.makeVisible();
        
        fire2 = new Triangle();
        fire2.changeColor("red");
        fire2.moveHorizontal(-30);
        fire2.moveVertical(47);
        fire2.changeSize(20,20);
        fire2.makeVisible();


        moon1 = new Circle();
        moon1.changeColor("gray");
        moon1.moveHorizontal(100);
        moon1.moveVertical(-60);
        moon1.changeSize(60);
        moon1.makeVisible();
        
        moon2 = new Circle();
        moon2.changeColor("white");
        moon2.moveHorizontal(130);
        moon2.moveVertical(-60);
        moon2.changeSize(60);
        moon2.makeVisible();
        
        person = new Person();
        person.moveHorizontal(0);
        person.moveVertical(0);
        person.makeVisible();
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall1 != null)   // only if it's painted already...
        {
             wing.changeColor("black");
             wall1.changeColor("black");
             wall2.changeColor("black");
             window1.changeColor("white");
             window2.changeColor("white");
             fire1.changeColor("black");
             fire2.changeColor("black");
             roof.changeColor("black");
             moon1.changeColor("black");
             moon2.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall1 != null)   // only if it's painted already...
        {
             wing.changeColor("red");
             wall1.changeColor("blue");
             wall2.changeColor("blue");
             window1.changeColor("red");
             window2.changeColor("red");
             fire1.changeColor("red");
             fire2.changeColor("red");
             roof.changeColor("green");
             moon1.changeColor("gray");
             moon2.changeColor("white"); 
        }
    }
}
