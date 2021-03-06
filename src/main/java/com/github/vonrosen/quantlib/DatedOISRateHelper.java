/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class DatedOISRateHelper extends RateHelper {
  private transient long swigCPtr;

  protected DatedOISRateHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DatedOISRateHelper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DatedOISRateHelper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DatedOISRateHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DatedOISRateHelper(Date startDate, Date endDate, QuoteHandle rate, OvernightIndex index, YieldTermStructureHandle discountingCurve) {
    this(QuantLibJNI.new_DatedOISRateHelper__SWIG_0(Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(rate), rate, OvernightIndex.getCPtr(index), index, YieldTermStructureHandle.getCPtr(discountingCurve), discountingCurve), true);
  }

  public DatedOISRateHelper(Date startDate, Date endDate, QuoteHandle rate, OvernightIndex index) {
    this(QuantLibJNI.new_DatedOISRateHelper__SWIG_1(Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, QuoteHandle.getCPtr(rate), rate, OvernightIndex.getCPtr(index), index), true);
  }

}
