package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class NearbyDevicesDyngateIds extends AbstractList implements RandomAccess {
    public transient long m;
    public transient boolean n = true;

    public NearbyDevicesDyngateIds(long j) {
        this.m = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        DyngateID dyngateID = (DyngateID) obj;
        ((AbstractList) this).modCount++;
        INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doAdd__SWIG_1(this.m, this, i, DyngateID.getCPtr(dyngateID), dyngateID);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_clear(this.m, this);
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.m;
                if (j != 0) {
                    if (this.n) {
                        this.n = false;
                        INearbyDeviceItemSWIGJNI.delete_NearbyDevicesDyngateIds(j);
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
        return new DyngateID(INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doGet(this.m, this, i), false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_isEmpty(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new DyngateID(INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doRemove(this.m, this, i), true);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doRemoveRange(this.m, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        DyngateID dyngateID = (DyngateID) obj;
        return new DyngateID(INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doSet(this.m, this, i, DyngateID.getCPtr(dyngateID), dyngateID), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doSize(this.m, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        DyngateID dyngateID = (DyngateID) obj;
        ((AbstractList) this).modCount++;
        INearbyDeviceItemSWIGJNI.NearbyDevicesDyngateIds_doAdd__SWIG_0(this.m, this, DyngateID.getCPtr(dyngateID), dyngateID);
        return true;
    }
}
