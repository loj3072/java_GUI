package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;

class MyApp1 {
   public static void main(String  arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");
      Button  b2 = new Button("CANCEL");

	  mainWin.setLayout(new FlowLayout() ); //Layout ����
	  mainWin.add(b);
	  mainWin.add(b2);

      mainWin.setSize(200, 100);     
      mainWin.setVisible(true);
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){//x��ư�� ������ â�� ��������
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
   }
}