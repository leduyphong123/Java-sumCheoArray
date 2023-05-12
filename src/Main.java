import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("input x = y = ");
            x=input.nextInt();
            if(x<=0){
                System.out.println("x>0");
            }
        }while(x<=0);
        double[][] arr=new double[x][x];
        if(x==1){
            System.out.println("nhap value = ");
            double value=input.nextDouble();
            System.out.println("sum = " + value);
        }else {
            double sum=0.0;
            for(int i=0;i<x;i++){
                for(int j=0;j<x;j++){
                    System.out.println("input index [" + i+"]["+j+"]"+" value = ");
                    arr[i][j]=input.nextDouble();
                }
            }
            for(int i=0;i<x;i++){
                for(int j=i;j<=i;j++){
                    sum+=arr[i][j];
                }
            }
            System.out.println("sum = " + sum);
        }
    }
}