public class BaseClass {  
    public int book = 7;  
    public void base(){  
        System.out.println("�������ͨ����");  
    }  
    public void test(){  
        System.out.println("����ı����ǵķ���");  
    }  
} 
public class SubClass extends BaseClass{  
    public String book = "����һ����";  
    public void test(){  
        System.out.println("���า�Ǹ���ķ���");  
    }  
    public void sub(){  
        System.out.println("������ͨ����");  
    }  
      
    @Test  
    public void classtest(){  
        BaseClass bc = new BaseClass();  
        System.out.println(bc.book);//7  
        bc.base();//�������ͨ����  
        bc.test();//����ı����ǵķ���  
        System.out.println("---------------------");  
        SubClass sc = new SubClass();  
        System.out.println(sc.book);//����һ����  
        sc.sub();//������ͨ����  
        sc.test();//���า�Ǹ���ķ���  
        System.out.println("---------------------");  
        BaseClass polymorphic = new SubClass();  
        System.out.println(polymorphic.book);//7  
        polymorphic.test();//���า�Ǹ���ķ���  
          
    }  
}  