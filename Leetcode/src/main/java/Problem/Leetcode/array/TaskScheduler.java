package Problem.Leetcode.array;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		//use this formula to solve the problem :
		// n - interval of one task -> (n+1)
		//maxfrequency among the frequency ->(mf-1)
		//numofmaxfrequency -> max
		//(n+1)(mf-1) +max;
		
		//find frequency
		int frequency[] = new int[26]; //represent the 26 alphabets
		
		int maxFrequency = 0;
		
		for(char task : tasks) {
			frequency[task-'A']++;
			maxFrequency = Math.max(maxFrequency, frequency[task-'A']);
		}
		
		int numOfElementsWithMaxFreq = 0;
		
		for(int frequencies: frequency) {
			if(frequencies == maxFrequency) {
				numOfElementsWithMaxFreq++;
			}
		}
		
		//formula ;
		
		int interval = Math.max((n+1) * (maxFrequency - 1) + numOfElementsWithMaxFreq , tasks.length);
		
		return interval;
	}
}
