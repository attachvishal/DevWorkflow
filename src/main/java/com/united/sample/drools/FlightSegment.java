package com.united.sample.drools;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class FlightSegment implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public FlightSegment() {
    }


 private String FlightNumber ;
    private String Origin ;
    private String Destination ;
    private String CarrierCd ;
    private String ScheduledDepartureDate ;
    private String LegIndex;
    private String MktCarrCd ;
    private String ScheduledDepartureTime ;
    private String ScheduledArrivalDate ;
    private String ScheduledArrivalTime ;
    private String ScheduledDepartureDay ;
    private String ScheduledDepArrDayOffset ;
    private String isCodeShare ;
    private String isReverseCodeShare ;
    private String isOD ;
    private String SegmentType ;
    private String AuxSegmentText ;
    private String OperatingFltNum ;
    private String FirstIndexInd ;
    private String isInternationalSeg ;		
    private String action;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightSegment that = (FlightSegment) o;
        return Objects.equals(FlightNumber, that.FlightNumber) &&
                Objects.equals(Origin, that.Origin) &&
                Objects.equals(Destination, that.Destination) &&
                Objects.equals(ScheduledDepartureDate, that.ScheduledDepartureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FlightNumber, Origin, Destination, ScheduledDepartureDate);
    }
    
    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getCarrierCd() {
        return CarrierCd;
    }

    public void setCarrierCd(String carrierCd) {
        CarrierCd = carrierCd;
    }

    public String getScheduledDepartureDate() {
        return ScheduledDepartureDate;
    }

    public void setScheduledDepartureDate(String scheduledDepartureDate) {
        ScheduledDepartureDate = scheduledDepartureDate;
    }

    public String getLegIndex() {
        return LegIndex;
    }

    public void setLegIndex(String legIndex) {
        LegIndex = legIndex;
    }

    public String getMktCarrCd() {
        return MktCarrCd;
    }

    public void setMktCarrCd(String mktCarrCd) {
        MktCarrCd = mktCarrCd;
    }

    public String getScheduledDepartureTime() {
        return ScheduledDepartureTime;
    }

    public void setScheduledDepartureTime(String scheduledDepartureTime) {
        ScheduledDepartureTime = scheduledDepartureTime;
    }

    public String getScheduledArrivalDate() {
        return ScheduledArrivalDate;
    }

    public void setScheduledArrivalDate(String scheduledArrivalDate) {
        ScheduledArrivalDate = scheduledArrivalDate;
    }

    public String getScheduledArrivalTime() {
        return ScheduledArrivalTime;
    }

    public void setScheduledArrivalTime(String scheduledArrivalTime) {
        ScheduledArrivalTime = scheduledArrivalTime;
    }

    public String getScheduledDepartureDay() {
        return ScheduledDepartureDay;
    }

    public void setScheduledDepartureDay(String scheduledDepartureDay) {
        ScheduledDepartureDay = scheduledDepartureDay;
    }

    public String getScheduledDepArrDayOffset() {
        return ScheduledDepArrDayOffset;
    }

    public void setScheduledDepArrDayOffset(String scheduledDepArrDayOffset) {
        ScheduledDepArrDayOffset = scheduledDepArrDayOffset;
    }

    public String getIsCodeShare() {
        return isCodeShare;
    }

    public void setIsCodeShare(String isCodeShare) {
        this.isCodeShare = isCodeShare;
    }

    public String getIsReverseCodeShare() {
        return isReverseCodeShare;
    }

    public void setIsReverseCodeShare(String isReverseCodeShare) {
        this.isReverseCodeShare = isReverseCodeShare;
    }

    public String getIsOD() {
        return isOD;
    }

    public void setIsOD(String isOD) {
        this.isOD = isOD;
    }

    public String getSegmentType() {
        return SegmentType;
    }

    public void setSegmentType(String segmentType) {
        SegmentType = segmentType;
    }

    public String getAuxSegmentText() {
        return AuxSegmentText;
    }

    public void setAuxSegmentText(String auxSegmentText) {
        AuxSegmentText = auxSegmentText;
    }

    public String getOperatingFltNum() {
        return OperatingFltNum;
    }

    public void setOperatingFltNum(String operatingFltNum) {
        OperatingFltNum = operatingFltNum;
    }

    public String getFirstIndexInd() {
        return FirstIndexInd;
    }

    public void setFirstIndexInd(String firstIndexInd) {
        FirstIndexInd = firstIndexInd;
    }

    public String getIsInternationalSeg() {
        return isInternationalSeg;
    }

    public void setIsInternationalSeg(String isInternationalSeg) {
        this.isInternationalSeg = isInternationalSeg;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}