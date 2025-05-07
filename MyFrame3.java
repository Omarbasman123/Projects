
import java.awt.* ;
import javax.swing.* ;
public class MyFrame3 extends JFrame {
public MyFrame3(String title) {
    super (title) ;
    add (new JLabel (" Haut") , BorderLayout.NORTH) ;
    add (new JLabel (" Bas" ) , BorderLayout.SOUTH) ;
    add (new JLabel (" Droite ") , BorderLayout.EAST ) ;
    add (new JLabel (" Gauche ") , BorderLayout.WEST) ;
        setSize(200, 300) ; 
            setVisible( true ) ;
}
public static void main (String [ ] args) {
    new MyFrame3("Une fenêre") ;
    }
}
