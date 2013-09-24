package uva.p10038;

//@JUDGE_ID:  1000AA  100  Java  "Easy algorithm"

import java.io.*;
import java.util.*;

class Main
{
 
 public static void main (String args[])  // entry point from OS
 {
     Main myWork = new Main();  // create a dinamic instance
     myWork.Begin();            // the true entry point
 }

 void Begin()
 {
     StringTokenizer idata;
     	Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){			
			idata = new StringTokenizer (sc.nextLine());
			int n = Integer.parseInt(idata.nextToken());
			if(n<=0){
				System.out.println("Jolly");
				continue;
			}
			
			int[] nums = new int[n];
			for(int i = 0; i < nums.length;i++){
				nums[i] = Integer.parseInt(idata.nextToken());
			}
			

			boolean[] array = new boolean[n-1];
			boolean valid = true;
			for (int i = 0; i < n-1 && valid; i++) {
				int dif = Math.abs(nums[i]-nums[i+1])-1;
				if(dif >= array.length || dif < 0 || array[dif]){
					valid=false;
				}else{
					array[dif]=true;
				}
			}
			if(valid)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
 }
}
