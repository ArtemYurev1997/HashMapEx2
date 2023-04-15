package by.pvt.hashmap2;

/*2.1.Создать класс. Сотрудник.
2.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст.
2.3.Создать сотрудников (создайте штук восемь)
2.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им квалификацию.
2.5. Необходимо создать мапку типа HashMap<String, Collection<Сотрудник>>. Т.е, поменять местами Квалифакацию и сотрудника( в качестве ключа будет выступать квалификация, в качестве значения-коллекция сотрудников).
*/

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}
