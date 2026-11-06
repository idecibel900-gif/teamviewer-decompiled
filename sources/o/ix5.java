package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ix5 {
    public static final ai0 b = new ai0(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = qf0.K("*");
    public static final ix5 d = new ix5(new d11((byte) 5));
    public final d11 a;

    public ix5(d11 d11Var) {
        this.a = d11Var;
    }

    public static List b(String str) {
        List listM0 = ub7.m0(str, new char[]{'.'});
        return im3.n(lv0.v0(listM0), "") ? lv0.k0(listM0) : listM0;
    }

    public final String a(String str) {
        String strN;
        String strN2;
        String strN3;
        List listM0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        d11 d11Var = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) d11Var.m;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) d11Var.n).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        d11Var.O();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        d11Var.q = e;
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (((ai0) d11Var.f578o) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(d11Var.r);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) d11Var.q);
            throw illegalStateException;
        }
        int size3 = listB.size();
        ai0[] ai0VarArr = new ai0[size3];
        for (int i = 0; i < size3; i++) {
            ai0 ai0Var = ai0.p;
            ai0VarArr[i] = ju.s((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strN = null;
                break;
            }
            ai0 ai0Var2 = (ai0) d11Var.f578o;
            if (ai0Var2 == null) {
                im3.e0("bytes");
                throw null;
            }
            strN = nv1.n(ai0Var2, ai0VarArr, i2);
            if (strN != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strN2 = null;
            break;
        }
        ai0[] ai0VarArr2 = (ai0[]) ai0VarArr.clone();
        int length = ai0VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strN2 = null;
                break;
            }
            ai0VarArr2[i3] = b;
            ai0 ai0Var3 = (ai0) d11Var.f578o;
            if (ai0Var3 == null) {
                im3.e0("bytes");
                throw null;
            }
            strN2 = nv1.n(ai0Var3, ai0VarArr2, i3);
            if (strN2 != null) {
                break;
            }
            i3++;
        }
        if (strN2 == null) {
            strN3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strN3 = null;
                break;
            }
            ai0 ai0Var4 = (ai0) d11Var.p;
            if (ai0Var4 == null) {
                im3.e0("exceptionBytes");
                throw null;
            }
            strN3 = nv1.n(ai0Var4, ai0VarArr, i5);
            if (strN3 != null) {
                break;
            }
            i5++;
        }
        if (strN3 != null) {
            listM0 = ub7.m0("!".concat(strN3), new char[]{'.'});
        } else if (strN == null && strN2 == null) {
            listM0 = c;
        } else {
            List listM1 = ea2.m;
            List listM2 = strN != null ? ub7.m0(strN, new char[]{'.'}) : listM1;
            if (strN2 != null) {
                listM1 = ub7.m0(strN2, new char[]{'.'});
            }
            listM0 = listM2.size() > listM1.size() ? listM2 : listM1;
        }
        if (listB.size() == listM0.size() && ((String) listM0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listM0.size();
        } else {
            size = listB.size();
            size2 = listM0.size() + 1;
        }
        return bq6.j0(bq6.f0(new fx(b(str), (byte) 1), size - size2), ".");
    }
}
