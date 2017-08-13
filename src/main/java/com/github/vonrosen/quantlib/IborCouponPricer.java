/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class IborCouponPricer extends FloatingRateCouponPricer {
  private transient long swigCPtr;

  protected IborCouponPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.IborCouponPricer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IborCouponPricer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_IborCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OptionletVolatilityStructureHandle capletVolatility() {
    return new OptionletVolatilityStructureHandle(QuantLibJNI.IborCouponPricer_capletVolatility(swigCPtr, this), true);
  }

  public void setCapletVolatility(OptionletVolatilityStructureHandle v) {
    QuantLibJNI.IborCouponPricer_setCapletVolatility__SWIG_0(swigCPtr, this, OptionletVolatilityStructureHandle.getCPtr(v), v);
  }

  public void setCapletVolatility() {
    QuantLibJNI.IborCouponPricer_setCapletVolatility__SWIG_1(swigCPtr, this);
  }

}