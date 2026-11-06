package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements t1 {
    public static final Charset c = Charset.forName("UTF-8");
    public final g7 a;
    public final HashMap b;

    public u2(g7 g7Var) {
        this.a = g7Var;
        HashMap map = new HashMap();
        this.b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a((byte) 4));
        map.put(h.class, new g((byte) 0));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a((byte) 5));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a((byte) 6));
        map.put(DebugImage.class, new io.sentry.clientreport.a((byte) 7));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a((byte) 8));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a((byte) 9));
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a((byte) 10));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a((byte) 12));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a((byte) 14));
        map.put(io.sentry.protocol.b0.class, new io.sentry.clientreport.a((byte) 29));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a((byte) 15));
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a((byte) 16));
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a((byte) 17));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a((byte) 18));
        map.put(c4.class, new g((byte) 1));
        map.put(d4.class, new g((byte) 2));
        map.put(f4.class, new g((byte) 3));
        map.put(g4.class, new g((byte) 4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a((byte) 2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a((byte) 3));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a((byte) 19));
        map.put(l4.class, new g((byte) 5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.d0((byte) 9));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.d0((byte) 10));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.d0((byte) 12));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.d0((byte) 14));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.d0((byte) 16));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.d0((byte) 17));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.d0((byte) 18));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a((byte) 20));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a((byte) 21));
        map.put(n5.class, new g((byte) 7));
        map.put(u5.class, new g((byte) 8));
        map.put(v5.class, new g((byte) 9));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a((byte) 22));
        map.put(e6.class, new g((byte) 10));
        map.put(f6.class, new g((byte) 11));
        map.put(g6.class, new g((byte) 12));
        map.put(i6.class, new g((byte) 15));
        map.put(n6.class, new g((byte) 18));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a((byte) 24));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a((byte) 25));
        map.put(i7.class, new g((byte) 19));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a((byte) 26));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a((byte) 27));
        map.put(io.sentry.protocol.c0.class, new io.sentry.clientreport.a((byte) 28));
        map.put(e5.class, new g((byte) 6));
        map.put(io.sentry.protocol.e0.class, new io.sentry.protocol.d0((byte) 0));
        map.put(io.sentry.protocol.f0.class, new io.sentry.protocol.d0((byte) 1));
        map.put(u7.class, new g((byte) 21));
        map.put(w7.class, new g((byte) 22));
        map.put(y7.class, new g((byte) 23));
        map.put(a8.class, new g((byte) 24));
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.d0((byte) 2));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a((byte) 13));
        map.put(h8.class, new g((byte) 26));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a((byte) 0));
        map.put(io.sentry.protocol.k0.class, new io.sentry.protocol.d0((byte) 4));
        map.put(io.sentry.protocol.j0.class, new io.sentry.protocol.d0((byte) 3));
    }

    @Override // io.sentry.t1
    public final void a(Object obj, Writer writer) throws IOException {
        io.sentry.util.b.v(obj, "The entity is required.");
        g7 g7Var = this.a;
        g1 logger = g7Var.getLogger();
        f6 f6Var = f6.DEBUG;
        if (logger.i(f6Var)) {
            g7Var.getLogger().g(f6Var, "Serializing object: %s", f(obj, g7Var.isEnablePrettySerializationOutput()));
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(writer, g7Var.getMaxDepth());
        ((s2) cVar.f205o).c(cVar, g7Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.t1
    public final Object b(Reader reader, Class cls) {
        Object objT0;
        g7 g7Var = this.a;
        try {
            r2 r2Var = new r2(reader);
            try {
                f2 f2Var = (f2) this.b.get(cls);
                if (f2Var != null) {
                    objT0 = cls.cast(f2Var.a(r2Var, g7Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        r2Var.close();
                        return null;
                    }
                    objT0 = r2Var.t0();
                }
                r2Var.close();
                return objT0;
            } catch (Throwable th) {
                try {
                    r2Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            g7Var.getLogger().d(f6.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.t1
    public final io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream) {
        g7 g7Var = this.a;
        try {
            return g7Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            g7Var.getLogger().d(f6.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.t1
    public final String d(Map map) {
        return f(map, false);
    }

    @Override // io.sentry.t1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        g7 g7Var = this.a;
        io.sentry.util.b.v(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c), 512);
        try {
            ((n5) cVar.n).serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, g7Var.getMaxDepth()), g7Var.getLogger());
            bufferedWriter.write("\n");
            for (t5 t5Var : (Iterable) cVar.f205o) {
                try {
                    byte[] bArrG = t5Var.g();
                    t5Var.a.serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, g7Var.getMaxDepth()), g7Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrG);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    g7Var.getLogger().d(f6.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    public final String f(Object obj, boolean z) {
        StringWriter stringWriter = new StringWriter();
        g7 g7Var = this.a;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(stringWriter, g7Var.getMaxDepth());
        if (z) {
            cVar.u("\t");
        }
        ((s2) cVar.f205o).c(cVar, g7Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
