import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class Kasparovtron extends JFrame implements MouseListener, MouseMotionListener {
  JLayeredPane layeredPane;
  JPanel chessBoard;
  JLabel chessPiece;
  int col;
  int row;
private Object tileCoord;
 
  public Kasparovtron(){
  Dimension boardSize = new Dimension(600, 600);

 layeredPane = new JLayeredPane();
  getContentPane().add(layeredPane);
  layeredPane.setPreferredSize(boardSize);
  layeredPane.addMouseListener(this);
  layeredPane.addMouseMotionListener(this);
  
  chessBoard = new JPanel();
  layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
  chessBoard.setLayout( new GridLayout(8, 8) );
  chessBoard.setPreferredSize( boardSize );
  chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
 
  for (int i = 0; i < 64; i++) {
  JPanel square = new JPanel( new BorderLayout() );
  chessBoard.add( square );
 
  int row = (i / 8) % 2;
  if (row == 0)
  square.setBackground( i % 2 == 0 ? Color.black : Color.white );
  else
  square.setBackground( i % 2 == 0 ? Color.white : Color.black );
  }
  }
  public void mousePressed(MouseEvent e){
  chessPiece = null;
  Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
 
  if (c instanceof JPanel) 
  return;
 
  Point parentLocation = c.getParent().getLocation();
  col = parentLocation.x - e.getX();
  row = parentLocation.y - e.getY();
  chessPiece = (JLabel)c;
  chessPiece.setLocation(e.getX() + col, e.getY() + row);
  chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
  layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
  }

  public void mouseDragged(MouseEvent me) {
  if (chessPiece == null) return;
 chessPiece.setLocation(me.getX() + col, me.getY() + row);
 }

  public void mouseReleased(MouseEvent e) {
  if(chessPiece == null) return;
 
  chessPiece.setVisible(false);
  Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
 
  if (c instanceof JLabel){
  Container parent = c.getParent();
  parent.remove(0);
  parent.add( chessPiece );
  }
  else {
  Container parent = (Container)c;
  parent.add( chessPiece );
  }
 
  chessPiece.setVisible(true);
  }
 
  public void mouseClicked(MouseEvent e) {
	  
  }
  public void mouseMoved(MouseEvent e) {
 }
  public void mouseEntered(MouseEvent e){
  
  }
  public void mouseExited(MouseEvent e) {
  
  }
 
  public static void main(String[] args) {
  JFrame frame = new Kasparovtron();
  frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
  frame.pack();
  frame.setResizable(true);
  frame.setLocationRelativeTo( null );
  frame.setVisible(true);
 }
}