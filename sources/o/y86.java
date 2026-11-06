package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class y86 extends x86 {
    public static ou3 k(bj0 bj0Var) {
        ku3 owner = bj0Var.getOwner();
        return owner instanceof ou3 ? (ou3) owner : aa2.n;
    }

    @Override // o.x86
    public final pu3 a(bx2 bx2Var) {
        ou3 ou3VarK = k(bx2Var);
        String name = bx2Var.getName();
        String signature = bx2Var.getSignature();
        Object boundReceiver = bx2Var.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new ru3(ou3VarK, name, signature, null, boundReceiver);
    }

    @Override // o.x86
    public final wt3 b(Class cls) {
        Object objPutIfAbsent;
        wk0 wk0Var = ni0.a;
        cls.getClass();
        wk0 wk0Var2 = ni0.a;
        wk0Var2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wk0Var2.f2420o;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((Function1) wk0Var2.n).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        objInvoke.getClass();
        return (eu3) objInvoke;
    }

    @Override // o.x86
    public final ku3 c(Class cls, String str) {
        Object objPutIfAbsent;
        wk0 wk0Var = ni0.a;
        cls.getClass();
        wk0 wk0Var2 = ni0.b;
        wk0Var2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wk0Var2.f2420o;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((Function1) wk0Var2.n).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        return (ku3) objInvoke;
    }

    @Override // o.x86
    public final wu3 d(oq7 oq7Var) {
        return new yu3(k(oq7Var), oq7Var.getName(), oq7Var.getSignature(), oq7Var.getBoundReceiver());
    }

    @Override // o.x86
    public final zu3 e(gx4 gx4Var) {
        return new bv3(k(gx4Var), gx4Var.getName(), gx4Var.getSignature(), gx4Var.getBoundReceiver());
    }

    @Override // o.x86
    public final sv3 f(k44 k44Var) {
        return new vv3(k(k44Var), k44Var.getName(), k44Var.getSignature(), k44Var.getBoundReceiver());
    }

    @Override // o.x86
    public final xv3 g(fu5 fu5Var) {
        return new aw3(k(fu5Var), fu5Var.getName(), fu5Var.getSignature(), fu5Var.getBoundReceiver());
    }

    @Override // o.x86
    public final bw3 h(hu5 hu5Var) {
        return new ew3(k(hu5Var), hu5Var.getName(), hu5Var.getSignature());
    }

    @Override // o.x86
    public final String i(rw2 rw2Var) throws IOException {
        ru3 ru3VarB;
        Metadata metadata = (Metadata) rw2Var.getClass().getAnnotation(Metadata.class);
        ru3 ru3Var = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                dg2 dg2Var = kt3.a;
                strArrD2.getClass();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(j70.a(strArrD1));
                dg2 dg2Var2 = kt3.a;
                qs3 qs3VarG = kt3.g(byteArrayInputStream, strArrD2);
                dg2 dg2Var3 = kt3.a;
                ys3 ys3Var = iv5.H;
                ys3Var.getClass();
                vu0 vu0Var = new vu0(byteArrayInputStream);
                t1 t1Var = (t1) ys3Var.b(vu0Var, dg2Var3);
                try {
                    vu0Var.a(0);
                    if (!t1Var.a()) {
                        rm3 rm3Var = new rm3(new z78().getMessage());
                        rm3Var.m = t1Var;
                        throw rm3Var;
                    }
                    iv5 iv5Var = (iv5) t1Var;
                    ps3 ps3Var = new ps3(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = rw2Var.getClass();
                    gw5 gw5Var = iv5Var.B;
                    gw5Var.getClass();
                    ru3Var = new ru3(aa2.n, (c07) pa8.f(cls, iv5Var, qs3VarG, new d22(gw5Var), ps3Var, t86.n));
                } catch (rm3 e) {
                    e.m = t1Var;
                    throw e;
                }
            }
        }
        if (ru3Var == null || (ru3VarB = pa8.b(ru3Var)) == null) {
            return super.i(rw2Var);
        }
        qo1 qo1Var = z86.a;
        xw2 xw2VarC = ru3VarB.w();
        StringBuilder sb = new StringBuilder();
        z86.a(sb, xw2VarC);
        List listJ = xw2VarC.J();
        listJ.getClass();
        lv0.s0(listJ, sb, ", ", "(", ")", e24.D, 48);
        sb.append(" -> ");
        oz3 returnType = xw2VarC.getReturnType();
        returnType.getClass();
        sb.append(z86.a.X(returnType));
        return sb.toString();
    }

    @Override // o.x86
    public final String j(yz3 yz3Var) {
        return i(yz3Var);
    }
}
