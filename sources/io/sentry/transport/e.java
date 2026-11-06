package io.sentry.transport;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.d7;
import io.sentry.f6;
import io.sentry.g1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final io.sentry.internal.debugmeta.c b;
    public final SentryAndroidOptions c;
    public final p d;

    public e(SentryAndroidOptions sentryAndroidOptions, io.sentry.internal.debugmeta.c cVar, p pVar) {
        Proxy proxy;
        this.b = cVar;
        this.c = sentryAndroidOptions;
        this.d = pVar;
        d7 proxy2 = sentryAndroidOptions.getProxy();
        if (proxy2 != null) {
            String str = proxy2.b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.a, Integer.parseInt(str)));
            } catch (NumberFormatException e2) {
                this.c.getLogger().b(f6.ERROR, e2, fx3.g("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.a = proxy;
        if (proxy == null || sentryAndroidOptions.getProxy() == null) {
            return;
        }
        String str2 = sentryAndroidOptions.getProxy().c;
        String str3 = sentryAndroidOptions.getProxy().d;
        String str4 = sentryAndroidOptions.getProxy().a;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new l(str2, str3, str4));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        f6 f6Var;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            e(httpURLConnection, responseCode);
            if (responseCode == 200) {
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "Envelope sent successfully.", new Object[0]);
                return s.c;
            }
            if (responseCode == 413) {
                g1 logger = sentryAndroidOptions.getLogger();
                f6Var = f6.ERROR;
                logger.g(f6Var, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
            } else {
                g1 logger2 = sentryAndroidOptions.getLogger();
                f6Var = f6.ERROR;
                logger2.g(f6Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
            }
            if (sentryAndroidOptions.isDebug()) {
                sentryAndroidOptions.getLogger().g(f6Var, "%s", b(httpURLConnection));
            }
            return new r(responseCode);
        } catch (IOException e2) {
            sentryAndroidOptions.getLogger().b(f6.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
            return new r(-1);
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        sentryAndroidOptions.getSocketTagger().e();
        io.sentry.internal.debugmeta.c cVar2 = this.b;
        URL url = (URL) cVar2.n;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) cVar2.f205o).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(sentryAndroidOptions.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(sentryAndroidOptions.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = sentryAndroidOptions.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sentryAndroidOptions.getSerializer().e(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                sentryAndroidOptions.getLogger().b(f6.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                c(httpURLConnection);
                sentryAndroidOptions.getSocketTagger().a();
            }
        }
        return c(httpURLConnection);
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        long j;
        String[] strArr;
        double d;
        long j2;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        p pVar = this.d;
        io.sentry.time.c cVar = pVar.m;
        SentryAndroidOptions sentryAndroidOptions = pVar.n;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        double d2 = 1000.0d;
        if (headerField2 == null) {
            if (i == 429) {
                io.sentry.q qVar = io.sentry.q.All;
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                pVar.e(qVar, io.sentry.time.a.a(cVar, j, timeUnit));
                return;
            }
            return;
        }
        int i2 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String[] strArrSplit2 = strArrSplit[i4].replace(" ", "").split(":", i2);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[i3];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d2);
                    } catch (NumberFormatException unused2) {
                        j2 = 60000;
                    }
                } else {
                    j2 = 60000;
                }
                io.sentry.time.a aVarA = io.sentry.time.a.a(cVar, j2, timeUnit);
                d = d2;
                if (strArrSplit2.length <= 1) {
                    strArr = strArrSplit;
                } else {
                    String str2 = strArrSplit2[1];
                    if (str2 == null || str2.isEmpty()) {
                        strArr = strArrSplit;
                        pVar.e(io.sentry.q.All, aVarA);
                    } else {
                        String[] strArrSplit3 = str2.split(";", i2);
                        int length2 = strArrSplit3.length;
                        int i5 = i3;
                        while (i5 < length2) {
                            String str3 = strArrSplit3[i5];
                            io.sentry.q qVarValueOf = io.sentry.q.Unknown;
                            try {
                                Charset charset = io.sentry.util.r.a;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = io.sentry.util.r.b.split(str3, i2);
                                    StringBuilder sb = new StringBuilder();
                                    for (String str4 : strArrSplit4) {
                                        sb.append(io.sentry.util.r.b(str4));
                                    }
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    qVarValueOf = io.sentry.q.valueOf(string);
                                    strArr2 = strArrSplit;
                                } else {
                                    strArr2 = strArrSplit;
                                    try {
                                        sentryAndroidOptions.getLogger().g(f6.ERROR, "Couldn't capitalize: %s", str3);
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        sentryAndroidOptions.getLogger().b(f6.INFO, e, "Unknown category: %s", str3);
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                                strArr2 = strArrSplit;
                            }
                            if (!io.sentry.q.Unknown.equals(qVarValueOf)) {
                                pVar.e(qVarValueOf, aVarA);
                            }
                            i5++;
                            strArrSplit = strArr2;
                            i2 = -1;
                        }
                        strArr = strArrSplit;
                    }
                }
            } else {
                strArr = strArrSplit;
                d = d2;
            }
            i4++;
            d2 = d;
            strArrSplit = strArr;
            i2 = -1;
            i3 = 0;
        }
    }
}
