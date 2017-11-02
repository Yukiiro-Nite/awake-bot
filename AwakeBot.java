import java.awt.Robot;
import java.awt.Point;
import java.util.Random;


public class AwakeBot
{
  public static void main(String args[])
  {
    Robot robot = null;
    try{robot = new Robot();}
    catch(Exception e){}
    Point p;
    Random r = new Random();
    int width = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
    int height = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    while(true)
    {
      p = java.awt.MouseInfo.getPointerInfo().getLocation();
      
      robot.mouseMove(r.nextInt(width),r.nextInt(height));
      robot.mouseMove(p.x,p.y);

      try{Thread.sleep(1000 * 60);}
      catch(Exception e){System.out.println(e);}
 
    }
  }
}