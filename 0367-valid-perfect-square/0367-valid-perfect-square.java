class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1; // Start of the search range
        long end = num; // End of the search range

        while (start <= end) { // Continue until the range is exhausted
            long mid = start + (end - start) / 2; // Calculate mid to avoid overflow

            if (mid * mid < num) { // If mid squared is less than num
                start = mid + 1; // Narrow search to the right half
            } else if (mid * mid > num) { // If mid squared is greater than num
                end = mid - 1; // Narrow search to the left half
            } else { // Found the number whose square equals num
                return true;
            }
        }
        return false; // No perfect square found
    }
}