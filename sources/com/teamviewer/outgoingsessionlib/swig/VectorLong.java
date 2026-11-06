package com.teamviewer.outgoingsessionlib.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class VectorLong extends AbstractList<Long> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public VectorLong(Iterable<Long> iterable) {
        this();
        Iterator<Long> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next().longValue());
        }
    }

    private void doAdd(int i, long j) {
        ParticipantManagerSWIGJNI.VectorLong_doAdd__SWIG_1(this.swigCPtr, this, i, j);
    }

    private int doCapacity() {
        return ParticipantManagerSWIGJNI.VectorLong_doCapacity(this.swigCPtr, this);
    }

    private long doGet(int i) {
        return ParticipantManagerSWIGJNI.VectorLong_doGet(this.swigCPtr, this, i);
    }

    private long doRemove(int i) {
        return ParticipantManagerSWIGJNI.VectorLong_doRemove(this.swigCPtr, this, i);
    }

    private void doRemoveRange(int i, int i2) {
        ParticipantManagerSWIGJNI.VectorLong_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        ParticipantManagerSWIGJNI.VectorLong_doReserve(this.swigCPtr, this, i);
    }

    private long doSet(int i, long j) {
        return ParticipantManagerSWIGJNI.VectorLong_doSet(this.swigCPtr, this, i, j);
    }

    private int doSize() {
        return ParticipantManagerSWIGJNI.VectorLong_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(VectorLong vectorLong) {
        if (vectorLong == null) {
            return 0L;
        }
        return vectorLong.swigCPtr;
    }

    public static long swigRelease(VectorLong vectorLong) {
        if (vectorLong != null) {
            if (vectorLong.swigCMemOwn) {
                long j = vectorLong.swigCPtr;
                vectorLong.swigCMemOwn = false;
                vectorLong.delete();
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
        ParticipantManagerSWIGJNI.VectorLong_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantManagerSWIGJNI.delete_VectorLong(j);
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
        return ParticipantManagerSWIGJNI.VectorLong_isEmpty(this.swigCPtr, this);
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
        ParticipantManagerSWIGJNI.VectorLong_doAdd__SWIG_0(this.swigCPtr, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        ((AbstractList) this).modCount++;
        doAdd(i, l.longValue());
    }

    public VectorLong(long[] jArr) {
        this();
        doReserve(jArr.length);
        for (long j : jArr) {
            doAdd(j);
        }
    }

    public VectorLong(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public VectorLong() {
        this(ParticipantManagerSWIGJNI.new_VectorLong__SWIG_0(), true);
    }

    public VectorLong(VectorLong vectorLong) {
        this(ParticipantManagerSWIGJNI.new_VectorLong__SWIG_1(getCPtr(vectorLong), vectorLong), true);
    }

    public VectorLong(int i, long j) {
        this(ParticipantManagerSWIGJNI.new_VectorLong__SWIG_2(i, j), true);
    }
}
