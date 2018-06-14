package edu.skku.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class UITest {

	public static void main(String[] args) {
		Button b1=new Button("OK1"); //버튼은 컴포넌트
		Label b2=new Label("OK2");
		TextField b3=new TextField("OK3");
		Frame f=new Frame("Test");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setLayout(new FlowLayout());
		//화면 표시
		f.setSize(300,200); //화면 사이즈 가로 300 세로 200
		f.setVisible(true);//이래야 화면이 보여짐
		
		

	}

}
