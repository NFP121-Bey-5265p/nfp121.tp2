package question1;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.awt.*;

public class FahrenheitCelsius { 
    /**
     * le point d'entrée de cette application est String
     */
    public static void main(String[]args) {
      DecimalFormat c=new DecimalFormat("###.#");
      
      ArrayList<String>fahrenheitCelsius=new ArrayList<String>();
      ArrayList<Integer>fahrenheitCelsiusInteger=new ArrayList<Integer>();
      ArrayList<Float>convertedList=new ArrayList<Float>();
      
     for(int i = 0; i < args.length; i++) {
     fahrenheitCelsius.add(args[i]);
     fahrenheitCelsiusInteger.add(Integer.parseInt(fahrenheitCelsius.get(i)));
     int f= fahrenheitCelsiusInteger.get(i);
     convertedList.add(fahrenheitEnCelsius(f));
     
      System.out.println(f + "\u00B0F -> " + c.format(fahrenheitEnCelsius(f)) + "\u00B0C");
     }
      
    }

    public static float fahrenheitEnCelsius(int f) {
    float C =(f-32)/1.8f;
    return C; 
    }
}

