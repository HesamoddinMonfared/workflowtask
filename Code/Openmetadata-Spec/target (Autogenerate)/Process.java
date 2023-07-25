package com.sampledomain.model;

import lombok.Data;

@Data
public class Process {
  public Process(){}
  private String name;
  private Link[] link;
}
