package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeyListenerFrame extends JFrame implements
        KeyListener, MouseListener {
    JLabel label1;
    boolean clicked=false;
    public void KeyListenerExampleFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Working with Key and Mouse Listeners");
        this.setSize(500,500);
        this.setLayout(null);
        setVisible(true);
        label1= new JLabel();
        label1.setSize(100,100);
        label1.setBackground(Color.BLUE);
        label1.setOpaque(true);
        add(label1);
        this.addKeyListener(this);
        label1.addMouseListener(this);
        this.addMouseListener(this);

//add key and mouse listeners to the elements
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37:
            case 65:
                label1.setLocation(label1.getX()-10, label1.getY());
                break;
            case 38:
            case 87:
                label1.setLocation(label1.getX(), label1.getY()-10);
                break;
            case 39:
            case 68:
                label1.setLocation(label1.getX()+10, label1.getY());
                break;
            case 40:
            case 83:
                label1.setLocation(label1.getX(), label1.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        clicked=true;
        label1.setLocation(e.getXOnScreen(),e.getYOnScreen());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
           if (e.getY() > label1.getY()) {
               label1.setLocation(e.getX(), e.getY() - 100);
           }
           if (e.getX() > label1.getX()) {
               label1.setLocation(e.getX() - 100, e.getY() - 100);
           }
           if (e.getX() < label1.getX()) {
               label1.setLocation(e.getX() + 100, e.getY() + 100);
           }
           if (e.getY() < label1.getY()) {
               label1.setLocation(e.getX() + 100, e.getY() + 100);
           }
            label1.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label1.setLocation(0,0);
        label1.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        KeyListenerFrame  myFrame=new KeyListenerFrame();
        myFrame.KeyListenerExampleFrame();
    }

    //Override necessary methods for the interfaces here
//make the label move as you move the arrow keys on the keyboard.
    //Use e.getKeyCode()method of the event.
    //make the label change the color when a mouse enters and go to the
    //original color when the mouse exits an element.
//make a label move after a mouse, you may use e.getX(),
            //e.getY(),e.getXOnScreen()and e.getYOnScreen() methods.
    // set an icon to the label using the class ImageIcon which let create
  //  a icon with an operator icon = new ImageIcon(filename), place a file
  //  in a src folder.
}
