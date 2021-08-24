package mod1.rev.day2;

public class LoopingConstructs {
public static void main(String[] args) {
	// for and while and do while 
	int i=1;
	while(i<10) {//pre condition check
		System.out.println(i);
		i++;
		
	}
	i=1;
	do {
		System.out.println("do while loop...."+i);
	}while(i<10);//post condition check

//while (true) {-infinte loop
	
//	}
	//for(;;){}//infinte loop
	//for (initilisation;conditioncheck;increment or decrement){}
	for(int n=0;n<10;n++) {
		System.out.println(i);
		
	}
}
}