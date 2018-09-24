/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class GbpLiborSwapIsdaFix extends SwapIndex {
  private transient long swigCPtr;

  protected GbpLiborSwapIsdaFix(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GbpLiborSwapIsdaFix_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GbpLiborSwapIsdaFix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GbpLiborSwapIsdaFix(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GbpLiborSwapIsdaFix(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_GbpLiborSwapIsdaFix__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public GbpLiborSwapIsdaFix(Period tenor) {
    this(QuantLibJNI.new_GbpLiborSwapIsdaFix__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

  public GbpLiborSwapIsdaFix(Period tenor, YieldTermStructureHandle h1, YieldTermStructureHandle h2) {
    this(QuantLibJNI.new_GbpLiborSwapIsdaFix__SWIG_2(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h1), h1, YieldTermStructureHandle.getCPtr(h2), h2), true);
  }

}
