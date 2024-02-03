import java.util.ArrayList;
import java.util.Scanner;

public class OneLoop {
    public static void main (String[] args) {
        // int array [];
       //int array = userin.nextLine();
         Scanner userin = new Scanner(System.in);
        System.out.println("please enter ints followed by enter and 'q' when ur done: ");
        ArrayList<Integer>arrayList=readInteger(userin);
      
       boolean dupes = containsdupes(arrayList);

      System.out.println("Contains dupe: " +dupes);
}

      private static ArrayList<Integer>readInteger(Scanner scanner){
   System.out.println("Enter ints (type'q' to finish): ");
   ArrayList<Integer>arrayList = new ArrayList<>();
      while(scanner.hasNextInt()){
        arrayList.add(scanner.nextInt());


    }
 return arrayList;

}
  private static boolean containsdupes(ArrayList<Integer>arrayList){
   for(int i=0; i<arrayList.size()-1;i++){
    for(int j=i+1; j<arrayList.size();j++){
//for(int i=0;i<arrayList.size();i+=)
      if(arrayList.get(i).equals(arrayList.get(j))){
       return true;


      }
     }


    }

   return false;

/*
        while(userin == int){
           for(int i =0; i<array; i++){ 
            }
         return true;

          }else{
            return false;

         }*/

}
//1. Write a function that takes in a list of integers as an argument
//and returns true if it contains two integers that are the same, false
//otherwise.
