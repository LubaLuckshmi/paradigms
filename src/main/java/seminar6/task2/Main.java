package seminar6.task2;

public class Main {
    public static void main(String[] args) {
        int[] referenceArray =  new int[]{1,2,3,4,5,6};
        int[] magic =  new int[]{1,2,3,4,5,6};

        System.out.println(mse(referenceArray,magic));
    }
    public static double mse(int[] reference, int[] magicArray){
        double sumSquares = 0;
        for (int i = 0; i < reference.length; i++) {
            sumSquares += Math.pow((reference[i] - magicArray[i]), 2);
        }
        return sumSquares/reference.length;
    }
}
