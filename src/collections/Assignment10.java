package collections;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num[] = new int[5];
			//num[2]=10/0;
			
			System.out.println(num[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
