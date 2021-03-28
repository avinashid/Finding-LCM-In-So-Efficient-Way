package projects;


public class PrimeFactors {
	 private PrimeFactors() {};
	 
	 public static int[] primeFactorization(int a) {
//		It print prime Factorization for 8 it will print 2,2,2;
		int[] store= new int[0];
		if(a==0) { 
			int ar[]= {0};
			return ar;
		}else {
			while(a>1) {
				for(int i=2;i<=a;i++) {
					if(a%i==0) {
						store=MyArray.add(store, i);
						a=a/i;
						break;
					}
				}
			}
		}
		return store;
	 }
	 public static int leastFactor(int a){ 
//		 It will print least Factor other than 1 if 1 is not a parameter
		 if(a>1) {
			 for(int i=2;i<=a;i++) {
				 if(a%i==0) {
					 return i;
				 }
			 }
		 }
		 return 1;
	 }

	 public static int[] factors(int a) {
//		It will print only factors example for 8 print only 2;
		int arr[]= new int[a];
		int sum=0,temp=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				arr[i]=i;
				sum++;
			}
		}
		int real[]=new int[sum];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				real[temp]=arr[i];
				temp++;
			}
		}
		return real;
	}
	static boolean primeOrNot(int n) {
//		Say a integer a Prime number of not a prime number
		boolean is=true;
		if(n==1) return false;
		else for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					is = false;
					break;
				}
			}
			return is;
		}
	static public void main(String[] args) {
//		System.out.println(leastFactor(9));
		
	}
}
