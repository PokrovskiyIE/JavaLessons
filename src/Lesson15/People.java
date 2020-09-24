package Lesson15;

public class People {
    private int age;
    private String name;

    public People() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UncurrentAgeException {
        if (age < 0 || age > 150) {
            throw new UncurrentAgeException("Возраст не может быть больше 150 или меньше 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}