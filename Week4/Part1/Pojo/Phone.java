package Part1.Pojo;

import java.time.LocalDate;

public class Phone {
    private int id;
    private String model;
    private String color;
    private int memoryPhone;
    private int ram;
    LocalDate year_of_issue;
    private Brand brand;

    public Phone (int id){
        this.id = id;
    }
    public Phone(int id,String model){
        this.id = id;
        this.model = model;
    }
    public Phone (int id, String model, String color){
        this(id,
                model);
        this.color = color;
    }
    public Phone (int id, String model, String color,int memoryPhone){
        this(id,
                model,
                color);
        this.memoryPhone = memoryPhone;
    }
    public Phone (int id, String model, String color, int memoryPhone,int ram){
        this(id,
                model,
                color,
                memoryPhone);
        this.ram = ram;
    }
    public Phone (int id, String model, String color,int memoryPhone,int ram,LocalDate year_of_issue){
        this(id,
                model,
                color,
                memoryPhone,
                ram);
        this.year_of_issue = year_of_issue;
    }
    public Phone (int id, String model, String color, int memoryPhone, int ram, LocalDate year_of_issue, Brand brand){
        this(id,
                model,
                color,
                memoryPhone,
                ram,
                year_of_issue);
        this.brand = brand;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.model = model;
    }
    public String getName(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setMemoryPhone(int memoryPhone){
        this.memoryPhone = memoryPhone;
    }
    public int getMemoryPhone(){
        return memoryPhone;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return ram;
    }
    public void setYear_of_issue(LocalDate year_of_issue){
        this.year_of_issue = year_of_issue;
    }

    public LocalDate getYear_of_issue() {
        return year_of_issue;
    }
    public void setBrand(Brand brand){
        this.brand=brand;
    }
    public Brand getBrand(){
        return brand;
    }

    @Override
    public String toString(){
        return "Phone{"+
                "id=" +id+
                ", model=" +model+
                ", color=" +color+
                ", memoryPhone=" +memoryPhone+
                ", ram=" +ram+
                ", year_of_issue=" + year_of_issue+
                ", brand=" +brand+
                '}';
    }
}
