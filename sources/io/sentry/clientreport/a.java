package io.sentry.clientreport;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.a8;
import io.sentry.d4;
import io.sentry.f2;
import io.sentry.f6;
import io.sentry.g;
import io.sentry.g1;
import io.sentry.g6;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.g0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.w3;
import io.sentry.y7;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.ep1;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
    }

    public static io.sentry.protocol.a b(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "split_names":
                    List list = (List) w3Var.t0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.y = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.f223o = w3Var.H();
                    break;
                case "start_type":
                    aVar.v = w3Var.H();
                    break;
                case "view_names":
                    List list2 = (List) w3Var.t0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.u = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.r = w3Var.H();
                    break;
                case "in_foreground":
                    aVar.w = w3Var.f0();
                    break;
                case "build_type":
                    aVar.p = w3Var.H();
                    break;
                case "app_identifier":
                    aVar.m = w3Var.H();
                    break;
                case "app_start_time":
                    aVar.n = w3Var.d0(g1Var);
                    break;
                case "permissions":
                    aVar.t = io.sentry.util.b.r((Map) w3Var.t0());
                    break;
                case "app_name":
                    aVar.q = w3Var.H();
                    break;
                case "app_build":
                    aVar.s = w3Var.H();
                    break;
                case "is_split_apks":
                    aVar.x = w3Var.f0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        aVar.z = concurrentHashMap;
        w3Var.Z();
        return aVar;
    }

    public static io.sentry.protocol.e c(w3 w3Var, g1 g1Var) {
        byte b;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        w3Var.u0();
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            byte b2 = 11;
            switch (strU) {
                case "device":
                    b = 0;
                    break;
                case "spring":
                    b = 1;
                    break;
                case "response":
                    b = 2;
                    break;
                case "profile":
                    b = 3;
                    break;
                case "feedback":
                    b = 4;
                    break;
                case "os":
                    b = 5;
                    break;
                case "app":
                    b = 6;
                    break;
                case "art":
                    b = 7;
                    break;
                case "gpu":
                    b = 8;
                    break;
                case "flags":
                    b = 9;
                    break;
                case "trace":
                    b = 10;
                    break;
                case "browser":
                    b = 11;
                    break;
                case "runtime":
                    b = 12;
                    break;
                default:
                    b = -1;
                    break;
            }
            ArrayList arrayList = null;
            switch (b) {
                case 0:
                    eVar.q(d(w3Var, g1Var));
                    break;
                case 1:
                    w3Var.u0();
                    g0 g0Var = new g0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU2 = w3Var.U();
                        strU2.getClass();
                        if (strU2.equals("active_profiles")) {
                            List list = (List) w3Var.t0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                g0Var.m = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap, strU2);
                        }
                    }
                    g0Var.n = concurrentHashMap;
                    w3Var.Z();
                    eVar.w(g0Var);
                    break;
                case 2:
                    w3Var.u0();
                    s sVar = new s();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU3 = w3Var.U();
                        strU3.getClass();
                        switch (strU3) {
                            case "status_code":
                                sVar.f246o = w3Var.w();
                                break;
                            case "data":
                                sVar.q = w3Var.t0();
                                break;
                            case "headers":
                                Map map = (Map) w3Var.t0();
                                if (map != null) {
                                    sVar.n = io.sentry.util.b.r(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                sVar.m = w3Var.H();
                                break;
                            case "body_size":
                                sVar.p = w3Var.A();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                w3Var.y(g1Var, concurrentHashMap2, strU3);
                                break;
                        }
                    }
                    sVar.r = concurrentHashMap2;
                    w3Var.Z();
                    eVar.u(sVar);
                    break;
                case 3:
                    w3Var.u0();
                    d4 d4Var = new d4(w.n);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU4 = w3Var.U();
                        strU4.getClass();
                        if (strU4.equals("profiler_id")) {
                            w wVar = (w) w3Var.q0(g1Var, new a((byte) 23));
                            if (wVar != null) {
                                d4Var.m = wVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap3, strU4);
                        }
                    }
                    d4Var.n = concurrentHashMap3;
                    w3Var.Z();
                    eVar.l(d4Var, "profile");
                    break;
                case 4:
                    eVar.l(e(w3Var, g1Var), "feedback");
                    break;
                case 5:
                    eVar.t(g(w3Var, g1Var));
                    break;
                case 6:
                    eVar.o(b(w3Var, g1Var));
                    break;
                case 7:
                    w3Var.u0();
                    io.sentry.protocol.c cVar = new io.sentry.protocol.c();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU5 = w3Var.U();
                        strU5.getClass();
                        switch (strU5) {
                            case "gc.total_time":
                                cVar.n = w3Var.S();
                                break;
                            case "memory.free_until_gc":
                                cVar.t = w3Var.A();
                                break;
                            case "gc.blocking_time":
                                cVar.p = w3Var.S();
                                break;
                            case "gc.waiting_time":
                                cVar.r = w3Var.S();
                                break;
                            case "memory.free_until_oome":
                                cVar.u = w3Var.A();
                                break;
                            case "memory.total":
                                cVar.v = w3Var.A();
                                break;
                            case "gc.pre_oome_count":
                                cVar.q = w3Var.A();
                                break;
                            case "memory.free":
                                cVar.s = w3Var.A();
                                break;
                            case "gc.blocking_count":
                                cVar.f225o = w3Var.A();
                                break;
                            case "gc.total_count":
                                cVar.m = w3Var.A();
                                break;
                            case "memory.max":
                                cVar.w = w3Var.A();
                                break;
                            default:
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                w3Var.y(g1Var, concurrentHashMap4, strU5);
                                break;
                        }
                    }
                    cVar.x = concurrentHashMap4;
                    w3Var.Z();
                    eVar.l(cVar, "art");
                    break;
                case 8:
                    eVar.s(f(w3Var, g1Var));
                    break;
                case ep1.b /* 9 */:
                    w3Var.u0();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU6 = w3Var.U();
                        strU6.getClass();
                        if (strU6.equals("values")) {
                            arrayList = w3Var.B0(g1Var, new a(b2));
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap5, strU6);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    j jVar = new j(arrayList);
                    jVar.n = concurrentHashMap5;
                    w3Var.Z();
                    eVar.r(jVar);
                    break;
                case ep1.c /* 10 */:
                    eVar.x(g.c(w3Var, g1Var));
                    break;
                case 11:
                    w3Var.u0();
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU7 = w3Var.U();
                        strU7.getClass();
                        if (strU7.equals("name")) {
                            dVar.m = w3Var.H();
                        } else if (strU7.equals("version")) {
                            dVar.n = w3Var.H();
                        } else {
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap6, strU7);
                        }
                    }
                    dVar.f227o = concurrentHashMap6;
                    w3Var.Z();
                    eVar.p(dVar);
                    break;
                case ep1.d /* 12 */:
                    w3Var.u0();
                    y yVar = new y();
                    ConcurrentHashMap concurrentHashMap7 = null;
                    while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU8 = w3Var.U();
                        strU8.getClass();
                        switch (strU8) {
                            case "raw_description":
                                yVar.f251o = w3Var.H();
                                break;
                            case "name":
                                yVar.m = w3Var.H();
                                break;
                            case "version":
                                yVar.n = w3Var.H();
                                break;
                            default:
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                w3Var.y(g1Var, concurrentHashMap7, strU8);
                                break;
                        }
                    }
                    yVar.p = concurrentHashMap7;
                    w3Var.Z();
                    eVar.v(yVar);
                    break;
                default:
                    Object objT0 = w3Var.t0();
                    if (objT0 != null) {
                        eVar.l(objT0, strU);
                    }
                    break;
            }
        }
        w3Var.Z();
        return eVar;
    }

    public static h d(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            byte b = 10;
            switch (strU) {
                case "timezone":
                    hVar.L = w3Var.E(g1Var);
                    break;
                case "boot_time":
                    if (w3Var.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        hVar.K = w3Var.d0(g1Var);
                        break;
                    }
                    break;
                case "simulator":
                    hVar.x = w3Var.f0();
                    break;
                case "manufacturer":
                    hVar.n = w3Var.H();
                    break;
                case "processor_count":
                    hVar.Q = w3Var.w();
                    break;
                case "orientation":
                    hVar.w = (io.sentry.protocol.g) w3Var.q0(g1Var, new a(b));
                    break;
                case "battery_temperature":
                    hVar.P = w3Var.p0();
                    break;
                case "family":
                    hVar.p = w3Var.H();
                    break;
                case "locale":
                    hVar.N = w3Var.H();
                    break;
                case "online":
                    hVar.v = w3Var.f0();
                    break;
                case "battery_level":
                    hVar.t = w3Var.p0();
                    break;
                case "model_id":
                    hVar.r = w3Var.H();
                    break;
                case "screen_density":
                    hVar.I = w3Var.p0();
                    break;
                case "screen_dpi":
                    hVar.J = w3Var.w();
                    break;
                case "free_memory":
                    hVar.z = w3Var.A();
                    break;
                case "id":
                    hVar.M = w3Var.H();
                    break;
                case "name":
                    hVar.m = w3Var.H();
                    break;
                case "low_memory":
                    hVar.B = w3Var.f0();
                    break;
                case "archs":
                    List list = (List) w3Var.t0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        hVar.s = strArr;
                        break;
                    }
                    break;
                case "brand":
                    hVar.f230o = w3Var.H();
                    break;
                case "model":
                    hVar.q = w3Var.H();
                    break;
                case "cpu_description":
                    hVar.S = w3Var.H();
                    break;
                case "processor_frequency":
                    hVar.R = w3Var.S();
                    break;
                case "connection_type":
                    hVar.O = w3Var.H();
                    break;
                case "chipset":
                    hVar.T = w3Var.H();
                    break;
                case "screen_width_pixels":
                    hVar.G = w3Var.w();
                    break;
                case "external_storage_size":
                    hVar.E = w3Var.A();
                    break;
                case "storage_size":
                    hVar.C = w3Var.A();
                    break;
                case "usable_memory":
                    hVar.A = w3Var.A();
                    break;
                case "memory_size":
                    hVar.y = w3Var.A();
                    break;
                case "charging":
                    hVar.u = w3Var.f0();
                    break;
                case "external_free_storage":
                    hVar.F = w3Var.A();
                    break;
                case "free_storage":
                    hVar.D = w3Var.A();
                    break;
                case "screen_height_pixels":
                    hVar.H = w3Var.w();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        hVar.U = concurrentHashMap;
        w3Var.Z();
        return hVar;
    }

    public static k e(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        w wVar = null;
        w wVar2 = null;
        String strH4 = null;
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "associated_event_id":
                    wVar = new w(w3Var.r());
                    break;
                case "replay_id":
                    wVar2 = new w(w3Var.r());
                    break;
                case "url":
                    strH4 = w3Var.H();
                    break;
                case "name":
                    strH3 = w3Var.H();
                    break;
                case "contact_email":
                    strH2 = w3Var.H();
                    break;
                case "message":
                    strH = w3Var.H();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    w3Var.y(g1Var, map, strU);
                    break;
            }
        }
        w3Var.Z();
        if (strH == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            g1Var.d(f6.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        k kVar = new k(strH);
        kVar.n = strH2;
        kVar.f234o = strH3;
        kVar.p = wVar;
        kVar.q = wVar2;
        kVar.r = strH4;
        kVar.s = map;
        return kVar;
    }

    public static m f(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "npot_support":
                    mVar.u = w3Var.H();
                    break;
                case "vendor_id":
                    mVar.f237o = w3Var.H();
                    break;
                case "multi_threaded_rendering":
                    mVar.s = w3Var.f0();
                    break;
                case "id":
                    mVar.n = w3Var.w();
                    break;
                case "name":
                    mVar.m = w3Var.H();
                    break;
                case "vendor_name":
                    mVar.p = w3Var.H();
                    break;
                case "version":
                    mVar.t = w3Var.H();
                    break;
                case "api_type":
                    mVar.r = w3Var.H();
                    break;
                case "memory_size":
                    mVar.q = w3Var.w();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        mVar.v = concurrentHashMap;
        w3Var.Z();
        return mVar;
    }

    public static q g(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        q qVar = new q();
        ConcurrentHashMap concurrentHashMap = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "rooted":
                    qVar.r = w3Var.f0();
                    break;
                case "raw_description":
                    qVar.f244o = w3Var.H();
                    break;
                case "name":
                    qVar.m = w3Var.H();
                    break;
                case "build":
                    qVar.p = w3Var.H();
                    break;
                case "version":
                    qVar.n = w3Var.H();
                    break;
                case "kernel_version":
                    qVar.q = w3Var.H();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        qVar.s = concurrentHashMap;
        w3Var.Z();
        return qVar;
    }

    public static IllegalStateException h(g1 g1Var, String str) {
        String strG = fx3.g("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strG);
        g1Var.d(f6.ERROR, strG, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(g1 g1Var, String str) {
        String strG = fx3.g("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strG);
        g1Var.d(f6.ERROR, strG, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(g1 g1Var, String str) {
        String strG = fx3.g("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strG);
        g1Var.d(f6.ERROR, strG, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.f2
    public final Object a(w3 w3Var, g1 g1Var) {
        Double dValueOf;
        byte b = 7;
        byte b2 = 3;
        byte b3 = 1;
        Boolean boolF0 = null;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                w3Var.u0();
                Date dateD0 = null;
                HashMap map = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU = w3Var.U();
                    strU.getClass();
                    if (strU.equals("discarded_events")) {
                        arrayList.addAll(w3Var.B0(g1Var, new a(b3)));
                    } else if (strU.equals("timestamp")) {
                        dateD0 = w3Var.d0(g1Var);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        w3Var.y(g1Var, map, strU);
                    }
                }
                w3Var.Z();
                if (dateD0 == null) {
                    throw h(g1Var, "timestamp");
                }
                if (arrayList.isEmpty()) {
                    throw h(g1Var, "discarded_events");
                }
                b bVar = new b(dateD0, arrayList);
                bVar.f189o = map;
                return bVar;
            case 1:
                w3Var.u0();
                String strH = null;
                String strH2 = null;
                Long lA = null;
                HashMap map2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    switch (strU2) {
                        case "quantity":
                            lA = w3Var.A();
                            break;
                        case "reason":
                            strH = w3Var.H();
                            break;
                        case "category":
                            strH2 = w3Var.H();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            w3Var.y(g1Var, map2, strU2);
                            break;
                    }
                }
                w3Var.Z();
                if (strH == null) {
                    throw i(g1Var, "reason");
                }
                if (strH2 == null) {
                    throw i(g1Var, "category");
                }
                if (lA == null) {
                    throw i(g1Var, "quantity");
                }
                e eVar = new e(strH, strH2, lA);
                eVar.p = map2;
                return eVar;
            case 2:
                w3Var.u0();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU3 = w3Var.U();
                    strU3.getClass();
                    if (strU3.equals("values")) {
                        ArrayList arrayListB0 = w3Var.B0(g1Var, new a(b2));
                        if (arrayListB0 != null) {
                            aVar.f221o = arrayListB0;
                        }
                    } else if (strU3.equals("unit")) {
                        String strH3 = w3Var.H();
                        if (strH3 != null) {
                            aVar.n = strH3;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap, strU3);
                    }
                }
                aVar.m = concurrentHashMap;
                w3Var.Z();
                return aVar;
            case 3:
                w3Var.u0();
                io.sentry.profilemeasurements.b bVar2 = new io.sentry.profilemeasurements.b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU4 = w3Var.U();
                    strU4.getClass();
                    switch (strU4) {
                        case "elapsed_since_start_ns":
                            String strH4 = w3Var.H();
                            if (strH4 != null) {
                                bVar2.f222o = strH4;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "timestamp":
                            try {
                                dValueOf = w3Var.S();
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateD1 = w3Var.d0(g1Var);
                                dValueOf = dateD1 != null ? Double.valueOf(dateD1.getTime() / 1000.0d) : null;
                            }
                            if (dValueOf != null) {
                                bVar2.n = dValueOf.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "value":
                            Double dS = w3Var.S();
                            if (dS != null) {
                                bVar2.p = dS.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap2, strU4);
                            break;
                    }
                }
                bVar2.m = concurrentHashMap2;
                w3Var.Z();
                return bVar2;
            case 4:
                return b(w3Var, g1Var);
            case 5:
                w3Var.u0();
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU5 = w3Var.U();
                    strU5.getClass();
                    if (strU5.equals("name")) {
                        dVar.m = w3Var.H();
                    } else if (strU5.equals("version")) {
                        dVar.n = w3Var.H();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap3, strU5);
                    }
                }
                dVar.f227o = concurrentHashMap3;
                w3Var.Z();
                return dVar;
            case 6:
                return c(w3Var, g1Var);
            case 7:
                DebugImage debugImage = new DebugImage();
                w3Var.u0();
                AbstractMap map3 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU6 = w3Var.U();
                    strU6.getClass();
                    switch (strU6) {
                        case "debug_file":
                            debugImage.debugFile = w3Var.H();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = w3Var.H();
                            break;
                        case "image_size":
                            debugImage.imageSize = w3Var.A();
                            break;
                        case "code_file":
                            debugImage.codeFile = w3Var.H();
                            break;
                        case "arch":
                            debugImage.arch = w3Var.H();
                            break;
                        case "type":
                            debugImage.type = w3Var.H();
                            break;
                        case "uuid":
                            debugImage.uuid = w3Var.H();
                            break;
                        case "debug_id":
                            debugImage.debugId = w3Var.H();
                            break;
                        case "code_id":
                            debugImage.codeId = w3Var.H();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            w3Var.y(g1Var, map3, strU6);
                            break;
                    }
                }
                w3Var.Z();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                w3Var.u0();
                HashMap map4 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU7 = w3Var.U();
                    strU7.getClass();
                    if (strU7.equals("images")) {
                        fVar.n = w3Var.B0(g1Var, new a(b));
                    } else if (strU7.equals("sdk_info")) {
                        fVar.m = (t) w3Var.q0(g1Var, new a((byte) 20));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        w3Var.y(g1Var, map4, strU7);
                    }
                }
                w3Var.Z();
                fVar.f229o = map4;
                return fVar;
            case ep1.b /* 9 */:
                return d(w3Var, g1Var);
            case ep1.c /* 10 */:
                return io.sentry.protocol.g.valueOf(w3Var.r().toUpperCase(Locale.ROOT));
            case 11:
                w3Var.u0();
                String strH5 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU8 = w3Var.U();
                    strU8.getClass();
                    if (strU8.equals("result")) {
                        boolF0 = w3Var.f0();
                    } else if (strU8.equals("flag")) {
                        strH5 = w3Var.H();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap4, strU8);
                    }
                }
                if (strH5 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    g1Var.d(f6.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolF0 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    g1Var.d(f6.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                i iVar = new i(strH5, boolF0.booleanValue());
                iVar.f231o = concurrentHashMap4;
                w3Var.Z();
                return iVar;
            case ep1.d /* 12 */:
                return e(w3Var, g1Var);
            case 13:
                w3Var.u0();
                l lVar = new l();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU9 = w3Var.U();
                    strU9.getClass();
                    switch (strU9) {
                        case "region":
                            lVar.f236o = w3Var.H();
                            break;
                        case "city":
                            lVar.m = w3Var.H();
                            break;
                        case "country_code":
                            lVar.n = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap5, strU9);
                            break;
                    }
                }
                lVar.p = concurrentHashMap5;
                w3Var.Z();
                return lVar;
            case 14:
                return f(w3Var, g1Var);
            case 15:
                w3Var.u0();
                Number number = null;
                String strH6 = null;
                AbstractMap concurrentHashMap6 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU10 = w3Var.U();
                    strU10.getClass();
                    if (strU10.equals("unit")) {
                        strH6 = w3Var.H();
                    } else if (strU10.equals("value")) {
                        number = (Number) w3Var.t0();
                    } else {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap6, strU10);
                    }
                }
                w3Var.Z();
                if (number != null) {
                    n nVar = new n(number, strH6);
                    nVar.p = concurrentHashMap6;
                    return nVar;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
                g1Var.d(f6.ERROR, "Missing required field \"value\"", illegalStateException3);
                throw illegalStateException3;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                o oVar = new o();
                w3Var.u0();
                HashMap map5 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU11 = w3Var.U();
                    strU11.getClass();
                    switch (strU11) {
                        case "description":
                            oVar.n = w3Var.H();
                            break;
                        case "exception_id":
                            oVar.t = w3Var.w();
                            break;
                        case "data":
                            oVar.r = io.sentry.util.b.r((Map) w3Var.t0());
                            break;
                        case "meta":
                            oVar.q = io.sentry.util.b.r((Map) w3Var.t0());
                            break;
                        case "type":
                            oVar.m = w3Var.H();
                            break;
                        case "handled":
                            oVar.p = w3Var.f0();
                            break;
                        case "synthetic":
                            oVar.s = w3Var.f0();
                            break;
                        case "is_exception_group":
                            oVar.v = w3Var.f0();
                            break;
                        case "help_link":
                            oVar.f239o = w3Var.H();
                            break;
                        case "parent_id":
                            oVar.u = w3Var.w();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            w3Var.y(g1Var, map5, strU11);
                            break;
                    }
                }
                w3Var.Z();
                oVar.w = map5;
                return oVar;
            case 17:
                w3Var.u0();
                p pVar = new p();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU12 = w3Var.U();
                    strU12.getClass();
                    switch (strU12) {
                        case "params":
                            List list = (List) w3Var.t0();
                            if (list != null) {
                                pVar.f240o = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            pVar.n = w3Var.H();
                            break;
                        case "formatted":
                            pVar.m = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap7, strU12);
                            break;
                    }
                }
                pVar.p = concurrentHashMap7;
                w3Var.Z();
                return pVar;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return g(w3Var, g1Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                w3Var.u0();
                r rVar = new r();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU13 = w3Var.U();
                    strU13.getClass();
                    switch (strU13) {
                        case "fragment":
                            rVar.v = w3Var.H();
                            break;
                        case "method":
                            rVar.n = w3Var.H();
                            break;
                        case "env":
                            Map map6 = (Map) w3Var.t0();
                            if (map6 != null) {
                                rVar.s = io.sentry.util.b.r(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            rVar.m = w3Var.H();
                            break;
                        case "data":
                            rVar.p = w3Var.t0();
                            break;
                        case "other":
                            Map map7 = (Map) w3Var.t0();
                            if (map7 != null) {
                                rVar.u = io.sentry.util.b.r(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) w3Var.t0();
                            if (map8 != null) {
                                rVar.r = io.sentry.util.b.r(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            rVar.q = w3Var.H();
                            break;
                        case "body_size":
                            rVar.t = w3Var.A();
                            break;
                        case "query_string":
                            rVar.f245o = w3Var.H();
                            break;
                        case "api_target":
                            rVar.w = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap8, strU13);
                            break;
                    }
                }
                rVar.x = concurrentHashMap8;
                w3Var.Z();
                return rVar;
            case 20:
                t tVar = new t();
                w3Var.u0();
                HashMap map9 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU14 = w3Var.U();
                    strU14.getClass();
                    switch (strU14) {
                        case "sdk_name":
                            tVar.m = w3Var.H();
                            break;
                        case "version_patchlevel":
                            tVar.p = w3Var.w();
                            break;
                        case "version_major":
                            tVar.n = w3Var.w();
                            break;
                        case "version_minor":
                            tVar.f247o = w3Var.w();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            w3Var.y(g1Var, map9, strU14);
                            break;
                    }
                }
                w3Var.Z();
                tVar.q = map9;
                return tVar;
            case 21:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                w3Var.u0();
                String strR = null;
                String strR2 = null;
                HashMap map10 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU15 = w3Var.U();
                    strU15.getClass();
                    switch (strU15) {
                        case "name":
                            strR = w3Var.r();
                            break;
                        case "version":
                            strR2 = w3Var.r();
                            break;
                        case "packages":
                            ArrayList arrayListB1 = w3Var.B0(g1Var, new a((byte) 24));
                            if (arrayListB1 != null) {
                                arrayList2.addAll(arrayListB1);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) w3Var.t0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            w3Var.y(g1Var, map10, strU15);
                            break;
                    }
                }
                w3Var.Z();
                if (strR == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    g1Var.d(f6.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strR2 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    g1Var.d(f6.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
                u uVar = new u(strR, strR2);
                uVar.f248o = new CopyOnWriteArraySet(arrayList2);
                uVar.p = new CopyOnWriteArraySet(arrayList3);
                uVar.q = map10;
                return uVar;
            case 22:
                v vVar = new v();
                w3Var.u0();
                HashMap map11 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU16 = w3Var.U();
                    strU16.getClass();
                    switch (strU16) {
                        case "thread_id":
                            vVar.p = w3Var.A();
                            break;
                        case "module":
                            vVar.f249o = w3Var.H();
                            break;
                        case "type":
                            vVar.m = w3Var.H();
                            break;
                        case "value":
                            vVar.n = w3Var.H();
                            break;
                        case "mechanism":
                            vVar.r = (o) w3Var.q0(g1Var, new a((byte) 16));
                            break;
                        case "stacktrace":
                            vVar.q = (c0) w3Var.q0(g1Var, new a((byte) 28));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            w3Var.y(g1Var, map11, strU16);
                            break;
                    }
                }
                w3Var.Z();
                vVar.s = map11;
                return vVar;
            case 23:
                return new w(w3Var.r());
            case 24:
                w3Var.u0();
                String strR3 = null;
                String strR4 = null;
                HashMap map12 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU17 = w3Var.U();
                    strU17.getClass();
                    if (strU17.equals("name")) {
                        strR3 = w3Var.r();
                    } else if (strU17.equals("version")) {
                        strR4 = w3Var.r();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        w3Var.y(g1Var, map12, strU17);
                    }
                }
                w3Var.Z();
                if (strR3 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
                    g1Var.d(f6.ERROR, "Missing required field \"name\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (strR4 != null) {
                    x xVar = new x(strR3, strR4);
                    xVar.f250o = map12;
                    return xVar;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
                g1Var.d(f6.ERROR, "Missing required field \"version\"", illegalStateException7);
                throw illegalStateException7;
            case 25:
                w3Var.u0();
                y yVar = new y();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU18 = w3Var.U();
                    strU18.getClass();
                    switch (strU18) {
                        case "raw_description":
                            yVar.f251o = w3Var.H();
                            break;
                        case "name":
                            yVar.m = w3Var.H();
                            break;
                        case "version":
                            yVar.n = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap9, strU18);
                            break;
                    }
                }
                yVar.p = concurrentHashMap9;
                w3Var.Z();
                return yVar;
            case 26:
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap10 = null;
                Map map13 = null;
                HashMap map14 = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                w wVar = null;
                y7 y7Var = null;
                y7 y7Var2 = null;
                String strH7 = null;
                String strH8 = null;
                a8 a8Var = null;
                String strH9 = null;
                Map map15 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU19 = w3Var.U();
                    strU19.getClass();
                    switch (strU19) {
                        case "span_id":
                            y7Var = new y7(w3Var.r());
                            break;
                        case "parent_span_id":
                            y7Var2 = (y7) w3Var.q0(g1Var, new g((byte) 23));
                            break;
                        case "description":
                            strH8 = w3Var.H();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = w3Var.S();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateD2 = w3Var.d0(g1Var);
                                dValueOf2 = dateD2 == null ? null : Double.valueOf(dateD2.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strH9 = w3Var.H();
                            break;
                        case "status":
                            a8Var = (a8) w3Var.q0(g1Var, new g((byte) 24));
                            break;
                        case "measurements":
                            map14 = w3Var.L(g1Var, new a((byte) 15));
                            break;
                        case "op":
                            strH7 = w3Var.H();
                            break;
                        case "data":
                            map15 = (Map) w3Var.t0();
                            break;
                        case "tags":
                            map13 = (Map) w3Var.t0();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = w3Var.S();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateD3 = w3Var.d0(g1Var);
                                dValueOf3 = dateD3 == null ? null : Double.valueOf(dateD3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            wVar = new w(w3Var.r());
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap10, strU19);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw j(g1Var, "start_timestamp");
                }
                if (wVar == null) {
                    throw j(g1Var, "trace_id");
                }
                if (y7Var == null) {
                    throw j(g1Var, "span_id");
                }
                if (strH7 == null) {
                    throw j(g1Var, "op");
                }
                if (map13 == null) {
                    map13 = new HashMap();
                }
                Map map16 = map13;
                if (map14 == null) {
                    map14 = new HashMap();
                }
                z zVar = new z(dValueOf2, dValueOf3, wVar, y7Var, y7Var2, strH7, strH8, a8Var, strH9, map16, map14, map15);
                zVar.y = concurrentHashMap10;
                w3Var.Z();
                return zVar;
            case 27:
                a0 a0Var = new a0();
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU20 = w3Var.U();
                    strU20.getClass();
                    switch (strU20) {
                        case "post_context":
                            a0Var.n = (List) w3Var.t0();
                            break;
                        case "image_addr":
                            a0Var.A = w3Var.H();
                            break;
                        case "in_app":
                            a0Var.w = w3Var.f0();
                            break;
                        case "raw_function":
                            a0Var.G = w3Var.H();
                            break;
                        case "lineno":
                            a0Var.s = w3Var.w();
                            break;
                        case "module":
                            a0Var.r = w3Var.H();
                            break;
                        case "native":
                            a0Var.y = w3Var.f0();
                            break;
                        case "symbol":
                            a0Var.E = w3Var.H();
                            break;
                        case "package":
                            a0Var.x = w3Var.H();
                            break;
                        case "filename":
                            a0Var.p = w3Var.H();
                            break;
                        case "symbol_addr":
                            a0Var.B = w3Var.H();
                            break;
                        case "lock":
                            a0Var.H = (g6) w3Var.q0(g1Var, new g((byte) 12));
                            break;
                        case "vars":
                            a0Var.f224o = (Map) w3Var.t0();
                            break;
                        case "colno":
                            a0Var.t = w3Var.w();
                            break;
                        case "instruction_addr":
                            a0Var.C = w3Var.H();
                            break;
                        case "pre_context":
                            a0Var.m = (List) w3Var.t0();
                            break;
                        case "addr_mode":
                            a0Var.D = w3Var.H();
                            break;
                        case "context_line":
                            a0Var.v = w3Var.H();
                            break;
                        case "function":
                            a0Var.q = w3Var.H();
                            break;
                        case "abs_path":
                            a0Var.u = w3Var.H();
                            break;
                        case "platform":
                            a0Var.z = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap11, strU20);
                            break;
                    }
                }
                a0Var.F = concurrentHashMap11;
                w3Var.Z();
                return a0Var;
            case 28:
                c0 c0Var = new c0();
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU21 = w3Var.U();
                    strU21.getClass();
                    switch (strU21) {
                        case "frames":
                            c0Var.m = w3Var.B0(g1Var, new a((byte) 27));
                            break;
                        case "instruction_addr_adjustment":
                            c0Var.p = (b0) w3Var.q0(g1Var, new a((byte) 29));
                            break;
                        case "registers":
                            c0Var.n = io.sentry.util.b.r((Map) w3Var.t0());
                            break;
                        case "snapshot":
                            c0Var.f226o = w3Var.f0();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap12, strU21);
                            break;
                    }
                }
                c0Var.q = concurrentHashMap12;
                w3Var.Z();
                return c0Var;
            default:
                return b0.valueOf(w3Var.r().toUpperCase(Locale.ROOT));
        }
    }
}
