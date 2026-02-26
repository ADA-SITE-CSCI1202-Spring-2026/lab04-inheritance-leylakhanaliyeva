package week06;

import java.util.Arrays;

import week06.Inheritance.Person.Teacher;

public class Inheritance {
    public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
    }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }

    public class Teacher extends Person {
        private String department;
        private String [] courses;

        public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        this.department = department;
        this.courses = courses;

    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String[] getCourses() { return courses; }
    public void setCourses(String[] courses) { this.courses = courses; }

    @Override
    public String toString() {
        return "Teacher [firstName=" + getFirstName() + ", lastName=" + getLastName() +
               ", gender=" + getGender() + ", department=" + department +
               ", courses=" + Arrays.toString(courses) + "]";
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
               this.department.equals(t.department) &&
               Arrays.equals(this.courses, t.courses);
    }
}
    }
}

