package com.spring.abscissa.services.basics;

import com.spring.abscissa.entities.basics.CartesianCoordinate;
import com.spring.abscissa.entities.basics.PolarCoordinate;

import org.springframework.stereotype.Component;

@Component
public class BasicCoordinateService implements BasicCoordinateServiceInterface {

  public PolarCoordinate transfromCartesianToPolar(CartesianCoordinate cartesianCoordinate) {

    double xValue = cartesianCoordinate.getxValue();
    double yValue = cartesianCoordinate.getyValue();
    Boolean isRadian = cartesianCoordinate.getIsRadian();

    double rValue = Math.sqrt(Math.pow(xValue, 2) + Math.pow(yValue, 2));
    double thetaValue = isRadian == true ? Math.atan(yValue / xValue) : Math.toDegrees(Math.atan(yValue / xValue));

    PolarCoordinate polarCoordinate = new PolarCoordinate(rValue, thetaValue, isRadian);

    return polarCoordinate;
  }

  public CartesianCoordinate transfromPolarToCartesian(PolarCoordinate polarCoordinate) {

    double rValue = polarCoordinate.getrValue();
    Boolean isRadian = polarCoordinate.getIsRadian();

    double thetaValue = isRadian == true ? polarCoordinate.getThetaValue() : Math.toRadians(polarCoordinate.getThetaValue());
    

    double xValue = rValue * Math.cos(thetaValue);
    double yValue = rValue * Math.sin(thetaValue);

    CartesianCoordinate cartesianCoordinate = new CartesianCoordinate(xValue, yValue, isRadian);

    return cartesianCoordinate;
  }
}
