package ѧ��ѡ��ϵͳ;

import java.util.Scanner;

public class Timetable {
	public static void main(String[] args) {
		Teacher t1,t2,t3;
		/*t1,t2,t3���ڴ����ʦ��ַ��*/
		Student s1,s2,s3;
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("�γ����£�");	
		t1 = new Teacher(1,"�Գ�","��","����","��101","8:00am--10:00am",5);
		System.out.println(t1.toString());
		t2 = new Teacher(2,"Ǯ���","��","Java","��101","10:20am--12:20am",3);
		System.out.println(t2.toString());
		t3 = new Teacher(3,"������","Ů","Ӣ��","��102","2:00pm--4:00pm",2);
		System.out.println(t3.toString());
		System.out.println("ѧ����Ϣ  ��   ѧ�ţ�7   ���������װ�    �Ա���" );
		s1 = new Student(7,"���װ�","��",t1);
		s2 = new Student(7,"���װ�","��",t2);
		s3 = new Student(7,"���װ�","��",t3);
		System.out.println ("��ѡ��γ�(ֻ��������ѡ�λ��ᣩ��");
		Scanner i = new Scanner(System.in);//�ַ����룬�Է���ѧ��ѡ��
		int a = i.nextInt();
		/*
		 * ѡ�β�����ѡ�γ̴�ӡ
		 */
		switch(a){
	         case 1:
	            System.out.println("����Ӹÿγ�   "+s1.toString());break;
	         case 2:
	            System.out.println("����Ӹÿγ�"+s2.toString());break;
	         case 3:
	            System.out.println("����Ӹÿγ�"+s3.toString()); break;
	         default:
	            System.out.println("����ѡ");
	      }
		 System.out.println("�����ѡ�Σ�");
		 int b = i.nextInt();
			switch(b){
		         case 1:
		            System.out.println("ע�⣬�ÿγ���ѡ��");break;//����һ��ѡ�γ�һ������ʾ
		         case 2:
		            System.out.println("����Ӹÿγ�"+s2.toString());break;
		         case 3:
		            System.out.println("����Ӹÿγ�"+s3.toString()); break;
		         default:
		            System.out.println("����ѡ");
		      }
			System.out.println("�����ѡ�Σ�");
			 int c = i.nextInt();
				switch(c){
			         case 1:
			            System.out.println("ע�⣬�ÿγ���ѡ��");break;
			         case 2:
			            System.out.println("ע�⣬�ÿγ���ѡ��");break;
			         case 3:
			            System.out.println("����Ӹÿγ�"+s3.toString()); break;
			         default:
			            System.out.println("����ѡ");
			      }
			System.out.println();//����
			System.out.println("��ѡ�γ̣�");
			 if( a == 1 ){
				 System.out.println(t1.toString());
		      }
			 if(b == 2 ){
				 System.out.println(t2.toString());	 
		      }
			 else if(b == 3){
				 System.out.println(t3.toString());
			 }
			 if( c == 3 ){
				 System.out.println(t3.toString());
		      }
			 else if(c == 2){
				 System.out.println(t2.toString());
			 }
        System.out.println();
        /*
         * �����˿����̲����˿κ󽫿α��ӡ
         */
        System.out.println("�˿�(ֻ��һ���˿λ���):");
        int d =i.nextInt();
        System.out.println("ѧ����Ϣ  ��   ѧ�ţ�7   ���������װ�    �Ա���" );
        if(d == 1) {
        	  System.out.println("�˿γɹ���");
        	  System.out.println(t2.toString());
        	  System.out.println(t3.toString());
        }else if(d == 2) {
        	System.out.println("�˿γɹ���");
        	System.out.println(t1.toString());
      	    System.out.println(t3.toString());
        }else if(d == 3) {
        	System.out.println("�˿γɹ���");
        	System.out.println(t1.toString());
      	    System.out.println(t2.toString());
        }	
	}
}
