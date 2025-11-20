package h3;


public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][]einheiten= {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    int input=11;
 
    
    System.out.println("der Geldbetrag "+input);

    System.out.println("lässt sich darstellen durch ");
    
    //Geld=Münzen/Scheine, Stückzahl=wie viele Münzen und Scheine man benötigt
    for(int i=0;i<15;i++) {
    	int geld=einheiten[0][i];
    	int Stückzahl=input/geld;
    	einheiten[1][i]=Stückzahl;
    	input=input% geld;  }
    
    
    for(int i=0;i<15; i++) {
    	if(einheiten[0][i]>0) {
    
    System.out.println(einheiten[1][i]+" "+einheiten[0][i]);
	}

}
}
}