package test.chapter16.arrays;

import java.util.Arrays;
import java.util.Random;

public class Quiz4_6 {
	public double[][][] createArrays(int x,int y,int z ,double start, double end){
		
		double[][][] dArray = new double[x][y][z];
		Random rand = new Random(47);
		double gap = end - start;
		for(int i = 0 ;i < dArray.length; i++){
			for(int j = 0;j<dArray[i].length;j++ ){
				for(int k=0;k<dArray[i][j].length;k++){
				dArray[i][j][k] = gap * rand.nextDouble() + start;
				}
			}
		}

		return dArray;
	}
	public void pArray(double[][][] da){
		System.out.println(Arrays.deepToString(da));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz4_6 q =new Quiz4_6();
		q.pArray(q.createArrays(2, 1, 3, 10, 15));

	}

}
