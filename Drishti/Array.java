import java.util.*;


public class Array {

    public static void main(Strings[] args) {
    //Declaration of array when size of  array is known 
     /*{
        
        int[] arraymarks = {20,24,29};
        
        for(int i=0; i<3; i++){
            System.out.println(arraymarks[i]);
        }*/



    // Declaration of array when size of  array is known 
    /* {
        
        int[] arraymarks = new int[3];
        
        arraymarks[0]=20;
        arraymarks[1]=23;
        arraymarks[2]=29;
        
        System.out.println(marks[2]);
    }*/



    // taking user input and initialize the size 

    /*  {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] marks = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }
  */



  //Taking input from user for array and printing output
/*  {
        
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    int[] marks = new int[size];
    
    //input
    for(int i=0; i<size; i++){
        marks[i] = sc.nextInt();
    }
    
    
    //output
    for(int i=0; i<size; i++){
        System.out.println(marks[i]);
    }
    
 }*/

   //linear search in array
   /*{
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    int numbers[] = new int[size];
    
    for(int i=0; i<size; i++){
        numbers[i]=sc.nextInt();
    }
    
    int x = sc.nextInt();
    
    for(int i=0; i<size; i++){
        if(numbers[i] == x){
            System.out.print("x found at index: "+ i);
        }
    
      }  
    }*/



//-------------------2D Array-----------------------//

//print matrix of array
/*{
        
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    
    int[][] numbers = new int[rows][columns];
    
    for(int i=0; i<rows; i++){
        for(int j=0; j<columns; j++){
            numbers[i][j]= sc.nextInt();
        }
    }
    
    for(int i=0; i<rows; i++){
        for(int j=0; j<columns; j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
    }*/



    // find the element in an array
   /*   Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int twodarray[][] = new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                twodarray[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(twodarray[i][j] == x){
                    System.out.print("x found at location" + i + ","+ j + " ");
                }
            }
        }
        */



  }
}

    
