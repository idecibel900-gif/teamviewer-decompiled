package o;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aa8 {
    public final t83 a;
    public final u83 b;
    public HttpURLConnection c;

    public aa8(t83 t83Var, u83 u83Var) {
        this.a = t83Var;
        this.b = u83Var;
    }

    public static HttpURLConnection a(t83 t83Var) throws ProtocolException, MalformedURLException {
        String str;
        HashSet hashSet;
        HashSet hashSet2;
        t83Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) t83Var.e().openConnection();
        HashSet hashSet3 = null;
        switch (t83Var.b) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "PATCH";
                break;
            case 6:
                str = "HEAD";
                break;
            case 7:
                str = "OPTIONS";
                break;
            case 8:
                str = "TRACE";
                break;
            default:
                throw null;
        }
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setInstanceFollowRedirects(false);
        short s = t83Var.f;
        httpURLConnection.setConnectTimeout(s);
        httpURLConnection.setReadTimeout(s / 2);
        if (e41.b(t83Var.b)) {
            httpURLConnection.setDoOutput(true);
        }
        Map map = xc1.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : t83Var.d.entrySet()) {
            linkedHashSet.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        try {
            for (Map.Entry<String, List<String>> entry2 : t83Var.n.get(t83Var.a.toURI(), xc1.a).entrySet()) {
                List<String> value = entry2.getValue();
                if (value != null && value.size() != 0) {
                    String key = entry2.getKey();
                    if ("Cookie".equals(key)) {
                        hashSet = hashSet3;
                        hashSet2 = linkedHashSet;
                    } else if ("Cookie2".equals(key)) {
                        hashSet2 = new HashSet();
                        hashSet = hashSet2;
                    }
                    hashSet2.addAll(value);
                    hashSet3 = hashSet;
                }
            }
            if (linkedHashSet.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", lb7.j("; ", linkedHashSet));
            }
            if (hashSet3 != null && hashSet3.size() > 0) {
                httpURLConnection.addRequestProperty("Cookie2", lb7.j("; ", hashSet3));
            }
            for (Map.Entry entry3 : t83Var.c.entrySet()) {
                Iterator it = ((List) entry3.getValue()).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty((String) entry3.getKey(), (String) it.next());
                }
            }
            return httpURLConnection;
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public final u83 b() throws IOException {
        t83 t83Var = this.a;
        try {
            HttpURLConnection httpURLConnectionA = a(t83Var);
            this.c = httpURLConnectionA;
            httpURLConnectionA.connect();
            if (this.c.getDoOutput()) {
                try {
                    OutputStream outputStream = this.c.getOutputStream();
                    try {
                        u83.l(t83Var, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    this.c.disconnect();
                    throw e;
                }
            }
            u83 u83Var = new u83(t83Var);
            u83Var.i = this;
            u83Var.b = e41.x(this.c.getRequestMethod());
            u83Var.a = this.c.getURL();
            u83Var.f = this.c.getResponseCode();
            this.c.getResponseMessage();
            u83Var.k = this.c.getContentType();
            u83Var.l = this.c.getContentLength();
            HttpURLConnection httpURLConnection = this.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    u83Var.i(linkedHashMap, this.b);
                    return u83Var;
                }
                i++;
                if (headerFieldKey != null && headerField != null) {
                    ((List) linkedHashMap.computeIfAbsent(headerFieldKey, new k82((byte) 6))).add(headerField);
                }
            }
        } catch (IOException e2) {
            HttpURLConnection httpURLConnection2 = this.c;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.c = null;
            }
            throw e2;
        }
    }
}
