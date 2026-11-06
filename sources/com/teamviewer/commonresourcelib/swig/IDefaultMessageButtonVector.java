package com.teamviewer.commonresourcelib.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class IDefaultMessageButtonVector extends AbstractList<DefaultMessageButtonViewModel> implements RandomAccess {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IDefaultMessageButtonVector(Iterable<DefaultMessageButtonViewModel> iterable) {
        this();
        Iterator<DefaultMessageButtonViewModel> it = iterable.iterator();
        while (it.hasNext()) {
            doAdd(it.next());
        }
    }

    private void doAdd(int i, DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doAdd__SWIG_1(this.swigCPtr, this, i, DefaultMessageButtonViewModel.getCPtr(defaultMessageButtonViewModel), defaultMessageButtonViewModel);
    }

    private int doCapacity() {
        return DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doCapacity(this.swigCPtr, this);
    }

    private DefaultMessageButtonViewModel doGet(int i) {
        return new DefaultMessageButtonViewModel(DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doGet(this.swigCPtr, this, i), false);
    }

    private DefaultMessageButtonViewModel doRemove(int i) {
        return new DefaultMessageButtonViewModel(DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doRemove(this.swigCPtr, this, i), true);
    }

    private void doRemoveRange(int i, int i2) {
        DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private void doReserve(int i) {
        DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doReserve(this.swigCPtr, this, i);
    }

    private DefaultMessageButtonViewModel doSet(int i, DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        return new DefaultMessageButtonViewModel(DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doSet(this.swigCPtr, this, i, DefaultMessageButtonViewModel.getCPtr(defaultMessageButtonViewModel), defaultMessageButtonViewModel), true);
    }

    private int doSize() {
        return DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doSize(this.swigCPtr, this);
    }

    public static long getCPtr(IDefaultMessageButtonVector iDefaultMessageButtonVector) {
        if (iDefaultMessageButtonVector == null) {
            return 0L;
        }
        return iDefaultMessageButtonVector.swigCPtr;
    }

    public static long swigRelease(IDefaultMessageButtonVector iDefaultMessageButtonVector) {
        if (iDefaultMessageButtonVector != null) {
            if (iDefaultMessageButtonVector.swigCMemOwn) {
                long j = iDefaultMessageButtonVector.swigCPtr;
                iDefaultMessageButtonVector.swigCMemOwn = false;
                iDefaultMessageButtonVector.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        ((AbstractList) this).modCount++;
        doAdd(defaultMessageButtonViewModel);
        return true;
    }

    public int capacity() {
        return doCapacity();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    DefaultMessageViewModelSWIGJNI.delete_IDefaultMessageButtonVector(j);
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
        return DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public DefaultMessageButtonViewModel remove(int i) {
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
    public DefaultMessageButtonViewModel get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public DefaultMessageButtonViewModel set(int i, DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        return doSet(i, defaultMessageButtonViewModel);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        ((AbstractList) this).modCount++;
        doAdd(i, defaultMessageButtonViewModel);
    }

    private void doAdd(DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        DefaultMessageViewModelSWIGJNI.IDefaultMessageButtonVector_doAdd__SWIG_0(this.swigCPtr, this, DefaultMessageButtonViewModel.getCPtr(defaultMessageButtonViewModel), defaultMessageButtonViewModel);
    }

    public IDefaultMessageButtonVector(DefaultMessageButtonViewModel[] defaultMessageButtonViewModelArr) {
        this();
        doReserve(defaultMessageButtonViewModelArr.length);
        for (DefaultMessageButtonViewModel defaultMessageButtonViewModel : defaultMessageButtonViewModelArr) {
            doAdd(defaultMessageButtonViewModel);
        }
    }

    public IDefaultMessageButtonVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public IDefaultMessageButtonVector() {
        this(DefaultMessageViewModelSWIGJNI.new_IDefaultMessageButtonVector__SWIG_0(), true);
    }

    public IDefaultMessageButtonVector(IDefaultMessageButtonVector iDefaultMessageButtonVector) {
        this(DefaultMessageViewModelSWIGJNI.new_IDefaultMessageButtonVector__SWIG_1(getCPtr(iDefaultMessageButtonVector), iDefaultMessageButtonVector), true);
    }

    public IDefaultMessageButtonVector(int i, DefaultMessageButtonViewModel defaultMessageButtonViewModel) {
        this(DefaultMessageViewModelSWIGJNI.new_IDefaultMessageButtonVector__SWIG_2(i, DefaultMessageButtonViewModel.getCPtr(defaultMessageButtonViewModel), defaultMessageButtonViewModel), true);
    }
}
