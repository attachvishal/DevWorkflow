package com.united.result;

import java.util.List;
import com.united.sample.drools.*;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class RuleResponse implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public RuleResponse() {
    }

 private boolean sizeCheck;
    private List<Passenger> removedPassengerList;
    private List<Passenger> addedPassengerList;

    private List<Passenger> removedFlightSegmentList;
    private List<Passenger> addedFlightSegmentList;

    @Override
    public String toString() {
        return "RuleResponse{" +
                "sizeCheck=" + sizeCheck +
                ", \n removedPassengerList=" + removedPassengerList +
                ", \n addedPassengerList=" + addedPassengerList +
                ", \n removedFlightSegmentList=" + removedFlightSegmentList +
                ", \n addedFlightSegmentList=" + addedFlightSegmentList +
                '}';
    }


}