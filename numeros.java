package Arrays;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 50;
		
		int [] a;
		int numero = 0;
		a = new int  [TAM];
		
		for (int i =0; i<a.length; i++) {
			a[i] = (int) (Math.random()*10);			
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		for (int i =0; i<a.length; i ++) {
			numero += a[i];
		}
	
		/*
		  numero += a[0];
		  numero += a[1];
		  numero += a[2];
		  numero += a[3];
		  numero += a[4];
	*/
		  System.out.print("la suma es: " + numero ); 
	
	}

}
