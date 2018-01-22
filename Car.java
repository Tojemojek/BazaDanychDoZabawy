package pl.kostrowski.autosalon.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "car")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "number")
    private String model;

    @Column(name = "production_date")
    private LocalDate productionDate;

    @Column(name = "vin", unique = true, nullable = false)
    private String vin;

    public Car() {
    }

    public Car(Integer id, String brand, String model, LocalDate productionDate, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.vin = vin;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public String getVin() {
        return vin;
    }
}
