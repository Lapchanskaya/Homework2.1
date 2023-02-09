package transport;

import java.util.Objects;

public class Mechanic {

    private String name;
    private String company;

    public Mechanic ( String name, String company){
        this.name = name;
        this.company = company;

    }

    //region Getters-Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    //endregion


    public void maintenance(){
        System.out.println( " Механик: " + getName() + " Из компании: " + getCompany() + " Проводит ТО. ");
    }

    public void fixTheCar() {
        System.out.println( " Механик: " + getName() + " Из компании: " + getCompany() + "   ремонтирует транспорт. ");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", company='" + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return getName().equals(mechanic.getName()) && getCompany().equals(mechanic.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany());
    }
}
