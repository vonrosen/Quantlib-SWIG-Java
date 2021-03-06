/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class CalibratedModelHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CalibratedModelHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CalibratedModelHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CalibratedModelHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CalibratedModelHandle(CalibratedModel arg0) {
    this(QuantLibJNI.new_CalibratedModelHandle__SWIG_0(CalibratedModel.getCPtr(arg0), arg0), true);
  }

  public CalibratedModelHandle() {
    this(QuantLibJNI.new_CalibratedModelHandle__SWIG_1(), true);
  }

  public CalibratedModel __deref__() {
    return new CalibratedModel(QuantLibJNI.CalibratedModelHandle___deref__(swigCPtr, this), true);
  }

  public boolean empty() {
    return QuantLibJNI.CalibratedModelHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    return new Observable(QuantLibJNI.CalibratedModelHandle_asObservable(swigCPtr, this), true);
  }

  public Array params() {
    return new Array(QuantLibJNI.CalibratedModelHandle_params(swigCPtr, this), true);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights) {
    QuantLibJNI.CalibratedModelHandle_calibrate__SWIG_0(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint) {
    QuantLibJNI.CalibratedModelHandle_calibrate__SWIG_1(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2) {
    QuantLibJNI.CalibratedModelHandle_calibrate__SWIG_2(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2);
  }

  public void setParams(Array params) {
    QuantLibJNI.CalibratedModelHandle_setParams(swigCPtr, this, Array.getCPtr(params), params);
  }

  public double value(Array params, CalibrationHelperVector arg1) {
    return QuantLibJNI.CalibratedModelHandle_value(swigCPtr, this, Array.getCPtr(params), params, CalibrationHelperVector.getCPtr(arg1), arg1);
  }

}
