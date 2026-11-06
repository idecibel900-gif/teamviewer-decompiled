package o;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class yp1 implements Function0 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2629o;
    public final Object p;

    public /* synthetic */ yp1(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f2629o = obj2;
        this.p = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        Object obj = this.p;
        Object obj2 = this.f2629o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return ((ys3) obj3).a((ByteArrayInputStream) obj2, (dg2) ((io.sentry.android.replay.screenshot.k) ((aq1) obj).b.a).p);
            case 1:
                au3 au3Var = (au3) obj2;
                eu3 eu3Var = (eu3) obj;
                ys0 ys0VarA = ((oz3) obj3).o0().a();
                if (!(ys0VarA instanceof ns4)) {
                    hk0.q(ys0VarA, "Supertype not a class: ");
                    return null;
                }
                Class clsJ = pa8.j((ns4) ys0VarA);
                if (clsJ == null) {
                    throw new kz3("Unsupported superclass of " + au3Var + ": " + ys0VarA);
                }
                Class cls = eu3Var.n;
                if (im3.n(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iW0 = cx.W0(clsJ, interfaces);
                if (iW0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iW0];
                    type.getClass();
                    return type;
                }
                throw new kz3("No superclass of " + au3Var + " in Java reflection for " + ys0VarA);
            case 2:
                s24 s24Var = (s24) obj3;
                return new ud4(((io3) s24Var.b.m).a, new e3(s24Var, (g86) obj2, (k76) obj));
            default:
                ((Function1) obj3).invoke(new e3((byte) 20, (Function1) obj2, (z31) obj, false));
                return f88.a;
        }
    }
}
