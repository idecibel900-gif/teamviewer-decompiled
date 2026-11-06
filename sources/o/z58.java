package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z58 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final j93 b;
    public volatile int c = 0;

    public z58(j93 j93Var, int i) {
        this.b = j93Var;
        this.a = i;
    }

    public final int a(int i) {
        ar4 ar4VarB = b();
        int iA = ar4VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ar4VarB.p;
        int i2 = iA + ar4VarB.m;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ar4 b() {
        ThreadLocal threadLocal = d;
        ar4 ar4Var = (ar4) threadLocal.get();
        if (ar4Var == null) {
            ar4Var = new ar4();
            threadLocal.set(ar4Var);
        }
        br4 br4Var = (br4) this.b.n;
        int iA = br4Var.a(6);
        if (iA != 0) {
            int i = iA + br4Var.m;
            int i2 = (this.a * 4) + ((ByteBuffer) br4Var.p).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) br4Var.p).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) br4Var.p;
            ar4Var.p = byteBuffer;
            if (byteBuffer != null) {
                ar4Var.m = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ar4Var.n = i4;
                ar4Var.f988o = ((ByteBuffer) ar4Var.p).getShort(i4);
                return ar4Var;
            }
            ar4Var.m = 0;
            ar4Var.n = 0;
            ar4Var.f988o = 0;
        }
        return ar4Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ar4 ar4VarB = b();
        int iA = ar4VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) ar4VarB.p).getInt(iA + ar4VarB.m) : 0));
        sb.append(", codepoints:");
        ar4 ar4VarB2 = b();
        int iA2 = ar4VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + ar4VarB2.m;
            i = ((ByteBuffer) ar4VarB2.p).getInt(((ByteBuffer) ar4VarB2.p).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
