import javax.swing.* ;
 public class MyFrame2 extends JFrame {
 public MyFrame2(String title) {
    super (title) ;
    add (new JLabel (" I'm Omar Basman ! ")) ; 
    setSize(200, 300) ; 
    setVisible(true) ;
}
 public static void main (String [ ] args) {
    new MyFrame2("Une fenêtre") ;
     }
} 
