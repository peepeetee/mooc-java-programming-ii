package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.equals("") || name.length()>40 || age < 0 || age > 120){
            throw new IllegalArgumentException("Illegal argument in Person constructor");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
