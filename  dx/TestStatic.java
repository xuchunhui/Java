class B {
int i=2; //���ʼ��
int j;
B(){j=3;}
}
public class TestStatic {
public static void main(String[] args) {
B b=new B();
System.out.println("���ʼ��i="+b.i);
System.out.println("��������ʼ��j="+b.j);
}

}