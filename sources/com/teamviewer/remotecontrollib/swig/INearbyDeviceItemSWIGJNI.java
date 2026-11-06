package com.teamviewer.remotecontrollib.swig;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class INearbyDeviceItemSWIGJNI {
    public static final native long INearbyDeviceItem_GetAccountId(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native String INearbyDeviceItem_GetAccountPictureURL(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native long INearbyDeviceItem_GetDyngateIds(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native int INearbyDeviceItem_GetIndicatorType(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native BigInteger INearbyDeviceItem_GetItemId(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native int INearbyDeviceItem_GetItemType(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native BigInteger INearbyDeviceItem_GetParentId(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native String INearbyDeviceItem_GetText(long j, INearbyDeviceItem iNearbyDeviceItem);

    public static final native void INearbyDeviceItem_RegisterOnPropertiesChangedCallback(long j, INearbyDeviceItem iNearbyDeviceItem, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void NearbyDevicesDyngateIds_clear(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds);

    public static final native void NearbyDevicesDyngateIds_doAdd__SWIG_0(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, long j2, DyngateID dyngateID);

    public static final native void NearbyDevicesDyngateIds_doAdd__SWIG_1(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, int i, long j2, DyngateID dyngateID);

    public static final native long NearbyDevicesDyngateIds_doGet(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, int i);

    public static final native long NearbyDevicesDyngateIds_doRemove(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, int i);

    public static final native void NearbyDevicesDyngateIds_doRemoveRange(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, int i, int i2);

    public static final native long NearbyDevicesDyngateIds_doSet(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds, int i, long j2, DyngateID dyngateID);

    public static final native int NearbyDevicesDyngateIds_doSize(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds);

    public static final native boolean NearbyDevicesDyngateIds_isEmpty(long j, NearbyDevicesDyngateIds nearbyDevicesDyngateIds);

    public static final native void delete_INearbyDeviceItem(long j);

    public static final native void delete_NearbyDevicesDyngateIds(long j);
}
