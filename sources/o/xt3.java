package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class xt3 implements Function0 {
    public final /* synthetic */ byte m;
    public final eu3 n;

    public xt3(eu3 eu3Var, au3 au3Var) {
        this.m = (byte) 6;
        this.n = eu3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws InvocationTargetException {
        ns4 ns4VarQ;
        byte b = this.m;
        mu3 mu3Var = mu3.m;
        mu3 mu3Var2 = mu3.n;
        eu3 eu3Var = this.n;
        switch (b) {
            case 0:
                return new au3(eu3Var);
            case 1:
                int i = eu3.p;
                js0 js0VarA = eu3Var.A();
                Class cls = eu3Var.n;
                u86 u86Var = ((au3) eu3Var.f743o.getValue()).a;
                fw3 fw3Var = lu3.b[0];
                Object objA = u86Var.a();
                objA.getClass();
                mg6 mg6Var = (mg6) objA;
                io.sentry.android.replay.screenshot.k kVar = mg6Var.a;
                ps4 ps4Var = (ps4) kVar.b;
                if (js0VarA.c && cls.isAnnotationPresent(Metadata.class)) {
                    es0 es0Var = (es0) kVar.t;
                    Set set = es0.c;
                    ns4VarQ = es0Var.a(js0VarA, null);
                } else {
                    ns4VarQ = vs1.q(ps4Var, js0VarA);
                }
                if (ns4VarQ != null) {
                    return ns4VarQ;
                }
                if (cls.isSynthetic()) {
                    return eu3.z(js0VarA, mg6Var);
                }
                r86 r86VarY = ct1.y(cls);
                xy3 xy3Var = r86VarY != null ? r86VarY.b.a : null;
                switch (xy3Var != null ? bu3.a[xy3Var.ordinal()] : -1) {
                    case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    case 6:
                        yq4.n("Unresolved class: ", cls, " (kind = ", xy3Var);
                        return null;
                    case 0:
                    default:
                        gk0.s();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return eu3.z(js0VarA, mg6Var);
                    case 5:
                        yq4.n("Unknown class: ", cls, " (kind = ", xy3Var);
                        return null;
                }
            case 2:
                return eu3Var.s(eu3Var.B().W().I(), mu3Var);
            case 3:
                zo4 zo4VarP0 = eu3Var.B().p0();
                zo4VarP0.getClass();
                return eu3Var.s(zo4VarP0, mu3Var);
            case 4:
                return eu3Var.s(eu3Var.B().W().I(), mu3Var2);
            case 5:
                zo4 zo4VarP1 = eu3Var.B().p0();
                zo4VarP1.getClass();
                return eu3Var.s(zo4VarP1, mu3Var2);
            case 6:
                Class cls2 = eu3Var.n;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                js0 js0VarA2 = eu3Var.A();
                if (!js0VarA2.c) {
                    String strB = js0VarA2.f().b();
                    strB.getClass();
                    return strB;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return ub7.p0(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    int iY = ub7.Y(simpleName, '$', 0, 6);
                    return iY == -1 ? simpleName : simpleName.substring(iY + 1, simpleName.length());
                }
                return ub7.p0(simpleName, enclosingConstructor.getName() + '$');
            case 7:
                if (eu3Var.n.isAnonymousClass()) {
                    return null;
                }
                js0 js0VarA3 = eu3Var.A();
                if (js0VarA3.c) {
                    return null;
                }
                return js0VarA3.a().b();
            default:
                Collection collectionN = eu3Var.n();
                ArrayList arrayList = new ArrayList(mv0.Z(collectionN, 10));
                Iterator it = collectionN.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ru3(eu3Var, (z61) it.next()));
                }
                return arrayList;
        }
    }

    public /* synthetic */ xt3(eu3 eu3Var, byte b) {
        this.m = b;
        this.n = eu3Var;
    }
}
