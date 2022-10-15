public class Inserting_arr {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 5;
        a[1]=2;
        a[2]=7;
        a[3]=8;
        a[4]=10;
        a[5]=9;
        int n = 6;
        int x = 20;
        int index = 2;
        for(int i = n;i>index;i--){

            a[i]=a[i-1];
        }
        a[index] = x;
        for(int i = 0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
