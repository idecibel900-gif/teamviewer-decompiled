package o;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class wv8 extends yo8 implements IInterface {
    public final int d;

    public wv8(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 2);
        if (bArr.length == 25) {
            this.d = Arrays.hashCode(bArr);
        } else {
            yq4.f();
            throw null;
        }
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wv8) {
            try {
                wv8 wv8Var = (wv8) obj;
                if (wv8Var.d == this.d) {
                    return Arrays.equals(i(), (byte[]) new l65(wv8Var.i()).d);
                }
            } catch (RemoteException e) {
                io.sentry.android.core.v0.d("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    @Override // o.yo8
    public final boolean h(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.d);
            return true;
        }
        l65 l65Var = new l65(i());
        parcel2.writeNoException();
        int i2 = sr8.a;
        parcel2.writeStrongBinder(l65Var);
        return true;
    }

    public final int hashCode() {
        return this.d;
    }

    public abstract byte[] i();
}
