package o;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class bz2 extends q2 {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f469o;
    public String p;
    public IBinder q;
    public Scope[] r;
    public Bundle s;
    public Account t;
    public bi2[] u;
    public bi2[] v;
    public final boolean w;
    public final int x;
    public boolean y;
    public final String z;
    public static final Parcelable.Creator<bz2> CREATOR = new pq8((byte) 9);
    public static final Scope[] A = new Scope[0];
    public static final bi2[] B = new bi2[0];

    public bz2(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, bi2[] bi2VarArr, bi2[] bi2VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? A : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        bi2[] bi2VarArr3 = B;
        bi2VarArr = bi2VarArr == null ? bi2VarArr3 : bi2VarArr;
        bi2VarArr2 = bi2VarArr2 == null ? bi2VarArr3 : bi2VarArr2;
        this.m = i;
        this.n = i2;
        this.f469o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.p = "com.google.android.gms";
        } else {
            this.p = str;
        }
        if (i < 2) {
            Account accountC = null;
            if (iBinder != null) {
                int i5 = q4.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("o.l93");
                l93 ay8Var = iInterfaceQueryLocalInterface instanceof l93 ? (l93) iInterfaceQueryLocalInterface : new ay8(iBinder);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        accountC = ((ay8) ay8Var).c();
                    } catch (RemoteException unused) {
                        io.sentry.android.core.v0.j("AccountAccessor", "Remote account accessor probably died");
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.t = accountC;
        } else {
            this.q = iBinder;
            this.t = account;
        }
        this.r = scopeArr;
        this.s = bundle;
        this.u = bi2VarArr;
        this.v = bi2VarArr2;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        pq8.a(this, parcel, i);
    }
}
