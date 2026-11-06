package com.teamviewer.remotecontrolviewmodellib.swig;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ListOfResolutions extends AbstractList implements RandomAccess {
    public transient long m;
    public transient boolean n = true;

    public ListOfResolutions(long j) {
        this.m = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Resolution resolution = (Resolution) obj;
        ((AbstractList) this).modCount++;
        IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doAdd__SWIG_1(this.m, this, i, resolution == null ? 0L : resolution.a, resolution);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        IChangeResolutionViewModelSWIGJNI.ListOfResolutions_clear(this.m, this);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.m;
                if (j != 0) {
                    if (this.n) {
                        this.n = false;
                        IChangeResolutionViewModelSWIGJNI.delete_ListOfResolutions(j);
                    }
                    this.m = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new Resolution(IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doGet(this.m, this, i), false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return IChangeResolutionViewModelSWIGJNI.ListOfResolutions_isEmpty(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new Resolution(IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doRemove(this.m, this, i), true);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doRemoveRange(this.m, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Resolution resolution = (Resolution) obj;
        return new Resolution(IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doSet(this.m, this, i, resolution == null ? 0L : resolution.a, resolution), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doSize(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        Resolution resolution = (Resolution) obj;
        ((AbstractList) this).modCount++;
        IChangeResolutionViewModelSWIGJNI.ListOfResolutions_doAdd__SWIG_0(this.m, this, resolution == null ? 0L : resolution.a, resolution);
        return true;
    }
}
