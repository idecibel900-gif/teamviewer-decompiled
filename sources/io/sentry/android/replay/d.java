package io.sentry.android.replay;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f6;
import io.sentry.i4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.bc7;
import o.ds1;
import o.e96;
import o.im3;
import o.l54;
import o.mv0;
import o.u14;
import o.ub7;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i4 {
    public static final u14 c = ds1.X(l54.n, a.f137o);
    public static final HashSet d;
    public String a;
    public final Map b = Collections.synchronizedMap(new b());

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public d(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setBeforeBreadcrumb(new io.sentry.internal.debugmeta.c((Object) this, (Object) sentryAndroidOptions.getBeforeBreadcrumb(), (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02a0  */
    @Override // io.sentry.i4
    public final io.sentry.rrweb.b a(io.sentry.h hVar) {
        String str;
        f6 f6Var;
        Object obj;
        String strQ0;
        double dLongValue;
        double dLongValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!im3.n(hVar.s, "http")) {
            String str2 = "navigation";
            if (im3.n(hVar.q, "navigation") && im3.n(hVar.s, "app.lifecycle")) {
                str2 = "app." + hVar.b().get("state");
            } else if (im3.n(hVar.q, "navigation") && im3.n(hVar.s, "device.orientation")) {
                str2 = hVar.s;
                str2.getClass();
                Object obj2 = hVar.b().get("position");
                if (!im3.n(obj2, "landscape") && !im3.n(obj2, "portrait")) {
                    return null;
                }
                linkedHashMap.put("position", obj2);
            } else {
                if (!im3.n(hVar.q, "navigation")) {
                    if (im3.n(hVar.s, "ui.click")) {
                        Object obj3 = hVar.b().get("view.id");
                        if (obj3 == null && (obj3 = hVar.b().get("view.tag")) == null) {
                            obj3 = hVar.b().get("view.class");
                        }
                        str = obj3 instanceof String ? (String) obj3 : null;
                        if (str == null) {
                            return null;
                        }
                        Map mapB = hVar.b();
                        mapB.getClass();
                        linkedHashMap.putAll(mapB);
                        str2 = "ui.tap";
                        f6Var = null;
                    } else if (im3.n(hVar.q, "system") && im3.n(hVar.s, "network.event")) {
                        if (im3.n(hVar.b().get("action"), "NETWORK_LOST")) {
                            obj = "offline";
                        } else {
                            Map mapB2 = hVar.b();
                            mapB2.getClass();
                            if (!mapB2.containsKey("network_type")) {
                                return null;
                            }
                            Object obj4 = hVar.b().get("network_type");
                            String str3 = obj4 instanceof String ? (String) obj4 : null;
                            if (str3 == null || str3.length() == 0) {
                                return null;
                            }
                            obj = hVar.b().get("network_type");
                        }
                        linkedHashMap.put("state", obj);
                        if (im3.n(this.a, linkedHashMap.get("state"))) {
                            return null;
                        }
                        Object obj5 = linkedHashMap.get("state");
                        this.a = obj5 instanceof String ? (String) obj5 : null;
                        str2 = "device.connectivity";
                    } else if (im3.n(hVar.b().get("action"), "BATTERY_CHANGED")) {
                        Map mapB3 = hVar.b();
                        mapB3.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : mapB3.entrySet()) {
                            String str4 = (String) entry.getKey();
                            if (im3.n(str4, "level") || im3.n(str4, "charging")) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        linkedHashMap.putAll(linkedHashMap2);
                        str2 = "device.battery";
                    } else {
                        str2 = hVar.s;
                        str = hVar.p;
                        f6Var = hVar.u;
                        Map mapB4 = hVar.b();
                        mapB4.getClass();
                        linkedHashMap.putAll(mapB4);
                    }
                    if (str2 == null && str2.length() != 0) {
                        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                        aVar.n = hVar.c().getTime();
                        aVar.p = hVar.c().getTime() / 1000.0d;
                        aVar.q = "default";
                        aVar.r = str2;
                        aVar.s = str;
                        aVar.t = f6Var;
                        aVar.u = new ConcurrentHashMap(linkedHashMap);
                        return aVar;
                    }
                }
                if (im3.n(hVar.b().get("state"), "resumed")) {
                    Object obj6 = hVar.b().get("screen");
                    String str5 = obj6 instanceof String ? (String) obj6 : null;
                    if (str5 != null) {
                        strQ0 = ub7.q0('.', str5, str5);
                    } else {
                        strQ0 = null;
                    }
                } else {
                    Map mapB5 = hVar.b();
                    mapB5.getClass();
                    if (mapB5.containsKey("to")) {
                        Object obj7 = hVar.b().get("to");
                        if (obj7 instanceof String) {
                            strQ0 = (String) obj7;
                        } else {
                            strQ0 = null;
                        }
                    } else {
                        strQ0 = null;
                    }
                }
                if (strQ0 == null) {
                    return null;
                }
                linkedHashMap.put("to", strQ0);
            }
            str = null;
            f6Var = null;
            return str2 == null ? null : null;
        }
        Object obj8 = hVar.b().get("url");
        String str6 = obj8 instanceof String ? (String) obj8 : null;
        if (str6 == null || str6.length() == 0) {
            return null;
        }
        Map mapB6 = hVar.b();
        mapB6.getClass();
        if (!mapB6.containsKey("http.start_timestamp")) {
            return null;
        }
        Map mapB7 = hVar.b();
        mapB7.getClass();
        if (!mapB7.containsKey("http.end_timestamp")) {
            return null;
        }
        Object obj9 = hVar.b().get("http.start_timestamp");
        Object obj10 = hVar.b().get("http.end_timestamp");
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        lVar.n = hVar.c().getTime();
        lVar.p = "resource.http";
        Object obj11 = hVar.b().get("url");
        obj11.getClass();
        lVar.q = (String) obj11;
        if (obj9 instanceof Double) {
            dLongValue = ((Number) obj9).doubleValue();
        } else {
            obj9.getClass();
            dLongValue = ((Long) obj9).longValue();
        }
        lVar.r = dLongValue / 1000.0d;
        if (obj10 instanceof Double) {
            dLongValue2 = ((Number) obj10).doubleValue();
        } else {
            obj10.getClass();
            dLongValue2 = ((Long) obj10).longValue();
        }
        lVar.s = dLongValue2 / 1000.0d;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        io.sentry.util.network.f fVar = (io.sentry.util.network.f) this.b.remove(hVar);
        if (fVar != null) {
            String str7 = fVar.a;
            if (str7 != null) {
                linkedHashMap3.put("method", str7);
            }
            Integer num = fVar.b;
            if (num != null) {
                linkedHashMap3.put("statusCode", num);
            }
            Long l = fVar.c;
            if (l != null) {
                linkedHashMap3.put("requestBodySize", l);
            }
            Long l2 = fVar.d;
            if (l2 != null) {
                linkedHashMap3.put("responseBodySize", l2);
            }
            io.sentry.o oVar = fVar.e;
            if (oVar != null) {
                LinkedHashMap linkedHashMap4 = (LinkedHashMap) oVar.d;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                Long l3 = (Long) oVar.b;
                if (l3 != null) {
                    linkedHashMap5.put("size", l3);
                }
                io.sentry.util.network.b bVar = (io.sentry.util.network.b) oVar.c;
                if (bVar != null) {
                    linkedHashMap5.put("body", bVar.c);
                    List list = (List) bVar.d;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((io.sentry.util.network.a) it.next()).getValue());
                        }
                        linkedHashMap5.put("warnings", arrayList);
                    }
                }
                if (!linkedHashMap4.isEmpty()) {
                    linkedHashMap5.put("headers", linkedHashMap4);
                }
                if (!linkedHashMap5.isEmpty()) {
                    linkedHashMap3.put("request", linkedHashMap5);
                }
            }
            io.sentry.o oVar2 = fVar.f;
            if (oVar2 != null) {
                LinkedHashMap linkedHashMap6 = (LinkedHashMap) oVar2.d;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                Long l4 = (Long) oVar2.b;
                if (l4 != null) {
                    linkedHashMap7.put("size", l4);
                }
                io.sentry.util.network.b bVar2 = (io.sentry.util.network.b) oVar2.c;
                if (bVar2 != null) {
                    linkedHashMap7.put("body", bVar2.c);
                    List list2 = (List) bVar2.d;
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList(mv0.Z(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((io.sentry.util.network.a) it2.next()).getValue());
                        }
                        linkedHashMap7.put("warnings", arrayList2);
                    }
                }
                if (!linkedHashMap6.isEmpty()) {
                    linkedHashMap7.put("headers", linkedHashMap6);
                }
                if (!linkedHashMap7.isEmpty()) {
                    linkedHashMap3.put("response", linkedHashMap7);
                }
            }
        }
        Map mapB8 = hVar.b();
        mapB8.getClass();
        for (Map.Entry entry2 : mapB8.entrySet()) {
            String str8 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (d.contains(str8)) {
                str8.getClass();
                linkedHashMap3.put(((e96) c.getValue()).e(ub7.p0(bc7.L(str8, "content_length", "body_size"), "."), c.f140o), value);
            }
        }
        lVar.t = new ConcurrentHashMap(linkedHashMap3);
        return lVar;
    }
}
