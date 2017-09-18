/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * The image that is being represented is a penalty kick on a lovely day 
 * at their local soccer field.The kicker is preparing to take the shoot as 
 * the goalie hopes to save it! A classic situation in soccer.
 * 
 * @author  Giovanny Ospina
 * @version 09.15.2017
 */
public class Picture
{
    private Square field1;
    private Square field2;
    private Square field3;
    private Square field4;
    private Square goal1;
    private Square goal2;
    private Square goal3;
    private Square goalcov;
    private Square goalline;
    private Square the10;
    private Square the18;
    private Square sky1;
    private Square sky2;
    private Person kicker;
    private Person goalie;
    private Triangle lglove;
    private Triangle rglove;
    private Circle ball;

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
        field1 = new Square();
        field1.changeColor("green");
        field1.moveHorizontal(-320);
        field1.changeSize(550);
        field1.makeVisible();
        
        sky1 = new Square();
        sky1.changeColor("skyblue");
        sky1.moveHorizontal(-340);
        sky1.moveVertical(-550);
        sky1.changeSize(550);
        sky1.makeVisible();
      
        goal1 = new Square();
        goal1.changeColor("white");
        goal1.moveHorizontal(-165);
        goal1.moveVertical(-55);
        goal1.changeSize(95);
        goal1.makeVisible();
        
        goal2 = new Square();
        goal2.changeColor("white");
        goal2.moveHorizontal(-85);
        goal2.moveVertical(-55);
        goal2.changeSize(95);
        goal2.makeVisible();
        
        goal3 = new Square();
        goal3.changeColor("white");
        goal3.moveHorizontal(-40);
        goal3.moveVertical(-55);
        goal3.changeSize(95);
        goal3.makeVisible();
        
        sky2 = new Square();
        sky2.changeColor("skyblue");
        sky2.moveHorizontal(-150);
        sky2.moveVertical(-40);
        sky2.changeSize(190);
        sky2.makeVisible();
        
        goalcov = new Square();
        goalcov.changeColor("green");
        goalcov.moveHorizontal(-150);
        goalcov.moveVertical(0);
        goalcov.changeSize(190);
        goalcov.makeVisible();
        
        goalline = new Square();
        goalline.changeColor("white");
        goalline.moveHorizontal(-360);
        goalline.moveVertical(40);
        goalline.changeSize(550);
        goalline.makeVisible();
        
        field2 = new Square();
        field2.changeColor("green");
        field2.moveHorizontal(-350);
        field2.moveVertical(43);
        field2.changeSize(550);
        field2.makeVisible();
        
        the10 = new Square();
        the10.changeColor("white");
        the10.moveHorizontal(-320);
        the10.moveVertical(75);
        the10.changeSize(550);
        the10.makeVisible();
       
        field3 = new Square();
        field3.changeColor("green");
        field3.moveHorizontal(-310);
        field3.moveVertical(78);
        field3.changeSize(550);
        field3.makeVisible();
        
        the18 = new Square();
        the18.changeColor("white");
        the18.moveHorizontal(-360);
        the18.moveVertical(151);
        the18.changeSize(550);
        the18.makeVisible();
        
        field4 = new Square();
        field4.changeColor("green");
        field4.moveHorizontal(-310);
        field4.moveVertical(154);
        field4.changeSize(550);
        field4.makeVisible();
        
        kicker = new Person();
        kicker.changeSize(80,40);
        kicker.moveHorizontal(-94);
        kicker.moveVertical(25);
        kicker.makeVisible();
        
        goalie = new Person();
        goalie.changeSize(69,36);
        goalie.moveHorizontal(-25);
        goalie.moveVertical(-77);
        goalie.makeVisible();
        
        lglove = new Triangle();
        lglove.changeColor("magenta");
        lglove.changeSize(13,13);
        lglove.moveHorizontal(26);
        lglove.moveVertical(-20);
        lglove.makeVisible();
        
        rglove = new Triangle();
        rglove.changeColor("magenta");
        rglove.changeSize(13,13);
        rglove.moveHorizontal(64);
        rglove.moveVertical(-20);
        rglove.makeVisible();
        
        ball = new Circle();
        ball.changeColor("black");
        ball.moveHorizontal(15);
        ball.moveVertical(130);
        ball.changeSize(18);
        ball.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky1 != null)   // only if it's painted already...
        {
            field1.changeColor("white");
            sky1.changeColor("grey");
            goal1.changeColor("black");
            goal2.changeColor("black");
            goal3.changeColor("black");
            sky2.changeColor("grey");
            goalcov.changeColor("white");
            goalline.changeColor("black");
            field2.changeColor("white");
            the10.changeColor("black");
            field3.changeColor("white");
            the18.changeColor("black");
            field4.changeColor("white");
            kicker.changeColor("black");
            goalie.changeColor("black");
            lglove.changeColor("grey");
            rglove.changeColor("grey");
            ball.changeColor("grey");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky1 != null)   // only if it's painted already...
        {
            field1.changeColor("green");
            sky1.changeColor("skyblue");
            goal1.changeColor("white");
            goal2.changeColor("white");
            goal3.changeColor("white");
            sky2.changeColor("skyblue");
            goalcov.changeColor("green");
            goalline.changeColor("white");
            field2.changeColor("green");
            the10.changeColor("white");
            field3.changeColor("green");
            the18.changeColor("white");
            field4.changeColor("green");
            kicker.changeColor("black");
            goalie.changeColor("black");
            lglove.changeColor("magenta");
            rglove.changeColor("magenta");
            ball.changeColor("black");
        }
    }
}
