package io.sentry.android.replay;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof io.sentry.h) {
            return super.containsKey((io.sentry.h) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof io.sentry.util.network.f) {
            return super.containsValue((io.sentry.util.network.f) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof io.sentry.h) {
            return (io.sentry.util.network.f) super.get((io.sentry.h) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof io.sentry.h) ? obj2 : (io.sentry.util.network.f) super.getOrDefault((io.sentry.h) obj, (io.sentry.util.network.f) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof io.sentry.h) && (obj2 instanceof io.sentry.util.network.f)) {
            return super.remove((io.sentry.h) obj, (io.sentry.util.network.f) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof io.sentry.h) {
            return (io.sentry.util.network.f) super.remove((io.sentry.h) obj);
        }
        return null;
    }
}
