package Arrays;

public class Detector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int TAM = 10;
		int[] a;
		int numero = 0;
		a = new int[TAM];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
			System.out.print(" " + a[i]);

		}

		/// Quiero saber si a[0] es 5

		/*
		 * if (a[0] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco"); }
		 * 
		 * if (a[1] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco"); }
		 * 
		 * if (a[2] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco");
		 * 
		 * } if (a[3] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco"); if (a[4] == 5) {
		 * System.out.println(" es cinco"); } else { System.out.println(" no es cinco");
		 * if (a[5] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco"); if (a[6] == 5) {
		 * System.out.println(" es cinco"); } else { System.out.println(" no es cinco");
		 * } if (a[7] == 5) { System.out.println(" es cinco"); } else {
		 * System.out.println(" no es cinco"); } if (a[8] == 5) {
		 * System.out.println(" es cinco"); } else { System.out.println(" no es cinco");
		 * }
		 */
		
		boolean hayCinco = false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 5) {
				System.out.print("hay cinco");			
				hayCinco = true;
				break;
			}
		}
		if (hayCinco == false)
			System.out.println("no hay");
	}
}
