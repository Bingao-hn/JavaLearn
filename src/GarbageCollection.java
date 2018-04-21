class Person{
    //下面定义的finalize方法会在垃圾回收前被调用
    public void finalize(){
        System.out.println("对象将被作为垃圾回收...");
    }
}
public class GarbageCollection{
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        //指针置null,让对象成为垃圾
        p1 = null;
        p2 =null;
        System.gc();    //调用方法进行垃圾回收
        for(int i=0;i<1000000;i++){}//延长程序运行时间，以便更好的看到垃圾回收过程，如果不加可能只看到一次或看不到输出  
    }
}