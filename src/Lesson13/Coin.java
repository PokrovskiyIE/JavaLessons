package Lesson13;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private String metal;
    private int year;
    private int nominal;
    private double diameter;

    public Coin() {
    }

    public Coin(String metal, int year, int nominal, double diameter) {
        this.metal = metal;
        this.year = year;
        this.nominal = nominal;
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return year == coin.year &&
                nominal == coin.nominal &&
                diameter == coin.diameter &&
                Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metal, year, nominal, diameter);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "metal='" + metal + '\'' +
                ", year=" + year +
                ", nominal=" + nominal +
                ", diameter=" + diameter +
                '}';
    }


    @Override
    public int compareTo(Coin o) {
        if(this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiameter() != o.getDiameter()) {
            return Double.compare(this.getDiameter(), o.getDiameter());
        }
            return this.getMetal().compareTo(o.getMetal());
        }
}
