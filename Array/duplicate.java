package Array;

public class duplicate {
    public static void main(String[] args) {
        int a[]={1,23,13,1,78,132,7,1,321,26};

        for(int i=0;i<a.length;i++){
             for (int j = i + 1; j < a.length; j++)
            if (a[i]==a[j]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
    
}
