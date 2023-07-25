package com.sampledomain.model;

public class Workflow {
  public Workflow(){}

  private Process[] processes;
  private Link[] links;

  public Process[] getProcesses() {
    return processes;
  }

  public void setProcesses(Process[] processes) {
    this.processes = processes;
  }

  public Link[] getLinks() {
    return links;
  }

  public void setLinks(Link[] links) {
    this.links = links;
  }
}
