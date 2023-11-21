package com.udemy.springmvc.learning;

import com.udemy.springmvc.learning.validation.CheckEmail;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
  @Size(min = 2, message = "Name must be minimum 2 symbols!!!")
  private String name;

  // @NotEmpty не должно быть пустым и нулловым
  // @NotEmpty(message = "surname is required field")
  // @NotBlank поле не должно быть пустым или состоять из только пробелов
  @NotBlank(message = "surname is required field")
  private String surname;

  private String department;

  @Min(value = 500, message = "must be greater than 499")
  @Max(value = 1000, message = "must be less than 1001")
  private int salary;

  @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
  private String phoneNumber;
  // we also can done it using regexp "please use email pattern some@xyz.com"
  // but lets make our own (Annotation) and (Annotation Handler)
  // @Pattern(regexp = "", message = "please use email pattern some@xyz.com")
  @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
  private String email;

  private String carBrand;
  private String[] languages;

  private Map<String, String> departments;
  private Map<String, String> carBrands;
  private Map<String, String> languageList;

  public Employee() {
    departments = new HashMap<>();
    departments.put("IT", "INFORMATION TECHNOLOGY");
    departments.put("HR", "HUMAN RESOURCES");
    departments.put("SALES", "SALES");

    carBrands = new HashMap<>();
    carBrands.put("BMW", "BMW");
    carBrands.put("Audi", "Audi");
    carBrands.put("Mercedes-Benz", "Mercedes-Benz");

    languageList = new HashMap<>();
    languageList.put("English", "EN");
    languageList.put("Deuch", "DE");
    languageList.put("French", "FR");
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

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Map<String, String> getDepartments() {
    return departments;
  }

  public void setDepartments(Map<String, String> departments) {
    this.departments = departments;
  }

  public String[] getLanguages() {
    return languages;
  }

  public void setLanguages(String[] languages) {
    this.languages = languages;
  }

  public Map<String, String> getCarBrands() {
    return carBrands;
  }

  public void setCarBrands(Map<String, String> carBrands) {
    this.carBrands = carBrands;
  }

  public Map<String, String> getLanguageList() {
    return languageList;
  }

  public void setLanguageList(Map<String, String> languageList) {
    this.languageList = languageList;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "name='"
        + name
        + '\''
        + ", surname='"
        + surname
        + '\''
        + ", department='"
        + department
        + '\''
        + ", salary="
        + salary
        + '}';
  }
}
