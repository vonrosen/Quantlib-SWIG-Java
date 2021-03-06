/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CmsCouponPricer extends FloatingRateCouponPricer {
  private transient long swigCPtr;

  protected CmsCouponPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CmsCouponPricer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmsCouponPricer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CmsCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SwaptionVolatilityStructureHandle swaptionVolatility() {
    return new SwaptionVolatilityStructureHandle(QuantLibJNI.CmsCouponPricer_swaptionVolatility(swigCPtr, this), true);
  }

  public void setSwaptionVolatility(SwaptionVolatilityStructureHandle v) {
    QuantLibJNI.CmsCouponPricer_setSwaptionVolatility__SWIG_0(swigCPtr, this, SwaptionVolatilityStructureHandle.getCPtr(v), v);
  }

  public void setSwaptionVolatility() {
    QuantLibJNI.CmsCouponPricer_setSwaptionVolatility__SWIG_1(swigCPtr, this);
  }

}
