package dev.runje.ana.actuatordemo.service;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Endpoint(id = "random")
public class RandomEndpoint {

  @ReadOperation
  public int random(){
    return new Random().nextInt(10);
  }
}
