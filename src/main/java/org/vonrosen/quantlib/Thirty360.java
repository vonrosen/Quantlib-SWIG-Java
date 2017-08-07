/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.vonrosen.quantlib;

public class Thirty360 extends DayCounter {
  private transient long swigCPtr;

  protected Thirty360(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Thirty360_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Thirty360 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Thirty360(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Thirty360(Thirty360.Convention c) {
    this(QuantLibJNI.new_Thirty360__SWIG_0(c.swigValue()), true);
  }

  public Thirty360() {
    this(QuantLibJNI.new_Thirty360__SWIG_1(), true);
  }

  public final static class Convention {
    public final static Thirty360.Convention USA = new Thirty360.Convention("USA");
    public final static Thirty360.Convention BondBasis = new Thirty360.Convention("BondBasis");
    public final static Thirty360.Convention European = new Thirty360.Convention("European");
    public final static Thirty360.Convention EurobondBasis = new Thirty360.Convention("EurobondBasis");
    public final static Thirty360.Convention Italian = new Thirty360.Convention("Italian");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Convention swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Convention.class + " with value " + swigValue);
    }

    private Convention(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Convention(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Convention(String swigName, Convention swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Convention[] swigValues = { USA, BondBasis, European, EurobondBasis, Italian };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}