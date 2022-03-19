package com.spring.abscissa.services.basics;

import com.spring.abscissa.entities.basics.CartesianCoordinate;
import com.spring.abscissa.entities.basics.PolarCoordinate;

public interface BasicCoordinateServiceInterface {
  PolarCoordinate transfromCartesianToPolar(CartesianCoordinate cartesianCoordinate);
  CartesianCoordinate transfromPolarToCartesian(PolarCoordinate polarCoordinate);
}
