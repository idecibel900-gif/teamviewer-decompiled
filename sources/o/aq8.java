package o;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class aq8 extends q2 {
    public static final Parcelable.Creator<aq8> CREATOR = new xf5((byte) 25);
    public final int m;
    public final Account n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f349o;
    public final GoogleSignInAccount p;

    public aq8(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.m = i;
        this.n = account;
        this.f349o = i2;
        this.p = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.W(parcel, 2, this.n, i);
        et1.a0(parcel, 3, 4);
        parcel.writeInt(this.f349o);
        et1.W(parcel, 4, this.p, i);
        et1.c0(parcel, iB0);
    }
}
