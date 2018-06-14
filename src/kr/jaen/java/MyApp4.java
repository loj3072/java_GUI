package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp4 {  //화면에 버튼이 나타났다 사라지는 예제
   public static void main(String arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("Hello newFont");
      Font f = new Font
                  ("Serif", Font.BOLD+Font.ITALIC, 16);

      b.setFont(f);	 
      b.setForeground(Color.blue);
      mainWin.setBackground(Color.yellow);

      mainWin.setLayout(new FlowLayout());
      mainWin.add(b);

      List color = new List(3, false); 
      color.add("red");
      color.add("blue");
      color.add("green");
      color.add("yellow");
      color.add("cyan");
      mainWin.add(color);

      mainWin.setSize(200, 250);     
      mainWin.setVisible(true);       
	
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {}
	  
	  b.setVisible(false);      // 사라짐
      
	  try {
          Thread.sleep(3000);
		  System.out.println(Thread.currentThread());
      } catch (InterruptedException e) {}

      b.setVisible(true);     // 나타남
	// event handling...
	  mainWin.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });

   }
}