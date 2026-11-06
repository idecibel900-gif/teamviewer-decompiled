package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyChainByteArrayVector extends AbstractList<AndroidKeyChainByteArray> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidKeyChainByteArrayVector(Iterable<AndroidKeyChainByteArray> iterable) {
        this();
        Iterator<AndroidKeyChainByteArray> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(int i, AndroidKeyChainByteArray androidKeyChainByteArray) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doAdd__SWIG_1(this.swigCPtr, this, i, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray);
    }

    private int doCapacity() {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doCapacity(this.swigCPtr, this);
    }

    private AndroidKeyChainByteArray doGet(int i) {
        return new AndroidKeyChainByteArray(IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doGet(this.swigCPtr, this, i), false);
    }

    private AndroidKeyChainByteArray doRemove(int i) {
        return new AndroidKeyChainByteArray(IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doRemove(this.swigCPtr, this, i), true);
    }

    private void doRemoveRange(int i, int i2) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doReserve(this.swigCPtr, this, i);
    }

    private AndroidKeyChainByteArray doSet(int i, AndroidKeyChainByteArray androidKeyChainByteArray) {
        return new AndroidKeyChainByteArray(IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doSet(this.swigCPtr, this, i, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray), true);
    }

    private int doSize() {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector) {
        if (androidKeyChainByteArrayVector == null) {
            return 0L;
        }
        return androidKeyChainByteArrayVector.swigCPtr;
    }

    public static long swigRelease(AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector) {
        if (androidKeyChainByteArrayVector != null) {
            if (androidKeyChainByteArrayVector.swigCMemOwn) {
                long j = androidKeyChainByteArrayVector.swigCPtr;
                androidKeyChainByteArrayVector.swigCMemOwn = false;
                androidKeyChainByteArrayVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(AndroidKeyChainByteArray androidKeyChainByteArray) {
        ((AbstractList) this).modCount++;
        doAdd(androidKeyChainByteArray);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAndroidKeyChainCallbackSWIGJNI.delete_AndroidKeyChainByteArrayVector(j);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public AndroidKeyChainByteArray remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public void reserve(int i) {
        doReserve(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    @Override // java.util.AbstractList, java.util.List
    public AndroidKeyChainByteArray get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public AndroidKeyChainByteArray set(int i, AndroidKeyChainByteArray androidKeyChainByteArray) {
        return doSet(i, androidKeyChainByteArray);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, AndroidKeyChainByteArray androidKeyChainByteArray) {
        ((AbstractList) this).modCount++;
        doAdd(i, androidKeyChainByteArray);
    }

    private void doAdd(AndroidKeyChainByteArray androidKeyChainByteArray) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainByteArrayVector_doAdd__SWIG_0(this.swigCPtr, this, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray);
    }

    public AndroidKeyChainByteArrayVector(AndroidKeyChainByteArray[] androidKeyChainByteArrayArr) {
        this();
        doReserve(androidKeyChainByteArrayArr.length);
        for (AndroidKeyChainByteArray androidKeyChainByteArray : androidKeyChainByteArrayArr) {
            doAdd(androidKeyChainByteArray);
        }
    }

    public AndroidKeyChainByteArrayVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public AndroidKeyChainByteArrayVector() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainByteArrayVector__SWIG_0(), true);
    }

    public AndroidKeyChainByteArrayVector(AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector) {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainByteArrayVector__SWIG_1(getCPtr(androidKeyChainByteArrayVector), androidKeyChainByteArrayVector), true);
    }

    public AndroidKeyChainByteArrayVector(int i, AndroidKeyChainByteArray androidKeyChainByteArray) {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainByteArrayVector__SWIG_2(i, AndroidKeyChainByteArray.getCPtr(androidKeyChainByteArray), androidKeyChainByteArray), true);
    }
}
