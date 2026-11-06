package io.sentry.android.core.internal.tombstone;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import io.sentry.f6;
import io.sentry.m7;
import io.sentry.p2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.f;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.v5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o.cr;
import o.cv0;
import o.d22;
import o.dz7;
import o.e41;
import o.ep1;
import o.ep4;
import o.g96;
import o.k20;
import o.l70;
import o.o77;
import o.ua5;
import o.vv;
import o.wj5;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {
    public final InputStream m;
    public final List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f111o;
    public final String p;
    public final HashMap q;

    public c(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.q = map;
        this.m = inputStream;
        this.n = list;
        this.f111o = list2;
        this.p = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    public final v5 e() throws IOException {
        DebugImage debugImageA;
        Map map;
        int i;
        DebugImage debugImageA2;
        l70 l70Var;
        int i2;
        int i3;
        l70 l70Var2;
        l70 l70Var3;
        ArrayList arrayList;
        l70 l70Var4;
        ArrayList arrayList2;
        int i4;
        int i5;
        l70 l70Var5;
        l70 l70Var6;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i6 = this.m.read(bArr);
            if (i6 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i6);
        }
        l70 l70Var7 = new l70(byteArrayOutputStream.toByteArray(), (byte) 2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        String str = "";
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String strG = "";
        cv0 cv0Var = null;
        while (true) {
            int iH = l70Var7.h();
            if (iH == 0) {
                String str2 = str;
                int i10 = i8;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                Collections.unmodifiableList(arrayList4);
                Collections.unmodifiableList(arrayList5);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                Collections.unmodifiableMap(map3);
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Collections.unmodifiableList(arrayList8);
                v5 v5Var = new v5();
                v5Var.G = f6.FATAL;
                v5Var.t = "native";
                p pVar = new p();
                String strJoin = String.join(" ", listUnmodifiableList);
                if (cv0Var != null) {
                    Locale locale = Locale.ROOT;
                    pVar.m = (!strG.isEmpty() ? strG.concat(": ") : str2) + "Fatal signal " + ((String) cv0Var.d) + " (" + cv0Var.b + "), " + ((String) cv0Var.e) + " (" + cv0Var.c + "), pid = " + i7 + " (" + strJoin + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    pVar.m = e41.h("Fatal exit pid = ", " (", i7, strJoin, ")");
                }
                v5Var.C = pVar;
                ArrayList arrayList9 = new ArrayList();
                Iterator it = listUnmodifiableList2.iterator();
                b bVar = null;
                while (it.hasNext()) {
                    ep4 ep4Var = (ep4) it.next();
                    boolean z = ep4Var.d;
                    long j = ep4Var.b;
                    long j2 = ep4Var.a;
                    Map map4 = mapUnmodifiableMap;
                    Iterator it2 = it;
                    long j3 = ep4Var.c;
                    String str3 = ep4Var.f;
                    String str4 = ep4Var.e;
                    if (z && !str4.isEmpty()) {
                        map = map4;
                        if (!str4.startsWith("/dev/")) {
                            if (str3.isEmpty()) {
                                i = i7;
                                if (bVar != null) {
                                    long j4 = i9;
                                    if (bVar.a.equals(str4)) {
                                        long j5 = bVar.f;
                                        if (j2 >= j5) {
                                            long j6 = bVar.g;
                                            if (j3 >= j6) {
                                                long j7 = (j2 - j5) - (j3 - (j6 + (j5 - bVar.e)));
                                                if (j4 <= 0) {
                                                    j4 = 4096;
                                                }
                                                long jMax = Math.max(j4, 16384L);
                                                if (j7 >= (-jMax) && j7 <= jMax) {
                                                    bVar.d = Math.max(bVar.d, j);
                                                    bVar.e = j2;
                                                    bVar.f = j;
                                                    bVar.g = j3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (bVar != null && bVar.a.equals(str4) && bVar.b.equals(str3)) {
                                bVar.d = Math.max(bVar.d, j);
                                bVar.e = j2;
                                bVar.f = j;
                                bVar.g = j3;
                            } else {
                                if (bVar != null && (debugImageA2 = bVar.a()) != null) {
                                    arrayList9.add(debugImageA2);
                                }
                                bVar = new b();
                                bVar.a = str4;
                                bVar.b = str3;
                                bVar.c = j2;
                                bVar.d = j;
                                bVar.e = j2;
                                bVar.f = j;
                                bVar.g = j3;
                            }
                        }
                        it = it2;
                        mapUnmodifiableMap = map;
                        i7 = i;
                    } else {
                        map = map4;
                    }
                    i = i7;
                    it = it2;
                    mapUnmodifiableMap = map;
                    i7 = i;
                }
                Map map5 = mapUnmodifiableMap;
                int i11 = i7;
                if (bVar != null && (debugImageA = bVar.a()) != null) {
                    arrayList9.add(debugImageA);
                }
                f fVar = new f();
                fVar.b(arrayList9);
                v5Var.z = fVar;
                v vVar = new v();
                if (cv0Var != null) {
                    String str5 = (String) cv0Var.d;
                    vVar.m = str5;
                    vVar.n = (String) this.q.get(str5);
                    o oVar = new o();
                    oVar.m = a.TOMBSTONE.getValue();
                    oVar.p = Boolean.FALSE;
                    oVar.s = Boolean.TRUE;
                    HashMap map6 = new HashMap();
                    map6.put("number", Integer.valueOf(cv0Var.b));
                    map6.put("name", (String) cv0Var.d);
                    map6.put("code", Integer.valueOf(cv0Var.c));
                    map6.put("code_name", (String) cv0Var.e);
                    oVar.q = new HashMap(map6);
                    vVar.r = oVar;
                }
                vVar.p = Long.valueOf(i10);
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add(vVar);
                v5Var.h(arrayList10);
                ArrayList arrayListD = v5Var.d();
                Objects.requireNonNull(arrayListD);
                v vVar2 = (v) arrayListD.get(0);
                ArrayList arrayList11 = new ArrayList();
                Iterator it3 = map5.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    dz7 dz7Var = (dz7) entry.getValue();
                    e0 e0Var = new e0();
                    e0Var.m = Long.valueOf(((Integer) entry.getKey()).intValue());
                    e0Var.f228o = dz7Var.b;
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it4 = dz7Var.f.iterator();
                    while (it4.hasNext()) {
                        k20 k20Var = (k20) it4.next();
                        String str6 = k20Var.d;
                        long j8 = k20Var.b;
                        String str7 = k20Var.c;
                        it3 = it3;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            a0 a0Var = new a0();
                            a0Var.x = str6;
                            a0Var.q = str7;
                            Iterator it5 = it4;
                            a0Var.C = String.format("0x%x", Long.valueOf(j8));
                            if (!k20Var.e.isEmpty()) {
                                long j9 = k20Var.a;
                                if (j8 >= j9) {
                                    a0Var.A = String.format("0x%x", Long.valueOf(j8 - j9));
                                }
                            }
                            Boolean boolF = str7.isEmpty() ? Boolean.FALSE : m7.f(str7, this.n, this.f111o);
                            String str8 = this.p;
                            a0Var.w = Boolean.valueOf((boolF != null && boolF.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList12.add(0, a0Var);
                            it4 = it5;
                        }
                    }
                    Iterator it6 = it3;
                    c0 c0Var = new c0();
                    c0Var.m = arrayList12;
                    c0Var.p = b0.NONE;
                    HashMap map7 = new HashMap();
                    for (g96 g96Var : dz7Var.c) {
                        map7.put(g96Var.a, String.format("0x%x", Long.valueOf(g96Var.b)));
                    }
                    c0Var.n = map7;
                    e0Var.u = c0Var;
                    int i12 = dz7Var.a;
                    if (i10 == i12) {
                        e0Var.q = Boolean.TRUE;
                        vVar2.q = c0Var;
                    }
                    int i13 = i11;
                    if (i13 == i12) {
                        e0Var.f228o = "main";
                        e0Var.t = Boolean.TRUE;
                    }
                    arrayList11.add(e0Var);
                    i11 = i13;
                    it3 = it6;
                }
                v5Var.E = new p2(arrayList11);
                return v5Var;
            }
            int i14 = iH >>> 3;
            int i15 = iH & 7;
            String str9 = str;
            switch (i14) {
                case 1:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i8 = i8;
                    i2 = 2;
                    l70.b(i14, 0, i15);
                    int i16 = (int) l70Var.i();
                    int[] iArrE = ua5.E(6);
                    int length = iArrE.length;
                    for (int i17 = 0; i17 < length && ua5.b(iArrE[i17]) != i16; i17++) {
                    }
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 2:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    l70Var.g();
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 3:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    l70Var.g();
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 4:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    l70Var.g();
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 5:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    i7 = (int) l70Var.i();
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 6:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    l70.b(i14, 0, i15);
                    i8 = (int) l70Var.i();
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 7:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    l70Var.i();
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 8:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    l70.b(i14, 2, i15);
                    l70Var.g();
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case ep1.b /* 9 */:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i8 = i8;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    arrayList3.add(l70Var.g());
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case ep1.c /* 10 */:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 2, i15);
                    l70 l70VarF = l70Var.f();
                    String strG2 = str9;
                    String strG3 = strG2;
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        int iH2 = l70VarF.h();
                        if (iH2 == 0) {
                            cv0Var = new cv0(strG2, i18, i19, strG3);
                            i8 = i3;
                            i2 = 2;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                        } else {
                            int i20 = iH2 >>> 3;
                            int i21 = iH2 & 7;
                            switch (i20) {
                                case 1:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    i18 = (int) l70Var2.i();
                                    break;
                                case 2:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 2, i21);
                                    strG2 = l70Var2.g();
                                    break;
                                case 3:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    i19 = (int) l70Var2.i();
                                    i18 = i18;
                                    break;
                                case 4:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 2, i21);
                                    strG3 = l70Var2.g();
                                    break;
                                case 5:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    l70Var2.d();
                                    break;
                                case 6:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    l70Var2.i();
                                    break;
                                case 7:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    l70Var2.i();
                                    break;
                                case 8:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    l70Var2.d();
                                    break;
                                case ep1.b /* 9 */:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 0, i21);
                                    l70Var2.i();
                                    break;
                                case ep1.c /* 10 */:
                                    l70Var2 = l70VarF;
                                    l70.b(i20, 2, i21);
                                    o77.h(l70Var2.f());
                                    break;
                                default:
                                    l70VarF.j(i21);
                                    l70Var2 = l70VarF;
                                    break;
                            }
                            l70VarF = l70Var2;
                        }
                        break;
                    }
                    break;
                case 11:
                case ep1.d /* 12 */:
                case 13:
                default:
                    l70Var7.j(i15);
                    l70Var = l70Var7;
                    i8 = i8;
                    i2 = 2;
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 14:
                    l70Var = l70Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    strG = l70Var.g();
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 15:
                    l70Var = l70Var7;
                    i8 = i8;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    l70 l70VarF2 = l70Var.f();
                    while (true) {
                        int iH3 = l70VarF2.h();
                        if (iH3 != 0) {
                            int i22 = iH3 >>> 3;
                            int i23 = iH3 & 7;
                            if (i22 != 1) {
                                if (i22 != i2) {
                                    l70VarF2.j(i23);
                                } else {
                                    l70.b(i22, i2, i23);
                                    l70 l70VarF3 = l70VarF2.f();
                                    while (true) {
                                        int iH4 = l70VarF3.h();
                                        if (iH4 != 0) {
                                            int i24 = iH4 >>> 3;
                                            int i25 = iH4 & 7;
                                            l70 l70Var8 = l70VarF2;
                                            if (i24 == 1) {
                                                l70Var4 = l70VarF3;
                                                arrayList2 = arrayList4;
                                                l70.b(i24, 0, i25);
                                                int i26 = (int) l70Var4.i();
                                                int i27 = 2;
                                                int[] iArrE2 = ua5.E(2);
                                                int length2 = iArrE2.length;
                                                int i28 = 0;
                                                while (i28 < length2) {
                                                    int i29 = iArrE2[i28];
                                                    int[] iArr = iArrE2;
                                                    if (i29 == 1) {
                                                        i4 = 0;
                                                    } else {
                                                        if (i29 != i27) {
                                                            throw null;
                                                        }
                                                        i4 = 1;
                                                    }
                                                    if (i4 == i26) {
                                                    }
                                                    i28++;
                                                    iArrE2 = iArr;
                                                    i27 = 2;
                                                    break;
                                                }
                                            } else if (i24 == i2) {
                                                l70Var4 = l70VarF3;
                                                arrayList2 = arrayList4;
                                                l70.b(i24, 0, i25);
                                                int i30 = (int) l70Var4.i();
                                                for (int i31 : ua5.E(6)) {
                                                    switch (i31) {
                                                        case 1:
                                                            i5 = 0;
                                                            break;
                                                        case 2:
                                                            i5 = 1;
                                                            break;
                                                        case 3:
                                                            i5 = 2;
                                                            break;
                                                        case 4:
                                                            i5 = 3;
                                                            break;
                                                        case 5:
                                                            i5 = 4;
                                                            break;
                                                        case 6:
                                                            i5 = 5;
                                                            break;
                                                        default:
                                                            throw null;
                                                    }
                                                    if (i5 == i30) {
                                                    }
                                                    break;
                                                }
                                            } else if (i24 != 3) {
                                                l70VarF3.j(i25);
                                                l70Var4 = l70VarF3;
                                                arrayList2 = arrayList4;
                                            } else {
                                                l70.b(i24, i2, i25);
                                                l70 l70VarF4 = l70VarF3.f();
                                                ArrayList arrayList13 = new ArrayList();
                                                ArrayList arrayList14 = new ArrayList();
                                                while (true) {
                                                    int iH5 = l70VarF4.h();
                                                    if (iH5 != 0) {
                                                        int i32 = iH5 >>> 3;
                                                        l70 l70Var9 = l70VarF3;
                                                        int i33 = iH5 & 7;
                                                        switch (i32) {
                                                            case 1:
                                                                arrayList4 = arrayList4;
                                                                l70.b(i32, 0, i33);
                                                                l70VarF4.i();
                                                                break;
                                                            case 2:
                                                                arrayList4 = arrayList4;
                                                                l70.b(i32, 0, i33);
                                                                l70VarF4.i();
                                                                break;
                                                            case 3:
                                                                arrayList4 = arrayList4;
                                                                l70.b(i32, 0, i33);
                                                                l70VarF4.i();
                                                                break;
                                                            case 4:
                                                                l70.b(i32, 2, i33);
                                                                arrayList13.add(o77.g(l70VarF4.f()));
                                                                break;
                                                            case 5:
                                                                arrayList4 = arrayList4;
                                                                l70.b(i32, 0, i33);
                                                                l70VarF4.i();
                                                                break;
                                                            case 6:
                                                                l70.b(i32, 2, i33);
                                                                arrayList14.add(o77.g(l70VarF4.f()));
                                                                break;
                                                            default:
                                                                l70VarF4.j(i33);
                                                                break;
                                                        }
                                                        arrayList4 = arrayList4;
                                                        l70VarF3 = l70Var9;
                                                    } else {
                                                        l70Var4 = l70VarF3;
                                                        arrayList2 = arrayList4;
                                                        Collections.unmodifiableList(arrayList13);
                                                        Collections.unmodifiableList(arrayList14);
                                                    }
                                                }
                                            }
                                            l70VarF2 = l70Var8;
                                            arrayList4 = arrayList2;
                                            l70VarF3 = l70Var4;
                                            i2 = 2;
                                        }
                                    }
                                }
                                l70Var3 = l70VarF2;
                                arrayList = arrayList4;
                            } else {
                                l70Var3 = l70VarF2;
                                arrayList = arrayList4;
                                l70.b(i22, i2, i23);
                                l70Var3.g();
                            }
                            l70VarF2 = l70Var3;
                            arrayList4 = arrayList;
                        } else {
                            arrayList4 = arrayList4;
                            arrayList5.add(new vv((byte) 5));
                        }
                    }
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    l70Var = l70Var7;
                    i2 = 2;
                    l70.b(i14, 2, i15);
                    o77.i(l70Var.f(), map2);
                    arrayList4 = arrayList4;
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 17:
                    l70Var = l70Var7;
                    l70.b(i14, 2, i15);
                    l70 l70VarF5 = l70Var.f();
                    String strG4 = str9;
                    String strG5 = strG4;
                    long jI = 0;
                    long jI2 = 0;
                    long jI3 = 0;
                    boolean zD = false;
                    while (true) {
                        int iH6 = l70VarF5.h();
                        if (iH6 == 0) {
                            arrayList6.add(new ep4(jI, jI2, jI3, zD, strG4, strG5));
                            i2 = 2;
                            i8 = i8;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                            break;
                        } else {
                            int i34 = iH6 >>> 3;
                            int i35 = iH6 & 7;
                            switch (i34) {
                                case 1:
                                    l70.b(i34, 0, i35);
                                    jI = l70VarF5.i();
                                    break;
                                case 2:
                                    l70.b(i34, 0, i35);
                                    jI2 = l70VarF5.i();
                                    break;
                                case 3:
                                    l70.b(i34, 0, i35);
                                    jI3 = l70VarF5.i();
                                    break;
                                case 4:
                                    l70.b(i34, 0, i35);
                                    zD = l70VarF5.d();
                                    break;
                                case 5:
                                    l70.b(i34, 0, i35);
                                    l70VarF5.d();
                                    break;
                                case 6:
                                    l70.b(i34, 0, i35);
                                    l70VarF5.d();
                                    break;
                                case 7:
                                    l70.b(i34, 2, i35);
                                    strG4 = l70VarF5.g();
                                    break;
                                case 8:
                                    l70.b(i34, 2, i35);
                                    strG5 = l70VarF5.g();
                                    break;
                                case ep1.b /* 9 */:
                                    l70.b(i34, 0, i35);
                                    l70VarF5.i();
                                    break;
                                default:
                                    l70VarF5.j(i35);
                                    break;
                            }
                        }
                    }
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    l70Var = l70Var7;
                    l70.b(i14, 2, i15);
                    l70 l70VarF6 = l70Var.f();
                    ArrayList arrayList15 = new ArrayList();
                    while (true) {
                        int iH7 = l70VarF6.h();
                        if (iH7 == 0) {
                            arrayList7.add(new d22(arrayList15));
                            i2 = 2;
                            arrayList4 = arrayList4;
                            i8 = i8;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                        } else {
                            int i36 = iH7 >>> 3;
                            int i37 = iH7 & 7;
                            if (i36 == 1) {
                                l70Var5 = l70VarF6;
                                l70.b(i36, 2, i37);
                                l70Var5.g();
                            } else if (i36 != 2) {
                                l70VarF6.j(i37);
                                l70Var5 = l70VarF6;
                            } else {
                                l70.b(i36, 2, i37);
                                l70 l70VarF7 = l70VarF6.f();
                                while (true) {
                                    int iH8 = l70VarF7.h();
                                    if (iH8 != 0) {
                                        int i38 = iH8 >>> 3;
                                        int i39 = iH8 & 7;
                                        switch (i38) {
                                            case 1:
                                                l70VarF6 = l70VarF6;
                                                l70.b(i38, 2, i39);
                                                l70VarF7.g();
                                                break;
                                            case 2:
                                                l70.b(i38, 0, i39);
                                                l70VarF7.i();
                                                break;
                                            case 3:
                                                l70.b(i38, 0, i39);
                                                l70VarF7.i();
                                                break;
                                            case 4:
                                                l70.b(i38, 0, i39);
                                                l70VarF7.i();
                                                break;
                                            case 5:
                                                l70.b(i38, 2, i39);
                                                l70VarF7.g();
                                                break;
                                            case 6:
                                                l70VarF6 = l70VarF6;
                                                l70.b(i38, 2, i39);
                                                l70VarF7.g();
                                                break;
                                            default:
                                                l70VarF7.j(i39);
                                                break;
                                        }
                                        l70VarF6 = l70VarF6;
                                    } else {
                                        l70Var5 = l70VarF6;
                                        arrayList15.add(new cr((byte) 23));
                                    }
                                }
                            }
                            l70VarF6 = l70Var5;
                        }
                        break;
                    }
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    l70Var = l70Var7;
                    int i40 = 2;
                    l70.b(i14, 2, i15);
                    l70 l70VarF8 = l70Var.f();
                    while (true) {
                        int iH9 = l70VarF8.h();
                        if (iH9 == 0) {
                            arrayList8.add(new cr((byte) 17));
                            i2 = 2;
                            i8 = i8;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                        } else {
                            int i41 = iH9 >>> 3;
                            int i42 = iH9 & 7;
                            if (i41 == 1) {
                                l70.b(i41, 0, i42);
                                l70VarF8.i();
                            } else if (i41 == i40) {
                                l70.b(i41, i40, i42);
                                l70VarF8.g();
                            } else if (i41 == 3) {
                                l70.b(i41, i40, i42);
                                l70VarF8.g();
                            } else if (i41 != 4) {
                                l70VarF8.j(i42);
                            } else {
                                l70.b(i41, 0, i42);
                                l70VarF8.i();
                            }
                            i40 = 2;
                        }
                        break;
                    }
                    break;
                case 20:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    l70Var.i();
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 21:
                    l70Var = l70Var7;
                    int i43 = 2;
                    l70.b(i14, 2, i15);
                    l70 l70VarF9 = l70Var.f();
                    while (true) {
                        int iH10 = l70VarF9.h();
                        if (iH10 == 0) {
                            arrayList4.add(new vv((byte) 9));
                            i2 = 2;
                            i8 = i8;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                        } else {
                            int i44 = iH10 >>> 3;
                            int i45 = iH10 & 7;
                            if (i44 == 1) {
                                l70.b(i44, i43, i45);
                                l70VarF9.e();
                            } else if (i44 != i43) {
                                l70VarF9.j(i45);
                            } else {
                                l70.b(i44, i43, i45);
                                l70VarF9.e();
                            }
                            i43 = 2;
                        }
                        break;
                    }
                    break;
                case 22:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    i9 = (int) l70Var.i();
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 23:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    l70Var.d();
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 24:
                    l70Var = l70Var7;
                    i3 = i8;
                    l70.b(i14, 0, i15);
                    int i46 = (int) l70Var.i();
                    int[] iArrE3 = ua5.E(6);
                    int length3 = iArrE3.length;
                    for (int i47 = 0; i47 < length3 && ua5.b(iArrE3[i47]) != i46; i47++) {
                    }
                    i8 = i3;
                    i2 = 2;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 25:
                    l70Var = l70Var7;
                    l70.b(i14, 2, i15);
                    o77.i(l70Var.f(), map3);
                    i2 = 2;
                    i8 = i8;
                    str = str9;
                    arrayList4 = arrayList4;
                    l70Var7 = l70Var;
                    break;
                case 26:
                    l70.b(i14, 2, i15);
                    l70 l70VarF10 = l70Var7.f();
                    ArrayList arrayList16 = new ArrayList();
                    while (true) {
                        int iH11 = l70VarF10.h();
                        if (iH11 == 0) {
                            l70Var = l70Var7;
                            i3 = i8;
                            Collections.unmodifiableList(arrayList16);
                            i8 = i3;
                            i2 = 2;
                            str = str9;
                            arrayList4 = arrayList4;
                            l70Var7 = l70Var;
                        } else {
                            l70 l70Var10 = l70Var7;
                            int i48 = iH11 >>> 3;
                            int i49 = iH11 & 7;
                            int i50 = i8;
                            if (i48 == 1) {
                                l70Var6 = l70VarF10;
                                l70.b(i48, 0, i49);
                                l70Var6.i();
                            } else if (i48 != 2) {
                                l70VarF10.j(i49);
                                l70Var6 = l70VarF10;
                            } else {
                                l70.b(i48, 2, i49);
                                l70 l70VarF11 = l70VarF10.f();
                                while (true) {
                                    int iH12 = l70VarF11.h();
                                    if (iH12 != 0) {
                                        int i51 = iH12 >>> 3;
                                        int i52 = iH12 & 7;
                                        l70 l70Var11 = l70VarF10;
                                        if (i51 == 1) {
                                            l70.b(i51, 2, i52);
                                            o77.g(l70VarF11.f());
                                        } else if (i51 == 2) {
                                            l70.b(i51, 0, i52);
                                            l70VarF11.i();
                                        } else if (i51 != 3) {
                                            l70VarF11.j(i52);
                                        } else {
                                            l70.b(i51, 0, i52);
                                            l70VarF11.i();
                                        }
                                        l70VarF10 = l70Var11;
                                    } else {
                                        l70Var6 = l70VarF10;
                                        arrayList16.add(new wj5((byte) 10));
                                    }
                                }
                            }
                            l70VarF10 = l70Var6;
                            l70Var7 = l70Var10;
                            i8 = i50;
                        }
                        break;
                    }
                    break;
            }
        }
    }
}
