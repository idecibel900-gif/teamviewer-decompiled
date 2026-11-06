package o;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;

/* JADX INFO: loaded from: classes.dex */
public final class vx {
    public static final vx a = new vx();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(i46 i46Var, ke3 ke3Var, jc1 jc1Var) {
        ux uxVar;
        if (jc1Var instanceof ux) {
            uxVar = (ux) jc1Var;
            int i = uxVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxVar.p = i - Integer.MIN_VALUE;
            } else {
                uxVar = new ux(this, jc1Var);
            }
        } else {
            uxVar = new ux(this, jc1Var);
        }
        Object objC = uxVar.n;
        int i2 = uxVar.p;
        if (i2 == 0) {
            ct1.a0(objC);
            uxVar.m = ke3Var;
            uxVar.p = 1;
            objC = i46Var.c(ke3Var, uxVar);
            Object obj = ne1.m;
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ke3Var = uxVar.m;
            ct1.a0(objC);
        }
        se3 se3Var = (se3) objC;
        if (se3Var instanceof me7) {
            me7 me7Var = (me7) se3Var;
            return new AsyncImagePainter$State$Success(us1.p(me7Var.a, ke3Var.a, 1), me7Var);
        }
        if (!(se3Var instanceof bd2)) {
            gk0.s();
            return null;
        }
        bd2 bd2Var = (bd2) se3Var;
        xd3 xd3Var = bd2Var.a;
        return new AsyncImagePainter$State$Error(xd3Var != null ? us1.p(xd3Var, ke3Var.a, 1) : null, bd2Var);
    }
}
