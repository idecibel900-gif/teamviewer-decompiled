package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nn extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ on f1580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(on onVar, long j) {
        super(1);
        this.n = (byte) 2;
        this.f1580o = onVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i97 i97Var;
        byte b = this.n;
        f88 f88Var = f88.a;
        on onVar = this.f1580o;
        switch (b) {
            case 0:
                jl5 jl5Var = onVar.E;
                jl5Var.getClass();
                long j = onVar.G;
                long j2 = (((long) jl5Var.m) << 32) | (((long) jl5Var.n) & 4294967295L);
                il5.j((il5) obj, jl5Var, (((long) Math.round((1.0f - 1.0f) * ((((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f))) << 32) | (4294967295L & ((long) Math.round((1.0f - 1.0f) * ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f)))));
                return f88Var;
            case 1:
                jl5 jl5Var2 = onVar.D;
                jl5Var2.getClass();
                long j3 = onVar.F;
                long j4 = (((long) jl5Var2.n) & 4294967295L) | (((long) jl5Var2.m) << 32);
                il5.j((il5) obj, jl5Var2, (((long) Math.round((1.0f - 1.0f) * ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) / 2.0f))) & 4294967295L));
                return f88Var;
            default:
                o18 o18Var = (o18) obj;
                if (!im3.n(o18Var.b(), onVar.C.b()) && (i97Var = (i97) onVar.C.c.g(o18Var.b())) != null) {
                    long j5 = ((dl3) i97Var.getValue()).a;
                }
                i97 i97Var2 = (i97) onVar.C.c.g(o18Var.d());
                if (i97Var2 != null) {
                    long j6 = ((dl3) i97Var2.getValue()).a;
                }
                if (((b17) onVar.B.getValue()) == null) {
                    return db8.A0(0.0f, 400.0f, null, 5);
                }
                Map map = sg8.a;
                return db8.A0(0.0f, 400.0f, new dl3(4294967297L), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn(on onVar, byte b) {
        super(1);
        this.n = b;
        this.f1580o = onVar;
    }
}
