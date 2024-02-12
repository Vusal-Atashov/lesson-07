package az.edu.turing.module2;

public class Lesson13 {
    public static void main(String[] args) {
        String [] names=new String[]{"Vusal","Ferid","Osman","Ismayil"};
        int []age=new int[]{21,22,24,28};
        double[]grade=new double[]{82.5,73.7,93.0,88.9};
        int index=maxGradeIndex(grade);
        System.out.println(" name : "+names[index]+" | age : "+age[index]+" | grade : "+grade[index]);
    }
    public static int maxGradeIndex(double[] grade){
        int maxIndex=0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[maxIndex]<grade[i]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
