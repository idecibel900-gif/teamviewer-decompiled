package o;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bw4 extends db6 {
    public static final jo4 f;
    public static final jo4 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final ai0 b;
    public final List c;
    public final jo4 d;
    public long e;

    static {
        e96 e96Var = jo4.e;
        f = vt1.t("multipart/mixed");
        vt1.t("multipart/alternative");
        vt1.t("multipart/digest");
        vt1.t("multipart/parallel");
        g = vt1.t("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public bw4(ai0 ai0Var, jo4 jo4Var, List list) {
        jo4Var.getClass();
        this.b = ai0Var;
        this.c = list;
        e96 e96Var = jo4.e;
        this.d = vt1.t(jo4Var + "; boundary=" + ai0Var.s());
        this.e = -1L;
    }

    @Override // o.db6
    public final long a() throws EOFException {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // o.db6
    public final jo4 b() {
        return this.d;
    }

    @Override // o.db6
    public final boolean c() {
        List list = this.c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((aw4) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.db6
    public final void d(nf0 nf0Var) throws EOFException {
        e(nf0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(nf0 nf0Var, boolean z) throws EOFException {
        bf0 bf0Var;
        nf0 bf0Var2;
        if (z) {
            bf0Var2 = new bf0();
            bf0Var = bf0Var2;
        } else {
            bf0Var = 0;
            bf0Var2 = nf0Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            ai0 ai0Var = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                bf0Var2.getClass();
                bf0Var2.write(bArr);
                bf0Var2.z0(ai0Var);
                bf0Var2.write(bArr);
                bf0Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                bf0Var.getClass();
                long j3 = j2 + bf0Var.n;
                bf0Var.e();
                return j3;
            }
            aw4 aw4Var = (aw4) list.get(i2);
            k53 k53Var = aw4Var.a;
            db6 db6Var = aw4Var.b;
            bf0Var2.getClass();
            bf0Var2.write(bArr);
            bf0Var2.z0(ai0Var);
            bf0Var2.write(bArr2);
            int size2 = k53Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bf0Var2.V(i67.j(k53Var, i3)).write(h).V(i67.l(k53Var, i3)).write(bArr2);
            }
            jo4 jo4VarB = db6Var.b();
            if (jo4VarB != null) {
                bf0Var2.V("Content-Type: ").V(jo4VarB.a).write(bArr2);
            }
            long jA = db6Var.a();
            if (jA == -1 && z) {
                bf0Var.getClass();
                bf0Var.e();
                return -1L;
            }
            bf0Var2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                u36 u36Var = new u36(new zv4(bf0Var2));
                try {
                    db6Var.d(u36Var);
                    u36Var.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(u36Var, th);
                        throw th2;
                    }
                }
            }
            bf0Var2.write(bArr2);
            i2++;
        }
    }
}
