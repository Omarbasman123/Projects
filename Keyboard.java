import java.io . * ;

 public class Keyboard {

 public static int getInt ( ) throws IOException {
    byte [ ] buffer = new byte [ 256 ] ;
        System.in.read (buffer) ; // throws IOException
        String s = new String (buffer) ;
    int num = Integer.parseInt ( s.trim ( ) ) ; // throws NumberFormatException
            return num ;
 }

 public static void main (String[ ] args ) throws IOException {
        int n ;
        boolean done = false ;
 while ( ! done ) {
         System.out.println(" enter a number : ") ;
 try {
    n = Keyboard.getInt( ) ; // throws IOException
        System.out.println(" Number is : " + n ) ;
 done = true ;
 } catch ( NumberFormatException e ) {
    System.out.println(" Not a number ! " ) ;
            
            }
        }
    }
}

