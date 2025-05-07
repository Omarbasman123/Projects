import java.awt.* ;
import javax.swing.* ;

public class MyFrame4 extends JFrame {
    public MyFrame4(String title) {
     super (title) ;
    setLayout (new FlowLayout ( ) ) ;
        add (new JLabel ("  1 " ) ) ;
        add (new JLabel (" 2 " ) ) ;
        add (new JLabel (" 3 " ) ) ;
        add (new JLabel (" 4 " ) ) ;
        add (new JLabel (" 5 " ) ) ;
        add (new JLabel (" …. " ) ) ;
    setSize(200, 300) ; 
    setVisible( true ) ;
}
public static void main (String [ ] args) {
    new MyFrame4("Une fenêtre") ;
    }
}
