class B {
int i=2; //类初始化
int j;
B(){j=3;}
}
public class ConstructorDemo2 {
public static void main(String[] args) {
B b=new B();
System.out.println("类初始化i="+b.i);
System.out.println("构造器初始化j="+b.j);
}

}
