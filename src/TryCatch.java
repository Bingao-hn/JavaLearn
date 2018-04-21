class TryCatch{
    public static void main(String []args){
        try {
            int result = divide(4,0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception is :"+e.getMessage());
            return;
        }finally{ //无论程序是否发生异常，这里的语句都要执行
            //有一种情况finally不会执行，那就是try...catch...中执行了System.exit(0),表示退出当前Java虚拟机，虚拟机都退出了，后面的代码自然也不会执行了
            System.out.print("after return ,run to here!");
        }
        System.out.print("run to here!");//发生异常后，这里不会打印
    }
    public static int divide(int x,int y){
        int result =x / y;
        return result;
    }
}