public class BaseClass {  
    public int book = 7;  
    public void base(){  
        System.out.println("父类的普通方法");  
    }  
    public void test(){  
        System.out.println("父类的被覆盖的方法");  
    }  
} 
public class SubClass extends BaseClass{  
    public String book = "我是一本书";  
    public void test(){  
        System.out.println("子类覆盖父类的方法");  
    }  
    public void sub(){  
        System.out.println("子类普通方法");  
    }  
      
    @Test  
    public void classtest(){  
        BaseClass bc = new BaseClass();  
        System.out.println(bc.book);//7  
        bc.base();//父类的普通方法  
        bc.test();//父类的被覆盖的方法  
        System.out.println("---------------------");  
        SubClass sc = new SubClass();  
        System.out.println(sc.book);//我是一本书  
        sc.sub();//子类普通方法  
        sc.test();//子类覆盖父类的方法  
        System.out.println("---------------------");  
        BaseClass polymorphic = new SubClass();  
        System.out.println(polymorphic.book);//7  
        polymorphic.test();//子类覆盖父类的方法  
          
    }  
}  