import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

class Swing03 {
    public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas();   //Draw ton canvas

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(800, 500);
        window.add(canvas);
        window.pack();  // set the "size of frame to preferred sizes"
        window.setResizable(false); // Do not change the size frame whit mouse
        window.setLocationRelativeTo(null); // center of window
        window.setVisible(true);
    }
}

class MyCanvas extends JPanel {
    public MyCanvas () {
        setPreferredSize(new Dimension(800,500));
        setBackground(Color.DARK_GRAY);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintBrush=new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawCar();
        
    }
}

class Paintbrush{
    private Graphics g;
    //private static final Color COLOR_BROWN=new Color(34,27,21);
    public Paintbrush(Graphics g){
        this.g=g;
    }
    public void drawSky(){
        //make Sky
        g.setColor(new Color(127,233,245));
        g.fillRect(0,0,800,200);
       
        //make Sun
        g.setColor(Color.YELLOW);
        g.fillOval(40,40,50,50);
    }
    public void drawCar(){
        //make vehicle car
        g.setColor(Color.RED);
        g.fillRect(400, 200, 150, 45);

        //make windows
        g.setColor(Color.BLUE);
        g.fillRect(450, 172, 70, 30);

        //make tires
        g.setColor(Color.BLACK);
        g.fillOval(400,220,40,40);

        g.setColor(Color.BLACK);
        g.fillOval(510,220,40,40);
    }

   /*  public void drawMountains(){
        Polygon triangle=new Polygon();
        
        triangle.addPoint(30,120);
        triangle.addPoint(300,40);
        triangle.addPoint(500,130);
        g.setColor(COLOR_BROWN);
        g.fillPolygon(triangle);
    }*/

}
