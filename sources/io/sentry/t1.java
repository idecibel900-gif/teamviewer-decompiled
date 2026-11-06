package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface t1 {
    void a(Object obj, Writer writer);

    Object b(Reader reader, Class cls);

    io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream);

    String d(Map map);

    void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);
}
