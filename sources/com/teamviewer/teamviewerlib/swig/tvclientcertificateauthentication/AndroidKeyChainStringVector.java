package com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class AndroidKeyChainStringVector extends AbstractList<String> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidKeyChainStringVector(Iterable<String> iterable) {
        this();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(String str) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doAdd__SWIG_0(this.swigCPtr, this, str);
    }

    private int doCapacity() {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doCapacity(this.swigCPtr, this);
    }

    private String doGet(int i) {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doGet(this.swigCPtr, this, i);
    }

    private String doRemove(int i) {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doRemove(this.swigCPtr, this, i);
    }

    private void doRemoveRange(int i, int i2) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doReserve(this.swigCPtr, this, i);
    }

    private String doSet(int i, String str) {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doSet(this.swigCPtr, this, i, str);
    }

    private int doSize() {
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(AndroidKeyChainStringVector androidKeyChainStringVector) {
        if (androidKeyChainStringVector == null) {
            return 0L;
        }
        return androidKeyChainStringVector.swigCPtr;
    }

    public static long swigRelease(AndroidKeyChainStringVector androidKeyChainStringVector) {
        if (androidKeyChainStringVector != null) {
            if (androidKeyChainStringVector.swigCMemOwn) {
                long j = androidKeyChainStringVector.swigCPtr;
                androidKeyChainStringVector.swigCMemOwn = false;
                androidKeyChainStringVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(String str) {
        ((AbstractList) this).modCount++;
        doAdd(str);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IAndroidKeyChainCallbackSWIGJNI.delete_AndroidKeyChainStringVector(j);
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
        return IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
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
    public String get(int i) {
        return doGet(i);
    }

    private void doAdd(int i, String str) {
        IAndroidKeyChainCallbackSWIGJNI.AndroidKeyChainStringVector_doAdd__SWIG_1(this.swigCPtr, this, i, str);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return doSet(i, str);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ((AbstractList) this).modCount++;
        doAdd(i, str);
    }

    public AndroidKeyChainStringVector(String[] strArr) {
        this();
        doReserve(strArr.length);
        for (String str : strArr) {
            doAdd(str);
        }
    }

    public AndroidKeyChainStringVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public AndroidKeyChainStringVector() {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainStringVector__SWIG_0(), true);
    }

    public AndroidKeyChainStringVector(AndroidKeyChainStringVector androidKeyChainStringVector) {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainStringVector__SWIG_1(getCPtr(androidKeyChainStringVector), androidKeyChainStringVector), true);
    }

    public AndroidKeyChainStringVector(int i, String str) {
        this(IAndroidKeyChainCallbackSWIGJNI.new_AndroidKeyChainStringVector__SWIG_2(i, str), true);
    }
}
