package programmingchallenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	
	
	public static void main(String[] args) throws Exception{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String ln = buff.readLine();
		while(ln!=null){
			String[] info = ln.split(" ");
			int[] nums = new int[info.length];
			for(int i = 0; i < nums.length;i++){
				nums[i] = Integer.parseInt(info[i]);
			}
			int n = nums[0];
			if(n==0){
				System.out.println("Jolly");
				ln = buff.readLine();
				continue;
			}
			boolean[] array = new boolean[n-1];
			boolean valid = true;
			for (int i = 1; i < info.length-1 && valid; i++) {
				int dif = Math.abs(nums[i]-nums[i+1])-1;
				if(dif >= array.length || array[dif]){
					valid=false;
				}else{
					array[dif]=true;
				}
			}
			if(valid)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
			ln = buff.readLine();
		}
		
		
	}
	
	
}
