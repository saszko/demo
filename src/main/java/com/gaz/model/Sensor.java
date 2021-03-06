package com.gaz.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.TABLE;

@Entity
@Table(name = "sensors")
public class Sensor {
    @Id
    @GeneratedValue(strategy = TABLE)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "short_name", length = 15)
    private String name;
   @JoinColumn(name = "controller_id", referencedColumnName = "controller_id")
    @Column(name = "controller_id")
    private String controllerId;

    public Sensor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", controllerId=" + controllerId +
                '}';
    }
}
