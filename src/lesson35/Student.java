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
public class Student {
    String name;
    Subject[] subjects;
    
    public Student(){
        subjects = new Subject[5];
        for (int i = 0; i < 5; i++) {
            subjects[i] = new Subject();
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public Subject[] getSubjects(){
        return subjects;
    }
    
    public void setSubject(Subject[] s){
        this.subjects = s;
    }
}
