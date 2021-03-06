/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class InterestRateIndex extends Index {
  private transient long swigCPtr;

  protected InterestRateIndex(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.InterestRateIndex_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InterestRateIndex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InterestRateIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String familyName() {
    return QuantLibJNI.InterestRateIndex_familyName(swigCPtr, this);
  }

  public Period tenor() {
    return new Period(QuantLibJNI.InterestRateIndex_tenor(swigCPtr, this), true);
  }

  public long fixingDays() {
    return QuantLibJNI.InterestRateIndex_fixingDays(swigCPtr, this);
  }

  public Date fixingDate(Date valueDate) {
    return new Date(QuantLibJNI.InterestRateIndex_fixingDate(swigCPtr, this, Date.getCPtr(valueDate), valueDate), true);
  }

  public Currency currency() {
    return new Currency(QuantLibJNI.InterestRateIndex_currency(swigCPtr, this), true);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.InterestRateIndex_dayCounter(swigCPtr, this), true);
  }

  public Date maturityDate(Date valueDate) {
    return new Date(QuantLibJNI.InterestRateIndex_maturityDate(swigCPtr, this, Date.getCPtr(valueDate), valueDate), true);
  }

  public Date valueDate(Date fixingDate) {
    return new Date(QuantLibJNI.InterestRateIndex_valueDate(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate), true);
  }

}
