package com.teamviewer.nativelivedatalib.swig;

import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class Size {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Size(int i, int i2) {
        this(SizeSWIGJNI.new_Size__SWIG_0(i, i2), true);
    }

    public static long getCPtr(Size size) {
        if (size == null) {
            return 0L;
        }
        return size.swigCPtr;
    }

    public static long swigRelease(Size size) {
        if (size != null) {
            if (size.swigCMemOwn) {
                long j = size.swigCPtr;
                size.swigCMemOwn = false;
                size.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public boolean Equal(Size size) {
        return SizeSWIGJNI.Size_Equal(this.swigCPtr, this, getCPtr(size), size);
    }

    public boolean NotEqual(Size size) {
        return SizeSWIGJNI.Size_NotEqual(this.swigCPtr, this, getCPtr(size), size);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    SizeSWIGJNI.delete_Size(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public int getHeight() {
        return SizeSWIGJNI.Size_height_get(this.swigCPtr, this);
    }

    public int getWidth() {
        return SizeSWIGJNI.Size_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        SizeSWIGJNI.Size_height_set(this.swigCPtr, this, i);
    }

    public void setWidth(int i) {
        SizeSWIGJNI.Size_width_set(this.swigCPtr, this, i);
    }

    public Size(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public Size() {
        this(SizeSWIGJNI.new_Size__SWIG_1(), true);
    }
}
