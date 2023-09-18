package Homework9;

//        Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//        input:
//        arr[] = {1,2,3,5}
//        out: 4
//        arr[] = {6,1,2,8,3,4,7,10,5}
//        out: 9
public class Task1 {
    public static void main(String[] args) {
        int[] array = {5,2,3,4};
        System.out.println(missingElement(array));
    }
    public static int missingElement(int[] array){
        int sum1 = 0;
        for (int i=1;i<=array.length+1;i++){
            sum1+=i;
        }
        int sum2 = 0;
        for (int i=0;i<array.length;i++){
            sum2+=array[i];
        }
        return sum1-sum2;
    }
}
