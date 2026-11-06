package io.sentry.util;

import io.sentry.f2;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.h2;
import io.sentry.w3;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import o.gk0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements w3 {
    public final ArrayDeque m;

    public j(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.m = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.w3
    public final Long A() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return Long.valueOf(((Number) objE).longValue());
        }
        return null;
    }

    @Override // io.sentry.w3
    public final void A0() {
        ArrayDeque arrayDeque = this.m;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.w3
    public final ArrayList B0(g1 g1Var, f2 f2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (e() == null) {
                return null;
            }
            h2.m(peek(), "Expected null but was ");
            return null;
        }
        try {
            D0();
            ArrayList arrayList = new ArrayList();
            while (peek() != io.sentry.vendor.gson.stream.b.END_ARRAY) {
                int size = this.m.size();
                try {
                    arrayList.add(f2Var.a(this, g1Var));
                } catch (Exception e) {
                    g1Var.d(f6.WARNING, "Failed to deserialize object in list.", e);
                    j(size);
                }
            }
            A0();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.w3
    public final void D0() throws IOException {
        ArrayDeque arrayDeque = this.m;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            gk0.l("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            gk0.l("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.w3
    public final TimeZone E(g1 g1Var) {
        String str = (String) e();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.w3
    public final String H() {
        return (String) e();
    }

    @Override // io.sentry.w3
    public final void I(boolean z) {
    }

    @Override // io.sentry.w3
    public final HashMap L(g1 g1Var, f2 f2Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (e() == null) {
                return null;
            }
            h2.m(peek(), "Expected null but was ");
            return null;
        }
        try {
            u0();
            HashMap map = new HashMap();
            if (peek() == io.sentry.vendor.gson.stream.b.NAME) {
                while (true) {
                    String strU = U();
                    int size = this.m.size();
                    try {
                        map.put(strU, f2Var.a(this, g1Var));
                    } catch (Exception e) {
                        g1Var.d(f6.WARNING, "Failed to deserialize object in map.", e);
                        j(size);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            Z();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.w3
    public final Double S() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return Double.valueOf(((Number) objE).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.w3
    public final String U() throws IOException {
        Map.Entry entry = (Map.Entry) this.m.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        h2.m(peek(), "Expected a name but was ");
        return null;
    }

    @Override // io.sentry.w3
    public final void Z() {
        ArrayDeque arrayDeque = this.m;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.clear();
    }

    @Override // io.sentry.w3
    public final Date d0(g1 g1Var) {
        String str = (String) e();
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.p(str);
            } catch (Exception unused) {
                return io.sentry.config.a.q(str);
            }
        } catch (Exception e) {
            g1Var.d(f6.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    public final Object e() throws IOException {
        try {
            ArrayDeque arrayDeque = this.m;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // io.sentry.w3
    public final Boolean f0() {
        return (Boolean) e();
    }

    @Override // io.sentry.w3
    public final boolean hasNext() {
        return !this.m.isEmpty();
    }

    public final void j(int i) {
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.w3
    public final double nextDouble() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return ((Number) objE).doubleValue();
        }
        gk0.l("Expected double");
        return 0.0d;
    }

    @Override // io.sentry.w3
    public final float nextFloat() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return ((Number) objE).floatValue();
        }
        gk0.l("Expected float");
        return 0.0f;
    }

    @Override // io.sentry.w3
    public final int nextInt() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return ((Number) objE).intValue();
        }
        gk0.l("Expected int");
        return 0;
    }

    @Override // io.sentry.w3
    public final long nextLong() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return ((Number) objE).longValue();
        }
        gk0.l("Expected long");
        return 0L;
    }

    @Override // io.sentry.w3
    public final Float p0() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return Float.valueOf(((Number) objE).floatValue());
        }
        return null;
    }

    @Override // io.sentry.w3
    public final io.sentry.vendor.gson.stream.b peek() {
        Map.Entry entry;
        ArrayDeque arrayDeque = this.m;
        if (!arrayDeque.isEmpty() && (entry = (Map.Entry) arrayDeque.peekLast()) != null) {
            if (entry.getKey() != null) {
                return io.sentry.vendor.gson.stream.b.NAME;
            }
            Object value = entry.getValue();
            if (value instanceof Map) {
                return io.sentry.vendor.gson.stream.b.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return io.sentry.vendor.gson.stream.b.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return io.sentry.vendor.gson.stream.b.STRING;
            }
            if (value instanceof Number) {
                return io.sentry.vendor.gson.stream.b.NUMBER;
            }
            if (value instanceof Boolean) {
                return io.sentry.vendor.gson.stream.b.BOOLEAN;
            }
            return value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.w3
    public final Object q0(g1 g1Var, f2 f2Var) {
        ArrayDeque arrayDeque = this.m;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (g1Var != null) {
            return f2Var.a(this, g1Var);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // io.sentry.w3
    public final String r() throws IOException {
        String str = (String) e();
        if (str != null) {
            return str;
        }
        gk0.l("Expected string");
        return null;
    }

    @Override // io.sentry.w3
    public final Object t0() {
        return e();
    }

    @Override // io.sentry.w3
    public final void u0() throws IOException {
        ArrayDeque arrayDeque = this.m;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            gk0.l("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            gk0.l("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    @Override // io.sentry.w3
    public final void v() {
        ArrayDeque arrayDeque = this.m;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.w3
    public final Integer w() throws IOException {
        Object objE = e();
        if (objE instanceof Number) {
            return Integer.valueOf(((Number) objE).intValue());
        }
        return null;
    }

    @Override // io.sentry.w3
    public final void y(g1 g1Var, AbstractMap abstractMap, String str) {
        int size = this.m.size();
        try {
            abstractMap.put(str, e());
        } catch (Exception e) {
            g1Var.b(f6.ERROR, e, "Error deserializing unknown key: %s", str);
            j(size);
        }
    }
}
