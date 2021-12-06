/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockanagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CHUKWUEMEKA
 */
public class Sherlockanagrams {

  static boolean boolAnagram(String u, String v) {
    char[] au = u.toCharArray();
    char[] av = v.toCharArray();
    Arrays.sort(au);
    Arrays.sort(av);
    for (int i = 0; i < au.length; i++) {
      if (au[i] != av[i]) {
        return false;
      }
    }
    return true;
  }

  static int sherlockAnagrams(String s) {
    int count = 0;
    String cs, bs;
    for (int t = 1; t < s.length(); t++) {
      for (int i = 0; i < s.length() - t; i++) {
        bs = s.substring(i, i + t);
          for (int j = i + 1; j <= s.length() - t; j++) {
            cs = s.substring(j, j + t);
              if (boolAnagram(bs, cs)) {
                count++;
              }
          }
      }
    }
    return count;
  }

  public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of tests for each string ");
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        int result = sherlockAnagrams(s);
        System.out.println(result);
  }
        sc.close();
  }

    
}
