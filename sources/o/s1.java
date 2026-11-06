package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    protected int memoizedHashCode;

    public abstract int a();

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final byte[] c() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            yu0 yu0Var = new yu0(bArr, iA);
            d(yu0Var);
            if (iA - yu0Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            an4.n(b("byte array"), e);
            return null;
        }
    }

    public abstract void d(yu0 yu0Var);
}
