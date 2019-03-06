import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.MouseInfo;

public class Main {

    public static void main(String args[]){
        try{
            Robot rob = new Robot();

            //Point object stores the mouse location on the screen
            //Does not require the mouse pointer to be in the bounds of the application
            Point p = MouseInfo.getPointerInfo().getLocation();

            //Color object has the pixel color at a particular x and y coordinate
            Color color = rob.getPixelColor((int) p.getX(),(int)p.getY());
            System.out.println("Red: " + color.getRed()+"\nGreen: "+ color.getGreen()+ "\nBlue: "+color.getBlue());

        }
        catch (AWTException e){
            e.printStackTrace();
        }

    }
}
