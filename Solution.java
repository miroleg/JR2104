package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
 
        return (first != null ? first.equals(solution.first) : solution.first == null)  &&
                (last != null ? last.equals(solution.last) : solution.last == null) ;
    }

   // public int hashCode() {
     //   int result = this.first != null ? this.first.hashCode() : 0;
       // result = 31 * result + (this.last != null ? this.last.hashCode() : 0);
        //return result;
        //return 31 * first.hashCode() + last.hashCode();

    @Override
    public int hashCode() {

        return Objects.hash(first, last);
    }





    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
