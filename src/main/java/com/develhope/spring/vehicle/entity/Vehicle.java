package com.develhope.spring.vehicle.entity;
import com.develhope.spring.vehicle.entity.Status;
import jakarta.persistence.*;
import lombok.*;
import com.develhope.spring.Vehicle.entity.Type;

import java.math.BigDecimal;

@Entity
@Data
@Table
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private int displacement;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private int power;
    @Column(nullable = false)
    private String transmission;
    @Column(nullable = false)
    private Integer registrationYear;
    @Column(nullable = false)
    private String fullType;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private BigDecimal discount;
    @Column(nullable = false)
    private String accessories;
    @Column(nullable = false)
    private Boolean isNew;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status vehicleStatus;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type vehicleType;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", displacement=" + displacement +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", transmission='" + transmission + '\'' +
                ", registrationYear=" + registrationYear +
                ", fullType='" + fullType + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", accessories='" + accessories + '\'' +
                ", isNew=" + isNew +
                ", vehicleStatus=" + vehicleStatus +
                ", vehicleType=" + vehicleType +
                '}';

    }
}