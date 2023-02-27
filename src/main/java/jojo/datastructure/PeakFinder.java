package jojo.datastructure;

public class PeakFinder {

    public static String findWithoutOptimization(int[] arr) {
        if (arr.length == 1) {
            return "1 position array \nPeak:" + arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    return "Peak: position " + i + ", value: " + arr[i];
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    return "Peak: position " + i + ", value: " + arr[i];
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    return "Peak: position " + i + ", value: " + arr[i];
                }
            }
        }
        return "No peak found";
    }
}
