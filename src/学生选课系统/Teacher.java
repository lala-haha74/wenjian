package ѧ��ѡ��ϵͳ;

class Teacher extends Person{
	String course;
	String address;
	String time;
	int score;
	
	String getcourse() {
		return course;
	}
	String getaddress() {
		return address;
	}
	int getscore() {
		return score;
	}
	public String gettime() {
		return time;
	}
	public Teacher(int id,String name,String sex,String course,
			        String address,String time,int score) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.course = course;
		this.address = address;
		this.time = time;
		this.score = score;
	}
	public String toString() {
		   return "�γ̱�ţ�" + id +" ��ʦ���ƣ�" + name + " ��ʦ�Ա�" + sex 
				   +" �γ̣�"+ course + "   ��ַ��"+address+"   ѧ�֣�"+score+"  ʱ�䣺 "+ time ;
		   
		}
}