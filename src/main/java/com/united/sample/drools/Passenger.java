package com.united.sample.drools;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class Passenger implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String passengerSurname ;
    private String passengerFirstName ;
    private String passengerSurnameKey ;
    private String passengerInitialKey ;

    public Passenger() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(passengerSurname, passenger.passengerSurname) &&
                Objects.equals(passengerFirstName, passenger.passengerFirstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerSurname, passengerFirstName);
    }


public SecureFlightData getSecureFlightData() {
        return secureFlightData;
    }

    public void setSecureFlightData(SecureFlightData secureFlightData) {
        this.secureFlightData = secureFlightData;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public void setPassengerFirstName(String passengerFirstName) {
        this.passengerFirstName = passengerFirstName;
    }

    public String getPassengerSurnameKey() {
        return passengerSurnameKey;
    }

    public void setPassengerSurnameKey(String passengerSurnameKey) {
        this.passengerSurnameKey = passengerSurnameKey;
    }

    public String getPassengerInitialKey() {
        return passengerInitialKey;
    }

    public void setPassengerInitialKey(String passengerInitialKey) {
        this.passengerInitialKey = passengerInitialKey;
    }

}