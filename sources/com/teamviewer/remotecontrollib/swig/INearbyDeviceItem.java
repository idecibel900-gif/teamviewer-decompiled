package com.teamviewer.remotecontrollib.swig;

import o.bc3;
import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public final class INearbyDeviceItem {
    public transient long a;
    public transient boolean b = true;

    public INearbyDeviceItem(long j) {
        this.a = j;
    }

    public final bc3 a() {
        int iINearbyDeviceItem_GetIndicatorType = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetIndicatorType(this.a, this);
        bc3 bc3Var = bc3.Unknown;
        bc3[] bc3VarArr = (bc3[]) bc3.class.getEnumConstants();
        if (iINearbyDeviceItem_GetIndicatorType < bc3VarArr.length && iINearbyDeviceItem_GetIndicatorType >= 0) {
            bc3 bc3Var2 = bc3VarArr[iINearbyDeviceItem_GetIndicatorType];
            if (bc3Var2.m == iINearbyDeviceItem_GetIndicatorType) {
                return bc3Var2;
            }
        }
        for (bc3 bc3Var3 : bc3VarArr) {
            if (bc3Var3.m == iINearbyDeviceItem_GetIndicatorType) {
                return bc3Var3;
            }
        }
        hk0.g(ua5.k(iINearbyDeviceItem_GetIndicatorType, bc3.class, "No enum ", " with value "));
        return null;
    }

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        INearbyDeviceItemSWIGJNI.delete_INearbyDeviceItem(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
