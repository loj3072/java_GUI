package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp3 {  
   public static void main(String  arg[]) {
      Frame  mainWin = new Frame("First Frame");

      Label name  = new Label (" NAME : ");
	  Label addr = new Label (" ADDRESS:");
      TextField tf1 = new TextField();              // a blank text field
      TextField tf2 = new TextField("", 20);        // blank field of 20 columns

      mainWin.setLayout(new GridLayout(2,2)); //�׸���. �ٵ��ǽ����� �ؼ� �Ȱ��� ũ��� ���� ä���� UI�� ����.
      mainWin.add(name);
      mainWin.add(tf1);
      mainWin.add(addr);
      mainWin.add(tf2);
      mainWin.setSize(300, 120);
      mainWin.setVisible(true);  
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
   }
}