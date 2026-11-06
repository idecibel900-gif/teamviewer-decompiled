package io.sentry.protocol;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.f2;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.i6;
import io.sentry.w3;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements f2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ d0(byte b) {
        this.a = b;
    }

    public static io.sentry.rrweb.a b(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            if (strU.equals("data")) {
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    if (strU2.equals("payload")) {
                        w3Var.u0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strU3 = w3Var.U();
                            strU3.getClass();
                            switch (strU3) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r((Map) w3Var.t0());
                                    if (concurrentHashMapR == null) {
                                        break;
                                    } else {
                                        aVar.u = concurrentHashMapR;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.q = w3Var.H();
                                    break;
                                case "category":
                                    aVar.r = w3Var.H();
                                    break;
                                case "timestamp":
                                    aVar.p = w3Var.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        aVar.t = f6.valueOf(w3Var.r().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        g1Var.b(f6.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.s = w3Var.H();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    w3Var.y(g1Var, concurrentHashMap2, strU3);
                                    break;
                            }
                        }
                        aVar.w = concurrentHashMap2;
                        w3Var.Z();
                    } else if (strU2.equals("tag")) {
                        String strH = w3Var.H();
                        if (strH == null) {
                            strH = "";
                        }
                        aVar.f255o = strH;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap, strU2);
                    }
                }
                aVar.x = concurrentHashMap;
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0((byte) 10));
                io.sentry.util.b.v(cVar, "");
                aVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                aVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        aVar.v = map;
        w3Var.Z();
        return aVar;
    }

    public static io.sentry.rrweb.g c(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            if (strU.equals("data")) {
                w3Var.u0();
                HashMap map2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    switch (strU2) {
                        case "x":
                            gVar.r = w3Var.nextFloat();
                            break;
                        case "y":
                            gVar.s = w3Var.nextFloat();
                            break;
                        case "id":
                            gVar.q = w3Var.nextInt();
                            break;
                        case "type":
                            gVar.p = (io.sentry.rrweb.f) w3Var.q0(g1Var, new d0((byte) 13));
                            break;
                        case "pointerType":
                            gVar.t = w3Var.nextInt();
                            break;
                        case "pointerId":
                            gVar.u = w3Var.nextInt();
                            break;
                        default:
                            if (!strU2.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                w3Var.y(g1Var, map2, strU2);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) w3Var.q0(g1Var, new d0((byte) 11));
                                io.sentry.util.b.v(dVar, "");
                                gVar.f256o = dVar;
                                break;
                            }
                            break;
                    }
                }
                gVar.w = map2;
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0((byte) 10));
                io.sentry.util.b.v(cVar, "");
                gVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                gVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        gVar.v = map;
        w3Var.Z();
        return gVar;
    }

    public static io.sentry.rrweb.i d(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            if (strU.equals("data")) {
                w3Var.u0();
                HashMap map2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    if (strU2.equals("pointerId")) {
                        iVar.p = w3Var.nextInt();
                    } else if (strU2.equals("positions")) {
                        iVar.q = w3Var.B0(g1Var, new d0((byte) 15));
                    } else if (strU2.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) w3Var.q0(g1Var, new d0((byte) 11));
                        io.sentry.util.b.v(dVar, "");
                        iVar.f256o = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        w3Var.y(g1Var, map2, strU2);
                    }
                }
                iVar.s = map2;
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0((byte) 10));
                io.sentry.util.b.v(cVar, "");
                iVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                iVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        iVar.r = map;
        w3Var.Z();
        return iVar;
    }

    public static io.sentry.rrweb.j e(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            if (strU.equals("data")) {
                w3Var.u0();
                AbstractMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    switch (strU2) {
                        case "height":
                            Integer numW = w3Var.w();
                            jVar.p = numW != null ? numW.intValue() : 0;
                            break;
                        case "href":
                            String strH = w3Var.H();
                            if (strH == null) {
                                strH = "";
                            }
                            jVar.f258o = strH;
                            break;
                        case "width":
                            Integer numW2 = w3Var.w();
                            jVar.q = numW2 != null ? numW2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap, strU2);
                            break;
                    }
                }
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0((byte) 10));
                io.sentry.util.b.v(cVar, "");
                jVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                jVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        jVar.r = map;
        w3Var.Z();
        return jVar;
    }

    public static io.sentry.rrweb.l f(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            if (strU.equals("data")) {
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    if (strU2.equals("payload")) {
                        w3Var.u0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strU3 = w3Var.U();
                            strU3.getClass();
                            switch (strU3) {
                                case "description":
                                    lVar.q = w3Var.H();
                                    break;
                                case "endTimestamp":
                                    lVar.s = w3Var.nextDouble();
                                    break;
                                case "startTimestamp":
                                    lVar.r = w3Var.nextDouble();
                                    break;
                                case "op":
                                    lVar.p = w3Var.H();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r((Map) w3Var.t0());
                                    if (concurrentHashMapR == null) {
                                        break;
                                    } else {
                                        lVar.t = concurrentHashMapR;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    w3Var.y(g1Var, concurrentHashMap2, strU3);
                                    break;
                            }
                        }
                        lVar.v = concurrentHashMap2;
                        w3Var.Z();
                    } else if (strU2.equals("tag")) {
                        String strH = w3Var.H();
                        if (strH == null) {
                            strH = "";
                        }
                        lVar.f260o = strH;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap, strU2);
                    }
                }
                lVar.w = concurrentHashMap;
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0((byte) 10));
                io.sentry.util.b.v(cVar, "");
                lVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                lVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        lVar.u = map;
        w3Var.Z();
        return lVar;
    }

    public static io.sentry.rrweb.m g(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            byte b = 10;
            if (strU.equals("data")) {
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    if (strU2.equals("payload")) {
                        w3Var.u0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strU3 = w3Var.U();
                            strU3.getClass();
                            switch (strU3) {
                                case "duration":
                                    mVar.r = w3Var.nextLong();
                                    break;
                                case "segmentId":
                                    mVar.p = w3Var.nextInt();
                                    break;
                                case "height":
                                    Integer numW = w3Var.w();
                                    mVar.u = numW != null ? numW.intValue() : 0;
                                    break;
                                case "container":
                                    String strH = w3Var.H();
                                    if (strH == null) {
                                        strH = "";
                                    }
                                    mVar.t = strH;
                                    break;
                                case "frameCount":
                                    Integer numW2 = w3Var.w();
                                    mVar.w = numW2 != null ? numW2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numW3 = w3Var.w();
                                    mVar.A = numW3 != null ? numW3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numW4 = w3Var.w();
                                    mVar.z = numW4 != null ? numW4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lA = w3Var.A();
                                    mVar.q = lA == null ? 0L : lA.longValue();
                                    break;
                                case "width":
                                    Integer numW5 = w3Var.w();
                                    mVar.v = numW5 != null ? numW5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numW6 = w3Var.w();
                                    mVar.y = numW6 != null ? numW6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strH2 = w3Var.H();
                                    if (strH2 == null) {
                                        strH2 = "";
                                    }
                                    mVar.s = strH2;
                                    break;
                                case "frameRateType":
                                    String strH3 = w3Var.H();
                                    if (strH3 == null) {
                                        strH3 = "";
                                    }
                                    mVar.x = strH3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    w3Var.y(g1Var, concurrentHashMap2, strU3);
                                    break;
                            }
                        }
                        mVar.C = concurrentHashMap2;
                        w3Var.Z();
                    } else if (strU2.equals("tag")) {
                        String strH4 = w3Var.H();
                        if (strH4 == null) {
                            strH4 = "";
                        }
                        mVar.f261o = strH4;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w3Var.y(g1Var, concurrentHashMap, strU2);
                    }
                }
                mVar.D = concurrentHashMap;
                w3Var.Z();
            } else if (strU.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) w3Var.q0(g1Var, new d0(b));
                io.sentry.util.b.v(cVar, "");
                mVar.m = cVar;
            } else if (strU.equals("timestamp")) {
                mVar.n = w3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                w3Var.y(g1Var, map, strU);
            }
        }
        mVar.B = map;
        w3Var.Z();
        return mVar;
    }

    @Override // io.sentry.f2
    public final Object a(w3 w3Var, g1 g1Var) {
        byte b = 7;
        byte b2 = 8;
        byte b3 = 6;
        switch (this.a) {
            case 0:
                e0 e0Var = new e0();
                w3Var.u0();
                ConcurrentHashMap concurrentHashMap = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU = w3Var.U();
                    strU.getClass();
                    switch (strU) {
                        case "daemon":
                            e0Var.s = w3Var.f0();
                            break;
                        case "priority":
                            e0Var.n = w3Var.w();
                            break;
                        case "held_locks":
                            HashMap mapL = w3Var.L(g1Var, new io.sentry.g((byte) 12));
                            if (mapL != null) {
                                e0Var.v = new HashMap(mapL);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            e0Var.m = w3Var.A();
                            break;
                        case "main":
                            e0Var.t = w3Var.f0();
                            break;
                        case "name":
                            e0Var.f228o = w3Var.H();
                            break;
                        case "state":
                            e0Var.p = w3Var.H();
                            break;
                        case "crashed":
                            e0Var.q = w3Var.f0();
                            break;
                        case "current":
                            e0Var.r = w3Var.f0();
                            break;
                        case "stacktrace":
                            e0Var.u = (c0) w3Var.q0(g1Var, new io.sentry.clientreport.a((byte) 28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap, strU);
                            break;
                    }
                }
                e0Var.w = concurrentHashMap;
                w3Var.Z();
                return e0Var;
            case 1:
                w3Var.u0();
                f0 f0Var = new f0(new ArrayList(), new HashMap(), new i6(h0.CUSTOM.apiName(), (byte) 1));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var.U();
                    strU2.getClass();
                    switch (strU2) {
                        case "start_timestamp":
                            try {
                                Double dS = w3Var.S();
                                if (dS != null) {
                                    f0Var.C = dS;
                                }
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateD0 = w3Var.d0(g1Var);
                                if (dateD0 != null) {
                                    f0Var.C = Double.valueOf(dateD0.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapL2 = w3Var.L(g1Var, new io.sentry.clientreport.a((byte) 15));
                            if (mapL2 != null) {
                                f0Var.F.putAll(mapL2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            w3Var.r();
                            break;
                        case "timestamp":
                            try {
                                Double dS2 = w3Var.S();
                                if (dS2 != null) {
                                    f0Var.D = dS2;
                                }
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateD1 = w3Var.d0(g1Var);
                                if (dateD1 != null) {
                                    f0Var.D = Double.valueOf(dateD1.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListB0 = w3Var.B0(g1Var, new io.sentry.clientreport.a((byte) 26));
                            if (arrayListB0 != null) {
                                f0Var.E.addAll(arrayListB0);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            w3Var.u0();
                            String strH = null;
                            AbstractMap concurrentHashMap3 = null;
                            while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strU3 = w3Var.U();
                                strU3.getClass();
                                if (strU3.equals("source")) {
                                    strH = w3Var.H();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    w3Var.y(g1Var, concurrentHashMap3, strU3);
                                }
                            }
                            i6 i6Var = new i6(strH, (byte) 1);
                            i6Var.f203o = concurrentHashMap3;
                            w3Var.Z();
                            f0Var.G = i6Var;
                            break;
                        case "transaction":
                            f0Var.B = w3Var.H();
                            break;
                        default:
                            if (io.sentry.config.a.i(f0Var, strU2, w3Var, g1Var)) {
                                break;
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                w3Var.y(g1Var, concurrentHashMap2, strU2);
                                break;
                            }
                            break;
                    }
                }
                f0Var.H = concurrentHashMap2;
                w3Var.Z();
                return f0Var;
            case 2:
                w3Var.u0();
                i0 i0Var = new i0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU4 = w3Var.U();
                    strU4.getClass();
                    switch (strU4) {
                        case "username":
                            i0Var.f232o = w3Var.H();
                            break;
                        case "id":
                            i0Var.n = w3Var.H();
                            break;
                        case "geo":
                            w3Var.u0();
                            l lVar = new l();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strU5 = w3Var.U();
                                strU5.getClass();
                                switch (strU5) {
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
                                        w3Var.y(g1Var, concurrentHashMap5, strU5);
                                        break;
                                }
                            }
                            lVar.p = concurrentHashMap5;
                            w3Var.Z();
                            i0Var.r = lVar;
                            break;
                        case "data":
                            i0Var.s = io.sentry.util.b.r((Map) w3Var.t0());
                            break;
                        case "name":
                            i0Var.q = w3Var.H();
                            break;
                        case "email":
                            i0Var.m = w3Var.H();
                            break;
                        case "ip_address":
                            i0Var.p = w3Var.H();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap4, strU4);
                            break;
                    }
                }
                i0Var.t = concurrentHashMap4;
                w3Var.Z();
                return i0Var;
            case 3:
                w3Var.u0();
                String strH2 = null;
                ArrayList arrayListB1 = null;
                HashMap map = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU6 = w3Var.U();
                    strU6.getClass();
                    if (strU6.equals("rendering_system")) {
                        strH2 = w3Var.H();
                    } else if (strU6.equals("windows")) {
                        arrayListB1 = w3Var.B0(g1Var, new d0((byte) 4));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        w3Var.y(g1Var, map, strU6);
                    }
                }
                w3Var.Z();
                j0 j0Var = new j0(strH2, arrayListB1);
                j0Var.f233o = map;
                return j0Var;
            case 4:
                k0 k0Var = new k0();
                w3Var.u0();
                HashMap map2 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU7 = w3Var.U();
                    strU7.getClass();
                    switch (strU7) {
                        case "rendering_system":
                            k0Var.m = w3Var.H();
                            break;
                        case "identifier":
                            k0Var.f235o = w3Var.H();
                            break;
                        case "height":
                            k0Var.r = w3Var.S();
                            break;
                        case "x":
                            k0Var.s = w3Var.S();
                            break;
                        case "y":
                            k0Var.t = w3Var.S();
                            break;
                        case "tag":
                            k0Var.p = w3Var.H();
                            break;
                        case "type":
                            k0Var.n = w3Var.H();
                            break;
                        case "alpha":
                            k0Var.v = w3Var.S();
                            break;
                        case "width":
                            k0Var.q = w3Var.S();
                            break;
                        case "children":
                            k0Var.w = w3Var.B0(g1Var, this);
                            break;
                        case "visibility":
                            k0Var.u = w3Var.H();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            w3Var.y(g1Var, map2, strU7);
                            break;
                    }
                }
                w3Var.Z();
                k0Var.x = map2;
                return k0Var;
            case 5:
                w3Var.u0();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU8 = w3Var.U();
                    strU8.getClass();
                    switch (strU8) {
                        case "frames":
                            ArrayList arrayListB2 = w3Var.B0(g1Var, new io.sentry.clientreport.a((byte) 27));
                            if (arrayListB2 != null) {
                                aVar.f241o = arrayListB2;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) w3Var.q0(g1Var, new d0(b3));
                            if (list != null) {
                                aVar.n = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListB3 = w3Var.B0(g1Var, new d0(b));
                            if (arrayListB3 != null) {
                                aVar.m = arrayListB3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapL3 = w3Var.L(g1Var, new d0(b2));
                            if (mapL3 != null) {
                                aVar.p = mapL3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            w3Var.y(g1Var, concurrentHashMap6, strU8);
                            break;
                    }
                }
                aVar.q = concurrentHashMap6;
                w3Var.Z();
                return aVar;
            case 6:
                ArrayList arrayList = new ArrayList();
                w3Var.D0();
                while (w3Var.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    w3Var.D0();
                    while (w3Var.hasNext()) {
                        arrayList2.add(Integer.valueOf(w3Var.nextInt()));
                    }
                    w3Var.A0();
                    arrayList.add(arrayList2);
                }
                w3Var.A0();
                return arrayList;
            case 7:
                w3Var.u0();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                AbstractMap map3 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU9 = w3Var.U();
                    strU9.getClass();
                    switch (strU9) {
                        case "thread_id":
                            bVar.f242o = w3Var.H();
                            break;
                        case "timestamp":
                            bVar.m = w3Var.nextDouble();
                            break;
                        case "stack_id":
                            bVar.n = w3Var.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            w3Var.y(g1Var, map3, strU9);
                            break;
                    }
                }
                bVar.p = map3;
                w3Var.Z();
                return bVar;
            case 8:
                w3Var.u0();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap map4 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU10 = w3Var.U();
                    strU10.getClass();
                    if (strU10.equals("priority")) {
                        cVar.n = w3Var.nextInt();
                    } else if (strU10.equals("name")) {
                        cVar.m = w3Var.H();
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        w3Var.y(g1Var, map4, strU10);
                    }
                }
                cVar.f243o = map4;
                w3Var.Z();
                return cVar;
            case ep1.b /* 9 */:
                return b(w3Var, g1Var);
            case ep1.c /* 10 */:
                return io.sentry.rrweb.c.values()[w3Var.nextInt()];
            case 11:
                return io.sentry.rrweb.d.values()[w3Var.nextInt()];
            case ep1.d /* 12 */:
                return c(w3Var, g1Var);
            case 13:
                return io.sentry.rrweb.f.values()[w3Var.nextInt()];
            case 14:
                return d(w3Var, g1Var);
            case 15:
                w3Var.u0();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap map5 = null;
                while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU11 = w3Var.U();
                    strU11.getClass();
                    switch (strU11) {
                        case "x":
                            hVar.n = w3Var.nextFloat();
                            break;
                        case "y":
                            hVar.f257o = w3Var.nextFloat();
                            break;
                        case "id":
                            hVar.m = w3Var.nextInt();
                            break;
                        case "timeOffset":
                            hVar.p = w3Var.nextLong();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            w3Var.y(g1Var, map5, strU11);
                            break;
                    }
                }
                hVar.q = map5;
                w3Var.Z();
                return hVar;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return e(w3Var, g1Var);
            case 17:
                return f(w3Var, g1Var);
            default:
                return g(w3Var, g1Var);
        }
    }
}
