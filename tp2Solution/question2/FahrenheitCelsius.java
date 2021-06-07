package question2;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.awt.*;



      public class FahrenheitCelsius{

    
         public static void main(String[] args){
         
         DecimalFormat c=new DecimalFormat("###.#");
         ArrayList<Float>convertedList=new ArrayList<Float>();
         ArrayList<String>fahrenheitCelsius=new ArrayList<String>();
         ArrayList<Integer>fahrenheitCelsiusInteger=new ArrayList<Integer>();
      
         try{
            for(int i = 0; i < args.length; i++) {
            fahrenheitCelsius.add(args[i]);
            fahrenheitCelsiusInteger.add(Integer.parseInt(fahrenheitCelsius.get(i)));
            int f= fahrenheitCelsiusInteger.get(i);
            convertedList.add(fahrenheitEnCelsius(f));
     
           System.out.println(f + "\u00B0F -> " + c.format(fahrenheitEnCelsius(f)) + "\u00B0C");
        }
        }   catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
        } 
      }
     
        public static float fahrenheitEnCelsius( int f){
        float C =(f-32)/1.8f;
        return C;  
      }
     
        public static double fahrenheitEnCelsius1( String f){
         DecimalFormat c=new DecimalFormat("###.#");
         int k=0;
         double D;
         try {
           k=Integer.parseInt(f);
           D=fahrenheitEnCelsius(k);
           c.format(D);
           } 
      
         catch (NumberFormatException e) { 
          System.out.println("error : " + e.getMessage());
          D=0.0;
          }
        return D;
      
      }
  }