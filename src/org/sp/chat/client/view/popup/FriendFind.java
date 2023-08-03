package org.sp.chat.client.view.popup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class FriendFind extends Popup{
	JPanel p_north;
	JPanel p_center;
	JLabel la_title,la_search;
	JTextField t_search;
	JButton bt_regist;
	
	public FriendFind() {
		p_north = new JPanel();
		p_center = new JPanel();
		la_title = new JLabel("친구추가");
		t_search = new JTextField("");
		bt_regist = new JButton("등록");
		
		//스타일
		p_north.setBorder(new LineBorder(Color.LIGHT_GRAY, 2)); //북쪽
		p_north.setPreferredSize(new Dimension(250, 50));
		t_search.setPreferredSize(new Dimension(200, 30)); //텍스트 필드 크기
		Font f= new Font("휴먼모음T", Font.PLAIN, 20); //타이틀 제목
		la_title.setFont(f); //타이틀 
		la_title.setPreferredSize(new Dimension(100,40));
		la_title.setHorizontalAlignment(JLabel.CENTER);
		
		//조립
		p_north.add(la_title);
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		p_center.add(t_search);
		p_center.add(bt_regist);
		
		setBounds(950, 200, 300, 380);
	}
}