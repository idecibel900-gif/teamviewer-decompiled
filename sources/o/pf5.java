package o;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class pf5 extends xo1 {
    public final Method f;
    public final int g;
    public final String h;
    public final boolean i;

    public pf5(Method method, int i, String str, boolean z) {
        this.f = method;
        this.g = i;
        Objects.requireNonNull(str, "name == null");
        this.h = str;
        this.i = z;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) throws EOFException {
        String strN0;
        String str = this.h;
        if (obj == null) {
            throw im3.U(this.f, this.g, fx3.g("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String string = obj.toString();
        if (fb6Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strN0 = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.i;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                bf0 bf0Var = new bf0();
                bf0Var.Y0(0, iCharCount, string);
                bf0 bf0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (bf0Var2 == null) {
                                bf0Var2 = new bf0();
                            }
                            bf0Var2.a1(iCodePointAt2);
                            long j = bf0Var2.n;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bF = bf0Var2.F(j2);
                                bf0Var.U0(37);
                                char[] cArr = fb6.l;
                                bf0Var.U0(cArr[((bF & 255) >> 4) & 15]);
                                bf0Var.U0(cArr[bF & 15]);
                                j2++;
                                bf0Var2 = bf0Var2;
                            }
                            bf0Var2.e();
                        } else {
                            bf0Var.a1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strN0 = bf0Var.N0();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = fb6Var.c.replace("{" + str + "}", strN0);
        if (fb6.m.matcher(strReplace).matches()) {
            hk0.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            fb6Var.c = strReplace;
        }
    }
}
