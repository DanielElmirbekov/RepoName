package Part1.Pojo;

import java.time.LocalDate;

public class Car {

        private int id;
        private String model;
        private String color;
        private String fuel;
        private double fuel_volume;
        LocalDate year_of_issue;


    public Car( int id){
            this.id = id;
        }

    public Car( int id, String model){
            this.id = id;
            this.model = model;
        }

    public Car( int id, String model, String color){
            this(id, model);
            this.color = color;
        }
    public Car( int id, String model, String color, String fuel){
            this(id, model, color);
            this.fuel = fuel;
        }
    public Car( int id, String model, String color, String fuel,double fuel_volume){
            this(id, model, color, fuel);
            this.fuel_volume = fuel_volume;
        }
    public Car( int id, String model, String color, String fuel,double fuel_volume, LocalDate year_of_issue){
            this(id, model, color, fuel, fuel_volume);
            this.year_of_issue = year_of_issue;
        }


        public void setId ( int id){
            this.id = id;
        }

        public int getId () {
            return id;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getModel () {
            return model;
        }

        public void setColor (String color){
            this.color = color;
        }

        public String getColor () {
            return color;
        }

        public void setFuel (String fuel){
            this.fuel = fuel;
        }

        public String getFuel () {
            return fuel;
        }

        public void setFuel_volume ( double fuel_volume){
            this.fuel_volume = fuel_volume;
        }

        public double getFuel_volume () {
            return fuel_volume;
        }

        public void setYear_of_issue (LocalDate year_of_issue){
            this.year_of_issue = year_of_issue;
        }

        public LocalDate getYear_of_issue () {
            return year_of_issue;
        }

        @Override
        public String toString () {
            return "Car{ " +
                    "id= " + id +
                    ", model= " + model +
                    ", color= " + color +
                    ", fuel= " + fuel +
                    ", fuel_volume= " + fuel_volume +
                    ", year_of_issue= " + year_of_issue +
                    '}';
        }
    }