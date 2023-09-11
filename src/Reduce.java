public class Reduce {
    public static void main(String[] args) {
        System.out.print(doReduce(100));
    }

    public static int doReduce(int i){
        int count = 0;
        while (i > 0){
            if (i % 2 == 0){
                i = i/2;
            }
            else{
                i--;
            }
            count++;
        }
        return count;

    }
}
