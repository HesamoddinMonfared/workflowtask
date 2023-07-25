package com.sampledomain.model;

import lombok.Data;

@Data
public class Link {
  public Link(){}
  private String name;
  private String from;
  private String to;
  private String condition;
}
