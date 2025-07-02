package com.sherollfaith.assignment.employees;

public class Developer extends Employees{
    public String department;
    protected String programmingLanguage;
    private String project;

    public Developer(String name, int id, int salary, String department, String programmingLanguage, String project) {
        super(name, id, salary);
        this.department = department;
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "department='" + department + "\n" +
                "programmingLanguage='" + programmingLanguage + "\n" +
                "project=" + project + "\n" ;
    }
}
