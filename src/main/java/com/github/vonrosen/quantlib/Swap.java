/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class Swap extends Instrument {
  private transient long swigCPtr;

  protected Swap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Swap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Swap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Swap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Swap(Leg firstLeg, Leg secondLeg) {
    this(QuantLibJNI.new_Swap(Leg.getCPtr(firstLeg), firstLeg, Leg.getCPtr(secondLeg), secondLeg), true);
  }

  public Date startDate() {
    return new Date(QuantLibJNI.Swap_startDate(swigCPtr, this), true);
  }

  public Date maturityDate() {
    return new Date(QuantLibJNI.Swap_maturityDate(swigCPtr, this), true);
  }

  public Leg leg(long i) {
    return new Leg(QuantLibJNI.Swap_leg(swigCPtr, this, i), false);
  }

  public double legNPV(long j) {
    return QuantLibJNI.Swap_legNPV(swigCPtr, this, j);
  }

}
