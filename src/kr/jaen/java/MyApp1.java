package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;

class MyApp1 {
   public static void main(String  arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");
      Button  b2 = new Button("CANCEL");

	  mainWin.setLayout(new FlowLayout() ); //Layout 변경
	  mainWin.add(b);
	  mainWin.add(b2);

      mainWin.setSize(200, 100);     
      mainWin.setVisible(true);
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){//x버튼을 누르면 창이 닫히도록
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
   }
}