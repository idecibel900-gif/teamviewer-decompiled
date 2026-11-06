package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.ct1;
import o.et1;

/* JADX INFO: loaded from: classes.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.V(parcel, 2, remoteMessage.bundle);
        et1.c0(parcel, iB0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iC0 = ct1.c0(parcel);
        Bundle bundleZ = null;
        while (parcel.dataPosition() < iC0) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                ct1.W(parcel, i);
            } else {
                bundleZ = ct1.z(parcel, i);
            }
        }
        ct1.E(parcel, iC0);
        return new RemoteMessage(bundleZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
