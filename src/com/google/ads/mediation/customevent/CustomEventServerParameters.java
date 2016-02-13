package com.google.ads.mediation.customevent;

import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.Parameter;

public class CustomEventServerParameters extends MediationServerParameters
{

  @MediationServerParameters.Parameter(name="class_name", required=true)
  public String className;

  @MediationServerParameters.Parameter(name="label", required=true)
  public String label;

  @MediationServerParameters.Parameter(name="parameter", required=false)
  public String parameter = null;
}

/* Location:           C:\Users\T00049862\Downloads\JARS\nca-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventServerParameters
 * JD-Core Version:    0.6.2
 */