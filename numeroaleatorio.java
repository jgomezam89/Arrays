package Arrays;

public class numeroaleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a;
		int suma = 0;
		a = new int [10];
		
		for (int i =0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10);
		}
			
		
		//Mostrar el array
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		//-----------------------
		
		for (int i =0; i <a.length; i++) {
			
			
		}
		
		suma += a[0] ;
		suma += a[1] ;
		suma += a[2];
		
		
		//----------------------
		
		System.out.println("La suma es " + suma);
		
	}

}
