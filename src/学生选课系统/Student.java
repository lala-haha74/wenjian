package ѧ��ѡ��ϵͳ;

class Student extends Person{
	Teacher teacher;//����ʦ�Ŀε���Ϣ��������
	public Student(int id,String name,String sex,Teacher teacher) {
		this.id = id;//���ò��Ҵ������
		this.name = name;
		this.sex = sex;
		this.teacher = teacher;//����Teacher��
	}
	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		   return "ѧ����Ϣ  ��       " +"  ѧ�ţ�" + id+ " ������" + name 
				   + " �Ա�" + sex+"["+teacher+"]" ;
		   }
		   
}