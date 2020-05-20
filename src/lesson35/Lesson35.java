/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lesson35;

/**
 *
 * @author oscar neiva
 */
public class Lesson35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
        }
        
        students[0].setName("dudu");
        students[0].getSubjects()[0].setName("Computer Science");
        students[0].getSubjects()[1].setName("Maths");
        
        students[1].setName("Caio");
        students[1].getSubjects()[0].setName("Science");
        students[1].getSubjects()[1].setName("Economics");
        
        System.out.println(students[0].getName());  
        System.out.println(students[0].getSubjects()[0].getName());
        System.out.println(students[0].getSubjects()[1].getName());
        
        System.out.println(students[1].getName());
        System.out.println(students[1].getSubjects()[0].getName());
        System.out.println(students[1].getSubjects()[1].getName());
    }
    
}
