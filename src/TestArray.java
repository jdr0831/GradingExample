
public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Student[][] = new int[][]{{1,3,2,4,3,1,4,2,2,1},{3,2,4,2,2,1,1,3,4,1},{2,4,3,2,1,2,1,3,3,4},{2,3,3,1,1,3,2,2,4,4},{3,1,1,2,4,1,2,3,1,3}};
		int correct[] = new int[]{Integer.parseInt(args[0]),Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]),Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8]),Integer.parseInt(args[9])};
		int Stu_score[] = new int[]{0,0,0,0,0};
		char OX[][] = new char[5][10];
		
		System.out.println("학생들 점수");
		for(int i=0;i<=4;i++){
			for(int j=0;j<=9;j++){
				System.out.print("학생"+i+" : "+Student[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.print("java Grading : ");
		for(int i=0;i<10;i++)
			System.out.print(correct[i]+" ");
		System.out.println();
		
		for(int i=0;i<=4;i++){
			for(int j=0;j<=9;j++){
				if(Student[i][j]==correct[j]){
					Stu_score[i]+=10;
					OX[i][j]='O';
				}
				else{
					OX[i][j]='X';
				}
			}
		System.out.println("학생"+(i+1)+"의 점수는 "+Stu_score[i]);
		System.out.println(OX[i]);
		}
	}
}