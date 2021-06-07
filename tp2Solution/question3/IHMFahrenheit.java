package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   * action listener
   */
  public void actionPerformed( ActionEvent ae ){
      DecimalFormat c=new DecimalFormat("###.#");
      String Fahr;
      String Cels;
      int fahrenheit = 0;
      double x;
    try{
        Fahr=entree.getText();
        fahrenheit=Integer.parseInt(Fahr);
        x=fahrenheitEnCelsius(fahrenheit);
        sortie.setText( c.format( x));
       
     }catch(NumberFormatException nfe){
     
      System.out.println("error :" + nfe.getMessage());
      Cels="error!";
      sortie.setText(Cels);
    }
  }
    public static double fahrenheitEnCelsius(int f) {
        
    double C =(f-32)/1.8;
      if (C<-273.1){ C=-273.1;}
    return C; 
    }
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
