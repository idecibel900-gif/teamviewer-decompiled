package o;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f864o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(boolean z, xr6 xr6Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 5;
        this.f864o = z;
        this.p = xr6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new g6((j6) obj2, this.f864o, hc1Var, (byte) 0);
            case 1:
                return new g6((n81) obj2, this.f864o, hc1Var, (byte) 1);
            case 2:
                g6 g6Var = new g6(obj2, hc1Var, (byte) 2);
                g6Var.f864o = ((Boolean) obj).booleanValue();
                return g6Var;
            case 3:
                return new g6((jf3) obj2, this.f864o, hc1Var, (byte) 3);
            case 4:
                g6 g6Var2 = new g6(obj2, hc1Var, (byte) 4);
                g6Var2.f864o = ((Boolean) obj).booleanValue();
                return g6Var2;
            case 5:
                return new g6(this.f864o, (xr6) obj2, hc1Var);
            default:
                return new g6((pr7) obj2, this.f864o, hc1Var, (byte) 6);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((g6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((g6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g6) create(bool, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((g6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((g6) create(bool2, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((g6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((g6) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[LOOP:4: B:79:0x0177->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v11 java.lang.Object, still in use, count: 2, list:
          (r11v11 java.lang.Object) from 0x0160: PHI (r11 I:??) = (r11v8 java.lang.Object), (r11v11 java.lang.Object) binds: [B:68:0x015f, B:184:0x0160] A[DONT_GENERATE, DONT_INLINE]
          (r11v11 java.lang.Object) from 0x0156: CHECK_CAST (com.teamviewer.apidefinitions.supportsessions.models.SupportSession) (r11v11 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, boolean z, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.f864o = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
    }
}
