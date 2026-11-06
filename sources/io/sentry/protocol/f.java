package io.sentry.protocol;

import io.sentry.g1;
import io.sentry.g7;
import io.sentry.t2;
import io.sentry.x3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements t2 {
    public t m;
    public List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f229o;

    public static f a(f fVar, g7 g7Var) {
        DebugImage debugImage;
        ArrayList<DebugImage> arrayList = new ArrayList();
        if (g7Var.getProguardUuid() != null) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.PROGUARD);
            debugImage2.setUuid(g7Var.getProguardUuid());
            arrayList.add(debugImage2);
        }
        for (String str : g7Var.getBundleIds()) {
            DebugImage debugImage3 = new DebugImage();
            debugImage3.setType(DebugImage.JVM);
            debugImage3.setDebugId(str);
            arrayList.add(debugImage3);
        }
        if (fVar == null && arrayList.isEmpty()) {
            return null;
        }
        if (fVar == null) {
            fVar = new f();
        }
        if (!arrayList.isEmpty()) {
            if (fVar.n == null) {
                fVar.b(new ArrayList());
            }
            List list = fVar.n;
            if (list != null) {
                for (DebugImage debugImage4 : arrayList) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            list.add(debugImage4);
                            break;
                        }
                        debugImage = (DebugImage) it.next();
                    } while (!(DebugImage.PROGUARD.equals(debugImage4.getType()) ? DebugImage.PROGUARD.equals(debugImage.getType()) : DebugImage.JVM.equals(debugImage4.getType()) && DebugImage.JVM.equals(debugImage.getType()) && debugImage4.getDebugId() != null && debugImage4.getDebugId().equals(debugImage.getDebugId())));
                }
            }
        }
        return fVar;
    }

    public final void b(List list) {
        this.n = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.t2
    public final void serialize(x3 x3Var, g1 g1Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) x3Var;
        cVar.k();
        if (this.m != null) {
            cVar.r("sdk_info");
            cVar.x(g1Var, this.m);
        }
        if (this.n != null) {
            cVar.r("images");
            cVar.x(g1Var, this.n);
        }
        HashMap map = this.f229o;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.f.a(this.f229o, str, cVar, str, g1Var);
            }
        }
        cVar.m();
    }
}
