package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=6709;
    int digits=0;
    int []a= {0,0,0,0,0,0,0,0,0};
    
    digits=0;
    digits=String.valueOf(n).length();
  
    //übrigbleibenden Nullen erschaffen
    for (int i=0; i<(9-digits);i++) {
    	a[i]=0;  
    System.out.println(a[i]); }
	
    //Ziffern von n
    for(int i=8;i>=9-digits; i--) {
    	a[i]=n%10;
    	n=n/10;}
    
    for (int z=9-digits; z<9; z++) {
    	System.out.println(a[z]);
    
    }
}
}