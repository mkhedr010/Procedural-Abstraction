/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2.Ex2;

/**
 *
 * @author Mohamed Khedr
 */
public class Palindrome {
// Requires: a is a String 
// Modifies: None (modifies only a copy of the string, by converting to lowercase, not the passed string itself) 
// Effects: Returns true if the input string a is a palindrome (ignoring case), 
//          or false if the input string is empty, null, or not a palindrome.
public static boolean isPalindrome(String a) {
int n = 0;
if(a!=null)
{a = a.toLowerCase();
// a = a.replace(" ", "");
 n = a.length(); }

 if (n==0){
     return false;}
        int left = 0;
        int right = n - 1;
while (left < right) {
            if (a.charAt(left) != a.charAt(right)||a==null) {
                return false;
            }
            left++;
            right--;
        }
        return true; }
public static void main(String[] args) {
if(args.length == 1) {
if (args[0].equals("1"))
System.out.println(isPalindrome(null));
else if (args[0].equals("2"))
System.out.println(isPalindrome(""));
else if (args[0].equals("3"))
System.out.println(isPalindrome("deed"));
else if (args[0].equals("4"))
System.out.println(isPalindrome("abcd"));
}
}

}

