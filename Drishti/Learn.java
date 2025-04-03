// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Learn {
    public static void main(Strings[] args) {
        
        //basic formula//
/*      float a = 10;
        float b = 20;
        float c = a+b ;
        float d = a*b;
        float e = b/a;
        System.out.println(c);
        System.out.println((a*b)/(a+b));
        System.out.print(e);
*/        
        //input from user//
     /*   Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print(name);
     */
     
     
        //sum of two no. taking user input//
    /* Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = a+b;
     System.out.println(c);
    */
    
    
           //if-else loop//
    /*Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n<0){
        System.out.print("-ve integer");
        }
        else if(n==0){
            System.out.print("zero");
        }
        else if(n>0){
            System.out.print("+ve integer");
        }
        else{
            System.out.print("")
        }
    */
    
    
             //case statement//
    /*
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    
    switch(button){
        case 1 : System.out.print("GM");
        break;
        case 2 : System.out.print("GA");
        break;
        case 3 : System.out.print("GN");
        break;
        default : System.out.print("invalid");
        break;
    }
    */
    
    
      //solid rectangle pattern// 
   /* Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() ;
    int m = sc.nextInt();
   
    for(int i =1; i<=n; i++){
        for(int j=1; j<=m; j++){
            System.out.print("*");
        }
        System.out.println();
    }
   */
  
       // Hollow rectangle pattern
       
      /* Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       
       for(int i = 1; i<=n; i++){
           for(int j =1 ; j<=m; j++){
               if(i==1 || j==1 || i==n || j==m){
                   System.out.print("*");
               }else{
                     System.out.print(" ");
               }
          }
          System.out.println();
       }
*/  

          //  triangle pattern
          
         /*Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          //int m = sc.nextInt();
          
          for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                  System.out.print("*");
              }
              System.out.println();
          }
*/

        // inverted pyramid
        /* Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
              for(int i=n; i>=1; i--){
              for(int j=1; j<=i; j++){
                  System.out.print("*");
              }
              System.out.println();
          } 
        */
        
        //360 degree half pyramid
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       */ 
       
      
       //Number Pyramid
     /* Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
     */ 
     
     //inverted Number Pyramid
     /*Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     for(int i=1; i<=n; i++){
         for(int j=1; j<=n-i+1; j++){
             System.out.print(j);
         }
         System.out.println();
     }
     */
     
     //sequence of increase no. in pyramid pattern
     /*Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int num = 1;
     
     for(int i=1; i<=n; i++){
         for(int j=1; j<=i; j++){
             System.out.print(num+" ");
             num++;
         }
         System.out.println();
     }
     */   
     
     //print boolean pyramid
    /* Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     for(int i=1; i<=n; i++){
         for(int j=1; j<=i; j++){
             if((i+j)%2==0){
                 System.out.print("1");
             }else{
                 System.out.print("0");
             }
         }
         System.out.println();
     }*/
     
    //  Scanner sc = new Scanner(System.in);
    //  int n = sc.nextInt();
     
    //  for(int i= 1; i<=n; i++){
    //      for(int j=1; j<=i; j++){
    //          System.out.print("*");
    //      }
         
    //      int spaces = 2*(n-i);
    //      for(int j=1; j<=spaces; j++){
    //          System.out.print(" ");
    //      }
         
    //      for(int j=1; j<=i; j++){
    //          System.out.print("*");
    //      }
    //      System.out.println();
    //      }
         
    //     for(int i=n ; i>=1; i--){
    //      for(int j=1; j<=i; j++){
    //          System.out.print("*");
    //      }
         
    //      int spaces = 2*(n-i);
    //      for(int j=1; j<=spaces; j++){
    //          System.out.print(" ");
    //      }
         
    //      for(int j=1; j<=i; j++){
    //          System.out.print("*");
    //      }
    //      System.out.println();
    //      } 
    
      //rhombus
    // Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
        
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

 


            /*Hollow Rhombus */
    // Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
        
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=n; j++){
    //             if(i==1||j==1||i==n||j==n){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }



    //Tiangle Pattern wit same digit in each row as row no.
     /*    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/


        //Palindromic pattern
        /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/



        //Diamond Pattern
          /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
           System.out.println();
        }
            for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1 ;j++){
                System.out.print("*");
            }
           System.out.println();
        }*/
        
    }
}