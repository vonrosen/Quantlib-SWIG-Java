/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class BlackProcess extends GeneralizedBlackScholesProcess {
  private transient long swigCPtr;

  protected BlackProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BlackProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackProcess(QuoteHandle s0, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_BlackProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

}