package BinarySearch;
//Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
//        You have to paint all N boards [C0, C1, C2, C3 … CN-1].
//        There are A painters available and each of them takes B units of time to paint 1 unit of the board.
//
//        Calculate and return the minimum time required to paint all boards under the constraints that
//        any painter will only paint contiguous sections of the board.
//        NOTE:
//        1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
//        2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.
//
//        Return the ans % 10000003

// Input1          Input2
//A = 2             A = 10
//B = 5             B = 1
//C = [1, 10]       C = [1, 8, 11, 3]
public class PaintersPartition {
    public static boolean canPaint(int[] boards, int painters, int maxUnitsPerPainter){
        int requiredPainters = 1;   // we start with one painter
        int currentUnits = 0;       // units assigned to the current painter

        for(int length : boards) {
            // if a single board itself is larger than the allowed limit
            if (length > maxUnitsPerPainter) return false;

            if (currentUnits + length <= maxUnitsPerPainter) {
                currentUnits += length;  // assign board to current painter
            } else {
                requiredPainters++;      // need a new painter
                currentUnits = length;   // start assigning from this board
            }
        }
        return requiredPainters <= painters;
    }

    public static int paint(int A, int B, int[] C) {
        int max = 0, sum = 0;
        for(int i=0;i<C.length;i++){
            sum += C[i];
            max = Math.max(C[i],max);
        }

        int low = max, high = sum;

        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canPaint(C,A,mid)){
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return (int)((long)ans*B % 10000003);

    }
    public static void main(String[] args) {
        int A = 10, B = 1;
        int[] C = {1,8,11,3};
        System.out.println("minimum time required to paint all boards : "+paint(A,B,C));
    }
}
