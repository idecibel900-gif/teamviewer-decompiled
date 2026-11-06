package com.teamviewer.apidefinitions.account.models;

import java.util.Arrays;
import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountPicture;", "", "mimeType", "", "pictureData", "", "<init>", "(Ljava/lang/String;[B)V", "getMimeType", "()Ljava/lang/String;", "getPictureData", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountPicture {
    private final String mimeType;
    private final byte[] pictureData;

    public AccountPicture(@sp3(name = "mimeType") String str, @sp3(name = "pictureData") byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.mimeType = str;
        this.pictureData = bArr;
    }

    public static /* synthetic */ AccountPicture copy$default(AccountPicture accountPicture, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountPicture.mimeType;
        }
        if ((i & 2) != 0) {
            bArr = accountPicture.pictureData;
        }
        return accountPicture.copy(str, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getPictureData() {
        return this.pictureData;
    }

    public final AccountPicture copy(@sp3(name = "mimeType") String mimeType, @sp3(name = "pictureData") byte[] pictureData) {
        mimeType.getClass();
        pictureData.getClass();
        return new AccountPicture(mimeType, pictureData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountPicture)) {
            return false;
        }
        AccountPicture accountPicture = (AccountPicture) other;
        return im3.n(this.mimeType, accountPicture.mimeType) && im3.n(this.pictureData, accountPicture.pictureData);
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final byte[] getPictureData() {
        return this.pictureData;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + (this.mimeType.hashCode() * 31);
    }

    public String toString() {
        return fx3.h("AccountPicture(mimeType=", this.mimeType, ", pictureData=", Arrays.toString(this.pictureData), ")");
    }
}
