package o;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class u83 extends r83 {
    public static final String[] q = {"Content-Encoding", "Content-Language", "Content-Location", "Content-Type", "Content-Length", "Digest", "Last-Modified"};
    public static final Pattern r = Pattern.compile("^[^/;]+/(?:xml(?:-[^/;]+)?|[^/;]+\\+xml)(?:\\s*;.*)?$", 2);
    public int f;
    public ByteBuffer g;
    public sc1 h;
    public aa8 i;
    public String j;
    public String k;
    public int l;
    public boolean m = false;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2183o = 0;
    public final t83 p;

    public u83(t83 t83Var) {
        this.p = t83Var;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0298  */
    /* JADX WARN: Code duplicated, block: B:163:0x0316 A[Catch: all -> 0x0212, IOException -> 0x0215, TryCatch #1 {all -> 0x0212, blocks: (B:73:0x01a1, B:74:0x01a5, B:78:0x01b5, B:87:0x01c7, B:89:0x01d4, B:91:0x01d8, B:93:0x01dc, B:94:0x01e2, B:96:0x01e8, B:98:0x01f5, B:100:0x01f9, B:103:0x020a, B:108:0x0217, B:110:0x0221, B:111:0x0225, B:113:0x023a, B:114:0x024e, B:117:0x0261, B:121:0x026b, B:123:0x026f, B:129:0x028a, B:137:0x02a1, B:138:0x02ae, B:140:0x02b1, B:142:0x02b5, B:143:0x02c3, B:145:0x02cf, B:147:0x02d3, B:149:0x02d7, B:151:0x02df, B:154:0x02ee, B:156:0x02f6, B:161:0x0310, B:163:0x0316, B:165:0x0326, B:164:0x031b, B:158:0x02fd, B:160:0x0305, B:152:0x02e4, B:153:0x02e9, B:166:0x0336, B:169:0x0342, B:170:0x0359, B:173:0x035d, B:174:0x0360), top: B:179:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x031b A[Catch: all -> 0x0212, IOException -> 0x0215, TryCatch #1 {all -> 0x0212, blocks: (B:73:0x01a1, B:74:0x01a5, B:78:0x01b5, B:87:0x01c7, B:89:0x01d4, B:91:0x01d8, B:93:0x01dc, B:94:0x01e2, B:96:0x01e8, B:98:0x01f5, B:100:0x01f9, B:103:0x020a, B:108:0x0217, B:110:0x0221, B:111:0x0225, B:113:0x023a, B:114:0x024e, B:117:0x0261, B:121:0x026b, B:123:0x026f, B:129:0x028a, B:137:0x02a1, B:138:0x02ae, B:140:0x02b1, B:142:0x02b5, B:143:0x02c3, B:145:0x02cf, B:147:0x02d3, B:149:0x02d7, B:151:0x02df, B:154:0x02ee, B:156:0x02f6, B:161:0x0310, B:163:0x0316, B:165:0x0326, B:164:0x031b, B:158:0x02fd, B:160:0x0305, B:152:0x02e4, B:153:0x02e9, B:166:0x0336, B:169:0x0342, B:170:0x0359, B:173:0x035d, B:174:0x0360), top: B:179:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0336 A[Catch: all -> 0x0212, IOException -> 0x0215, TRY_LEAVE, TryCatch #1 {all -> 0x0212, blocks: (B:73:0x01a1, B:74:0x01a5, B:78:0x01b5, B:87:0x01c7, B:89:0x01d4, B:91:0x01d8, B:93:0x01dc, B:94:0x01e2, B:96:0x01e8, B:98:0x01f5, B:100:0x01f9, B:103:0x020a, B:108:0x0217, B:110:0x0221, B:111:0x0225, B:113:0x023a, B:114:0x024e, B:117:0x0261, B:121:0x026b, B:123:0x026f, B:129:0x028a, B:137:0x02a1, B:138:0x02ae, B:140:0x02b1, B:142:0x02b5, B:143:0x02c3, B:145:0x02cf, B:147:0x02d3, B:149:0x02d7, B:151:0x02df, B:154:0x02ee, B:156:0x02f6, B:161:0x0310, B:163:0x0316, B:165:0x0326, B:164:0x031b, B:158:0x02fd, B:160:0x0305, B:152:0x02e4, B:153:0x02e9, B:166:0x0336, B:169:0x0342, B:170:0x0359, B:173:0x035d, B:174:0x0360), top: B:179:0x01a1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static u83 f(t83 t83Var, u83 u83Var) {
        aa8 aa8Var;
        String str;
        Object[] objArr;
        InputStream inflaterInputStream;
        int i;
        sc1 sc1Var;
        Constructor constructor;
        String str2;
        ReentrantLock reentrantLock = t83Var.f2090o;
        ArrayList<s83> arrayList = t83Var.i;
        db8.e0("Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.", reentrantLock.tryLock());
        URL urlE = t83Var.e();
        if (urlE == null) {
            throw new fb8("URL must be specified to connect");
        }
        String protocol = urlE.getProtocol();
        if (!protocol.equals("http") && !protocol.equals("https")) {
            throw new MalformedURLException("Only http & https protocols supported");
        }
        boolean zB = e41.b(t83Var.b);
        if (!zB) {
            switch (t83Var.b) {
                case 1:
                    str2 = "GET";
                    break;
                case 2:
                    str2 = "POST";
                    break;
                case 3:
                    str2 = "PUT";
                    break;
                case 4:
                    str2 = "DELETE";
                    break;
                case 5:
                    str2 = "PATCH";
                    break;
                case 6:
                    str2 = "HEAD";
                    break;
                case 7:
                    str2 = "OPTIONS";
                    break;
                case 8:
                    str2 = "TRACE";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            "Cannot set a request body for HTTP method ".concat(str2);
        }
        u83 u83Var2 = null;
        InputStream errorStream = null;
        if (!arrayList.isEmpty() && !zB) {
            lh7 lh7Var = new lh7(t83Var.e());
            for (s83 s83Var : arrayList) {
                s83Var.getClass();
                StringBuilder sb = (StringBuilder) lh7Var.f1364o;
                if (sb == null) {
                    lh7Var.f1364o = lb7.b();
                } else {
                    sb.append('&');
                }
                StringBuilder sb2 = (StringBuilder) lh7Var.f1364o;
                String str3 = s83Var.a;
                Charset charset = xh1.b;
                sb2.append(URLEncoder.encode(str3, charset.name()));
                sb2.append('=');
                sb2.append(URLEncoder.encode(s83Var.b, charset.name()));
            }
            URL urlI = lh7Var.i();
            db8.p0(urlI, "url");
            t83Var.a = new lh7(urlI).i();
            arrayList.clear();
        } else if (zB) {
            List listB = t83Var.b("Content-Type");
            String strJ = !listB.isEmpty() ? lb7.j(", ", listB) : null;
            String strK = (strJ == null || !strJ.contains("multipart/form-data")) ? null : t83Var.j;
            if (strJ == null) {
                Charset charset2 = v83.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s83) it.next()).getClass();
                }
                String str4 = "application/x-www-form-urlencoded; charset=" + t83Var.m;
                db8.n0("Content-Type", "name");
                t83Var.d("Content-Type");
                t83Var.a("Content-Type", str4);
            } else if (strJ.contains("multipart/form-data") && !strJ.contains("boundary")) {
                Pattern pattern = xh1.a;
                StringBuilder sbB = lb7.b();
                Random random = new Random();
                for (int i2 = 0; i2 < 32; i2++) {
                    char[] cArr = xh1.d;
                    sbB.append(cArr[random.nextInt(cArr.length)]);
                }
                strK = lb7.k(sbB);
                String strConcat = "multipart/form-data; boundary=".concat(strK);
                db8.n0("Content-Type", "name");
                t83Var.d("Content-Type");
                t83Var.a("Content-Type", strConcat);
            }
            t83Var.j = strK;
        }
        long jNanoTime = System.nanoTime();
        Constructor constructor2 = hb6.a;
        if (!Boolean.parseBoolean(System.getProperty("jsoup.useHttpClient", "true")) || (constructor = hb6.a) == null) {
            aa8Var = new aa8(t83Var, u83Var);
        } else {
            try {
                aa8Var = (aa8) constructor.newInstance(t83Var, u83Var);
            } catch (Exception unused) {
                aa8Var = new aa8(t83Var, u83Var);
            }
        }
        try {
            try {
                u83 u83VarB = aa8Var.b();
                try {
                    int i3 = u83VarB.f;
                    int i4 = t83Var.b;
                    if (i3 != 307 && i3 != 308) {
                        switch (i3) {
                            case 301:
                            case 302:
                                if (i4 == 2) {
                                }
                                break;
                            case 303:
                                i4 = i4 == 6 ? 6 : 1;
                                break;
                            default:
                                i4 = 0;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        db8.n0("Location", "name");
                        if (!u83VarB.b("Location").isEmpty() && t83Var.h) {
                            if (i4 == t83Var.b) {
                                Charset charset3 = v83.c;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((s83) it2.next()).getClass();
                                }
                            }
                            if (i4 != t83Var.b) {
                                to7.n(i4, "method");
                                t83Var.b = i4;
                                arrayList.clear();
                                String[] strArr = q;
                                for (int i5 = 0; i5 < 7; i5++) {
                                    t83Var.d(strArr[i5]);
                                }
                            }
                            List listB2 = u83VarB.b("Location");
                            String strJ2 = listB2.isEmpty() ? null : lb7.j(", ", listB2);
                            db8.o0(strJ2);
                            URL urlL = lb7.l(t83Var.e(), strJ2);
                            if (!k(t83Var.e(), urlL)) {
                                t83Var.d("Authorization");
                                t83Var.d("Cookie");
                                t83Var.d("Cookie2");
                                t83Var.d.clear();
                            }
                            t83Var.a = new lh7(urlL).i();
                            u83 u83VarF = f(t83Var, u83VarB);
                            reentrantLock.unlock();
                            return u83VarF;
                        }
                    }
                    int i6 = u83VarB.f;
                    if (i6 < 200 || i6 >= 400) {
                        throw new f93(e41.h("HTTP error fetching URL. Status=", ", URL=[", i6, t83Var.e().toString(), "]"));
                    }
                    String str5 = u83VarB.k;
                    if (str5 != null) {
                        str = str5;
                        Object[] objArr2 = str5.regionMatches(true, 0, "text/", 0, 5);
                        if (str == null && r.matcher(str).matches()) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        if (str != null && objArr2 == false && objArr == false) {
                            throw new l98(str, t83Var.e().toString());
                        }
                        if (objArr != false && !t83Var.l) {
                            t83Var.k = new kg5(new do8());
                            t83Var.l = true;
                        }
                        u83VarB.j = xh1.b(u83VarB.k);
                        if (u83VarB.l != 0 || t83Var.b == 6) {
                            u83VarB.g = ByteBuffer.allocate(0);
                        } else {
                            HttpURLConnection httpURLConnection = aa8Var.c;
                            if (httpURLConnection != null) {
                                InputStream errorStream2 = httpURLConnection.getErrorStream();
                                HttpURLConnection httpURLConnection2 = aa8Var.c;
                                errorStream = errorStream2 != null ? httpURLConnection2.getErrorStream() : httpURLConnection2.getInputStream();
                            } else {
                                hk0.l("Not yet executed");
                            }
                            if (u83VarB.c("gzip")) {
                                inflaterInputStream = new GZIPInputStream(errorStream);
                            } else {
                                if (u83VarB.c("deflate")) {
                                    inflaterInputStream = new InflaterInputStream(errorStream, new Inflater(true));
                                }
                                i = t83Var.g;
                                if (errorStream instanceof sc1) {
                                    int i7 = sc1.v;
                                    sc1Var = (sc1) errorStream;
                                } else {
                                    sc1Var = new sc1(new b07(errorStream), i);
                                }
                                long j = t83Var.f;
                                sc1Var.f2006o = jNanoTime;
                                sc1Var.p = j * 1000000;
                                u83VarB.h = sc1Var;
                                int i8 = t83.p;
                            }
                            errorStream = inflaterInputStream;
                            i = t83Var.g;
                            if (errorStream instanceof sc1) {
                                int i9 = sc1.v;
                                sc1Var = (sc1) errorStream;
                            } else {
                                sc1Var = new sc1(new b07(errorStream), i);
                            }
                            long j2 = t83Var.f;
                            sc1Var.f2006o = jNanoTime;
                            sc1Var.p = j2 * 1000000;
                            u83VarB.h = sc1Var;
                            int i10 = t83.p;
                        }
                        reentrantLock.unlock();
                        u83VarB.m = true;
                        return u83VarB;
                    }
                    str = str5;
                    if (str == null) {
                        objArr = false;
                    } else {
                        objArr = false;
                    }
                    if (str != null) {
                        throw new l98(str, t83Var.e().toString());
                    }
                    if (objArr != false) {
                        t83Var.k = new kg5(new do8());
                        t83Var.l = true;
                    }
                    u83VarB.j = xh1.b(u83VarB.k);
                    if (u83VarB.l != 0) {
                        u83VarB.g = ByteBuffer.allocate(0);
                    } else {
                        u83VarB.g = ByteBuffer.allocate(0);
                    }
                    reentrantLock.unlock();
                    u83VarB.m = true;
                    return u83VarB;
                } catch (IOException e) {
                    e = e;
                    u83Var2 = u83VarB;
                    if (u83Var2 != null) {
                        u83Var2.j();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void g(t83 t83Var, BufferedWriter bufferedWriter, OutputStream outputStream) throws IOException {
        ArrayList<s83> arrayList = t83Var.i;
        String str = t83Var.m;
        String str2 = t83Var.j;
        if (str2 == null) {
            boolean z = true;
            for (s83 s83Var : arrayList) {
                if (z) {
                    z = false;
                } else {
                    bufferedWriter.append('&');
                }
                bufferedWriter.write(URLEncoder.encode(s83Var.a, str));
                bufferedWriter.write(61);
                bufferedWriter.write(URLEncoder.encode(s83Var.b, str));
            }
            return;
        }
        for (s83 s83Var2 : arrayList) {
            bufferedWriter.write("--");
            bufferedWriter.write(str2);
            bufferedWriter.write("\r\n");
            bufferedWriter.write("Content-Disposition: form-data; name=\"");
            String str3 = s83Var2.a;
            Charset charset = v83.c;
            bufferedWriter.write(str3.replace("\"", "%22").replace("\r", "%0D").replace("\n", "%0A"));
            bufferedWriter.write("\"");
            bufferedWriter.write("\r\n\r\n");
            bufferedWriter.write(s83Var2.b);
            bufferedWriter.write("\r\n");
        }
        bufferedWriter.write("--");
        bufferedWriter.write(str2);
        bufferedWriter.write("--");
    }

    public static boolean k(URL url, URL url2) {
        return url.getProtocol().equalsIgnoreCase(url2.getProtocol()) && url.getHost().equalsIgnoreCase(url2.getHost()) && (url.getPort() != -1 ? url.getPort() : url.getDefaultPort()) == (url2.getPort() != -1 ? url2.getPort() : url2.getDefaultPort());
    }

    public static void l(t83 t83Var, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, t83Var.m);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            try {
                g(t83Var, bufferedWriter, outputStream);
                bufferedWriter.close();
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final i32 h() {
        iu iuVarA;
        db8.e0("Request must be executed (with .execute(), .get(), or .post() before parsing response", this.m);
        sc1 sc1Var = this.h;
        if (this.g != null) {
            sc1 sc1Var2 = new sc1(new b07(new ByteArrayInputStream(this.g.array(), 0, this.g.limit())), 0);
            this.n = false;
            sc1Var = sc1Var2;
        }
        if (this.n) {
            throw new fb8("Input stream already read and parsed, cannot re-read.");
        }
        db8.o0(sc1Var);
        this.n = true;
        String str = this.j;
        String externalForm = this.a.toExternalForm();
        kg5 kg5Var = this.p.k;
        try {
            iuVarA = xh1.a(sc1Var, str, externalForm, kg5Var);
            try {
                i32 i32VarC = xh1.c(iuVarA, externalForm, kg5Var);
                ((InputStream) iuVarA.p).close();
                this.j = i32VarC.v.n.name();
                j();
                return i32VarC;
            } catch (Throwable th) {
                th = th;
                if (iuVarA != null) {
                    ((InputStream) iuVarA.p).close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iuVarA = null;
        }
    }

    public final void i(LinkedHashMap linkedHashMap, u83 u83Var) throws IOException {
        LinkedHashMap linkedHashMap2;
        int i;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null && StandardCharsets.ISO_8859_1.newEncoder().canEncode(str2)) {
                        byte[] bytes = str2.getBytes(v83.c);
                        boolean z = false;
                        int i2 = (bytes.length >= 3 && (bytes[0] & 255) == 239 && (bytes[1] & 255) == 187 && (bytes[2] & 255) == 191) ? 3 : 0;
                        int length = bytes.length;
                        boolean z2 = false;
                        while (true) {
                            if (i2 >= length) {
                                z = z2;
                                break;
                            }
                            byte b = bytes[i2];
                            if ((b & 128) != 0) {
                                if ((b & 224) == 192) {
                                    i = i2 + 1;
                                } else if ((b & 240) == 224) {
                                    i = i2 + 2;
                                } else if ((b & 248) != 240) {
                                    break;
                                } else {
                                    i = i2 + 3;
                                }
                                if (i >= bytes.length) {
                                    break;
                                }
                                while (i2 < i) {
                                    i2++;
                                    if ((bytes[i2] & 192) != 128) {
                                        break;
                                    }
                                }
                                z2 = true;
                            }
                            i2++;
                        }
                        if (z) {
                            str2 = new String(bytes, xh1.b);
                        }
                    }
                    a(str, str2);
                }
            }
        }
        URL url = this.a;
        Map map = xc1.a;
        try {
            this.p.n.put(url.toURI(), linkedHashMap);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                linkedHashMap2 = this.d;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                String str3 = (String) entry2.getKey();
                List<String> list = (List) entry2.getValue();
                if (str3.equalsIgnoreCase("Set-Cookie")) {
                    for (String str4 : list) {
                        if (str4 != null) {
                            tn0 tn0Var = new tn0(str4);
                            String strTrim = tn0Var.G('=').trim();
                            tn0Var.e();
                            String strTrim2 = tn0Var.G(';').trim();
                            if (!strTrim.isEmpty()) {
                                db8.n0(strTrim, "name");
                                db8.p0(strTrim2, "value");
                                linkedHashMap2.put(strTrim, strTrim2);
                            }
                            tn0Var.close();
                        }
                    }
                }
            }
            if (u83Var != null) {
                for (Map.Entry entry3 : u83Var.d.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    db8.n0(str5, "name");
                    if (!linkedHashMap2.containsKey(str5)) {
                        String str6 = (String) entry3.getKey();
                        String str7 = (String) entry3.getValue();
                        db8.n0(str6, "name");
                        db8.p0(str7, "value");
                        linkedHashMap2.put(str6, str7);
                    }
                }
                u83Var.j();
                int i3 = u83Var.f2183o + 1;
                this.f2183o = i3;
                if (i3 < 20) {
                    return;
                }
                io.sentry.h2.m(u83Var.e(), "Too many redirects occurred trying to load URL ");
            }
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection;
        sc1 sc1Var = this.h;
        if (sc1Var != null) {
            try {
                sc1Var.close();
            } catch (IOException unused) {
            } finally {
                this.h = null;
            }
        }
        aa8 aa8Var = this.i;
        if (aa8Var == null || (httpURLConnection = aa8Var.c) == null) {
            return;
        }
        httpURLConnection.disconnect();
        aa8Var.c = null;
    }
}
