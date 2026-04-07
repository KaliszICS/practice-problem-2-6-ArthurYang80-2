public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static int[] bubbleSort(double[] nums) {
        double[] arr = nums.clone();
        int swaps = 0;
        int steps = 0;
        boolean swapped;
        
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                steps++; 
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps += 3; 
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        
        return new int[]{swaps, steps};
    }

    public static int[] selectionSort(double[] nums) {
        double[] arr = nums.clone();
        int swaps = 0;
        int steps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                steps++; 
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                    swaps += 1; 
                }
            }

            double temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            swaps += 3; 
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        
        return new int[]{swaps, steps};
    }

    public static int[] insertionSort(double[] nums) {
        double[] arr = nums.clone();
        int swaps = 0;
        int steps = 0;
        
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            swaps += 1; 
            int j = i - 1;
            
            while (j >= 0) {
                if (arr[j] > key) {
                    steps++; 
                    arr[j + 1] = arr[j];
                    swaps += 1; 
                    j--;
                } else {
                    break;
                }
            }
            
            arr[j + 1] = key;
            swaps += 1; 
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        
        return new int[]{swaps, steps};
    }

    public static String leastSwaps(double[] nums) {
        double[] copy1 = nums.clone();
        double[] copy2 = nums.clone();
        double[] copy3 = nums.clone();
        
        int[] bubbleResult = bubbleSort(copy1);
        int[] selectionResult = selectionSort(copy2);
        int[] insertionResult = insertionSort(copy3);
        
        int bubbleSwaps = bubbleResult[0];
        int selectionSwaps = selectionResult[0];
        int insertionSwaps = insertionResult[0];
        
        int minSwaps = Math.min(bubbleSwaps, Math.min(selectionSwaps, insertionSwaps));
        
        if (bubbleSwaps == minSwaps) {
            return "Bubble";
        } else if (selectionSwaps == minSwaps) {
            return "Selection";
        } else {
            return "Insertion";
        }
    }

    public static String leastIterations(double[] nums) {
        double[] copy1 = nums.clone();
        double[] copy2 = nums.clone();
        double[] copy3 = nums.clone();
        
        int[] bubbleResult = bubbleSort(copy1);
        int[] selectionResult = selectionSort(copy2);
        int[] insertionResult = insertionSort(copy3);
        
        int bubbleSteps = bubbleResult[1];
        int selectionSteps = selectionResult[1];
        int insertionSteps = insertionResult[1];
        
        int minSteps = Math.min(bubbleSteps, Math.min(selectionSteps, insertionSteps));
        
        if (bubbleSteps == minSteps) {
            return "Bubble";
        } else if (selectionSteps == minSteps) {
            return "Selection";
        } else {
            return "Insertion";
        }
    }

	 // Question 1
    public static void q1() {
        
    }

    // Question 2
    public static void q2() {

    }

    // Question 3
    public static void q3() {

	}

	 // Question 4
    public static void q4() {

    }

    // Question 5
    public static void q5() {

	}
}