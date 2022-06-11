package testing.oop.app;

import testing.oop.data.Company;

public class CompanyApp {
  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Java OOP");

    Company.Employee employee = company.new Employee();
    employee.setName("Dadang");

    System.out.println(employee.getCompany());
    System.out.println(employee.getName());

    Company company2 = new Company();
    company2.setName("Youtube");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Bandrek");

    System.out.println(employee2.getCompany());
    System.out.println(employee2.getName());

  }
}
