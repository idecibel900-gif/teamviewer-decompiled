package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class n40 implements op7 {
    public final yy0 a;
    public final iy4 b = new iy4();
    public final bg5 c = h57.p(null);

    public n40(yy0 yy0Var) {
        this.a = yy0Var;
    }

    @Override // o.op7
    public final Object a(fp7 fp7Var, og7 og7Var) {
        Object objA = iy4.a(this.b, new jf(this, new m40(fp7Var), null, (byte) 2), og7Var);
        return objA == ne1.m ? objA : f88.a;
    }

    public final void b(final Function0 function0, ux2 ux2Var, final int i) {
        final Function0 function1;
        ux2 ux2Var2;
        ux2Var.Y(723898654);
        int i2 = (ux2Var.f(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            m40 m40Var = (m40) this.c.getValue();
            if (m40Var == null) {
                j56 j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2(this, function0, i, b) { // from class: o.l40
                        public final /* synthetic */ byte m;
                        public final /* synthetic */ n40 n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Function0 f1327o;

                        {
                            this.m = b;
                            this.n = this;
                        }

                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.m;
                            f88 f88Var = f88.a;
                            Function0 function2 = this.f1327o;
                            n40 n40Var = this.n;
                            ux2 ux2Var3 = (ux2) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    n40Var.b(function2, ux2Var3, yo1.Y(7));
                                    break;
                                default:
                                    n40Var.b(function2, ux2Var3, yo1.Y(7));
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    return;
                }
                return;
            }
            function1 = function0;
            ux2Var2 = ux2Var;
            this.a.n(m40Var, m40Var.a, function1, ux2Var2, 384);
        } else {
            function1 = function0;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR2 = ux2Var2.r();
        if (j56VarR2 != null) {
            j56VarR2.d = new hw2(this, function1, i, b2) { // from class: o.l40
                public final /* synthetic */ byte m;
                public final /* synthetic */ n40 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Function0 f1327o;

                {
                    this.m = b2;
                    this.n = this;
                }

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.m;
                    f88 f88Var = f88.a;
                    Function0 function2 = this.f1327o;
                    n40 n40Var = this.n;
                    ux2 ux2Var3 = (ux2) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            n40Var.b(function2, ux2Var3, yo1.Y(7));
                            break;
                        default:
                            n40Var.b(function2, ux2Var3, yo1.Y(7));
                            break;
                    }
                    return f88Var;
                }
            };
        }
    }
}
