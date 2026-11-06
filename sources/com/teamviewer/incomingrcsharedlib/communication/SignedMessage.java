package com.teamviewer.incomingrcsharedlib.communication;

import android.os.Parcel;
import android.os.Parcelable;
import o.xf5;

/* JADX INFO: loaded from: classes.dex */
public final class SignedMessage implements Parcelable {
    public static final Parcelable.Creator<SignedMessage> CREATOR = new xf5((byte) 8);
    public final byte[] m;
    public final byte[][] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f61o;

    public SignedMessage(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f61o = bArr;
        parcel.readByteArray(bArr);
        int i = parcel.readByte();
        byte[] bArr2 = new byte[i];
        this.m = bArr2;
        parcel.readByteArray(bArr2);
        this.n = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr3 = new byte[parcel.readInt()];
            this.n[i2] = bArr3;
            parcel.readByteArray(bArr3);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f61o;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        byte[] bArr2 = this.m;
        parcel.writeInt(bArr2.length);
        parcel.writeByteArray(bArr2);
        for (byte[] bArr3 : this.n) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(bArr3);
        }
    }

    public SignedMessage(byte[] bArr, byte[][] bArr2, byte[] bArr3) {
        this.f61o = bArr3;
        this.m = bArr;
        this.n = bArr2;
    }
}
