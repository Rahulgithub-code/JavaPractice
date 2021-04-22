package com.practice;

import java.util.*;

public class Set12_Adv_Java {
    public static void main(String[] args) {
        /* Question 1
        ArrayList<String> students = new ArrayList<String>(10);
        students.add("Student 1");
        students.add("Student 2");
        students.add("Student 3");
        students.add("Student 4");
        students.add("Student 5");
        students.add("Student 6");
        students.add("Student 7");
        students.add("Student 8");
        students.add("Student 9");
        students.add("Student 10");
        for (String student :students) {
            System.out.println(student);
        }
         */

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+ d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.HOUR_OF_DAY)+":"+gc.get(Calendar.MINUTE)+":"+gc.get(Calendar.SECOND));
        /* Question 5
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(55);
        s.add(22);
        s.add(2);
        System.out.println(s);
         */
    }
}
