/**
 * This class represents a simple picture. You can draw the picture of
 * a person catching the train using the draw method.
 * The colors can be changed to black and white and back to the  
 * original colors.
 *
 * @author  Lucita Fortes
 * @version 2017.09.19
 */
public class Picture
{
    private Square bground;
    private Square wall;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Square window6;
    private Square window7;
    private Square window8;
    private Square window9;
    private Square window10;
    private Square window11;
    private Square window12;
    private Triangle roof;
    private Circle wheel1;
    private Circle wheel2;
    private Circle wheel3;
    private Circle wheel4;
    private Person person;
    private Square ground1;
    private Square ground2;
    private Square ground3;
    private Square ground4;
    private Square ground5;
    private Square ground6;
    private Square coach1;
    private Square coach2;
    private Square chimney;
    private Circle steam1;
    private Circle steam2;
    private Circle steam3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        draw();
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        ground1 = new Square();
        ground1.moveHorizontal(150);
        ground1.moveVertical(150);
        ground1.changeColor("black");
        ground1.changeSize(20);
        ground1.makeVisible();
        
        ground2 = new Square();
        ground2.moveHorizontal(110);
        ground2.moveVertical(150);
        ground2.changeColor("black");
        ground2.changeSize(20);
        ground2.makeVisible();
        
        ground3 = new Square();
        ground3.moveHorizontal(70);
        ground3.moveVertical(150);
        ground3.changeColor("black");
        ground3.changeSize(20);
        ground3.makeVisible();
        
        ground4 = new Square();
        ground4.moveHorizontal(30);
        ground4.moveVertical(150);
        ground4.changeColor("black");
        ground4.changeSize(20);
        ground4.makeVisible();
        
        ground5 = new Square();
        ground5.moveHorizontal(-10);
        ground5.moveVertical(150);
        ground5.changeColor("black");
        ground5.changeSize(20);
        ground5.makeVisible();
        
        ground6 = new Square();
        ground6.moveHorizontal(-50);
        ground6.moveVertical(150);
        ground6.changeColor("black");
        ground6.changeSize(20);
        ground6.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-250);
        wall.moveVertical(50);
        wall.changeSize(120);
        wall.makeVisible();
        
        window1 = new Square();
        window1.changeColor("yellow");
        window1.moveHorizontal(-240);
        window1.moveVertical(70);
        window1.changeSize(20);
        window1.makeVisible();
        
        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(-240);
        window2.moveVertical(95);
        window2.changeSize(20);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("yellow");
        window3.moveHorizontal(-215);
        window3.moveVertical(70);
        window3.changeSize(20);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("yellow");
        window4.moveHorizontal(-215);
        window4.moveVertical(95);
        window4.changeSize(20);
        window4.makeVisible();
        
        window5 = new Square();
        window5.changeColor("yellow");
        window5.moveHorizontal(-190);
        window5.moveVertical(70);
        window5.changeSize(20);
        window5.makeVisible();
        
        window6 = new Square();
        window6.changeColor("yellow");
        window6.moveHorizontal(-190);
        window6.moveVertical(95);
        window6.changeSize(20);
        window6.makeVisible();
        
        window7 = new Square();
        window7.changeColor("yellow");
        window7.moveHorizontal(-165);
        window7.moveVertical(70);
        window7.changeSize(20);
        window7.makeVisible();
        
        window8 = new Square();
        window8.changeColor("yellow");
        window8.moveHorizontal(-165);
        window8.moveVertical(95);
        window8.changeSize(20);
        window8.makeVisible();
        
        window9 = new Square();
        window9.changeColor("yellow");
        window9.moveHorizontal(-240);
        window9.moveVertical(120);
        window9.changeSize(20);
        window9.makeVisible();
        
        window10 = new Square();
        window10.changeColor("yellow");
        window10.moveHorizontal(-215);
        window10.moveVertical(120);
        window10.changeSize(20);
        window10.makeVisible();
        
        window11 = new Square();
        window11.changeColor("yellow");
        window11.moveHorizontal(-190);
        window11.moveVertical(120);
        window11.changeSize(20);
        window11.makeVisible();
        
        window12 = new Square();
        window12.changeColor("yellow");
        window12.moveHorizontal(-165);
        window12.moveVertical(120);
        window12.changeSize(20);
        window12.makeVisible();

        roof = new Triangle();  
        roof.changeColor("green");
        roof.changeSize(60, 180);
        roof.moveHorizontal(-90);
        roof.moveVertical(-20);
        roof.makeVisible();

        wheel1 = new Circle();
        wheel1.changeColor("magenta");
        wheel1.moveHorizontal(160);
        wheel1.moveVertical(150);
        wheel1.changeSize(30);
        wheel1.makeVisible();
        
        wheel2 = new Circle();
        wheel2.changeColor("magenta");
        wheel2.moveHorizontal(110);
        wheel2.moveVertical(150);
        wheel2.changeSize(30);
        wheel2.makeVisible();
        
        wheel3 = new Circle();
        wheel3.changeColor("yellow");
        wheel3.moveHorizontal(160);
        wheel3.moveVertical(150);
        wheel3.changeSize(20);
        wheel3.makeVisible();
        
        wheel4 = new Circle();
        wheel4.changeColor("yellow");
        wheel4.moveHorizontal(110);
        wheel4.moveVertical(150);
        wheel4.changeSize(20);
        wheel4.makeVisible();
        
        coach1 = new Square();
        coach1.moveHorizontal(30);
        coach1.moveVertical(40);
        coach1.changeColor("blue");
        coach1.changeSize(80);
        coach1.makeVisible();
        
        chimney = new Square();
        chimney.moveHorizontal(30);
        chimney.moveVertical(0);
        chimney.changeColor("red");
        chimney.changeSize(40);
        chimney.makeVisible();
        
        steam1 = new Circle();
        steam1.changeColor("yellow");
        steam1.moveHorizontal(120);
        steam1.moveVertical(-8);
        steam1.changeSize(15);
        steam1.makeVisible();
        
        steam2 = new Circle();
        steam2.changeColor("yellow");
        steam2.moveHorizontal(100);
        steam2.moveVertical(-25);
        steam2.changeSize(20);
        steam2.makeVisible();
        
        steam3 = new Circle();
        steam3.changeColor("yellow");
        steam3.moveHorizontal(80);
        steam3.moveVertical(-42);
        steam3.changeSize(25);
        steam3.makeVisible();
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            window2.changeColor("white");
            window3.changeColor("white");
            window4.changeColor("white");
            window5.changeColor("white");
            window6.changeColor("white");
            window7.changeColor("white");
            window8.changeColor("white");
            window9.changeColor("white");
            window10.changeColor("white");
            window11.changeColor("white");
            window12.changeColor("white");
            roof.changeColor("black");
            wheel1.changeColor("black");
            wheel2.changeColor("black");
            wheel3.changeColor("black");
            wheel4.changeColor("black");
            coach1.changeColor("black");
            steam1.changeColor("black");
            steam2.changeColor("black");
            steam3.changeColor("black");
            ground1.changeColor("black");
            ground2.changeColor("black");
            ground3.changeColor("black");
            ground4.changeColor("black");
            ground5.changeColor("black");
            ground6.changeColor("black");
            chimney.changeColor("black");
            if (person != null)
                person.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("yellow");
            window2.changeColor("yellow");
            window3.changeColor("yellow");
            window4.changeColor("yellow");
            window5.changeColor("yellow");
            window6.changeColor("yellow");
            window7.changeColor("yellow");
            window8.changeColor("yellow");
            window9.changeColor("yellow");
            window10.changeColor("yellow");
            window11.changeColor("yellow");
            window12.changeColor("yellow");
            roof.changeColor("green");
            wheel1.changeColor("yellow");
            wheel2.changeColor("yellow");
            wheel3.changeColor("magenta");
            wheel4.changeColor("magenta");
            steam1.changeColor("yellow");
            steam2.changeColor("yellow");
            steam3.changeColor("yellow");
            coach1.changeColor("blue");
            ground1.changeColor("green");
            ground2.changeColor("green");
            ground3.changeColor("green");
            ground4.changeColor("green");
            ground5.changeColor("green");
            ground6.changeColor("green");
            chimney.changeColor("red");
            if (person != null)
                person.changeColor("magenta");
        }
    }
    /**
     * Draw Person
     */
    public void drawPerson()
    {
        person = new Person();
        person.changeColor("magenta");
        person.moveVertical(60);
        
        person.moveHorizontal(-300);
        person.makeVisible();
        person.slowMoveHorizontal(350);
        person.slowMoveVertical(-55);
        person.slowMoveHorizontal(40);
    }
}
