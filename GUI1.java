package xueshengxuanke;
import xueshengxuanke.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class GUI1 extends JFrame implements
ActionListener{  We we;
                   Container c;
                   JLabel label1;JLabel label2;JLabel label3;JLabel label4,label5;JLabel label6;
               	JLabel label7;JLabel label8;JLabel label9;JLabel label10,label11;JLabel label12;JLabel label13;
               	JButton button1,button2;
               	JButton button3,button4;
               	TextArea ta1,ta2;
               	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
               	CheckboxGroup cbg;
               	JComboBox b1;JComboBox b2;JComboBox b3;JComboBox b4;JComboBox b5;
               	JCheckBox c1,c2,c3;
               	
               	String bianhao[]={"004","005","006","007","008","009"};
               	String score[]={"0.5","1.0","1.5","2.0","2.5","3.0",};
               	public GUI1(){
               		super("选课系统");
               		label1=new JLabel("请输入个人信息及所选课程，单击确定。     ");
               		label7=new JLabel("请输入开设课程和相关信息，单击确定。 ");
               		label2=new JLabel("学生姓名：");
               		label8=new JLabel("教师姓名：");
               		label3=new JLabel("性别:");
               		cbg = new CheckboxGroup(); 
               		label9=new JLabel("课程名称：");
               		label6=new JLabel("学号：");
              
               		label5=new JLabel("课程：");
               		label11=new JLabel("上课地点：");
               		label12=new JLabel("课程编号：");
               		label13=new JLabel("学分：");
               		
               		b4=new JComboBox(bianhao);
               		b5=new JComboBox(score);
               		c1=new JCheckBox("线代");
               		c2=new JCheckBox("离散");
               		c3=new JCheckBox("大物");
               		ta1=new TextArea(10,10);
               		ta2=new TextArea(10,10);
               		button1=new JButton("确定");
               		button2=new JButton("取消");
               		button3=new JButton("确定");
               		button4=new JButton("取消");
               		t1=new JTextField("",5);
               		t2=new JTextField("",10);
               		t3=new JTextField("",5);
               		t4=new JTextField("",5);
               		t5=new JTextField("",5);
               		t6=new JTextField("",5);
               		t7=new JTextField("",5);
               		t8=new JTextField("",5);
               		setBounds(600,300,625,600);
               		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
               		}catch(Exception e){}
               		c=getContentPane();	              	
               		c.setLayout(new FlowLayout(FlowLayout.LEFT));
               		c.add(label1);
               		c.add(label7);
               		c.add(label2);
               		c.add(t1);

               		c.add(label3);
               		
               		c.add(new Checkbox("男", cbg, true)); 
               		c.add(new Checkbox("女", cbg, false));
               		c.add(new JLabel("           "));
               		c.add(label8);
               		c.add(t3);
               		c.add(new JLabel("                  "));
               		c.add(label6);
               		c.add(t2);

               		c.add(new JLabel("                  "));
               		c.add(label9);
               		c.add(t4);
               		
               		c.add(new JLabel("                  "));
               		c.add(label5);
               		c.add(c1);c.add(c2);c.add(c3);
               		
               		c.add(new JLabel("            "));
               		
               		
               		c.add(new JLabel("       "));

               		c.add(label11);
               		c.add(t6);
               		c.add(new JLabel("            "));
               	
               		c.add(new JLabel("               "));
               		c.add(label12);
               		c.add(b4);
               		c.add(new JLabel("          "));
               		
               		
               		
               	
               		c.add(new JLabel("                    "));
               		c.add(label13);
               		c.add(b5);
               	

               		c.add(new JLabel("                   "));
               		c.add(ta1);
               		c.add(new JLabel("     "));
               		c.add(ta2);
               		c.add(new JLabel("                                                 "));
               		
               		
               		c.add(button1);
               		c.add(button2);
               		c.add(button3);
               		c.add(button4);
               		setVisible(true);
               		button1.addActionListener(this);
               		button2.addActionListener(this);
               		button3.addActionListener(this);
               		button4.addActionListener(this);
               		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               		}
               	public void actionPerformed(ActionEvent e){
               	    	We p = null;
               	    	We q = null;
               	    	We r = null;
               	    	Student students = null;
               	    	We we = null;
               	    	p  = new We("线代", "001", "教101","1");
               	    	q  = new We("离散", "002", "教102","2");
               	    	r  = new We("大物", "003", "教103","3");
               			if(e.getSource()==button1)
               				
               				ta1.append("姓名："+t1.getText()+"\n"+
               				"学号："+t2.getText()+"\n"+"性别："
               				+cbg.getSelectedCheckbox().getLabel()+
               				"\n");
               				if(c1.isSelected() && e.getSource()==button1)
               					ta1.append( "课程名称：" + c1.getLabel()+" "+p.toString()+"\n");
               					students = new Student(t1.getText(),t2.getText(),
               							cbg.getSelectedCheckbox().getLabel(),p);
               				if(c2.isSelected() && e.getSource()==button1)
               					ta1.append( "课程名称：" + c2.getLabel()+" "+q.toString()+"\n");
               					students = new Student(t1.getText(),t2.getText(),
               							cbg.getSelectedCheckbox().getLabel(),q);
               				if(c3.isSelected() && e.getSource()==button1)
               					ta1.append( "课程名称：" + c3.getLabel()+" "+r.toString()+"\n");
               					students = new Student(t1.getText(),t2.getText(),
               							cbg.getSelectedCheckbox().getLabel(),r);
               					ta1.append("\n");
               			if(e.getSource()==button4){
               				System.exit(0);
               			}
               			if(e.getSource()==button2){
               				System.exit(0);
               			}
               			if(e.getSource()==button3)
            				ta2.append("教师姓名："+t3.getText()+"\n"+
            				"课程名称："+t4.getText()+"\n"+"上课地点："+t6.getText()
            				+"\n"+"课程编号："+t5.getText()+"\n"+"课时："+b4.getSelectedItem()
            				+"\n"+"学分："+b5.getSelectedItem()+"\n");
               			
               			
               				we = new We(t4.getText(),t5.getText(),
               						t6.getText(),t7.getText());
               			


               		
               	}

                             	
               	public static void main(String[] args){
               		GUI1 d = new GUI1();
               	}

}
