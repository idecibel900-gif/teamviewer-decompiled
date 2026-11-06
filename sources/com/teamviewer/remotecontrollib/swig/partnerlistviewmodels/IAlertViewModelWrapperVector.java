package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class IAlertViewModelWrapperVector extends AbstractList implements RandomAccess {
    public transient long m;
    public transient boolean n = true;

    public IAlertViewModelWrapperVector(long j) {
        this.m = j;
    }

    public final synchronized void a() {
        try {
            long j = this.m;
            if (j != 0) {
                if (this.n) {
                    this.n = false;
                    ComputerDetailsViewModelSWIGJNI.delete_IAlertViewModelWrapperVector(j);
                }
                this.m = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
        ((AbstractList) this).modCount++;
        ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doAdd__SWIG_1(this.m, this, i, iAlertViewModelWrapper == null ? 0L : iAlertViewModelWrapper.a, iAlertViewModelWrapper);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_clear(this.m, this);
    }

    public final void finalize() {
        a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long jIAlertViewModelWrapperVector_doGet = ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doGet(this.m, this, i);
        if (jIAlertViewModelWrapperVector_doGet == 0) {
            return null;
        }
        return new IAlertViewModelWrapper(jIAlertViewModelWrapperVector_doGet);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_isEmpty(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long jIAlertViewModelWrapperVector_doRemove = ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doRemove(this.m, this, i);
        if (jIAlertViewModelWrapperVector_doRemove == 0) {
            return null;
        }
        return new IAlertViewModelWrapper(jIAlertViewModelWrapperVector_doRemove);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doRemoveRange(this.m, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
        long jIAlertViewModelWrapperVector_doSet = ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doSet(this.m, this, i, iAlertViewModelWrapper == null ? 0L : iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        if (jIAlertViewModelWrapperVector_doSet == 0) {
            return null;
        }
        return new IAlertViewModelWrapper(jIAlertViewModelWrapperVector_doSet);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doSize(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) obj;
        ((AbstractList) this).modCount++;
        ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_doAdd__SWIG_0(this.m, this, iAlertViewModelWrapper == null ? 0L : iAlertViewModelWrapper.a, iAlertViewModelWrapper);
        return true;
    }
}
