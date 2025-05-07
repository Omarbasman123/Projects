import java.awt.* ;
 import javax.swing.* ;
 public class FenetreComplexe extends JFrame {
 public FenetreComplexe (String title) {//constructeur
 super (title) ;
 JPanel panelBoutons = new JPanel();
 panelBoutons.setLayout (new FlowLayout ( ) ) ;
 JButton b1 = new JButton (" Cliquez moi! ") ;
 JButton b2 = new JButton (" Et moi aussi! ") ;
 panelBoutons.add(b1); 
panelBoutons.add(b2);
 this.add(panelBoutons, BorderLayout.NORTH);
 JTextArea textArea = new JTextArea(15, 5);
 this.add(textArea, BorderLayout.CENTER);
 JButton quitter = new JButton("Quitter");
 this.add(quitter, BorderLayout.SOUTH);
 pack ( ) ;  
setVisible(true) ;
 }
 }
 
