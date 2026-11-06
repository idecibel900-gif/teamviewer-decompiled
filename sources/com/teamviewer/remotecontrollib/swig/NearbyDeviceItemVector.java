package com.teamviewer.remotecontrollib.swig;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class NearbyDeviceItemVector extends AbstractList implements RandomAccess {
    public transient long m;
    public transient boolean n = true;

    public NearbyDeviceItemVector(long j) {
        this.m = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        INearbyDeviceItem iNearbyDeviceItem = (INearbyDeviceItem) obj;
        ((AbstractList) this).modCount++;
        INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doAdd__SWIG_1(this.m, this, i, iNearbyDeviceItem == null ? 0L : iNearbyDeviceItem.a, iNearbyDeviceItem);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_clear(this.m, this);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.m;
                if (j != 0) {
                    if (this.n) {
                        this.n = false;
                        INearbyDevicesViewModelSWIGJNI.delete_NearbyDeviceItemVector(j);
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
        long jNearbyDeviceItemVector_doGet = INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doGet(this.m, this, i);
        if (jNearbyDeviceItemVector_doGet == 0) {
            return null;
        }
        return new INearbyDeviceItem(jNearbyDeviceItemVector_doGet);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_isEmpty(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long jNearbyDeviceItemVector_doRemove = INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doRemove(this.m, this, i);
        if (jNearbyDeviceItemVector_doRemove == 0) {
            return null;
        }
        return new INearbyDeviceItem(jNearbyDeviceItemVector_doRemove);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doRemoveRange(this.m, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        INearbyDeviceItem iNearbyDeviceItem = (INearbyDeviceItem) obj;
        long jNearbyDeviceItemVector_doSet = INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doSet(this.m, this, i, iNearbyDeviceItem == null ? 0L : iNearbyDeviceItem.a, iNearbyDeviceItem);
        if (jNearbyDeviceItemVector_doSet == 0) {
            return null;
        }
        return new INearbyDeviceItem(jNearbyDeviceItemVector_doSet);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doSize(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        INearbyDeviceItem iNearbyDeviceItem = (INearbyDeviceItem) obj;
        ((AbstractList) this).modCount++;
        INearbyDevicesViewModelSWIGJNI.NearbyDeviceItemVector_doAdd__SWIG_0(this.m, this, iNearbyDeviceItem == null ? 0L : iNearbyDeviceItem.a, iNearbyDeviceItem);
        return true;
    }
}
