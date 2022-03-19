package com.spring.abscissa.controllers.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.abscissa.entities.basics.CartesianCoordinate;
import com.spring.abscissa.entities.basics.PolarCoordinate;
import com.spring.abscissa.services.basics.BasicCoordinateService;

@RestController
@RequestMapping("/Api/BasicCoordinate")
public class BasicCoordinateController {

  @Autowired
  private BasicCoordinateService basicCoordinateService;
  
  @GetMapping("/TransformToCartesian")
  public CartesianCoordinate handleTransformToCartesian(
    @RequestBody PolarCoordinate polarCoordinate
  ) {
    return this.basicCoordinateService.transfromPolarToCartesian(polarCoordinate);
  }

  @GetMapping("/TransformToPolar")
  public PolarCoordinate handleTransformToCartesian(
    @RequestBody CartesianCoordinate cartesianCoordinate
  ) {
    return this.basicCoordinateService.transfromCartesianToPolar(cartesianCoordinate);
  }
}
