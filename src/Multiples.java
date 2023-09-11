public class Multiples {
    public static void main(String[] args) {
        findMultiples(1000);
    }





    public static void findMultiples(int i) {
        int count = 1;
        int num = 0;
        while (count < i){
            boolean isMultiple = false;
            if ((count % 5 == 0) | (count % 3 == 0)){
                isMultiple = true;
            }
            if (isMultiple){
                num++;
            }
            count++;
        }
        System.out.print(num);

    }
}
