package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements a2 {
    public final /* synthetic */ byte a;
    public final SentryAndroidOptions b;

    public /* synthetic */ a0(SentryAndroidOptions sentryAndroidOptions, byte b) {
        this.a = b;
        this.b = sentryAndroidOptions;
    }

    @Override // io.sentry.a2
    public final boolean a() {
        switch (this.a) {
            case 0:
                return d6.d().c(this.b.getFatalLogger());
            default:
                if (io.sentry.internal.a.c == null) {
                    io.sentry.util.a aVar = io.sentry.internal.a.d;
                    aVar.e();
                    try {
                        if (io.sentry.internal.a.c == null) {
                            io.sentry.internal.a.c = new io.sentry.internal.a();
                        }
                        aVar.close();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                io.sentry.internal.a aVar2 = io.sentry.internal.a.c;
                if (!aVar2.a) {
                    try {
                        io.sentry.util.a aVar3 = aVar2.b;
                        aVar3.e();
                        try {
                            if (!aVar2.a) {
                                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                                while (resources.hasMoreElements()) {
                                    try {
                                        URLConnection uRLConnectionOpenConnection = resources.nextElement().openConnection();
                                        uRLConnectionOpenConnection.setUseCaches(false);
                                        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                                        try {
                                            Attributes mainAttributes = new Manifest(inputStream).getMainAttributes();
                                            if (mainAttributes != null) {
                                                String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                                String value2 = mainAttributes.getValue("Implementation-Version");
                                                String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                                String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                                if (value != null && value2 != null) {
                                                    String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                                    if (value5 != null) {
                                                        d6.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                        d6.d().a("OpenTelemetry");
                                                    }
                                                    String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                    if (value6 != null) {
                                                        d6.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                        d6.d().a("OpenTelemetry-Agent");
                                                    }
                                                    if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                        d6.d().a("OpenTelemetry-Agentless");
                                                    }
                                                    if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                        d6.d().a("OpenTelemetry-Agentless-Spring");
                                                    }
                                                }
                                                if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                                    d6.d().b(value4, value2);
                                                }
                                            }
                                            if (inputStream != null) {
                                                inputStream.close();
                                            }
                                        } catch (Throwable th3) {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                                break;
                                            }
                                            throw th3;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            aVar3.close();
                        } catch (Throwable th5) {
                            try {
                                aVar3.close();
                                break;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                        break;
                    } catch (IOException unused2) {
                    } catch (Throwable th7) {
                        aVar2.a = true;
                        throw th7;
                    }
                    aVar2.a = true;
                }
                return d6.d().c(this.b.getFatalLogger());
        }
    }
}
