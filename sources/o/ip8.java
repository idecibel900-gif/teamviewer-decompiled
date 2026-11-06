package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class ip8 extends yo8 implements tz2, uz2 {
    public static final so8 k = jp8.a;
    public final Context d;
    public final Handler e;
    public final so8 f;
    public final Set g;
    public final io.sentry.android.core.d h;
    public wz6 i;
    public z60 j;

    public ip8(Context context, xp8 xp8Var, io.sentry.android.core.d dVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 0);
        this.d = context;
        this.e = xp8Var;
        this.h = dVar;
        this.g = (Set) dVar.m;
        this.f = k;
    }

    @Override // o.uz2
    public final void c(w41 w41Var) {
        this.j.a(w41Var);
    }

    @Override // o.tz2
    public final void d(int i) {
        z60 z60Var = this.j;
        ap8 ap8Var = (ap8) ((vz2) z60Var.r).j.get((gr) z60Var.f2673o);
        if (ap8Var != null) {
            if (ap8Var.k) {
                ap8Var.m(new w41(17, null, null));
            } else {
                ap8Var.d(i);
            }
        }
    }

    @Override // o.tz2
    public final void e() {
        GoogleSignInAccount googleSignInAccountC;
        wz6 wz6Var = this.i;
        wz6Var.getClass();
        boolean z = false;
        try {
            wz6Var.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = wz6Var.c;
                ReentrantLock reentrantLock = ka7.c;
                nv1.s(context);
                ReentrantLock reentrantLock2 = ka7.c;
                reentrantLock2.lock();
                try {
                    ka7 ka7Var = ka7.d;
                    if (ka7Var == null) {
                        ka7Var = new ka7(context.getApplicationContext());
                        ka7.d = ka7Var;
                    }
                    reentrantLock2.unlock();
                    String strA = ka7Var.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = ka7Var.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountC = GoogleSignInAccount.c(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountC = null;
                            }
                        }
                    }
                    googleSignInAccountC = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountC = null;
            }
            Integer num = wz6Var.C;
            nv1.s(num);
            aq8 aq8Var = new aq8(2, account, num.intValue(), googleSignInAccountC);
            lp8 lp8Var = (lp8) wz6Var.h();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(lp8Var.e);
            int i = fp8.a;
            parcelObtain.writeInt(1);
            int iB0 = et1.b0(parcelObtain, 20293);
            et1.a0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            et1.W(parcelObtain, 2, aq8Var, 0);
            et1.c0(parcelObtain, iB0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                lp8Var.d.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            io.sentry.android.core.v0.j("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.e.post(new it8((byte) 23, this, new wp8(1, new w41(8, null, null), null), z));
            } catch (RemoteException unused2) {
                io.sentry.android.core.v0.m("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
