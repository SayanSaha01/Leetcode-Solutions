class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int window = 1; window <= arr.length; window += 2)
		  for (int i = 0; i + window <= arr.length; i++)
			for (int j = i; j < i + window; j++)
				total += arr[j];
        return total;
    }
}

