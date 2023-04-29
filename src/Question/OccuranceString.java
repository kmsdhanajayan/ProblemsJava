package Question;

public class OccuranceString {
	
	public static void main(String[] args) {
		
	
String s = "ashokJayan333@gmail.com";//small letters=17 large letters=1 number=3 special charecters=2
int smallcount= 0;
int largecount= 0;
int numbercount= 0;
int specialcount= 0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c>='a' && c<='z') {
		smallcount++;
		
}
	else if(c>='A' && c<='Z') {
		largecount++;
		
}
	else if(c>='0' && c<='9') {
		numbercount++;
	}
	else { 
		specialcount++;
		
	}
}
System.out.println(smallcount++);
System.out.println(largecount++);
System.out.println(numbercount++);
System.out.println(specialcount++);

	}
	}


