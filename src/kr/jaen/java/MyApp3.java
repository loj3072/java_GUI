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

      mainWin.setLayout(new GridLayout(2,2)); //그리드. 바둑판식으로 해서 똑같은 크기로 가득 채워서 UI를 만듦.
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