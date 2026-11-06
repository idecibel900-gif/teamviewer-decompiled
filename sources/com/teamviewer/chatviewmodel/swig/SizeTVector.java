package com.teamviewer.chatviewmodel.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class SizeTVector extends AbstractList<Long> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SizeTVector(Iterable<Long> iterable) {
        this();
        Iterator<Long> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next().longValue());
        }
    }

    private void doAdd(int i, long j) {
        ListChangeArgsSWIGJNI.SizeTVector_doAdd__SWIG_1(this.swigCPtr, this, i, j);
    }

    private int doCapacity() {
        return ListChangeArgsSWIGJNI.SizeTVector_doCapacity(this.swigCPtr, this);
    }

    private long doGet(int i) {
        return ListChangeArgsSWIGJNI.SizeTVector_doGet(this.swigCPtr, this, i);
    }

    private long doRemove(int i) {
        return ListChangeArgsSWIGJNI.SizeTVector_doRemove(this.swigCPtr, this, i);
    }

    private void doRemoveRange(int i, int i2) {
        ListChangeArgsSWIGJNI.SizeTVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        ListChangeArgsSWIGJNI.SizeTVector_doReserve(this.swigCPtr, this, i);
    }

    private long doSet(int i, long j) {
        return ListChangeArgsSWIGJNI.SizeTVector_doSet(this.swigCPtr, this, i, j);
    }

    private int doSize() {
        return ListChangeArgsSWIGJNI.SizeTVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(SizeTVector sizeTVector) {
        if (sizeTVector == null) {
            return 0L;
        }
        return sizeTVector.swigCPtr;
    }

    public static long swigRelease(SizeTVector sizeTVector) {
        if (sizeTVector != null) {
            if (sizeTVector.swigCMemOwn) {
                long j = sizeTVector.swigCPtr;
                sizeTVector.swigCMemOwn = false;
                sizeTVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        ((AbstractList) this).modCount++;
        doAdd(l.longValue());
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ListChangeArgsSWIGJNI.SizeTVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ListChangeArgsSWIGJNI.delete_SizeTVector(j);
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
    public Long get(int i) {
        return Long.valueOf(doGet(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ListChangeArgsSWIGJNI.SizeTVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(doRemove(i));
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
    public Long set(int i, Long l) {
        return Long.valueOf(doSet(i, l.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    private void doAdd(long j) {
        ListChangeArgsSWIGJNI.SizeTVector_doAdd__SWIG_0(this.swigCPtr, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        ((AbstractList) this).modCount++;
        doAdd(i, l.longValue());
    }

    public SizeTVector(long[] jArr) {
        this();
        doReserve(jArr.length);
        for (long j : jArr) {
            doAdd(j);
        }
    }

    public SizeTVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public SizeTVector() {
        this(ListChangeArgsSWIGJNI.new_SizeTVector__SWIG_0(), true);
    }

    public SizeTVector(SizeTVector sizeTVector) {
        this(ListChangeArgsSWIGJNI.new_SizeTVector__SWIG_1(getCPtr(sizeTVector), sizeTVector), true);
    }

    public SizeTVector(int i, long j) {
        this(ListChangeArgsSWIGJNI.new_SizeTVector__SWIG_2(i, j), true);
    }
}
