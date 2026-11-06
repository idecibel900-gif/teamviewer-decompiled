package o;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class hj8 implements pj8, y96 {
    public final /* synthetic */ byte m;
    public final Object n;

    public hj8() {
        this.m = (byte) 5;
        Object obj = rz2.c;
        this.n = new SparseIntArray();
    }

    public int a(Context context, com.google.android.gms.common.internal.a aVar) {
        int i;
        int iB;
        nv1.s(context);
        nv1.s(aVar);
        int iF = aVar.f();
        SparseIntArray sparseIntArray = (SparseIntArray) this.n;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iF, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.n;
        synchronized (sparseIntArray2) {
            iB = 0;
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iF && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iB == -1) {
                iB = rz2.d.b(context, iF);
            }
            sparseIntArray2.put(iF, iB);
        }
        return iB;
    }

    @Override // o.y96
    public void accept(Object obj, Object obj2) {
        byte b = this.m;
        Object obj3 = this.n;
        do7 do7Var = (do7) obj2;
        switch (b) {
            case 6:
                sp8 sp8Var = (sp8) ((xo8) obj).h();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(sp8Var.e);
                int i = fp8.a;
                parcelObtain.writeInt(1);
                ((wo8) obj3).writeToParcel(parcelObtain, 0);
                try {
                    sp8Var.d.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    do7Var.a(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            default:
                up8 up8Var = (up8) ((zp8) obj).h();
                no7 no7Var = (no7) obj3;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(up8Var.e);
                int i2 = fp8.a;
                if (no7Var == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    no7Var.writeToParcel(parcelObtain2, 0);
                }
                try {
                    up8Var.d.transact(1, parcelObtain2, null, 1);
                    parcelObtain2.recycle();
                    do7Var.a(null);
                    return;
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    throw th2;
                }
        }
    }

    public void b(int i, Object obj, qv8 qv8Var) throws ou8 {
        cv0 cv0Var = (cv0) this.n;
        iu8 iu8Var = (iu8) obj;
        cv0Var.R(i, 2);
        cv0Var.T(iu8Var.c(qv8Var));
        qv8Var.i(iu8Var, this);
    }

    public hj8(cv0 cv0Var) {
        this.m = (byte) 8;
        this.n = cv0Var;
        cv0Var.e = this;
    }

    public /* synthetic */ hj8(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public hj8(fl8 fl8Var, ej8 ej8Var, wj5 wj5Var) {
        this.m = (byte) 1;
        this.n = ej8Var;
    }
}
