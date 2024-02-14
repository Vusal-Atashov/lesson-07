package az.edu.turing.module2;

public class Lesson13 {
    public static void main(String[] args) {
        String[] names = new String[]{"Vusal", "Ferid", "Osman", "Ismayil"};
        int[] ages = new int[]{21, 22, 24, 28};
        double[] grades = new double[]{82.5, 73.7, 93.0, 88.9};
        int index = maxGradeIndex(grades);
        System.out.println(" name : " + names[index] + " | age : " + ages[index] + " | grade : " + grades[index]);
    }

    public static int maxGradeIndex(double[] grades) {
        int maxIndex = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[maxIndex] < grades[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
