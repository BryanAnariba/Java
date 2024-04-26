package classes;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String[] tecnologies;
    private boolean isStudent;

    public Person(String name, String lastName, int age, boolean isStudent, String[] tecnologies) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
        this.tecnologies = tecnologies;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String[] getTecnologies() {
        return this.tecnologies;
    }

    public boolean getIsStudent() {
        return this.isStudent;
    }

    // Setters

    @Override
    public String toString() {
        String listTecnologies = "";
        boolean isFirst = true;
        for (String tecnology : this.tecnologies) {
            if (isFirst) {
                listTecnologies = listTecnologies + tecnology;
            } else {
                listTecnologies = listTecnologies + "," + tecnology;
            }
            isFirst = false;
        }
        return "Person: {name: " + this.name + ", lastName: " + this.lastName + ", age: " + this.age + ", isStudent: "
                + this.isStudent + ", tecnologies: [" + listTecnologies + "]}";
    }
}