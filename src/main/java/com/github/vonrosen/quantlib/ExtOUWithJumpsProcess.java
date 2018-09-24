/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.vonrosen.quantlib;

public class ExtOUWithJumpsProcess extends StochasticProcess1D {
  private transient long swigCPtr;

  protected ExtOUWithJumpsProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ExtOUWithJumpsProcess_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtOUWithJumpsProcess obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ExtOUWithJumpsProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExtOUWithJumpsProcess(ExtendedOrnsteinUhlenbeckProcess process, double Y0, double beta, double jumpIntensity, double eta) {
    this(QuantLibJNI.new_ExtOUWithJumpsProcess(ExtendedOrnsteinUhlenbeckProcess.getCPtr(process), process, Y0, beta, jumpIntensity, eta), true);
  }

}
