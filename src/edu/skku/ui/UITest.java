package edu.skku.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class UITest {

	public static void main(String[] args) {
		Button b1=new Button("OK1"); //��ư�� ������Ʈ
		Label b2=new Label("OK2");
		TextField b3=new TextField("OK3");
		Frame f=new Frame("Test");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setLayout(new FlowLayout());
		//ȭ�� ǥ��
		f.setSize(300,200); //ȭ�� ������ ���� 300 ���� 200
		f.setVisible(true);//�̷��� ȭ���� ������
		
		

	}

}
