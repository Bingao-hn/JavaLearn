class Convert{
	public static void main(String[] args){
		short s =3;
		int i =5;
		//s = i;	//错误: 不兼容的类型: 从int转换到short可能会有损失
		s += i;		//在使用+= *=等运算符时，会自动强制类型转换
		System.out.println(s);
	}
}