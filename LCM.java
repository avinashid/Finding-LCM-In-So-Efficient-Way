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
		int[] main= {37,5,77,56,57,565,6,5,6};
		System.out.print("The LCM of ");
		MyArray.printArray(main);
		long lcm = lcm(main);
		System.out.print("\nIs : "+lcm+"\n");
//		System.out.println(checkLCM(main, lcm));
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
