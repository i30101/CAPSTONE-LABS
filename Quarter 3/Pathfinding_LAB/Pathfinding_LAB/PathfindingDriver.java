//Urav Tanna, Douglas Oberle, 2/2024
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class PathfindingDriver
{
   public static void main(String[] args) throws IOException
   {
      UI ui = new UI();
      Map map = new Map(ui);
        /*if you want to load a map immediately after the program starts do it like this:
        //--------------------------------------------------------------------------------
        map.loadFile(new File("maps\\finalboss_144_moves.plmap"));
        //--------------------------------------------------------------------------------
        //*/
   }

   //pre:   map, initial and destination are not null.
   //       initial and destination have (x,y) values that represent valid (row,col) indexes of the 2D-array in map.
   //post:  returns a List of Point objects that mark the shorted path in the map from initial to destination, avoiding obstacles. 
   //called in UI.java
   //*************************************YOUR SOLUTION GOES HERE*************************************
   protected static boolean activatePathButton1 = true;
   public static List<Point> shortestPath1(Map map, Point initial, Point destination)
   {
      //WRITE THIS METHOD
      ArrayList<Point> points = new ArrayList<>();  
      return points;
   }
    
    //****If you wish to test more than one algorithm and compare/contrast results, activate the appropriate buttons and complete the methods for up to 4 different algorithms*** 
   protected static boolean activatePathButton2 = false;     //set to true to activate the button in the UI that will run this method
   public static List<Point> shortestPath2(Map map, Point initial, Point destination)
   {
      ArrayList<Point> points = new ArrayList<>();  
      return points;
   }
   
   protected static boolean activatePathButton3 = false;       //set to true to activate the button in the UI that will run this method
   public static List<Point> shortestPath3(Map map, Point initial, Point destination)
   {
      ArrayList<Point> points = new ArrayList<>();
      return points;
   }
   
   protected static boolean activatePathButton4 = false;       //set to true to activate the button in the UI that will run this method
   public static List<Point> shortestPath4(Map map, Point initial, Point destination)
   {
      ArrayList<Point> points = new ArrayList<>();
      return points;
   }

}

