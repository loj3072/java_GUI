package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp2 {  //��ǥ�� ���� container ��ġ�� ũ�� ����
   public static void main(String arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");

      mainWin.setLayout(null);     //���̾ƿ� ����. ��ư�� ũ��� ��ġ�� �˷���� ��. ��ư�� �����Ǿ�����Ƿ� â ũ�⸦ �ٲٸ� ��ư�� ������ ���� �� ����. ����Ǵ� ����� �ƴ�.
      mainWin.add(b);
      b.setSize(50, 30);    //�ʺ� ����           
      b.setLocation(30, 30);        //x�� y��  

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