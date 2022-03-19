package com.spring.abscissa.entities.basics;

public class CartesianCoordinate {
  private double xValue;
  private double yValue;
  private Boolean isRadian;

  public CartesianCoordinate() {}

  public CartesianCoordinate(double xValue, double yValue, Boolean isRadian) {
    this.xValue = xValue;
    this.yValue = yValue;
    this.isRadian = isRadian;
  }

  public double getxValue() {
    return xValue;
  }

  public void setxValue(double xValue) {
    this.xValue = xValue;
  }

  public double getyValue() {
    return yValue;
  }

  public void setyValue(double yValue) {
    this.yValue = yValue;
  }

  public Boolean getIsRadian() {
    return isRadian;
  }
  
  public void setIsRadian(Boolean isRadian) {
    this.isRadian = isRadian;
  }

}
