package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iu8 {
    protected transient int zza;

    public abstract void a(cv0 cv0Var);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            cv0 cv0Var = new cv0(bArr, iD);
            a(cv0Var);
            int i = cv0Var.b;
            int i2 = cv0Var.c;
            if (i - i2 > 0) {
                hk0.l("Did not write as much data as expected.");
            } else if (i - i2 < 0) {
                hk0.l("Wrote more data than expected.");
            }
            return bArr;
        } catch (IOException e) {
            an4.n(fx3.g("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(qv8 qv8Var);

    public abstract int d();
}
