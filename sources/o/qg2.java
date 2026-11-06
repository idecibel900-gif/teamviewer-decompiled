package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qg2 {
    public static z43 a(cl8 cl8Var, FoldingFeature foldingFeature) {
        hr2 hr2Var;
        hr2 hr2Var2;
        cl8Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            hr2Var = hr2.u;
        } else {
            if (type != 2) {
                return null;
            }
            hr2Var = hr2.v;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            hr2Var2 = hr2.s;
        } else {
            if (state != 2) {
                return null;
            }
            hr2Var2 = hr2.t;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        ma0 ma0Var = new ma0(bounds);
        Rect rectC = cl8Var.a.c();
        if (ma0Var.a() == 0 && ma0Var.b() == 0) {
            return null;
        }
        if (ma0Var.b() != rectC.width() && ma0Var.a() != rectC.height()) {
            return null;
        }
        if (ma0Var.b() < rectC.width() && ma0Var.a() < rectC.height()) {
            return null;
        }
        if (ma0Var.b() == rectC.width() && ma0Var.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new z43(new ma0(bounds2), hr2Var, hr2Var2);
    }

    public static bl8 b(Context context, WindowLayoutInfo windowLayoutInfo) {
        gl8 gl8Var = z06.L;
        qa0 qa0Var = qa0.n;
        kn1 kn1Var = kn1.n;
        int i = Build.VERSION.SDK_INT;
        jn1 jn1Var = i >= 34 ? kn1.m : xz2.I;
        qf0.p(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                gl8Var = kn1Var;
            } else if (i >= 30) {
                gl8Var = qa0Var;
            }
            return c(gl8Var.c(context, jn1Var), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            yq4.r("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            gl8Var = kn1Var;
        } else if (i >= 30) {
            gl8Var = qa0Var;
        }
        return c(gl8Var.h(activity, jn1Var), windowLayoutInfo);
    }

    public static bl8 c(cl8 cl8Var, WindowLayoutInfo windowLayoutInfo) {
        cl8Var.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            z43 z43VarA = foldingFeature instanceof FoldingFeature ? a(cl8Var, foldingFeature) : null;
            if (z43VarA != null) {
                arrayList.add(z43VarA);
            }
        }
        return new bl8(arrayList);
    }
}
