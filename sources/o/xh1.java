package o;

import java.io.InputStream;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xh1 {
    public static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset b;
    public static final String c;
    public static final char[] d;
    public static final td2 e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        b = charsetForName;
        c = charsetForName.name();
        d = new char[]{'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        e = vy5.b0("meta[http-equiv=content-type], meta[charset]");
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    public static iu a(sc1 sc1Var, String str, String str2, kg5 kg5Var) {
        String str3;
        co8 co8Var;
        byte[] bArr = new byte[4];
        sc1Var.mark(4);
        b07 b07Var = sc1Var.m;
        boolean z = false;
        sc1Var.read(bArr, 0, 4);
        sc1Var.reset();
        byte b2 = bArr[0];
        i32 i32Var = null;
        if ((b2 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            str3 = "UTF-32";
        } else if ((b2 == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2)) {
            str3 = "UTF-16";
        } else if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            sc1Var.read(bArr, 0, 3);
            str3 = "UTF-8";
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str = str3;
        }
        Charset charsetForName = b;
        String str4 = c;
        if (str == null) {
            int i = sc1Var.n;
            sc1Var.e(5120);
            b07Var.j();
            sc1Var.mark(5120);
            sc1Var.t = false;
            try {
                try {
                    f07 f07Var = new f07(sc1Var, charsetForName);
                    try {
                        i32 i32VarA = kg5Var.a(f07Var, str2);
                        sc1Var.reset();
                        sc1Var.e(i);
                        f07Var.close();
                        sc1Var.t = true;
                        i32VarA.getClass();
                        td2 td2Var = e;
                        db8.o0(td2Var);
                        String strC = null;
                        for (o82 o82Var : xk0.p(td2Var, i32VarA)) {
                            if (o82Var.r("http-equiv")) {
                                strC = b(o82Var.c("content"));
                            }
                            if (strC == null && o82Var.r("charset")) {
                                strC = o82Var.c("charset");
                            }
                            if (strC != null) {
                                break;
                            }
                        }
                        if (strC == null && i32VarA.q.size() > 0) {
                            x35 x35VarI = i32VarA.i(0);
                            if (x35VarI instanceof co8) {
                                co8Var = (co8) x35VarI;
                            } else if (x35VarI instanceof zw0) {
                                zw0 zw0Var = (zw0) x35VarI;
                                String strQ = zw0Var.Q();
                                if (strQ.length() <= 1 || !(strQ.startsWith("!") || strQ.startsWith("?"))) {
                                    co8Var = null;
                                } else {
                                    String str5 = "<" + zw0Var.Q() + ">";
                                    kg5 kg5Var2 = new kg5(new do8());
                                    StringReader stringReader = new StringReader(str5);
                                    ReentrantLock reentrantLock = kg5Var2.q;
                                    try {
                                        reentrantLock.lock();
                                        o28 o28Var = kg5Var2.m;
                                        o28Var.j(stringReader, "", kg5Var2);
                                        o28Var.k();
                                        o28Var.q();
                                        List listA = o28Var.a();
                                        reentrantLock.unlock();
                                        if (listA.isEmpty() || !(listA.get(0) instanceof co8)) {
                                            co8Var = null;
                                        } else {
                                            co8Var = (co8) listA.get(0);
                                        }
                                    } catch (Throwable th) {
                                        reentrantLock.unlock();
                                        throw th;
                                    }
                                }
                            } else {
                                co8Var = null;
                            }
                            if (co8Var != null && co8Var.Q().equalsIgnoreCase("xml")) {
                                strC = co8Var.c("encoding");
                            }
                        }
                        String strD = d(strC);
                        if (strD != null && !strD.equalsIgnoreCase(str4)) {
                            str = strD.trim().replaceAll("[\"']", "");
                        } else if (b07Var.r) {
                            sc1Var.close();
                            i32Var = i32VarA;
                        }
                    } catch (Throwable th2) {
                        try {
                            f07Var.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (UncheckedIOException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th4) {
                sc1Var.t = true;
                throw th4;
            }
        } else {
            db8.m0(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = str4;
        }
        if (!str.equals(str4)) {
            charsetForName = Charset.forName(str);
        }
        iu iuVar = new iu((byte) 19, z);
        iuVar.f1103o = charsetForName;
        iuVar.p = sc1Var;
        iuVar.n = i32Var;
        return iuVar;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return d(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static i32 c(iu iuVar, String str, kg5 kg5Var) {
        i32 i32Var = (i32) iuVar.n;
        if (i32Var != null) {
            return i32Var;
        }
        InputStream inputStream = (InputStream) iuVar.p;
        Charset charset = (Charset) iuVar.f1103o;
        f07 f07Var = new f07(inputStream, charset);
        try {
            try {
                i32 i32VarA = kg5Var.a(f07Var, str);
                i32VarA.v.n = charset;
                if (!charset.canEncode()) {
                    i32VarA.i0(b);
                }
                f07Var.close();
                return i32VarA;
            } catch (UncheckedIOException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            try {
                f07Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String d(String str) {
        if (str != null && str.length() != 0) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
