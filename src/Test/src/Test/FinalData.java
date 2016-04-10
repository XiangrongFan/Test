package Test.src.Test;

//file FinalData.java   
import  java.util.*;  

//package Test.src.Test;

class  Value{  
    int  i;  
    public  Value( int  i){ this .i=i;}  
}//end of class Value   

public   class  FinalData{  
     private   static  Random rand =  new  Random( 47 );  
     private  String id;  
     public  FinalData(String id){ this .id=id;}  
     public   static   final   int  VALUE_THREE =  39 ;  
       
     private   int  i3=rand.nextInt( 20 );  
     private   final   int  i4=rand.nextInt( 20 );  
     static   int  INT_5=rand.nextInt( 20 );  
     static   final   int  INT_6= rand.nextInt( 20 );  
       
     private   final  Value v2=  new  Value( 22 );  
     private   final   int  [] a ={ 1 , 2 , 3 , 4 , 5 , 6 };  
       
     public  String toString(){  
         return  id+ " : " + " i3 = " +i3+ ", i4 = " +i4+ " , INT_5 = " +INT_5+ " , INT_6 = "  +INT_6;  
    }//end of toString   
       
     public   static   void  main(String [] args){  
         FinalData fd1 = new  FinalData( "fd1" );  
         //fd1.valueOne++;//Error, can not change the final value   
         //fd1.valueOne=15;//Error, can not change the final value   
         fd1.v2.i++;  
         new  Value( 9 );  
         for ( int  j= 0 ;j<fd1.a.length;j++){  
             fd1.a[j]++;  
         }   
         System.out.println(fd1);  
         System.out.println("Creating new FinalData" );  
         FinalData fd2 = new  FinalData( "fd2" );  
         System.out.println(fd1);  
         System.out.println(fd2);  
         System.out.println("Creating new FinalData" );  
         FinalData fd3 = new  FinalData( "fd3" );  
         System.out.println(fd1);  
         System.out.println(fd2);  
         System.out.println(fd3);  
        }//end of main   
}//end of class FinalData  