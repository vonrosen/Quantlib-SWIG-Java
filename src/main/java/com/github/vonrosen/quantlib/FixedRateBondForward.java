/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class FixedRateBondForward extends Forward {
  private transient long swigCPtr;

  protected FixedRateBondForward(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FixedRateBondForward_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FixedRateBondForward obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FixedRateBondForward(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FixedRateBondForward(Date valueDate, Date maturityDate, Position.Type type, double strike, long settlementDays, DayCounter dayCounter, Calendar calendar, BusinessDayConvention businessDayConvention, FixedRateBond fixedBond, YieldTermStructureHandle discountCurve, YieldTermStructureHandle incomeDiscountCurve) {
    this(QuantLibJNI.new_FixedRateBondForward__SWIG_0(Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, type.swigValue(), strike, settlementDays, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, businessDayConvention.swigValue(), FixedRateBond.getCPtr(fixedBond), fixedBond, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, YieldTermStructureHandle.getCPtr(incomeDiscountCurve), incomeDiscountCurve), true);
  }

  public FixedRateBondForward(Date valueDate, Date maturityDate, Position.Type type, double strike, long settlementDays, DayCounter dayCounter, Calendar calendar, BusinessDayConvention businessDayConvention, FixedRateBond fixedBond, YieldTermStructureHandle discountCurve) {
    this(QuantLibJNI.new_FixedRateBondForward__SWIG_1(Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, type.swigValue(), strike, settlementDays, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, businessDayConvention.swigValue(), FixedRateBond.getCPtr(fixedBond), fixedBond, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve), true);
  }

  public FixedRateBondForward(Date valueDate, Date maturityDate, Position.Type type, double strike, long settlementDays, DayCounter dayCounter, Calendar calendar, BusinessDayConvention businessDayConvention, FixedRateBond fixedBond) {
    this(QuantLibJNI.new_FixedRateBondForward__SWIG_2(Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, type.swigValue(), strike, settlementDays, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, businessDayConvention.swigValue(), FixedRateBond.getCPtr(fixedBond), fixedBond), true);
  }

  public double forwardPrice() {
    return QuantLibJNI.FixedRateBondForward_forwardPrice(swigCPtr, this);
  }

  public double cleanForwardPrice() {
    return QuantLibJNI.FixedRateBondForward_cleanForwardPrice(swigCPtr, this);
  }

  public double spotIncome(YieldTermStructureHandle incomeDiscountCurve) {
    return QuantLibJNI.FixedRateBondForward_spotIncome(swigCPtr, this, YieldTermStructureHandle.getCPtr(incomeDiscountCurve), incomeDiscountCurve);
  }

  public double spotValue() {
    return QuantLibJNI.FixedRateBondForward_spotValue(swigCPtr, this);
  }

}
