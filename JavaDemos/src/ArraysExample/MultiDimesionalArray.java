package ArraysExample;

public class MultiDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int marks[][] = {{55,65,85,67,90},
					{45,56,67,78,89,90},
					{77,88,98,89,77}};
			int rowLength = marks.length;
			int columnLength = marks[0].length;
			System.out.println("Row length ="+marks.length);
			System.out.println("Column length ="+marks[0].length);
			System.out.println();
			int sum = 0;	
	
	for(int i=0;i<rowLength;i++) {
		sum = 0;
		for(int j=0;j<columnLength;j++) {
			sum = sum +marks[i][j];
			//System.out.println(sum);
			//System.out.println( "marks["+i+"]["+j+"]="+marks[i][j]);
		}
		System.out.println("Sum of marks = "+sum);
		System.out.println("Average of marks = "+sum/5);
		System.out.println();
	}
	
	}
}
