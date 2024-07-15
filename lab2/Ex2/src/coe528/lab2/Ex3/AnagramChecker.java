/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2.Ex3;

/**
 *
 * @author Mohamed Khedr
 */
/**
 *
 * @author Mohamed Khedr
 */
public class AnagramChecker {
    public static String removeCharacter(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }
    
// Requires: Two strings input, a and b, not equal to null
// Modifies: None (the method modifies only copies of the input strings, by deleting any spaces and converting 
//           the strings to lower case, not the passed strings themselves). 
// Effects: Returns true if the input strings a and b are anagrams (ignoring case and spaces), 
//          or false if either or both input strings are empty, or if they are not anagrams.
  
    
    public static boolean     areAnagrams(String a, String b) {
int n = 0;
int n2=1;
if(a!=null&&b!=null)
{a = a.toLowerCase();
b = b.toLowerCase();
 a = a.replace(" ", "");
 b = b.replace(" ", "");
 n = a.length();
n2 = b.length();
}
 if (n!=n2||n==0){
     return false;}
 boolean  done = true;
      for (int i =0 ; i <n;i++){
      for (int j =0 ; j< n ;j++){
      if(a.charAt(i) == b.charAt(j)&&done==true){
  a =  removeCharacter(a,i);
 b = removeCharacter(b,j);
 n--;
done = true;
      }
      } 
if (n==n2){done=false; break;}
} return done;
}
public static void main(String[] args) {
if (args.length != 2) {
            System.out.println("Please provide exactly two strings as command line arguments.");
            return;
        }
System.out.println(areAnagrams(args[0],args[1]));
}


}
