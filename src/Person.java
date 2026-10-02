public class Person implements Sortable {

    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printPerson() {
        System.out.println(name + " " + surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean isGreaterThan(Sortable other) {
        Person otherPerson = (Person) other;

        int surnameComparison = this.surname.compareTo(otherPerson.surname);

        if (surnameComparison != 0) {
            return surnameComparison > 0;
        }
        return this.name.compareTo(otherPerson.name) > 0;
    }
}