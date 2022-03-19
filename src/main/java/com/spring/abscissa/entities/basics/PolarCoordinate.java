package com.spring.abscissa.entities.basics;

public class PolarCoordinate {
  private double rValue;
  private double thetaValue;
  private Boolean isRadian;

  public PolarCoordinate() {
  }

  public PolarCoordinate(double rValue, double thetaValue, Boolean isRadian) {
    this.rValue = rValue;
    this.thetaValue = thetaValue;
    this.isRadian = isRadian;
  }

  public double getrValue() {
    return rValue;
  }

  public void setrValue(double rValue) {
    this.rValue = rValue;
  }

  public double getThetaValue() {
    return thetaValue;
  }
  
  public void setThetaValue(double thetaValue) {
    this.thetaValue = thetaValue;
  }

  public Boolean getIsRadian() {
    return isRadian;
  }
  
  public void setIsRadian(Boolean isRadian) {
    this.isRadian = isRadian;
  }
  
  
}
