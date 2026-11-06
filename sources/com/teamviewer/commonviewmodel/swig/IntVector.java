package com.teamviewer.commonviewmodel.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IntVector extends AbstractList<Integer> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IntVector(Iterable<Integer> iterable) {
        this();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next().intValue());
        }
    }

    private void doAdd(int i) {
        IVideoCodecDetectorSWIGJNI.IntVector_doAdd__SWIG_0(this.swigCPtr, this, i);
    }

    private int doCapacity() {
        return IVideoCodecDetectorSWIGJNI.IntVector_doCapacity(this.swigCPtr, this);
    }

    private int doGet(int i) {
        return IVideoCodecDetectorSWIGJNI.IntVector_doGet(this.swigCPtr, this, i);
    }

    private int doRemove(int i) {
        return IVideoCodecDetectorSWIGJNI.IntVector_doRemove(this.swigCPtr, this, i);
    }

    private void doRemoveRange(int i, int i2) {
        IVideoCodecDetectorSWIGJNI.IntVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        IVideoCodecDetectorSWIGJNI.IntVector_doReserve(this.swigCPtr, this, i);
    }

    private int doSet(int i, int i2) {
        return IVideoCodecDetectorSWIGJNI.IntVector_doSet(this.swigCPtr, this, i, i2);
    }

    private int doSize() {
        return IVideoCodecDetectorSWIGJNI.IntVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(IntVector intVector) {
        if (intVector == null) {
            return 0L;
        }
        return intVector.swigCPtr;
    }

    public static long swigRelease(IntVector intVector) {
        if (intVector != null) {
            if (intVector.swigCMemOwn) {
                long j = intVector.swigCPtr;
                intVector.swigCMemOwn = false;
                intVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(num.intValue());
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IVideoCodecDetectorSWIGJNI.IntVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IVideoCodecDetectorSWIGJNI.delete_IntVector(j);
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

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(doGet(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return IVideoCodecDetectorSWIGJNI.IntVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ((AbstractList) this).modCount++;
        return Integer.valueOf(doRemove(i));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public void reserve(int i) {
        doReserve(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(doSet(i, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(int i, int i2) {
        IVideoCodecDetectorSWIGJNI.IntVector_doAdd__SWIG_1(this.swigCPtr, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(i, num.intValue());
    }

    public IntVector(int[] iArr) {
        this();
        doReserve(iArr.length);
        for (int i : iArr) {
            doAdd(i);
        }
    }

    public IntVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public IntVector() {
        this(IVideoCodecDetectorSWIGJNI.new_IntVector__SWIG_0(), true);
    }

    public IntVector(IntVector intVector) {
        this(IVideoCodecDetectorSWIGJNI.new_IntVector__SWIG_1(getCPtr(intVector), intVector), true);
    }

    public IntVector(int i, int i2) {
        this(IVideoCodecDetectorSWIGJNI.new_IntVector__SWIG_2(i, i2), true);
    }
}
