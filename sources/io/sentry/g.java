package io.sentry;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.ep1;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ g(byte b) {
        this.a = b;
    }

    public static e5 b(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        e5 e5Var = new e5();
        e5Var.f191o = false;
        ConcurrentHashMap concurrentHashMap = null;
        e5Var.p = null;
        e5Var.m = false;
        e5Var.n = null;
        e5Var.u = false;
        e5Var.q = null;
        e5Var.r = false;
        e5Var.s = false;
        e5Var.y = e4.MANUAL;
        e5Var.t = 0;
        e5Var.v = true;
        e5Var.w = false;
        e5Var.x = true;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "is_enable_app_start_profiling":
                    Boolean boolF0 = w3Var.f0();
                    if (boolF0 != null) {
                        e5Var.v = boolF0.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sampled":
                    Boolean boolF1 = w3Var.f0();
                    if (boolF1 != null) {
                        e5Var.f191o = boolF1.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_dir_path":
                    String strH = w3Var.H();
                    if (strH != null) {
                        e5Var.q = strH;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_continuous_profiling_enabled":
                    Boolean boolF2 = w3Var.f0();
                    if (boolF2 != null) {
                        e5Var.s = boolF2.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_profiling_enabled":
                    Boolean boolF3 = w3Var.f0();
                    if (boolF3 != null) {
                        e5Var.r = boolF3.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "is_start_profiler_on_app_start":
                    Boolean boolF4 = w3Var.f0();
                    if (boolF4 != null) {
                        e5Var.w = boolF4.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sampled":
                    Boolean boolF5 = w3Var.f0();
                    if (boolF5 != null) {
                        e5Var.m = boolF5.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_lifecycle":
                    String strH2 = w3Var.H();
                    if (strH2 != null) {
                        try {
                            e5Var.y = e4.valueOf(strH2);
                        } catch (IllegalArgumentException unused) {
                            g1Var.g(f6.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strH2), new Object[0]);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "continuous_profile_sampled":
                    Boolean boolF6 = w3Var.f0();
                    if (boolF6 != null) {
                        e5Var.u = boolF6.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profiling_traces_hz":
                    Integer numW = w3Var.w();
                    if (numW != null) {
                        e5Var.t = numW.intValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "trace_sample_rate":
                    Double dS = w3Var.S();
                    if (dS != null) {
                        e5Var.p = dS;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "enable_legacy_profiling":
                    Boolean boolF7 = w3Var.f0();
                    if (boolF7 != null) {
                        e5Var.x = boolF7.booleanValue();
                        break;
                    } else {
                        break;
                    }
                    break;
                case "profile_sample_rate":
                    Double dS2 = w3Var.S();
                    if (dS2 != null) {
                        e5Var.n = dS2;
                        break;
                    } else {
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        e5Var.z = concurrentHashMap;
        w3Var.Z();
        return e5Var;
    }

    public static w7 c(w3 w3Var, g1 g1Var) {
        w3Var.u0();
        io.sentry.protocol.w wVar = null;
        y7 y7Var = null;
        String strR = null;
        ConcurrentHashMap concurrentHashMap = null;
        y7 y7Var2 = null;
        String strR2 = null;
        a8 a8Var = null;
        String strR3 = null;
        ConcurrentHashMap concurrentHashMapR = null;
        Map map = null;
        while (w3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strU = w3Var.U();
            strU.getClass();
            switch (strU) {
                case "span_id":
                    y7Var = new y7(w3Var.r());
                    break;
                case "parent_span_id":
                    y7Var2 = (y7) w3Var.q0(g1Var, new g((byte) 23));
                    break;
                case "description":
                    strR2 = w3Var.r();
                    break;
                case "origin":
                    strR3 = w3Var.r();
                    break;
                case "status":
                    a8Var = (a8) w3Var.q0(g1Var, new g((byte) 24));
                    break;
                case "op":
                    strR = w3Var.r();
                    break;
                case "data":
                    map = (Map) w3Var.t0();
                    break;
                case "tags":
                    concurrentHashMapR = io.sentry.util.b.r((Map) w3Var.t0());
                    break;
                case "trace_id":
                    wVar = new io.sentry.protocol.w(w3Var.r());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w3Var.y(g1Var, concurrentHashMap, strU);
                    break;
            }
        }
        if (wVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            g1Var.d(f6.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (y7Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            g1Var.d(f6.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strR == null) {
            strR = "";
        }
        w7 w7Var = new w7(wVar, y7Var, strR, y7Var2);
        w7Var.r = strR2;
        w7Var.s = a8Var;
        w7Var.u = strR3;
        if (concurrentHashMapR != null) {
            w7Var.t = concurrentHashMapR;
        }
        if (map != null) {
            w7Var.v = map;
        }
        w7Var.w = concurrentHashMap;
        w3Var.Z();
        return w7Var;
    }

    public static IllegalStateException d(g1 g1Var, String str) {
        String strG = fx3.g("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strG);
        g1Var.d(f6.ERROR, strG, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException e(g1 g1Var, String str) {
        String strG = fx3.g("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strG);
        g1Var.d(f6.ERROR, strG, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v63 */
    @Override // io.sentry.f2
    public final Object a(w3 w3Var, g1 g1Var) {
        byte b;
        ?? r10;
        ArrayList arrayList;
        w3 w3Var2 = w3Var;
        byte b2 = 17;
        byte b3 = 11;
        byte b4 = 10;
        boolean z = true;
        byte b5 = 2;
        switch (this.a) {
            case 0:
                char c = 4;
                String strH = null;
                char c2 = 3;
                w3Var2.u0();
                Date date = new Date();
                String strH2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                String strH3 = null;
                String strH4 = null;
                f6 f6VarValueOf = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU = w3Var2.U();
                    strU.getClass();
                    switch (strU.hashCode()) {
                        case -1008619738:
                            b = strU.equals("origin") ? (byte) 0 : (byte) -1;
                            break;
                        case 3076010:
                            b = strU.equals("data") ? (byte) 1 : (byte) -1;
                            break;
                        case 3575610:
                            b = strU.equals("type") ? (byte) 2 : (byte) -1;
                            break;
                        case 50511102:
                            b = strU.equals("category") ? c2 : (byte) -1;
                            break;
                        case 55126294:
                            b = strU.equals("timestamp") ? c : (byte) -1;
                            break;
                        case 102865796:
                            b = strU.equals("level") ? (byte) 5 : (byte) -1;
                            break;
                        case 954925063:
                            b = strU.equals("message") ? (byte) 6 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            strH4 = w3Var.H();
                            continue;
                            w3Var2 = w3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapR = io.sentry.util.b.r((Map) w3Var.t0());
                            if (concurrentHashMapR == null) {
                                continue;
                            } else if (!concurrentHashMapR.isEmpty()) {
                                concurrentHashMap = concurrentHashMapR;
                            }
                            w3Var2 = w3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 2:
                            strH2 = w3Var.H();
                            continue;
                            w3Var2 = w3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 3:
                            strH3 = w3Var.H();
                            continue;
                            w3Var2 = w3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 4:
                            Date dateD0 = w3Var.d0(g1Var);
                            if (dateD0 != null) {
                                date = dateD0;
                            } else {
                                continue;
                            }
                            w3Var2 = w3Var;
                            c = 4;
                            c2 = 3;
                            break;
                        case 5:
                            try {
                                f6VarValueOf = f6.valueOf(w3Var2.r().toUpperCase(Locale.ROOT));
                            } catch (Exception e) {
                                g1Var.b(f6.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strH = w3Var2.H();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap2, strU);
                            break;
                    }
                    w3Var2 = w3Var;
                    c = 4;
                    c2 = 3;
                }
                h hVar = new h(date);
                hVar.p = strH;
                hVar.q = strH2;
                if (concurrentHashMap != null) {
                    hVar.r = concurrentHashMap;
                }
                hVar.s = strH3;
                hVar.t = strH4;
                hVar.u = f6VarValueOf;
                hVar.v = concurrentHashMap2;
                w3Var.Z();
                return hVar;
            case 1:
                ConcurrentHashMap concurrentHashMap3 = null;
                w3Var2.u0();
                io.sentry.protocol.w wVar = io.sentry.protocol.w.n;
                c4 c4Var = new c4(wVar, wVar, null, new HashMap(), Double.valueOf(0.0d), g7.empty());
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU2 = w3Var2.U();
                    strU2.getClass();
                    switch (strU2.hashCode()) {
                        case -1840434063:
                            r10 = strU2.equals("debug_meta") ? 0 : -1;
                            break;
                        case -362243017:
                            r10 = strU2.equals("measurements") ? z : -1;
                            break;
                        case -309425751:
                            r10 = strU2.equals("profile") ? 2 : -1;
                            break;
                        case -85904877:
                            r10 = strU2.equals("environment") ? 3 : -1;
                            break;
                        case 55126294:
                            r10 = strU2.equals("timestamp") ? 4 : -1;
                            break;
                        case 178573617:
                            r10 = strU2.equals("profiler_id") ? 5 : -1;
                            break;
                        case 351608024:
                            r10 = strU2.equals("version") ? 6 : -1;
                            break;
                        case 831846208:
                            r10 = strU2.equals("content_type") ? 7 : -1;
                            break;
                        case 1090594823:
                            r10 = strU2.equals("release") ? 8 : -1;
                            break;
                        case 1102774726:
                            r10 = strU2.equals("client_sdk") ? 9 : -1;
                            break;
                        case 1874684019:
                            r10 = strU2.equals("platform") ? 10 : -1;
                            break;
                        case 1953158756:
                            r10 = strU2.equals("sampled_profile") ? 11 : -1;
                            break;
                        case 2005113901:
                            r10 = strU2.equals("chunk_id") ? 12 : -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            io.sentry.protocol.f fVar = (io.sentry.protocol.f) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 8));
                            if (fVar != null) {
                                c4Var.m = fVar;
                            }
                            break;
                        case 1:
                            HashMap mapL = w3Var2.L(g1Var, new io.sentry.clientreport.a(b5));
                            if (mapL != null) {
                                c4Var.q.putAll(mapL);
                            }
                            break;
                        case 2:
                            io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) w3Var2.q0(g1Var, new io.sentry.protocol.d0((byte) 5));
                            if (aVar != null) {
                                c4Var.z = aVar;
                            }
                            break;
                        case 3:
                            String strH5 = w3Var2.H();
                            if (strH5 != null) {
                                c4Var.t = strH5;
                            }
                            break;
                        case 4:
                            Double dS = w3Var2.S();
                            if (dS != null) {
                                c4Var.v = dS.doubleValue();
                            }
                            break;
                        case 5:
                            io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            if (wVar2 != null) {
                                c4Var.n = wVar2;
                            }
                            break;
                        case 6:
                            String strH6 = w3Var2.H();
                            if (strH6 != null) {
                                c4Var.u = strH6;
                            }
                            break;
                        case 7:
                            String strH7 = w3Var2.H();
                            if (strH7 != null) {
                                c4Var.w = strH7;
                            }
                            break;
                        case 8:
                            String strH8 = w3Var2.H();
                            if (strH8 != null) {
                                c4Var.s = strH8;
                            }
                            break;
                        case ep1.b /* 9 */:
                            io.sentry.protocol.u uVar = (io.sentry.protocol.u) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 21));
                            if (uVar != null) {
                                c4Var.p = uVar;
                            }
                            break;
                        case ep1.c /* 10 */:
                            String strH9 = w3Var2.H();
                            if (strH9 != null) {
                                c4Var.r = strH9;
                            }
                            break;
                        case 11:
                            String strH10 = w3Var2.H();
                            if (strH10 != null) {
                                c4Var.y = strH10;
                            }
                            break;
                        case ep1.d /* 12 */:
                            io.sentry.protocol.w wVar3 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            if (wVar3 != null) {
                                c4Var.f183o = wVar3;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap3, strU2);
                            break;
                    }
                    z = true;
                }
                c4Var.A = concurrentHashMap3;
                w3Var2.Z();
                return c4Var;
            case 2:
                ConcurrentHashMap concurrentHashMap4 = null;
                w3Var2.u0();
                d4 d4Var = new d4(io.sentry.protocol.w.n);
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU3 = w3Var2.U();
                    strU3.getClass();
                    if (strU3.equals("profiler_id")) {
                        io.sentry.protocol.w wVar4 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                        if (wVar4 != null) {
                            d4Var.m = wVar4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        w3Var2.y(g1Var, concurrentHashMap4, strU3);
                    }
                }
                d4Var.n = concurrentHashMap4;
                w3Var2.Z();
                return d4Var;
            case 3:
                w3Var2.u0();
                File file = new File("dummy");
                Date date2 = new Date();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.w wVar5 = io.sentry.protocol.w.n;
                ConcurrentHashMap concurrentHashMap5 = null;
                f4 f4Var = new f4(file, date2, arrayList2, "", wVar5.a(), new w7(wVar5, y7.n, "op", null).m.a(), "0", 0, "", new q0((byte) 1), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU4 = w3Var2.U();
                    strU4.getClass();
                    switch (strU4) {
                        case "device_manufacturer":
                            String strH11 = w3Var2.H();
                            if (strH11 == null) {
                                break;
                            } else {
                                f4Var.q = strH11;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numW = w3Var2.w();
                            if (numW == null) {
                                break;
                            } else {
                                f4Var.f193o = numW.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strH12 = w3Var2.H();
                            if (strH12 == null) {
                                break;
                            } else {
                                f4Var.A = strH12;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strH13 = w3Var2.H();
                            if (strH13 == null) {
                                break;
                            } else {
                                f4Var.p = strH13;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strH14 = w3Var2.H();
                            if (strH14 == null) {
                                break;
                            } else {
                                f4Var.I = strH14;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strH15 = w3Var2.H();
                            if (strH15 == null) {
                                break;
                            } else {
                                f4Var.s = strH15;
                                break;
                            }
                            break;
                        case "device_model":
                            String strH16 = w3Var2.H();
                            if (strH16 == null) {
                                break;
                            } else {
                                f4Var.r = strH16;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolF0 = w3Var2.f0();
                            if (boolF0 == null) {
                                break;
                            } else {
                                f4Var.v = boolF0.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strH17 = w3Var2.H();
                            if (strH17 == null) {
                                break;
                            } else {
                                f4Var.D = strH17;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapL2 = w3Var2.L(g1Var, new io.sentry.clientreport.a(b5));
                            if (mapL2 == null) {
                                break;
                            } else {
                                f4Var.M.putAll(mapL2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strH18 = w3Var2.H();
                            if (strH18 == null) {
                                break;
                            } else {
                                f4Var.y = strH18;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) w3Var2.t0();
                            if (list == null) {
                                break;
                            } else {
                                f4Var.x = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strH19 = w3Var2.H();
                            if (strH19 == null) {
                                break;
                            } else {
                                f4Var.E = strH19;
                                break;
                            }
                            break;
                        case "version_name":
                            String strH20 = w3Var2.H();
                            if (strH20 == null) {
                                break;
                            } else {
                                f4Var.F = strH20;
                                break;
                            }
                            break;
                        case "environment":
                            String strH21 = w3Var2.H();
                            if (strH21 == null) {
                                break;
                            } else {
                                f4Var.J = strH21;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateD1 = w3Var.d0(g1Var);
                            if (dateD1 == null) {
                                break;
                            } else {
                                f4Var.L = dateD1;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strH22 = w3Var2.H();
                            if (strH22 == null) {
                                break;
                            } else {
                                f4Var.C = strH22;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strH23 = w3Var2.H();
                            if (strH23 == null) {
                                break;
                            } else {
                                f4Var.t = strH23;
                                break;
                            }
                            break;
                        case "architecture":
                            String strH24 = w3Var2.H();
                            if (strH24 == null) {
                                break;
                            } else {
                                f4Var.w = strH24;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strH25 = w3Var2.H();
                            if (strH25 == null) {
                                break;
                            } else {
                                f4Var.G = strH25;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strH26 = w3Var2.H();
                            if (strH26 == null) {
                                break;
                            } else {
                                f4Var.u = strH26;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strH27 = w3Var2.H();
                            if (strH27 == null) {
                                break;
                            } else {
                                f4Var.K = strH27;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strH28 = w3Var2.H();
                            if (strH28 == null) {
                                break;
                            } else {
                                f4Var.H = strH28;
                                break;
                            }
                            break;
                        case "platform":
                            String strH29 = w3Var2.H();
                            if (strH29 == null) {
                                break;
                            } else {
                                f4Var.z = strH29;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strH30 = w3Var2.H();
                            if (strH30 == null) {
                                break;
                            } else {
                                f4Var.N = strH30;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListB0 = w3Var2.B0(g1Var, new g((byte) 4));
                            if (arrayListB0 == null) {
                                break;
                            } else {
                                f4Var.B.addAll(arrayListB0);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap5, strU4);
                            break;
                    }
                }
                f4Var.O = concurrentHashMap5;
                w3Var2.Z();
                return f4Var;
            case 4:
                w3Var2.u0();
                g4 g4Var = new g4(t3.a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap6 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU5 = w3Var2.U();
                    strU5.getClass();
                    switch (strU5) {
                        case "relative_start_ns":
                            Long lA = w3Var2.A();
                            if (lA == null) {
                                break;
                            } else {
                                g4Var.p = lA;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lA2 = w3Var2.A();
                            if (lA2 == null) {
                                break;
                            } else {
                                g4Var.q = lA2;
                                break;
                            }
                            break;
                        case "id":
                            String strH31 = w3Var2.H();
                            if (strH31 == null) {
                                break;
                            } else {
                                g4Var.m = strH31;
                                break;
                            }
                            break;
                        case "name":
                            String strH32 = w3Var2.H();
                            if (strH32 == null) {
                                break;
                            } else {
                                g4Var.f195o = strH32;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strH33 = w3Var2.H();
                            if (strH33 == null) {
                                break;
                            } else {
                                g4Var.n = strH33;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lA3 = w3Var2.A();
                            if (lA3 == null) {
                                break;
                            } else {
                                g4Var.s = lA3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lA4 = w3Var2.A();
                            if (lA4 == null) {
                                break;
                            } else {
                                g4Var.r = lA4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap6, strU5);
                            break;
                    }
                }
                g4Var.t = concurrentHashMap6;
                w3Var2.Z();
                return g4Var;
            case 5:
                l4 l4Var = new l4();
                w3Var2.u0();
                HashMap map = null;
                Integer numW2 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU6 = w3Var2.U();
                    strU6.getClass();
                    if (strU6.equals("segment_id")) {
                        numW2 = w3Var2.w();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        w3Var2.y(g1Var, map, strU6);
                    }
                }
                w3Var2.Z();
                w3Var2.I(true);
                List list2 = (List) w3Var2.t0();
                w3Var2.I(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            io.sentry.util.j jVar = new io.sentry.util.j(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i = k4.b[cVar.ordinal()];
                                    if (i == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i2 = k4.a[dVar.ordinal()];
                                            if (i2 == 1) {
                                                arrayList.add(io.sentry.protocol.d0.c(jVar, g1Var));
                                            } else if (i2 != 2) {
                                                g1Var.g(f6.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList.add(io.sentry.protocol.d0.d(jVar, g1Var));
                                            }
                                        }
                                    } else if (i == 2) {
                                        arrayList.add(io.sentry.protocol.d0.e(jVar, g1Var));
                                    } else if (i != 3) {
                                        g1Var.g(f6.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get("tag");
                                        if (str2 != null) {
                                            switch (str2) {
                                                case "performanceSpan":
                                                    arrayList.add(io.sentry.protocol.d0.f(jVar, g1Var));
                                                    break;
                                                case "video":
                                                    arrayList.add(io.sentry.protocol.d0.g(jVar, g1Var));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(io.sentry.protocol.d0.b(jVar, g1Var));
                                                    break;
                                                default:
                                                    g1Var.g(f6.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                l4Var.m = numW2;
                l4Var.n = arrayList;
                l4Var.f210o = map;
                return l4Var;
            case 6:
                return b(w3Var, g1Var);
            case 7:
                w3Var2.u0();
                io.sentry.protocol.u uVar2 = null;
                c8 c8Var = null;
                Date dateD2 = null;
                HashMap map5 = null;
                io.sentry.protocol.w wVar6 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU7 = w3Var2.U();
                    strU7.getClass();
                    switch (strU7) {
                        case "sdk":
                            uVar2 = (io.sentry.protocol.u) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 21));
                            break;
                        case "trace":
                            c8Var = (c8) w3Var2.q0(g1Var, new g((byte) 25));
                            break;
                        case "event_id":
                            wVar6 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            break;
                        case "sent_at":
                            dateD2 = w3Var.d0(g1Var);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            w3Var2.y(g1Var, map5, strU7);
                            break;
                    }
                }
                n5 n5Var = new n5(wVar6, uVar2, c8Var);
                n5Var.p = dateD2;
                n5Var.q = map5;
                w3Var2.Z();
                return n5Var;
            case 8:
                w3Var2.u0();
                Integer numW3 = null;
                HashMap map6 = null;
                e6 e6Var = null;
                int iNextInt = 0;
                String strH34 = null;
                String strH35 = null;
                String strH36 = null;
                String strH37 = null;
                Integer numW4 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU8 = w3Var2.U();
                    strU8.getClass();
                    switch (strU8) {
                        case "item_count":
                            numW4 = w3Var2.w();
                            break;
                        case "meta_length":
                            numW3 = w3Var2.w();
                            break;
                        case "length":
                            iNextInt = w3Var2.nextInt();
                            break;
                        case "filename":
                            strH35 = w3Var2.H();
                            break;
                        case "attachment_type":
                            strH36 = w3Var2.H();
                            break;
                        case "type":
                            e6Var = (e6) w3Var2.q0(g1Var, new g(b4));
                            break;
                        case "content_type":
                            strH34 = w3Var2.H();
                            break;
                        case "platform":
                            strH37 = w3Var2.H();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            w3Var2.y(g1Var, map6, strU8);
                            break;
                    }
                }
                if (e6Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    g1Var.d(f6.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                u5 u5Var = new u5(e6Var, iNextInt, null, strH34, strH35, strH36, strH37, numW4, numW3 != null ? new r0(numW3, (byte) 2) : null);
                u5Var.v = map6;
                w3Var2.Z();
                return u5Var;
            case ep1.b /* 9 */:
                w3Var2.u0();
                v5 v5Var = new v5();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU9 = w3Var2.U();
                    strU9.getClass();
                    switch (strU9) {
                        case "fingerprint":
                            List list3 = (List) w3Var2.t0();
                            if (list3 == null) {
                                break;
                            } else {
                                v5Var.I = list3;
                                break;
                            }
                            break;
                        case "threads":
                            w3Var2.u0();
                            w3Var2.U();
                            v5Var.E = new p2(w3Var2.B0(g1Var, new io.sentry.protocol.d0((byte) 0)));
                            w3Var2.Z();
                            break;
                        case "logger":
                            v5Var.D = w3Var2.H();
                            break;
                        case "timestamp":
                            Date dateD3 = w3Var.d0(g1Var);
                            if (dateD3 == null) {
                                break;
                            } else {
                                v5Var.B = dateD3;
                                break;
                            }
                            break;
                        case "level":
                            v5Var.G = (f6) w3Var2.q0(g1Var, new g(b3));
                            break;
                        case "message":
                            v5Var.C = (io.sentry.protocol.p) w3Var2.q0(g1Var, new io.sentry.clientreport.a(b2));
                            break;
                        case "modules":
                            v5Var.K = io.sentry.util.b.r((Map) w3Var2.t0());
                            break;
                        case "exception":
                            w3Var2.u0();
                            w3Var2.U();
                            v5Var.F = new p2(w3Var2.B0(g1Var, new io.sentry.clientreport.a((byte) 22)));
                            w3Var2.Z();
                            break;
                        case "transaction":
                            v5Var.H = w3Var2.H();
                            break;
                        default:
                            if (!io.sentry.config.a.i(v5Var, strU9, w3Var2, g1Var)) {
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                w3Var2.y(g1Var, concurrentHashMap7, strU9);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                v5Var.J = concurrentHashMap7;
                w3Var2.Z();
                return v5Var;
            case ep1.c /* 10 */:
                return e6.valueOfLabel(w3Var2.r().toLowerCase(Locale.ROOT));
            case 11:
                return f6.valueOf(w3Var2.r().toUpperCase(Locale.ROOT));
            case ep1.d /* 12 */:
                g6 g6Var = new g6();
                w3Var2.u0();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU10 = w3Var2.U();
                    strU10.getClass();
                    switch (strU10) {
                        case "package_name":
                            g6Var.f196o = w3Var2.H();
                            break;
                        case "thread_id":
                            g6Var.q = w3Var2.A();
                            break;
                        case "address":
                            g6Var.n = w3Var2.H();
                            break;
                        case "class_name":
                            g6Var.p = w3Var2.H();
                            break;
                        case "type":
                            g6Var.m = w3Var2.nextInt();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap8, strU10);
                            break;
                    }
                }
                g6Var.r = concurrentHashMap8;
                w3Var2.Z();
                return g6Var;
            case 13:
                w3Var2.u0();
                Double dS2 = null;
                String strH38 = null;
                HashMap map7 = null;
                j6 j6Var = null;
                HashMap mapL3 = null;
                Integer numW5 = null;
                y7 y7Var = null;
                io.sentry.protocol.w wVar7 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU11 = w3Var2.U();
                    strU11.getClass();
                    switch (strU11) {
                        case "span_id":
                            y7Var = (y7) w3Var2.q0(g1Var, new g((byte) 23));
                            break;
                        case "severity_number":
                            numW5 = w3Var2.w();
                            break;
                        case "body":
                            strH38 = w3Var2.H();
                            break;
                        case "timestamp":
                            dS2 = w3Var2.S();
                            break;
                        case "level":
                            j6Var = (j6) w3Var2.q0(g1Var, new g((byte) 16));
                            break;
                        case "attributes":
                            mapL3 = w3Var2.L(g1Var, new g((byte) 14));
                            break;
                        case "trace_id":
                            wVar7 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            w3Var2.y(g1Var, map7, strU11);
                            break;
                    }
                }
                w3Var2.Z();
                if (wVar7 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    g1Var.d(f6.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dS2 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    g1Var.d(f6.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strH38 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    g1Var.d(f6.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (j6Var == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    g1Var.d(f6.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                h6 h6Var = new h6(wVar7, dS2, strH38, j6Var);
                h6Var.s = mapL3;
                h6Var.r = numW5;
                h6Var.n = y7Var;
                h6Var.t = map7;
                return h6Var;
            case 14:
                w3Var2.u0();
                Object objT0 = null;
                HashMap map8 = null;
                String strH39 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU12 = w3Var2.U();
                    strU12.getClass();
                    if (strU12.equals("type")) {
                        strH39 = w3Var2.H();
                    } else if (strU12.equals("value")) {
                        objT0 = w3Var2.t0();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        w3Var2.y(g1Var, map8, strU12);
                    }
                }
                w3Var2.Z();
                if (strH39 != null) {
                    io.sentry.protocol.n nVar = new io.sentry.protocol.n(objT0, strH39);
                    nVar.p = map8;
                    return nVar;
                }
                IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                g1Var.d(f6.ERROR, "Missing required field \"type\"", illegalStateException6);
                throw illegalStateException6;
            case 15:
                w3Var2.u0();
                HashMap map9 = null;
                ArrayList arrayListB1 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU13 = w3Var2.U();
                    strU13.getClass();
                    if (strU13.equals("items")) {
                        arrayListB1 = w3Var2.B0(g1Var, new g((byte) 13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        w3Var2.y(g1Var, map9, strU13);
                    }
                }
                w3Var2.Z();
                if (arrayListB1 != null) {
                    i6 i6Var = new i6(arrayListB1, (byte) 0);
                    i6Var.f203o = map9;
                    return i6Var;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                g1Var.d(f6.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return j6.valueOf(w3Var2.r().toUpperCase(Locale.ROOT));
            case 17:
                w3Var2.u0();
                Double dS3 = null;
                String strH40 = null;
                HashMap map10 = null;
                String strH41 = null;
                Double dS4 = null;
                HashMap mapL4 = null;
                y7 y7Var2 = null;
                io.sentry.protocol.w wVar8 = null;
                String strH42 = null;
                while (true) {
                    HashMap map11 = map10;
                    if (w3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        w3Var2.Z();
                        if (wVar8 == null) {
                            IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            g1Var.d(f6.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (dS3 == null) {
                            IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            g1Var.d(f6.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (strH40 == null) {
                            IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            g1Var.d(f6.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (strH41 == null) {
                            IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            g1Var.d(f6.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (dS4 == null) {
                            IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            g1Var.d(f6.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        m6 m6Var = new m6();
                        m6Var.m = wVar8;
                        m6Var.f213o = dS3;
                        m6Var.p = strH41;
                        m6Var.r = strH40;
                        m6Var.s = dS4;
                        m6Var.t = mapL4;
                        m6Var.n = y7Var2;
                        m6Var.q = strH42;
                        m6Var.u = map11;
                        return m6Var;
                    }
                    String strU14 = w3Var2.U();
                    strU14.getClass();
                    switch (strU14) {
                        case "span_id":
                            y7Var2 = (y7) w3Var2.q0(g1Var, new g((byte) 23));
                            break;
                        case "name":
                            strH41 = w3Var2.H();
                            break;
                        case "type":
                            strH40 = w3Var2.H();
                            break;
                        case "unit":
                            strH42 = w3Var2.H();
                            break;
                        case "timestamp":
                            dS3 = w3Var2.S();
                            break;
                        case "value":
                            dS4 = w3Var2.S();
                            break;
                        case "attributes":
                            mapL4 = w3Var2.L(g1Var, new g((byte) 14));
                            break;
                        case "trace_id":
                            wVar8 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            break;
                        default:
                            HashMap map12 = map11 == null ? new HashMap() : map11;
                            w3Var2.y(g1Var, map12, strU14);
                            map10 = map12;
                            continue;
                            break;
                    }
                    map10 = map11;
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                w3Var2.u0();
                HashMap map13 = null;
                ArrayList arrayListB2 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU15 = w3Var2.U();
                    strU15.getClass();
                    if (strU15.equals("items")) {
                        arrayListB2 = w3Var2.B0(g1Var, new g(b2));
                    } else {
                        if (map13 == null) {
                            map13 = new HashMap();
                        }
                        w3Var2.y(g1Var, map13, strU15);
                    }
                }
                w3Var2.Z();
                if (arrayListB2 != null) {
                    n6 n6Var = new n6(arrayListB2);
                    n6Var.n = map13;
                    return n6Var;
                }
                IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                g1Var.d(f6.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                i7 i7Var = new i7();
                w3Var2.u0();
                h7 h7Var = null;
                Date dateD4 = null;
                HashMap map14 = null;
                io.sentry.protocol.w wVar9 = null;
                Date dateD5 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                List list7 = null;
                String strH43 = null;
                Integer numW6 = null;
                while (true) {
                    HashMap map15 = map14;
                    if (w3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        w3Var2.Z();
                        if (strH43 != null) {
                            i7Var.C = strH43;
                        }
                        if (h7Var != null) {
                            i7Var.D = h7Var;
                        }
                        if (numW6 != null) {
                            i7Var.F = numW6.intValue();
                        }
                        if (dateD4 != null) {
                            i7Var.G = dateD4;
                        }
                        i7Var.E = wVar9;
                        i7Var.H = dateD5;
                        i7Var.I = list4;
                        i7Var.J = list5;
                        i7Var.K = list6;
                        i7Var.L = list7;
                        i7Var.M = map15;
                        return i7Var;
                    }
                    String strU16 = w3Var2.U();
                    strU16.getClass();
                    switch (strU16) {
                        case "segment_names":
                            list7 = (List) w3Var2.t0();
                            map14 = map15;
                            break;
                        case "replay_id":
                            wVar9 = (io.sentry.protocol.w) w3Var2.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                            map14 = map15;
                            break;
                        case "replay_start_timestamp":
                            dateD5 = w3Var.d0(g1Var);
                            map14 = map15;
                            break;
                        case "type":
                            strH43 = w3Var2.H();
                            map14 = map15;
                            break;
                        case "urls":
                            list4 = (List) w3Var2.t0();
                            map14 = map15;
                            break;
                        case "timestamp":
                            dateD4 = w3Var.d0(g1Var);
                            map14 = map15;
                            break;
                        case "error_ids":
                            list5 = (List) w3Var2.t0();
                            map14 = map15;
                            break;
                        case "trace_ids":
                            list6 = (List) w3Var2.t0();
                            map14 = map15;
                            break;
                        case "replay_type":
                            h7Var = (h7) w3Var2.q0(g1Var, new g((byte) 20));
                            map14 = map15;
                            break;
                        case "segment_id":
                            numW6 = w3Var2.w();
                            map14 = map15;
                            break;
                        default:
                            if (!io.sentry.config.a.i(i7Var, strU16, w3Var2, g1Var)) {
                                HashMap map16 = map15 == null ? new HashMap() : map15;
                                w3Var2.y(g1Var, map16, strU16);
                                map14 = map16;
                                break;
                            } else {
                                map14 = map15;
                                break;
                            }
                            break;
                    }
                }
                break;
            case 20:
                return h7.valueOf(w3Var2.r().toUpperCase(Locale.ROOT));
            case 21:
                w3Var2.u0();
                ConcurrentHashMap concurrentHashMap9 = null;
                boolean z2 = false;
                Integer numW7 = null;
                t7 t7VarValueOf = null;
                Date dateD6 = null;
                Date dateD7 = null;
                String strH44 = null;
                String str3 = null;
                Boolean boolF1 = null;
                Long lA5 = null;
                Double dS5 = null;
                String strH45 = null;
                String strH46 = null;
                String strH47 = null;
                String strH48 = null;
                String strH49 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU17 = w3Var2.U();
                    strU17.getClass();
                    switch (strU17) {
                        case "duration":
                            dS5 = w3Var2.S();
                            break;
                        case "started":
                            dateD6 = w3Var.d0(g1Var);
                            break;
                        case "errors":
                            numW7 = w3Var2.w();
                            break;
                        case "status":
                            String strB = io.sentry.util.r.b(w3Var2.H());
                            if (strB == null) {
                                break;
                            } else {
                                t7VarValueOf = t7.valueOf(strB);
                                break;
                            }
                            break;
                        case "did":
                            strH44 = w3Var2.H();
                            break;
                        case "seq":
                            lA5 = w3Var2.A();
                            break;
                        case "sid":
                            String strH50 = w3Var2.H();
                            if (strH50 != null && (strH50.length() == 36 || strH50.length() == 32)) {
                                str3 = strH50;
                                break;
                            } else {
                                g1Var.g(f6.ERROR, "%s sid is not valid.", strH50);
                                break;
                            }
                            break;
                        case "init":
                            boolF1 = w3Var2.f0();
                            break;
                        case "timestamp":
                            dateD7 = w3Var.d0(g1Var);
                            break;
                        case "attrs":
                            w3Var2.u0();
                            while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strU18 = w3Var2.U();
                                strU18.getClass();
                                switch (strU18) {
                                    case "environment":
                                        strH47 = w3Var2.H();
                                        break;
                                    case "release":
                                        strH48 = w3Var2.H();
                                        break;
                                    case "ip_address":
                                        strH45 = w3Var2.H();
                                        break;
                                    case "user_agent":
                                        strH46 = w3Var2.H();
                                        break;
                                    default:
                                        w3Var2.v();
                                        break;
                                }
                            }
                            w3Var2.Z();
                            break;
                        case "abnormal_mechanism":
                            strH49 = w3Var2.H();
                            break;
                        case "non_terminating_unhandled_error":
                            Boolean boolF2 = w3Var2.f0();
                            if (boolF2 != null && boolF2.booleanValue()) {
                                z2 = true;
                                break;
                            } else {
                                z2 = false;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap9, strU17);
                            break;
                    }
                }
                if (t7VarValueOf == null) {
                    throw d(g1Var, "status");
                }
                if (dateD6 == null) {
                    throw d(g1Var, "started");
                }
                if (numW7 == null) {
                    throw d(g1Var, "errors");
                }
                if (strH48 == null) {
                    throw d(g1Var, "release");
                }
                u7 u7Var = new u7(t7VarValueOf, dateD6, dateD7, numW7.intValue(), strH44, str3, boolF1, lA5, dS5, strH45, strH46, strH47, strH48, strH49);
                u7Var.A = z2;
                u7Var.C = concurrentHashMap9;
                w3Var2.Z();
                return u7Var;
            case 22:
                return c(w3Var, g1Var);
            case 23:
                return new y7(w3Var2.r());
            case 24:
                return a8.valueOf(w3Var2.r().toUpperCase(Locale.ROOT));
            case 25:
                w3Var2.u0();
                String strH51 = null;
                String strH52 = null;
                io.sentry.protocol.w wVar10 = null;
                String strH53 = null;
                String strH54 = null;
                String strH55 = null;
                io.sentry.protocol.w wVar11 = null;
                String strH56 = null;
                ConcurrentHashMap concurrentHashMap10 = null;
                String strH57 = null;
                String strR = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU19 = w3Var2.U();
                    strU19.getClass();
                    switch (strU19) {
                        case "replay_id":
                            wVar11 = new io.sentry.protocol.w(w3Var2.r());
                            break;
                        case "user_id":
                            strH53 = w3Var2.H();
                            break;
                        case "environment":
                            strH51 = w3Var2.H();
                            break;
                        case "sample_rand":
                            strH56 = w3Var2.H();
                            break;
                        case "sample_rate":
                            strH54 = w3Var2.H();
                            break;
                        case "release":
                            strH57 = w3Var2.H();
                            break;
                        case "trace_id":
                            wVar10 = new io.sentry.protocol.w(w3Var2.r());
                            break;
                        case "sampled":
                            strH55 = w3Var2.H();
                            break;
                        case "public_key":
                            strR = w3Var2.r();
                            break;
                        case "transaction":
                            strH52 = w3Var2.H();
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            w3Var2.y(g1Var, concurrentHashMap10, strU19);
                            break;
                    }
                }
                if (wVar10 == null) {
                    throw e(g1Var, "trace_id");
                }
                if (strR == null) {
                    throw e(g1Var, "public_key");
                }
                c8 c8Var2 = new c8(wVar10, strR, strH57, strH51, strH53, strH52, strH54, strH55, wVar11, strH56);
                c8Var2.w = concurrentHashMap10;
                w3Var2.Z();
                return c8Var2;
            default:
                w3Var2.u0();
                io.sentry.protocol.w wVar12 = null;
                String strH58 = null;
                String strH59 = null;
                String strH60 = null;
                HashMap map17 = null;
                while (w3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU20 = w3Var2.U();
                    strU20.getClass();
                    switch (strU20) {
                        case "comments":
                            strH60 = w3Var2.H();
                            break;
                        case "name":
                            strH58 = w3Var2.H();
                            break;
                        case "email":
                            strH59 = w3Var2.H();
                            break;
                        case "event_id":
                            wVar12 = new io.sentry.protocol.w(w3Var2.r());
                            break;
                        default:
                            if (map17 == null) {
                                map17 = new HashMap();
                            }
                            w3Var2.y(g1Var, map17, strU20);
                            break;
                    }
                }
                w3Var2.Z();
                if (wVar12 != null) {
                    h8 h8Var = new h8(wVar12, strH58, strH59, strH60);
                    h8Var.q = map17;
                    return h8Var;
                }
                IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                g1Var.d(f6.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
