package Problem.Leetcode.Math;

public class FindThePivotInteger {
	public int pivotInteger(int  n) {
		
		int leftSum = 0 ;
        int totalSum = 0 ;
        if(n==1)
            return 1;
        for(int i=1 ; i<= n; i++){
            totalSum += i;
        }

        for(int i = 1; i<=n; i++){
            int rightSum = totalSum - i - leftSum;
            if(rightSum == leftSum)
                return i;
            
            leftSum += i;

        }

        return -1;
    }
}
