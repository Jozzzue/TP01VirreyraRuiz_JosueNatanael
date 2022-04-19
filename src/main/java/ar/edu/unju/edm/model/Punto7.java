package ar.edu.unju.edm.model;

public class Punto7 {

	private int ocup;
	public Punto7() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] CreateNumericalSeq() {
		int seq[] = new int[41];
		int i=2,j=41;
	     ocup=0;
	    seq[ocup]=j;
	    for(j=j-2; j>=0 ; j=j-2)
	    {
	        seq[ocup+1] = seq[ocup] + j;
	        ocup++;
	    }
	
	    for(j=ocup; j>0 ; j--)
	    {
	        seq[ocup+1] = seq[j-1];
	        ocup++;
	    }
	    
	    return seq;
	}
	
	public void PrintNumSeq(int array[]) {
		int i;
		  for(i=1;i<=ocup;i++)
			  System.out.print(array[i]+ " ");
		  /*for(i=19;i>=0;i--)
			  System.out.print(array[i]+ " ");*/
	}
	
}
