package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp2 {  //좌표를 통한 container 위치와 크기 조절
   public static void main(String arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");

      mainWin.setLayout(null);     //레이아웃 없음. 버튼의 크기와 위치를 알려줘야 함. 버튼이 고정되어버리므로 창 크기를 바꾸면 버튼이 보이지 않을 수 있음. 권장되는 방법은 아님.
      mainWin.add(b);
      b.setSize(50, 30);    //너비 높이           
      b.setLocation(30, 30);        //x축 y축  

      mainWin.setSize(200,100);     
      mainWin.setVisible(true); 
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
   }
}