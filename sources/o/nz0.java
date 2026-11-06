package o;

/* JADX INFO: loaded from: classes.dex */
public final class nz0 extends rc6 implements hw2 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1613o;
    public int p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ oz0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(oz0 oz0Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.s = oz0Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        nz0 nz0Var = new nz0(this.s, hc1Var);
        nz0Var.r = obj;
        return nz0Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        return ((nz0) create((aq6) obj, (hc1) obj2)).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        aq6 aq6Var;
        int i;
        int i2;
        int i3;
        String strL;
        int i4;
        int i5;
        String str;
        oz0 oz0Var = this.s;
        zw4 zw4Var = oz0Var.m;
        jw4 jw4Var = oz0Var.f1690o;
        boolean z = this.q;
        if (!z) {
            ct1.a0(obj);
            aq6Var = (aq6) this.r;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.p;
            i2 = this.f1613o;
            i3 = this.n;
            aq6Var = (aq6) this.r;
            ct1.a0(obj);
        }
        if (i3 >= Math.min(oz0Var.p + 10, jw4Var.b)) {
            return f88.a;
        }
        int i6 = i3 + 1;
        int iC = jw4Var.c(i3);
        switch (iC) {
            case 0:
                strL = "up";
                break;
            case 1:
                Object objF = zw4Var.f(i2);
                i2++;
                strL = "down " + objF;
                break;
            case 2:
                strL = ua5.l("remove ", jw4Var.c(i6), jw4Var.c(i3 + 2), " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = jw4Var.c(i6);
                int iC3 = jw4Var.c(i3 + 2);
                int iC4 = jw4Var.c(i3 + 3);
                StringBuilder sbJ = fx3.j(iC2, iC3, "move ", " ", " ");
                sbJ.append(iC4);
                strL = sbJ.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strL = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = jw4Var.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + zw4Var.f(i2);
                int i7 = i4;
                strL = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = jw4Var.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + zw4Var.f(i2);
                int i8 = i4;
                strL = str;
                i6 = i8;
                i2 = i5;
                break;
            case 7:
                Object objF2 = zw4Var.f(i2);
                objF2.getClass();
                e8.i(2, objF2);
                i2 += 2;
                strL = "apply " + ((hw2) objF2);
                break;
            case 8:
                strL = "reuse " + oz0Var.n.f(i);
                i++;
                break;
            case ep1.b /* 9 */:
                strL = "recompose pending";
                break;
            default:
                strL = fx3.e(iC, "unknown op: ");
                break;
        }
        this.r = aq6Var;
        this.n = i6;
        this.f1613o = i2;
        this.p = i;
        this.q = true;
        aq6Var.b(i3 + ": " + strL, this);
        return ne1.m;
    }
}
