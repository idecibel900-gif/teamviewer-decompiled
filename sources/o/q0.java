package o;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.ConnectInterfaceActivity;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ q0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02db  */
    /* JADX WARN: Code duplicated, block: B:134:0x0332  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r3v26, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        ?? arrayList;
        ?? r24;
        fb5 fb5Var;
        ?? arrayList2;
        int i;
        t70 t70Var;
        boolean z;
        t57 t57Var;
        float f;
        nl0 nl0Var;
        iu iuVar;
        float f2;
        float f3;
        long jD;
        byte b = this.m;
        ea0 ea0Var = ea0.m;
        byte b2 = 5;
        byte b3 = 8;
        int i2 = 0;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return obj == ((r0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                String str = (String) obj;
                str.getClass();
                ((xd0) obj2).f1692o.setValue(str);
                return f88Var;
            case 2:
                zj5 zj5Var = (zj5) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == zj5Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != zj5Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                n9 n9Var = (n9) obj2;
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                n9Var.c.invoke(l33Var);
                n9Var.b.invoke(ea0Var);
                return f88Var;
            case 4:
                ja jaVar = (ja) obj2;
                l33 l33Var2 = (l33) obj;
                l33Var2.getClass();
                jaVar.c.invoke(l33Var2);
                jaVar.h.invoke(ea0Var);
                return f88Var;
            case 5:
                yb ybVar = (yb) obj2;
                ybVar.C.invoke((cp7) obj, xk0.q(ybVar, lh.b));
                return f88Var;
            case 6:
                c14 c14Var = (c14) obj2;
                me meVar = (me) obj;
                if (meVar.l() != Integer.MAX_VALUE) {
                    if (meVar.c().b) {
                        meVar.M();
                    }
                    for (Map.Entry entry2 : meVar.c().i.entrySet()) {
                        c14Var.a((ie) entry2.getKey(), ((Number) entry2.getValue()).intValue(), meVar.f());
                    }
                    e45 e45Var = meVar.f().K;
                    e45Var.getClass();
                    while (!e45Var.equals(c14Var.a.f())) {
                        for (ie ieVar : c14Var.b(e45Var).keySet()) {
                            c14Var.a(ieVar, c14Var.c(e45Var, ieVar), e45Var);
                        }
                        e45Var = e45Var.K;
                        e45Var.getClass();
                    }
                }
                return f88Var;
            case 7:
                return Boolean.valueOf(((br2) obj).c1(((wp2) obj2).a));
            case 8:
                qg4 qg4Var = (qg4) obj;
                AndroidComposeView androidComposeView = ((pg) obj2).B;
                if (androidComposeView.getInsetsListener().s.z() > 0) {
                    kw4 kw4Var = al8.a;
                    long j = qg4Var.a().j();
                    jx4 jx4Var = androidComposeView.getInsetsListener().r;
                    int i3 = (int) (j >> 32);
                    int i4 = (int) (j & 4294967295L);
                    for (yk8 yk8Var : al8.b) {
                        Object objG = jx4Var.g(yk8Var);
                        objG.getClass();
                        pl8 pl8Var = (pl8) objG;
                        al8.a(qg4Var, ((zk8) yk8Var).c, pl8Var.h, i3, i4);
                        if (((Boolean) pl8Var.b.getValue()).booleanValue()) {
                            al8.a(qg4Var, pl8Var.f, pl8Var.j, i3, i4);
                            al8.a(qg4Var, pl8Var.g, pl8Var.k, i3, i4);
                        }
                        al8.a(qg4Var, ((zk8) yk8Var).d, pl8Var.i, i3, i4);
                    }
                    zw4 zw4Var = androidComposeView.getInsetsListener().t;
                    if (zw4Var.i()) {
                        j57 j57Var = androidComposeView.getInsetsListener().u;
                        Object[] objArr = zw4Var.a;
                        int i5 = zw4Var.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            px4 px4Var = (px4) objArr[i6];
                            ui3 ui3Var = (ui3) j57Var.get(i6);
                            Rect rect = (Rect) px4Var.getValue();
                            qg4Var.b(ui3Var.b(), rect.left);
                            qg4Var.b(ui3Var.d(), rect.top);
                            qg4Var.b(ui3Var.c(), rect.right);
                            qg4Var.b(ui3Var.a(), rect.bottom);
                        }
                    }
                }
                return f88Var;
            case ep1.b /* 9 */:
                return Boolean.valueOf(((tk3) obj2).a(((fp6) obj).f));
            case ep1.c /* 10 */:
                return Boolean.valueOf(vn4.h0((fp6) obj, (Resources) obj2));
            case 11:
                ((op6) obj).d(uo6.a, new to6(l43.m, ((w65) obj2).a(), so6.n, true));
                return f88Var;
            case ep1.d /* 12 */:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.getClass();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("licenses");
                ?? arrayList3 = ea2.m;
                if (jSONArrayOptJSONArray == null) {
                    arrayList = arrayList3;
                } else {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        String string = jSONArrayOptJSONArray.getString(i7);
                        string.getClass();
                        arrayList.add((e84) linkedHashMap.get(string));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (e84 e84Var : arrayList) {
                    if (e84Var != null) {
                        arrayList4.add(e84Var);
                    }
                }
                HashSet hashSet = new HashSet(xm4.Q(mv0.Z(arrayList4, 12)));
                lv0.M0(arrayList4, hashSet);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("developers");
                if (jSONArrayOptJSONArray2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i8 = 0; i8 < length2; i8++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i8);
                        jSONObject2.getClass();
                        arrayList5.add(new sq1(qf0.Q(jSONObject2, "name"), qf0.Q(jSONObject2, "organisationUrl")));
                    }
                    r24 = arrayList5;
                } else {
                    r24 = arrayList3;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("organization");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    fb5Var = new fb5(strOptString, qf0.Q(jSONObjectOptJSONObject, "url"));
                } else {
                    fb5Var = null;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("scm");
                lj6 lj6Var = jSONObjectOptJSONObject2 != null ? new lj6(qf0.Q(jSONObjectOptJSONObject2, "connection"), qf0.Q(jSONObjectOptJSONObject2, "developerConnection"), qf0.Q(jSONObjectOptJSONObject2, "url")) : null;
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("funding");
                if (jSONArrayOptJSONArray3 == null) {
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = new ArrayList();
                    int length3 = jSONArrayOptJSONArray3.length();
                    for (int i9 = 0; i9 < length3; i9++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray3.getJSONObject(i9);
                        jSONObject3.getClass();
                        String string2 = jSONObject3.getString("platform");
                        string2.getClass();
                        String string3 = jSONObject3.getString("url");
                        string3.getClass();
                        arrayList2.add(new mx2(string2, string3));
                    }
                }
                Set setT0 = lv0.T0(arrayList2);
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("targets");
                if (jSONArrayOptJSONArray4 != null) {
                    arrayList3 = new ArrayList();
                    int length4 = jSONArrayOptJSONArray4.length();
                    for (int i10 = 0; i10 < length4; i10++) {
                        String string4 = jSONArrayOptJSONArray4.getString(i10);
                        string4.getClass();
                        arrayList3.add(string4);
                    }
                }
                Set setT1 = lv0.T0(arrayList3);
                String string5 = jSONObject.getString("uniqueId");
                string5.getClass();
                String strQ = qf0.Q(jSONObject, "artifactVersion");
                String strOptString2 = jSONObject.optString("name", string5);
                strOptString2.getClass();
                return new j74(string5, strQ, strOptString2, qf0.Q(jSONObject, "description"), qf0.Q(jSONObject, "website"), r24, fb5Var, lj6Var, hashSet, setT0, qf0.Q(jSONObject, "tag"), setT1);
            case 13:
                ((LayoutNode) obj2).y0((in1) obj);
                return f88Var;
            case 14:
                return new m8((n40) obj2, (byte) 4);
            case 15:
                return new m8((k08) obj2, b2);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((bf1) obj).getClass();
                return new g80(new r36((yx6) ((df6) obj2).n), Build.VERSION.SDK_INT >= 33);
            case 17:
                b90 b90Var = (b90) obj2;
                hi0 hi0Var = (hi0) obj;
                if (hi0Var.getDensity() * b90Var.D < 0.0f || y07.b(hi0Var.m.d()) <= 0.0f) {
                    return hi0Var.a(new px(b3));
                }
                final float fMin = Math.min(w32.b(b90Var.D, 0.0f) ? 1.0f : (float) Math.ceil(hi0Var.getDensity() * b90Var.D), (float) Math.ceil(y07.b(hi0Var.m.d()) / 2.0f));
                final float f4 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (hi0Var.m.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (hi0Var.m.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f5 = fMin * 2.0f;
                boolean z2 = f5 > y07.b(hi0Var.m.d());
                vs1 vs1VarA = b90Var.F.a(hi0Var.m.d(), hi0Var.m.getLayoutDirection(), hi0Var);
                if (!(vs1VarA instanceof nb5)) {
                    if (!(vs1VarA instanceof pb5)) {
                        boolean z3 = z2;
                        if (!(vs1VarA instanceof ob5)) {
                            gk0.s();
                            return null;
                        }
                        final t57 t57Var2 = b90Var.E;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j2 = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = hi0Var.m.d();
                        }
                        final long j3 = jFloatToRawIntBits2;
                        final v52 cc7Var = z3 ? zk2.a : new cc7(fMin, 0.0f, 0, 0, 30);
                        return hi0Var.a(new Function1() { // from class: o.v80
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                d14 d14Var = (d14) obj3;
                                d14Var.a();
                                u52.x(d14Var, t57Var2, j2, j3, 0.0f, cc7Var, null, 104);
                                return f88.a;
                            }
                        });
                    }
                    final t57 t57Var3 = b90Var.E;
                    lf6 lf6Var = ((pb5) vs1VarA).e;
                    if (xo1.T(lf6Var)) {
                        final long j4 = lf6Var.e;
                        final cc7 cc7Var2 = new cc7(fMin, 0.0f, 0, 0, 30);
                        final boolean z4 = z2;
                        return hi0Var.a(new Function1() { // from class: o.z80
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) throws Throwable {
                                long j5;
                                d14 d14Var = (d14) obj3;
                                d14Var.a();
                                nl0 nl0Var2 = d14Var.m;
                                boolean z5 = z4;
                                sb0 sb0Var = t57Var3;
                                long j6 = j4;
                                if (z5) {
                                    u52.n(d14Var, sb0Var, 0L, 0L, j6, 0.0f, null, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nl0Var2.d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (nl0Var2.d() & 4294967295L)) - f7;
                                        iu iuVar2 = nl0Var2.n;
                                        long jD2 = iuVar2.D();
                                        iuVar2.x().g();
                                        try {
                                            ((xc0) iuVar2.f1103o).D(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j5 = jD2;
                                            try {
                                                u52.n(d14Var, sb0Var, 0L, 0L, j6, 0.0f, null, null, 246);
                                                ua5.x(iuVar2, j5);
                                            } catch (Throwable th) {
                                                th = th;
                                                ua5.x(iuVar2, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = jD2;
                                        }
                                    } else {
                                        u52.n(d14Var, sb0Var, jFloatToRawIntBits, jFloatToRawIntBits2, uf0.x(f6, j6), 0.0f, cc7Var2, null, 208);
                                    }
                                }
                                return f88.a;
                            }
                        });
                    }
                    boolean z5 = z2;
                    s80 s80Var = b90Var.C;
                    if (s80Var == null) {
                        s80Var = new s80();
                        b90Var.C = s80Var;
                    }
                    rj rjVarA = s80Var.d;
                    if (rjVarA == null) {
                        rjVarA = tj.a();
                        s80Var.d = rjVarA;
                    }
                    rjVarA.g();
                    rj.c(rjVarA, lf6Var);
                    if (!z5) {
                        rj rjVarA2 = tj.a();
                        rj.c(rjVarA2, new lf6(fMin, fMin, lf6Var.b() - fMin, lf6Var.a() - fMin, uf0.x(fMin, lf6Var.e), uf0.x(fMin, lf6Var.f), uf0.x(fMin, lf6Var.g), uf0.x(fMin, lf6Var.h)));
                        rjVarA.f(rjVarA, rjVarA2, 0);
                    }
                    return hi0Var.a(new g0(rjVarA, t57Var3, (byte) 16));
                }
                t57 t57Var4 = b90Var.E;
                nb5 nb5Var = (nb5) vs1VarA;
                rj rjVar = nb5Var.e;
                if (z2) {
                    return hi0Var.a(new g0(nb5Var, t57Var4, (byte) 17));
                }
                if (t57Var4 != null) {
                    t70Var = new t70(5, rv0.b(1.0f, t57Var4.a));
                    i = 1;
                } else {
                    i = 0;
                    t70Var = null;
                }
                v56 v56VarD = rjVar.d();
                float f6 = v56VarD.b;
                float f7 = v56VarD.a;
                s80 s80Var2 = b90Var.C;
                if (s80Var2 == null) {
                    s80Var2 = new s80();
                    b90Var.C = s80Var2;
                }
                rj rjVarA3 = s80Var2.d;
                if (rjVarA3 == null) {
                    rjVarA3 = tj.a();
                    s80Var2.d = rjVarA3;
                }
                rjVarA3.g();
                rj.b(rjVarA3, v56VarD);
                rjVarA3.f(rjVarA3, rjVar, 0);
                k76 k76Var = new k76();
                rj rjVar2 = rjVarA3;
                long jCeil = (((long) ((int) Math.ceil(v56VarD.c - f7))) << 32) | (((long) ((int) Math.ceil(v56VarD.d - f6))) & 4294967295L);
                s80 s80Var3 = b90Var.C;
                s80Var3.getClass();
                vi viVarQ = s80Var3.a;
                cg cgVarA = s80Var3.b;
                yd3 yd3Var = viVarQ != null ? new yd3(viVarQ.a()) : null;
                if (yd3Var != null && yd3Var.a == 0) {
                    z = true;
                } else {
                    yd3 yd3Var2 = viVarQ != null ? new yd3(viVarQ.a()) : null;
                    if (yd3Var2 != null && i == yd3Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (viVarQ == null || cgVarA == null) {
                            t57Var = t57Var4;
                            f = 1.0f;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (hi0Var.m.d() >> 32));
                            Bitmap bitmap = viVarQ.a;
                            f = 1.0f;
                            if (fIntBitsToFloat <= bitmap.getWidth()) {
                                t57Var = t57Var4;
                                if (Float.intBitsToFloat((int) (hi0Var.m.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                                }
                                nl0Var = s80Var3.c;
                                if (nl0Var == null) {
                                    nl0Var = new nl0();
                                    s80Var3.c = nl0Var;
                                }
                                iuVar = nl0Var.n;
                                ml0 ml0Var = nl0Var.m;
                                t70 t70Var2 = t70Var;
                                long jA0 = xs1.a0(jCeil);
                                j04 layoutDirection = hi0Var.m.getLayoutDirection();
                                nl0 nl0Var2 = nl0Var;
                                in1 in1Var = ml0Var.a;
                                j04 j04Var = ml0Var.b;
                                t57 t57Var5 = t57Var;
                                ll0 ll0Var = ml0Var.c;
                                long j5 = ml0Var.d;
                                ml0Var.a = hi0Var;
                                ml0Var.b = layoutDirection;
                                ml0Var.c = cgVarA;
                                ml0Var.d = jA0;
                                cgVarA.g();
                                u52.k0(nl0Var2, rv0.b, jA0, 0.0f, 58);
                                f2 = -f7;
                                f3 = -f6;
                                ((xc0) iuVar.f1103o).V(f2, f3);
                                u52.H0(nl0Var2, nb5Var.e, t57Var5, 0.0f, new cc7(f5, 0.0f, 0, 0, 30), null, 52);
                                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (nl0Var2.d() >> 32)) + f) / Float.intBitsToFloat((int) (nl0Var2.d() >> 32));
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (nl0Var2.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (nl0Var2.d() & 4294967295L));
                                vi viVar = viVarQ;
                                cg cgVar = cgVarA;
                                long jT0 = nl0Var2.t0();
                                jD = iuVar.D();
                                iuVar.x().g();
                                ((xc0) iuVar.f1103o).U(fIntBitsToFloat2, fIntBitsToFloat3, jT0);
                                u52.H0(nl0Var2, rjVar2, t57Var5, 0.0f, null, null, 28);
                                iuVar.x().p();
                                iuVar.S(jD);
                                ((xc0) iuVar.f1103o).V(-f2, -f3);
                                cgVar.p();
                                ml0Var.a = in1Var;
                                ml0Var.b = j04Var;
                                ml0Var.c = ll0Var;
                                ml0Var.d = j5;
                                viVar.a.prepareToDraw();
                                k76Var.m = viVar;
                                return hi0Var.a(new a90(v56VarD, k76Var, jCeil, t70Var2));
                            }
                            t57Var = t57Var4;
                        }
                        ((xc0) iuVar.f1103o).U(fIntBitsToFloat2, fIntBitsToFloat3, jT0);
                        u52.H0(nl0Var2, rjVar2, t57Var5, 0.0f, null, null, 28);
                        iuVar.x().p();
                        iuVar.S(jD);
                        ((xc0) iuVar.f1103o).V(-f2, -f3);
                        cgVar.p();
                        ml0Var.a = in1Var;
                        ml0Var.b = j04Var;
                        ml0Var.c = ll0Var;
                        ml0Var.d = j5;
                        viVar.a.prepareToDraw();
                        k76Var.m = viVar;
                        return hi0Var.a(new a90(v56VarD, k76Var, jCeil, t70Var2));
                    } catch (Throwable th) {
                        iuVar.x().p();
                        iuVar.S(jD);
                        throw th;
                    }
                    u52.H0(nl0Var2, nb5Var.e, t57Var5, 0.0f, new cc7(f5, 0.0f, 0, 0, 30), null, 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (nl0Var2.d() >> 32)) + f) / Float.intBitsToFloat((int) (nl0Var2.d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (nl0Var2.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (nl0Var2.d() & 4294967295L));
                    vi viVar2 = viVarQ;
                    cg cgVar2 = cgVarA;
                    long jT1 = nl0Var2.t0();
                    jD = iuVar.D();
                    iuVar.x().g();
                } catch (Throwable th2) {
                    ((xc0) iuVar.f1103o).V(-f2, -f3);
                    throw th2;
                }
                viVarQ = ds1.q((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                s80Var3.a = viVarQ;
                cgVarA = dg.a(viVarQ);
                s80Var3.b = cgVarA;
                nl0Var = s80Var3.c;
                if (nl0Var == null) {
                    nl0Var = new nl0();
                    s80Var3.c = nl0Var;
                }
                iuVar = nl0Var.n;
                ml0 ml0Var2 = nl0Var.m;
                t70 t70Var3 = t70Var;
                long jA1 = xs1.a0(jCeil);
                j04 layoutDirection2 = hi0Var.m.getLayoutDirection();
                nl0 nl0Var3 = nl0Var;
                in1 in1Var2 = ml0Var2.a;
                j04 j04Var2 = ml0Var2.b;
                t57 t57Var6 = t57Var;
                ll0 ll0Var2 = ml0Var2.c;
                long j6 = ml0Var2.d;
                ml0Var2.a = hi0Var;
                ml0Var2.b = layoutDirection2;
                ml0Var2.c = cgVarA;
                ml0Var2.d = jA1;
                cgVarA.g();
                u52.k0(nl0Var3, rv0.b, jA1, 0.0f, 58);
                f2 = -f7;
                f3 = -f6;
                ((xc0) iuVar.f1103o).V(f2, f3);
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                db0 db0Var = (db0) obj2;
                v56 v56Var = (v56) obj;
                if (db0Var.z) {
                    im3.R(db0Var.I0(), null, null, new h0((Object) db0Var, (Object) v56Var, hc1Var, (byte) 15), 3);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((TextView) ((yt2) obj2).f2642o).setText((String) obj);
                return f88Var;
            case 20:
                Integer num = (Integer) obj;
                num.getClass();
                ((ud0) obj2).v.setValue(num);
                return f88Var;
            case 21:
                ae0 ae0Var = (ae0) obj2;
                ShimmerFrameLayout shimmerFrameLayout = ae0Var.B0;
                if (shimmerFrameLayout == null) {
                    im3.e0("shimmerContainer");
                    throw null;
                }
                shimmerFrameLayout.setVisibility(8);
                yd0 yd0Var = ae0Var.t0;
                if (yd0Var != null) {
                    String str2 = yd0Var.d;
                    ce0 ce0Var = yd0Var.c;
                    yd0Var.j = (ce0Var == null || ce0Var.V0(str2) <= 0) ? 0 : 1;
                    if (ce0Var != null) {
                        str2.getClass();
                        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ce0Var.n;
                        if ((pLManagerGroupsListV2ViewModel != null ? (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str2) : 0) > 0) {
                            i2 = 1;
                        }
                    }
                    yd0Var.k = i2;
                    yd0Var.d();
                }
                return f88Var;
            case 22:
                yo0 yo0Var = (yo0) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                yo0Var.C0 = bool.booleanValue();
                xt2 xt2VarC = yo0Var.C();
                if (xt2VarC != null) {
                    xt2VarC.invalidateOptionsMenu();
                }
                return f88Var;
            case 23:
                CancellationSignal cancellationSignal = (CancellationSignal) obj2;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return f88Var;
            case 24:
                c01 c01Var = (c01) obj2;
                wk wkVar = c01Var.x;
                if (wkVar != null) {
                    return wkVar;
                }
                wk wkVar2 = new wk(c01Var.a);
                c01Var.x = wkVar2;
                return wkVar2;
            case 25:
                jf8 jf8Var = (jf8) obj2;
                View view = ((kf8) ((u01) obj).T(h63.a)).a;
                while (view != null) {
                    Object tag = view.getTag(jf8Var.n());
                    if (tag != null) {
                        return tag;
                    }
                    Object objQ = i67.q(view);
                    view = objQ instanceof View ? (View) objQ : null;
                }
                return null;
            case 26:
                PListComputerID pListComputerID = (PListComputerID) obj2;
                ComputerEditViewModel computerEditViewModel = (ComputerEditViewModel) obj;
                computerEditViewModel.getClass();
                PListDyngateID pListDyngateIDA = computerEditViewModel.a();
                String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
                if (!ComputerEditViewModelSWIGJNI.ComputerEditViewModel_IsITbRemoteAccessActivated(computerEditViewModel.a, computerEditViewModel)) {
                    int i11 = wt6.k;
                    strPListDyngateID_GetAsString.getClass();
                    return vt6.a(60, strPListDyngateID_GetAsString, ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetPassword(computerEditViewModel.a, computerEditViewModel), null);
                }
                int i12 = wt6.k;
                String strComputerEditViewModel_GetPassword = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetPassword(computerEditViewModel.a, computerEditViewModel);
                strComputerEditViewModel_GetPassword.getClass();
                return vt6.b(PListComputerIDSWIGJNI.PListComputerID_GetInternalID(pListComputerID.a, pListComputerID), strComputerEditViewModel_GetPassword, strPListDyngateID_GetAsString);
            case 27:
                y21 y21Var = (y21) obj2;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                y21Var.s0 = bool2.booleanValue();
                xt2 xt2VarC2 = y21Var.C();
                if (xt2VarC2 != null) {
                    xt2VarC2.invalidateOptionsMenu();
                }
                return f88Var;
            case 28:
                ConnectInterfaceActivity connectInterfaceActivity = (ConnectInterfaceActivity) obj2;
                int i13 = ConnectInterfaceActivity.J;
                Intent intent = connectInterfaceActivity.getIntent();
                intent.getClass();
                au6 au6Var = bt1.b;
                if (au6Var == null) {
                    im3.e0("instance");
                    throw null;
                }
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                Intent intent2 = new Intent(connectInterfaceActivity, (Class<?>) MainActivity.class);
                ConnectInterfaceActivity.D(intent2, intent);
                au6Var.h = intent2;
                au6Var.i = connectInterfaceActivity;
                au6Var.j = true;
                return f88Var;
            default:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                lp6.d(op6Var, au8.R(((z31) obj2).a));
                return f88Var;
        }
    }
}
