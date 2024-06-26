package classes;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String[] tecnologies;
    private boolean isStudent;
    private Carrer carrer;

    public Person(String name, String lastName, int age, boolean isStudent, String[] tecnologies, String carrerName, int duration) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isStudent = isStudent;
        this.tecnologies = tecnologies;
        this.carrer = new Carrer(carrerName, duration);
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
    public void setName (String name) {
        this.name = name;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setTecnologies (String[] tecnologies) {
        this.tecnologies = tecnologies;
    }

    public void setIsStudent (boolean isStudent) {
        this.isStudent = isStudent;
    }
    
    // toString method
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
                + this.isStudent + ", tecnologies: [" + listTecnologies + "], carrer: " + this.carrer + "}";
    }
}