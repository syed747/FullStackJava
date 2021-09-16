package mod1.rev.day3;

public class PBVAndPBRDemo {
	public static void main(String[] args) {
		Item item=new Item();
		PBV obj=new PBV();
		System.out.println(item.s);
		obj.accept(item.s);
		System.out.println(item.s);
		
		PBR obj2=new PBR();
		System.out.println(item.s);
		obj2.accept(item);
		System.out.println(item.s);
		
		int arr[]= {10,20,30,40};
		item.accept(arr);
		System.out.println(arr[0]+":"+arr[1]+":"+arr[2]);
	}
}
class Item{
	String s="original...";
	public void accept(int arr[]) {
		arr[0]=1000;
		arr[1]=2000;
	}
}
class PBV{
	public void accept(String s) {
		s="changed....";
	}
}
class PBR{
	public void accept(Item item) {
		item.s="changed...";
	}
}
