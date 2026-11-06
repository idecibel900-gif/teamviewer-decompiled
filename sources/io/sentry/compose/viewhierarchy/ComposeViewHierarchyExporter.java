package io.sentry.compose.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import io.sentry.g1;
import io.sentry.internal.debugmeta.c;
import io.sentry.protocol.k0;
import io.sentry.util.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o.ep1;
import o.gs4;
import o.ti3;
import o.v56;
import o.vt1;
import o.xx4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/g1;", "logger", "<init>", "(Lio/sentry/g1;)V", "sentry-compose_release"}, k = 1, mv = {1, ep1.b, 0}, xi = 48)
public final class ComposeViewHierarchyExporter {
    public final g1 a;
    public volatile c b;
    public final a c;

    public ComposeViewHierarchyExporter(g1 g1Var) {
        g1Var.getClass();
        this.a = g1Var;
        this.c = new a();
    }

    public static void a(c cVar, k0 k0Var, LayoutNode layoutNode) {
        if (layoutNode.X()) {
            k0 k0Var2 = new k0();
            Iterator it = layoutNode.D().iterator();
            while (it.hasNext()) {
                String strP = cVar.p(((gs4) it.next()).a);
                if (strP != null) {
                    k0Var2.p = strP;
                }
            }
            v56 v56VarL = vt1.l((ti3) layoutNode.S.d);
            float f = v56VarL.a;
            k0Var2.s = Double.valueOf(f);
            float f2 = v56VarL.b;
            k0Var2.t = Double.valueOf(f2);
            k0Var2.r = Double.valueOf(v56VarL.d - f2);
            k0Var2.q = Double.valueOf(v56VarL.c - f);
            String str = k0Var2.p;
            if (str == null) {
                str = "@Composable";
            }
            k0Var2.n = str;
            List arrayList = k0Var.w;
            if (arrayList == null) {
                arrayList = new ArrayList();
                k0Var.w = arrayList;
            }
            arrayList.add(k0Var2);
            xx4 xx4VarK = layoutNode.K();
            int i = xx4VarK.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                a(cVar, k0Var2, (LayoutNode) xx4VarK.m[i2]);
            }
        }
    }
}
