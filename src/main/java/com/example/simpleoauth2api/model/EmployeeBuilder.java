package com.example.simpleoauth2api.model;

public final class EmployeeBuilder {
    private Long id;
    private String name;
    private String role;

    private EmployeeBuilder() {
    }

    public static EmployeeBuilder anEmployee() {
        return new EmployeeBuilder();
    }

    public EmployeeBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder withRole(String role) {
        this.role = role;
        return this;
    }

    public Employee build() {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setRole(role);
        return employee;
    }
}
