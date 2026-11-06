package o;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class gj6 {
    public static final Class a;
    public static final i88 b;
    public static final i88 c;
    public static final m88 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new m88();
    }

    public static void A(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue());
                yu0Var.p(i, 1);
                yu0Var.n(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 0);
                yu0Var.o(iIntValue);
            }
            return;
        }
        yu0Var.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += yu0.f(((Integer) list.get(i3)).intValue());
        }
        yu0Var.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            yu0Var.o(((Integer) list.get(i4)).intValue());
        }
    }

    public static void C(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 5);
                yu0Var.m(iIntValue);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yu0Var.p(i, 1);
                yu0Var.n(jLongValue);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iFloatToRawIntBits = Float.floatToRawIntBits(((Float) list.get(i2)).floatValue());
                yu0Var.p(i, 5);
                yu0Var.m(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, df6 df6Var, bj6 bj6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        df6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            df6Var.x(i, list.get(i2), bj6Var);
        }
    }

    public static void G(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 0);
                yu0Var.o(iIntValue);
            }
            return;
        }
        yu0Var.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += yu0.f(((Integer) list.get(i3)).intValue());
        }
        yu0Var.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            yu0Var.o(((Integer) list.get(i4)).intValue());
        }
    }

    public static void H(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yu0Var.p(i, 0);
                yu0Var.r(jLongValue);
            }
            return;
        }
        yu0Var.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += yu0.j(((Long) list.get(i3)).longValue());
        }
        yu0Var.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            yu0Var.r(((Long) list.get(i4)).longValue());
        }
    }

    public static void I(int i, List list, df6 df6Var, bj6 bj6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        df6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            df6Var.y(i, list.get(i2), bj6Var);
        }
    }

    public static void J(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 5);
                yu0Var.m(iIntValue);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yu0Var.p(i, 1);
                yu0Var.n(jLongValue);
                i2++;
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        yu0Var.q(i3);
        while (i2 < list.size()) {
            yu0Var.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 0);
                yu0Var.q((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += yu0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        yu0Var.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            yu0Var.q((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yu0Var.p(i, 0);
                yu0Var.r((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        yu0Var.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += yu0.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        yu0Var.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            yu0Var.r((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    public static void N(int i, List list, df6 df6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        byte[] bArr = yu0Var.b;
        int i2 = yu0Var.c;
        if (!(list instanceof h54)) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String str = (String) list.get(i3);
                yu0Var.p(i, 2);
                int i4 = yu0Var.d;
                try {
                    int i5 = yu0.i(str.length() * 3);
                    int i6 = yu0.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        yu0Var.d = i7;
                        int iK = ha8.a.k(i7, i2 - i7, str, bArr);
                        yu0Var.d = i4;
                        yu0Var.q((iK - i4) - i6);
                        yu0Var.d = iK;
                    } else {
                        yu0Var.q(ha8.a(str));
                        int i8 = yu0Var.d;
                        yu0Var.d = ha8.a.k(i8, i2 - i8, str, bArr);
                    }
                } catch (IndexOutOfBoundsException e) {
                    throw new zu0(e);
                } catch (fa8 e2) {
                    yu0Var.d = i4;
                    yu0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(sl3.a);
                    try {
                        yu0Var.q(bytes.length);
                        yu0Var.l(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e3) {
                        throw new zu0(e3);
                    } catch (zu0 e4) {
                        throw e4;
                    }
                }
            }
            return;
        }
        h54 h54Var = (h54) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objK0 = h54Var.k0(i9);
            if (objK0 instanceof String) {
                String str2 = (String) objK0;
                yu0Var.p(i, 2);
                int i10 = yu0Var.d;
                try {
                    int i11 = yu0.i(str2.length() * 3);
                    int i12 = yu0.i(str2.length());
                    if (i12 == i11) {
                        int i13 = i10 + i12;
                        yu0Var.d = i13;
                        int iK2 = ha8.a.k(i13, i2 - i13, str2, bArr);
                        yu0Var.d = i10;
                        yu0Var.q((iK2 - i10) - i12);
                        yu0Var.d = iK2;
                    } else {
                        yu0Var.q(ha8.a(str2));
                        int i14 = yu0Var.d;
                        yu0Var.d = ha8.a.k(i14, i2 - i14, str2, bArr);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new zu0(e5);
                } catch (fa8 e6) {
                    yu0Var.d = i10;
                    yu0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(sl3.a);
                    try {
                        yu0Var.q(bytes2.length);
                        yu0Var.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e7) {
                        throw new zu0(e7);
                    } catch (zu0 e8) {
                        throw e8;
                    }
                }
            } else {
                yh0 yh0Var = (yh0) objK0;
                yu0Var.p(i, 2);
                yu0Var.q(yh0Var.size());
                vh0 vh0Var = (vh0) yh0Var;
                yu0Var.l(vh0Var.p, vh0Var.g(), vh0Var.size());
            }
        }
    }

    public static void O(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                yu0Var.p(i, 0);
                yu0Var.q(iIntValue);
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += yu0.i(((Integer) list.get(i4)).intValue());
        }
        yu0Var.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            yu0Var.q(((Integer) list.get(i5)).intValue());
        }
    }

    public static void P(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                yu0Var.p(i, 0);
                yu0Var.r(jLongValue);
            }
            return;
        }
        yu0Var.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += yu0.j(((Long) list.get(i3)).longValue());
        }
        yu0Var.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            yu0Var.r(((Long) list.get(i4)).longValue());
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = yu0.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += yu0.b((yh0) list.get(i2));
        }
        return iH;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof nk3) {
            nk3 nk3Var = (nk3) list;
            if (size <= 0) {
                return 0;
            }
            nk3Var.c(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += yu0.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return yu0.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return yu0.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof nk3) {
            nk3 nk3Var = (nk3) list;
            if (size <= 0) {
                return 0;
            }
            nk3Var.c(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += yu0.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (yu0.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof wf4) {
            wf4 wf4Var = (wf4) list;
            if (size <= 0) {
                return 0;
            }
            wf4Var.c(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += yu0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int l(int i, List list, bj6 bj6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = yu0.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            s1 s1Var = (s1) list.get(i2);
            s1Var.getClass();
            ny2 ny2Var = (ny2) s1Var;
            int iH2 = ny2Var.memoizedSerializedSize;
            if (iH2 == -1) {
                iH2 = bj6Var.h(s1Var);
                ny2Var.memoizedSerializedSize = iH2;
            }
            iH += yu0.i(iH2) + iH2;
        }
        return iH;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof nk3) {
            nk3 nk3Var = (nk3) list;
            if (size <= 0) {
                return 0;
            }
            nk3Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += yu0.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof wf4) {
            wf4 wf4Var = (wf4) list;
            if (size <= 0) {
                return 0;
            }
            wf4Var.c(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += yu0.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH = yu0.h(i) * size;
        if (!(list instanceof h54)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof yh0) {
                    int size2 = ((yh0) obj).size();
                    iH = yu0.i(size2) + size2 + iH;
                } else {
                    iH = yu0.g((String) obj) + iH;
                }
                i2++;
            }
            return iH;
        }
        h54 h54Var = (h54) list;
        while (i2 < size) {
            Object objK0 = h54Var.k0(i2);
            if (objK0 instanceof yh0) {
                int size3 = ((yh0) objK0).size();
                iH = yu0.i(size3) + size3 + iH;
            } else {
                iH = yu0.g((String) objK0) + iH;
            }
            i2++;
        }
        return iH;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof nk3) {
            nk3 nk3Var = (nk3) list;
            if (size <= 0) {
                return 0;
            }
            nk3Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += yu0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (yu0.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof wf4) {
            wf4 wf4Var = (wf4) list;
            if (size <= 0) {
                return 0;
            }
            wf4Var.c(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += yu0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static i88 v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (i88) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(i88 i88Var, ny2 ny2Var, Object obj) {
        ((m88) i88Var).getClass();
        k88 k88Var = ny2Var.unknownFields;
        k88 k88Var2 = ((ny2) obj).unknownFields;
        if (!k88Var2.equals(k88.f)) {
            int i = k88Var.a + k88Var2.a;
            int[] iArrCopyOf = Arrays.copyOf(k88Var.b, i);
            System.arraycopy(k88Var2.b, 0, iArrCopyOf, k88Var.a, k88Var2.a);
            Object[] objArrCopyOf = Arrays.copyOf(k88Var.c, i);
            System.arraycopy(k88Var2.c, 0, objArrCopyOf, k88Var.a, k88Var2.a);
            k88Var = new k88(i, iArrCopyOf, objArrCopyOf, true);
        }
        ny2Var.unknownFields = k88Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, df6 df6Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yu0 yu0Var = (yu0) df6Var.n;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                yu0Var.p(i, 0);
                yu0Var.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        yu0Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        yu0Var.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            yu0Var.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i, List list, df6 df6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        df6Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            yu0 yu0Var = (yu0) df6Var.n;
            yh0 yh0Var = (yh0) list.get(i2);
            yu0Var.p(i, 2);
            yu0Var.q(yh0Var.size());
            vh0 vh0Var = (vh0) yh0Var;
            yu0Var.l(vh0Var.p, vh0Var.g(), vh0Var.size());
        }
    }
}
