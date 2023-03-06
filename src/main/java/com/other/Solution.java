package com.other;

class Solution {
    static int maxPartitions(int A[], int n)
    {
        int N = A.length;

        // To keep track of max
        // and min elements at every index
        int[] leftMax = new int[A.length];
        int[] rightMin = new int[A.length];

        leftMax[0] = A[0];

        for (int i = 1; i < N; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        rightMin[N - 1] = A[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], A[i]);
        }

        int count = 0;

        for (int i = 0; i < N - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                count++;
            }
        }

        // Return count + 1 as the final answer
        return count + 1;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 4,3,2,6,1 };
        int n = arr.length;
        System.out.println(maxPartitions(arr, n));
    }
}
