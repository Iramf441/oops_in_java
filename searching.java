import java.util.*;

public class searching {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int target = scanner.nextInt();
        int n=scanner.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }

    }
    }

