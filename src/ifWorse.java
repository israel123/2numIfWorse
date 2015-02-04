import java.util.Scanner;
public class ifWorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numFirst, numSecond ,oneNumFirst, tensNumFirst, oneNumSecond, tensNumSecond;
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter number first ");
		numFirst = sc.nextInt();
		System.out.print("please enter number second ");
		numSecond = sc.nextInt();
		
		oneNumFirst = numFirst % 10;
		tensNumFirst = numFirst / 10;
		
		oneNumSecond = numSecond % 10;
		tensNumSecond = numSecond / 10;
		//System.out.println(oneNumFirst);
		//System.out.print(tensNumFirst);
		
		if (numFirst == numSecond){
			System.out.println("number is equal");
		}
		else if ((oneNumFirst == tensNumSecond)&&(tensNumFirst== oneNumSecond)){
			System.out.println("digits it the same");
		}
		else {
			System.out.println("number and digits it is not equal");
		}
	}

}
