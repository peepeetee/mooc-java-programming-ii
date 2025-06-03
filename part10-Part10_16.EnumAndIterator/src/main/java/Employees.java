
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        employees.stream().forEach(employee -> System.out.println(employee));

    }

    public void print(Education education) {
        for (Iterator<Person> iterator = employees.iterator(); iterator.hasNext();) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }

        }

    }

    public void fire(Education education) {
        for (Iterator<Person> iterator = employees.iterator(); iterator.hasNext();) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                iterator.remove();
            }

        }
    }

}
