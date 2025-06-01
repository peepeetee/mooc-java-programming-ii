/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class Student extends Person{

    private int studyCredits;
    public Student(String name, String address) {
        super(name, address);
        studyCredits = 0;
    }
    
    public void study(){
        studyCredits += 1;
    }
    
    public int credits(){
        return studyCredits;
    }
    
    public String toString(){
        return super.toString() + "\n  " + "Study credits " + credits();
    }
    
}
