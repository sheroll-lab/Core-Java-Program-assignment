package com.sherollfaith.assignment.employees;

public class Manager extends Employees{
    public String department;
    protected int teamSize;

    public Manager(String name, int id, int salary, String department, int teamSize) {
        super(name, id, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "department= " + department + "\n" +
                "teamSize=" + teamSize + "\n";
    }
}
