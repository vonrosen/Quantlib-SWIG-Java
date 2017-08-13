/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CalibratedModel {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CalibratedModel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CalibratedModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CalibratedModel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_CalibratedModel __deref__() {
    long cPtr = QuantLibJNI.CalibratedModel___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_CalibratedModel(cPtr, false);
  }

  public boolean isNull() {
    return QuantLibJNI.CalibratedModel_isNull(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.CalibratedModel_asObservable(swigCPtr, this), true);
  }

  public CalibratedModel() {
    this(QuantLibJNI.new_CalibratedModel(), true);
  }

  public Array params() {
    return new Array(QuantLibJNI.CalibratedModel_params(swigCPtr, this), true);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights) {
    QuantLibJNI.CalibratedModel_calibrate__SWIG_0(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint) {
    QuantLibJNI.CalibratedModel_calibrate__SWIG_1(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2) {
    QuantLibJNI.CalibratedModel_calibrate__SWIG_2(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2);
  }

  public void setParams(Array params) {
    QuantLibJNI.CalibratedModel_setParams(swigCPtr, this, Array.getCPtr(params), params);
  }

  public double value(Array params, CalibrationHelperVector arg1) {
    return QuantLibJNI.CalibratedModel_value(swigCPtr, this, Array.getCPtr(params), params, CalibrationHelperVector.getCPtr(arg1), arg1);
  }

}