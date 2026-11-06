package o;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dc2 {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList(106);
    public static final ThreadLocal d = ThreadLocal.withInitial(new sn0(3));
    public static final ThreadLocal e = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static void a(lq1 lq1Var, cc2 cc2Var, int i) {
        String str;
        int iBinarySearch = Arrays.binarySearch(cc2Var.f513o, i);
        if (iBinarySearch >= 0) {
            String[] strArr = cc2Var.p;
            if (iBinarySearch < strArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (cc2Var.f513o[i2] == i) {
                    str = strArr[i2];
                } else {
                    str = strArr[iBinarySearch];
                }
            } else {
                str = strArr[iBinarySearch];
            }
        } else {
            str = "";
        }
        if ("".equals(str)) {
            lq1Var.k("&#x").k(Integer.toHexString(i)).j(';');
        } else {
            lq1Var.j('&').k(str).j(';');
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[RETURN] */
    public static boolean b(int i, int i2, CharsetEncoder charsetEncoder) {
        int iB = ua5.B(i);
        if (iB == 0) {
            if (i2 < 128) {
                return true;
            }
            return false;
        }
        if (iB != 1) {
            if (i2 < 65536) {
                return charsetEncoder.canEncode((char) i2);
            }
            char[] cArr = (char[]) d.get();
            return charsetEncoder.canEncode(CharBuffer.wrap(cArr, 0, Character.toChars(i2, cArr, 0)));
        }
        if (i2 < 55296 || i2 > 57343) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[PHI: r8 r9 r10
      0x0061: PHI (r8v4 boolean) = 
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v2 boolean)
      (r8v1 boolean)
      (r8v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r9v4 boolean) = 
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v2 boolean)
      (r9v1 boolean)
      (r9v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r10v4 boolean) = 
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v2 boolean)
      (r10v1 boolean)
      (r10v1 boolean)
     binds: [B:92:0x012f, B:91:0x012a, B:90:0x0123, B:87:0x0118, B:86:0x0111, B:85:0x010a, B:84:0x0103, B:82:0x00fa, B:81:0x00f5, B:80:0x00ee, B:79:0x00e7, B:73:0x00d9, B:72:0x00d5, B:46:0x009e, B:48:0x00a3, B:24:0x005f, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x013a  */
    /* JADX WARN: Code duplicated, block: B:96:0x014b  */
    public static void c(lq1 lq1Var, String str, h32 h32Var, int i) {
        int i2;
        cc2 cc2Var;
        char c2;
        cc2 cc2Var2 = h32Var.m;
        Charset charset = h32Var.n;
        String strName = charset.name();
        if (strName.equals("US-ASCII")) {
            i2 = 1;
        } else {
            i2 = strName.startsWith("UTF-") ? 2 : 3;
        }
        ThreadLocal threadLocal = e;
        CharsetEncoder charsetEncoderNewEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoderNewEncoder == null || !charsetEncoderNewEncoder.charset().equals(charset)) {
            charsetEncoderNewEncoder = charset.newEncoder();
            threadLocal.set(charsetEncoderNewEncoder);
        }
        int length = str.length();
        int iCharCount = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((i & 4) == 0) {
                cc2Var = cc2.xhtml;
                if (cc2Var == cc2Var2 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 13 || ((iCodePointAt >= 32 && iCodePointAt <= 55295) || ((iCodePointAt >= 57344 && iCodePointAt <= 65533) || (iCodePointAt >= 65536 && iCodePointAt <= 1114111)))) {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t' || c2 == '\n' || c2 == '\r') {
                            lq1Var.j(c2);
                        } else if (c2 != '\"') {
                            if (c2 == '<') {
                                lq1Var.k("&lt;");
                            } else if (c2 == '>') {
                                lq1Var.k("&gt;");
                            } else if (c2 != 160) {
                                if (c2 == '&') {
                                    lq1Var.k("&amp;");
                                } else if (c2 != '\'') {
                                    if (c2 < ' ' || !b(i2, iCodePointAt, charsetEncoderNewEncoder)) {
                                        a(lq1Var, cc2Var2, iCodePointAt);
                                    } else {
                                        lq1Var.j(c2);
                                    }
                                } else if ((i & 2) == 0 || (i & 1) == 0) {
                                    lq1Var.j('\'');
                                } else if (cc2Var2 == cc2Var) {
                                    lq1Var.k("&#x27;");
                                } else {
                                    lq1Var.k("&apos;");
                                }
                            } else if (cc2Var2 != cc2Var) {
                                lq1Var.k("&nbsp;");
                            } else {
                                lq1Var.k("&#xa0;");
                            }
                        } else if ((i & 2) != 0) {
                            lq1Var.k("&quot;");
                        } else {
                            lq1Var.j(c2);
                        }
                    } else if (b(i2, iCodePointAt, charsetEncoderNewEncoder)) {
                        char[] cArr = (char[]) d.get();
                        lq1Var.l(cArr, Character.toChars(iCodePointAt, cArr, 0));
                    } else {
                        a(lq1Var, cc2Var2, iCodePointAt);
                    }
                }
            } else if (!lb7.i(iCodePointAt)) {
                if (z) {
                    lq1Var.j(' ');
                    z = false;
                }
                z2 = true;
                z3 = false;
                cc2Var = cc2.xhtml;
                if (cc2Var == cc2Var2) {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            lq1Var.j(c2);
                        } else {
                            lq1Var.j(c2);
                        }
                    } else if (b(i2, iCodePointAt, charsetEncoderNewEncoder)) {
                        char[] cArr2 = (char[]) d.get();
                        lq1Var.l(cArr2, Character.toChars(iCodePointAt, cArr2, 0));
                    } else {
                        a(lq1Var, cc2Var2, iCodePointAt);
                    }
                } else {
                    c2 = (char) iCodePointAt;
                    if (iCodePointAt < 65536) {
                        if (c2 != '\t') {
                            lq1Var.j(c2);
                        } else {
                            lq1Var.j(c2);
                        }
                    } else if (b(i2, iCodePointAt, charsetEncoderNewEncoder)) {
                        char[] cArr3 = (char[]) d.get();
                        lq1Var.l(cArr3, Character.toChars(iCodePointAt, cArr3, 0));
                    } else {
                        a(lq1Var, cc2Var2, iCodePointAt);
                    }
                }
            } else if (((i & 8) == 0 || z2) && !z3) {
                if ((i & 16) != 0) {
                    z = true;
                } else {
                    lq1Var.j(' ');
                    z3 = true;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
