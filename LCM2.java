package projects;

public class LCM2 {
	public static boolean checkLCM(int[] raw, long lcm) {
		boolean check = true;
		
		for(int i=0;i<raw.length;i++) {
			if(lcm%raw[i]!=0) {
				check=false;
				return check;
			}
		}
		
		return check;
	}

	public static void main(String[] args) {
//		int[] main=MyArray.initializeArray();
		long a = System.currentTimeMillis();
		int[] main= {3434,4334,3433,34433,94,3,34,35,34,232,432,2423,232,4232,23,42,23,24,23,32,42,23,423,23,34,3,45,34,53,43,33,4,34,3,5,34,34,53,4,3,53,4,51,43,4,2,2,3,24,24,34,5,34,3,53,4,35,34,2,2,4,5,34,11323,5,34,34,2,3,24,2,232,42,4,23,24,43,43,4,3,64,5,46,7,5,77,56,57,565,6,5,6};
//		System.out.print("The LCM of ");
//		MyArray.printArray(main);
		long lcm = lcm(main);
		System.out.print("\nIs : "+lcm+"\n");
//		System.out.println(checkLCM(dup, lcm));
		long b = System.currentTimeMillis();
		System.out.println(b-a);
//		System.out.println(checkLCM(main,lcm));
	}
	public static long lcm(int main[]) {
		long lcm=1;
		int temp=0;
		while(temp!=1){
			temp=MyArray.minOfNot1(main);
			int leastfactor=PrimeFactors.leastFactor(temp);
			lcm*=leastfactor;
			for(int i=0;i<main.length;i++) {
				if(main[i]%leastfactor==0) {
					main[i]=main[i]/leastfactor;
				}
			}
		}
		return lcm;
		
	}
}