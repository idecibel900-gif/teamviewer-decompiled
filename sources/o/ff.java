package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;

/* JADX INFO: loaded from: classes.dex */
public final class ff extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f789o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f789o = obj;
        this.p = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new ff((gf) this.f789o, (q42) obj2, hc1Var, (byte) 0);
            case 1:
                return new ff((cj) this.f789o, (cj3) obj2, hc1Var, (byte) 1);
            case 2:
                return new ff((y31) obj2, hc1Var, (byte) 2);
            case 3:
                return new ff((h71) this.f789o, (n81) obj2, hc1Var, (byte) 3);
            case 4:
                return new ff((h71) this.f789o, (qa1) obj2, hc1Var, (byte) 4);
            case 5:
                return new ff((bp3) this.f789o, (sf1) obj2, hc1Var, (byte) 5);
            case 6:
                return new ff((ns1) this.f789o, (ru1) obj2, hc1Var, (byte) 6);
            case 7:
                ff ffVar = new ff((NativeLiveDataBool) obj2, hc1Var, (byte) 7);
                ffVar.f789o = obj;
                return ffVar;
            case 8:
                ff ffVar2 = new ff((nu4) obj2, hc1Var, (byte) 8);
                ffVar2.f789o = obj;
                return ffVar2;
            case ep1.b /* 9 */:
                return new ff((SupportSession) this.f789o, (su6) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new ff((pn5) obj2, hc1Var, (byte) 10);
            default:
                return new ff((bp3) this.f789o, (wr5) obj2, hc1Var, (byte) 11);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 6:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                ((ff) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 8:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((ff) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x02d1 -> B:168:0x02d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a2 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0178 -> B:79:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:164:0x02c5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.i30
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ff.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
    }
}
