public class Task3 {
    public static void main(String[] args) {
        int[] array=new int[]{2,3,6,8,1};
        int first=array[0];
        int last=array[array.length-1];
        int sum;
        array[0]=last;
        array[array.length-1]=first;
        sum=array[0]+array[array.length/2];
        System.out.println(sum);

    }
}
