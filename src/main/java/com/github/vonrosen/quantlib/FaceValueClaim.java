/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class FaceValueClaim extends Claim {
  private transient long swigCPtr;

  protected FaceValueClaim(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FaceValueClaim_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FaceValueClaim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FaceValueClaim(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FaceValueClaim() {
    this(QuantLibJNI.new_FaceValueClaim(), true);
  }

}
