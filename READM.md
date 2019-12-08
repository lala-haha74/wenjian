#学生选课 
班级：计181 姓名：管瑞强 学号：2018310742
一、实验目的   分析学生选课  使用GUI窗体及其组件设计窗体界面   完成学生选课过程业务逻辑编程   基于文件保存并读取数据   处理异常
二、实验要求  1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。   2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。   3、针对操作过程中可能会出现的各种异常，做异常处理
三、实验过程   1. 编写思路  先画出流程图，确定需要实现哪些功能，然后再根据框架写出程序。先确定需要哪些包（swing\awt\IO），将包导入，导入后先构建整体的GUI的所有界面，将界面通过监听事件相连接。然后在需要文本写入与文本读出的地方的界面写上文本操作。而打印课表则是通过将文件打开，显示出学生基本信息、所选课程来实现的。
              2. 流程图  ![image](https://github.com/lala-haha74/wenjian/blob/master/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)
              3.核心代码：package wenjian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


	public class register extends JFrame implements ActionListener{
		JLabel id = new JLabel("请输入学号：");
		JLabel name = new JLabel("请输入姓名：");
		JLabel password = new JLabel("请输入密码：");
		JTextField jtf1 = new JTextField(15); 
		JTextField jtf2 = new JTextField(15); 
		JTextField jtf3 = new JTextField(15); 
		JButton r = new JButton("注册");
		
		register(){
			setTitle("注册");
			setSize(300,250);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setLayout(new FlowLayout());
			
			add(id);add(jtf1);
			add(name);add(jtf2);
			add(password);add(jtf3);
			add(r);
			r.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==r) {
				JOptionPane.showMessageDialog(null, "注册成功！");
				new caozuo();
				/*
				 * 将注册信息转化成字符，写入txt中
四、实验结果
 ![image](https://github.com/lala-haha74/wenjian/blob/master/%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE.png)
五、实验感想
      这次实验是一次综合性实验，不仅要用到最新学到的关于数据的输入输出的语句，也用到了以前学过的语句，既学习了新的知识，又巩固了旧的知识。这是最后一次试验了，通过这几次实验，我发现了自己写代码时的不足，学习新的知识很吃力，导致写出来的代码中错误很多，发现了自己的不足之后，我也努力练习，希望能能更熟悉java，写出更复杂更通顺的代码。
      







