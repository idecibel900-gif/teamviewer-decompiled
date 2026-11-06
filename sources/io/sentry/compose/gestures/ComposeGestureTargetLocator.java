package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import io.sentry.d6;
import io.sentry.g1;
import io.sentry.internal.debugmeta.c;
import io.sentry.internal.gestures.a;
import io.sentry.internal.gestures.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.bp6;
import o.ep1;
import o.fs4;
import o.gs4;
import o.iq8;
import o.np6;
import o.ti3;
import o.v56;
import o.vd5;
import o.xw4;
import o.xx4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/g1;", "logger", "<init>", "(Lio/sentry/g1;)V", "sentry-compose_release"}, k = 1, mv = {1, ep1.b, 0}, xi = 48)
public final class ComposeGestureTargetLocator implements a {
    public final g1 a;
    public volatile c b;
    public final io.sentry.util.a c;

    public ComposeGestureTargetLocator(g1 g1Var) {
        g1Var.getClass();
        this.a = g1Var;
        this.c = new io.sentry.util.a();
        d6.d().b("maven:io.sentry:sentry-compose", "8.58.0");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f, float f2, b bVar) {
        String str;
        v56 v56Var;
        long j;
        String strP;
        String str2;
        bVar.getClass();
        String str3 = null;
        if (!(view instanceof Owner)) {
            return null;
        }
        if (this.b == null) {
            io.sentry.util.a aVar = this.c;
            aVar.e();
            try {
                if (this.b == null) {
                    this.b = new c(this.a, (byte) 14);
                }
                iq8.l(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(aVar, th);
                    throw th2;
                }
            }
        }
        LayoutNode root = ((Owner) view).getRoot();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new vd5(root, null));
        String str4 = null;
        while (!arrayDeque.isEmpty()) {
            vd5 vd5Var = (vd5) arrayDeque.poll();
            if (vd5Var == null) {
                str = str3;
            } else {
                LayoutNode layoutNode = (LayoutNode) vd5Var.m;
                String str5 = (String) vd5Var.n;
                if (layoutNode.X()) {
                    ti3 ti3Var = (ti3) layoutNode.S.d;
                    ti3 ti3Var2 = (ti3) root.S.d;
                    float fJ = (int) (ti3Var2.j() >> 32);
                    float fJ2 = (int) (ti3Var2.j() & 4294967295L);
                    v56 v56VarB = ti3Var2.b(ti3Var, true);
                    float f3 = v56VarB.a;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > fJ) {
                        f3 = fJ;
                    }
                    str = str3;
                    float f4 = v56VarB.b;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > fJ2) {
                        f4 = fJ2;
                    }
                    float f5 = v56VarB.c;
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 <= fJ) {
                        fJ = f5;
                    }
                    float f6 = v56VarB.d;
                    float f7 = f6 >= 0.0f ? f6 : 0.0f;
                    if (f7 <= fJ2) {
                        fJ2 = f7;
                    }
                    if (f3 == fJ || f4 == fJ2) {
                        v56Var = v56.e;
                        j = 4294967295L;
                    } else {
                        j = 4294967295L;
                        float f8 = f4;
                        long jE = ti3Var2.e((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
                        long jE2 = ti3Var2.e((((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                        long jE3 = ti3Var2.e((((long) Float.floatToRawIntBits(fJ2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                        long jE4 = ti3Var2.e((((long) Float.floatToRawIntBits(fJ2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
                        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
                        v56Var = new v56(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                    }
                    if (v56Var.a((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & j))) {
                        c cVar = this.b;
                        cVar.getClass();
                        List listD = layoutNode.D();
                        int size = listD.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                strP = str;
                                break;
                            }
                            strP = cVar.p(((gs4) listD.get(i)).a);
                            if (strP != null) {
                                break;
                            }
                            i++;
                        }
                        String str6 = strP == null ? str5 : strP;
                        if (str6 != null) {
                            List listD2 = layoutNode.D();
                            int size2 = listD2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                fs4 fs4Var = ((gs4) listD2.get(i2)).a;
                                if (fs4Var instanceof bp6) {
                                    Iterator it = ((bp6) fs4Var).g().iterator();
                                    while (it.hasNext()) {
                                        String str7 = ((np6) ((Map.Entry) it.next()).getKey()).a;
                                        if (bVar == b.SCROLLABLE && "ScrollBy".equals(str7)) {
                                            return new io.sentry.internal.gestures.c(null, null, null, str6, "jetpack_compose");
                                        }
                                        if (bVar == b.CLICKABLE && "OnClick".equals(str7)) {
                                            str4 = str6;
                                        }
                                    }
                                } else {
                                    String name = fs4Var.getClass().getName();
                                    if (bVar == b.CLICKABLE && ("androidx.compose.foundation.ClickableElement".equals(name) || "androidx.compose.foundation.CombinedClickableElement".equals(name))) {
                                        str4 = str6;
                                        str2 = str4;
                                    } else if (bVar == b.SCROLLABLE && ("androidx.compose.foundation.ScrollingLayoutElement".equals(name) || "androidx.compose.foundation.ScrollingContainerElement".equals(name))) {
                                        return new io.sentry.internal.gestures.c(null, null, null, str6, "jetpack_compose");
                                    }
                                    i2++;
                                    str6 = str2;
                                }
                                str2 = str6;
                                i2++;
                                str6 = str2;
                            }
                        }
                        String str8 = str6;
                        xw4 xw4Var = (xw4) layoutNode.K().f();
                        int i3 = ((xx4) xw4Var.n).f2559o;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayDeque.add(new vd5(xw4Var.get(i4), str8));
                        }
                    } else {
                        continue;
                    }
                } else {
                    str = str3;
                }
            }
            str3 = str;
        }
        return str4 == null ? str3 : new io.sentry.internal.gestures.c(null, null, null, str4, "jetpack_compose");
    }
}
