//taking 2d array as input and traversing through it

import java.util.*;
public class TwoDarrays {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

            int rows=sc.nextInt();
            int coloumns=sc.nextInt();

            int numbers [][]= new int[rows][coloumns];

            //rows
            for(int i=0;i<rows;i++){
                //coloumns
                for(int j=0;j<coloumns;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            int x= sc.nextInt();

            for(int i=0;i<rows;i++){
                for(int j=0;j<coloumns;j++){

                    if(x==numbers[i][j]){
                        System.out.println("the indices are"+(i+1)+ "x" +(j+1));
                    }

                }
            }


        }
}
    

