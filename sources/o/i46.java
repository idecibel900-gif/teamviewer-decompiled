package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class i46 {
    public static final /* synthetic */ int f = 0;
    public final f46 a;
    public final fc1 b;
    public final cj3 c;
    public final uy0 d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(i46.class, "e");
    }

    public i46(f46 f46Var) {
        final byte b;
        this.a = f46Var;
        byte b2 = 1;
        this.b = hm3.c(xk0.G(g57.a(), new rr2(z06.r, b2)));
        ll2 ll2Var = new ll2();
        ll2Var.n = new WeakReference(this);
        ll2Var.f1375o = new yk(ll2Var, this);
        ll2Var.p = new ti(ll2Var, b2);
        cj3 cj3Var = new cj3(this);
        this.c = cj3Var;
        uy0 uy0Var = f46Var.f;
        yc4 yc4Var = new yc4();
        yc4Var.p = lv0.Q0(uy0Var.a);
        yc4Var.m = lv0.Q0(uy0Var.b);
        yc4Var.n = lv0.Q0(uy0Var.c);
        List list = (List) uy0Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            byte b3 = 29;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList.add(new y((vd5) it.next(), b3));
            }
        }
        yc4Var.f2598o = arrayList;
        List list2 = (List) uy0Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            b = 0;
            if (!it2.hasNext()) {
                break;
            }
            final wi1 wi1Var = (wi1) it2.next();
            arrayList2.add(new Function0() { // from class: o.ty0
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    byte b4 = b;
                    wi1 wi1Var2 = wi1Var;
                    switch (b4) {
                        case 0:
                            break;
                    }
                    return qf0.K(wi1Var2);
                }
            });
        }
        yc4Var.q = arrayList2;
        ArrayList arrayList3 = (ArrayList) yc4Var.p;
        ArrayList arrayList4 = (ArrayList) yc4Var.f2598o;
        ArrayList arrayList5 = (ArrayList) yc4Var.n;
        ArrayList arrayList6 = (ArrayList) yc4Var.q;
        he3 he3Var = f46Var.b;
        Object obj = he3Var.n.a.get(pm8.f1749o);
        byte b4 = 5;
        byte b5 = 4;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList4.add(new w26(b5));
            arrayList6.add(new w26(b4));
        }
        ol olVar = new ol(b);
        x86 x86Var = w86.a;
        yc4Var.j(olVar, x86Var.b(Uri.class));
        yc4Var.j(new ol((byte) 3), x86Var.b(Integer.class));
        arrayList5.add(new vd5(new kk((byte) 0), x86Var.b(x98.class)));
        yc4Var.k(new ix(b), x86Var.b(x98.class));
        yc4Var.k(new ix(b5), x86Var.b(x98.class));
        yc4Var.k(new ix((byte) 9), x86Var.b(x98.class));
        yc4Var.k(new ix((byte) 6), x86Var.b(Drawable.class));
        f4 f4Var = fe3.a;
        Object obj2 = he3Var.n.a.get(fe3.a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i = up6.a;
        tp6 tp6Var = new tp6(iIntValue);
        int i2 = Build.VERSION.SDK_INT;
        Object obj3 = ef2.a;
        if (i2 >= 29) {
            Object obj4 = he3Var.n.a.get(fe3.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = he3Var.n.a.get(fe3.b);
                if (((ef2) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    final x97 x97Var = new x97(tp6Var);
                    final byte b6 = 1;
                    arrayList6.add(new Function0() { // from class: o.ty0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b7 = b6;
                            wi1 wi1Var2 = x97Var;
                            switch (b7) {
                                case 0:
                                    break;
                            }
                            return qf0.K(wi1Var2);
                        }
                    });
                }
            }
        }
        Object obj6 = he3Var.n.a.get(fe3.b);
        final n70 n70Var = new n70(tp6Var, (ef2) (obj6 != null ? obj6 : obj3));
        final byte b7 = 1;
        arrayList6.add(new Function0() { // from class: o.ty0
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b8 = b7;
                wi1 wi1Var2 = n70Var;
                switch (b8) {
                    case 0:
                        break;
                }
                return qf0.K(wi1Var2);
            }
        });
        yc4Var.j(new ol(b7), x86Var.b(File.class));
        yc4Var.k(new ix((byte) 8), x86Var.b(x98.class));
        yc4Var.k(new ix((byte) 3), x86Var.b(ByteBuffer.class));
        yc4Var.j(new ol((byte) 4), x86Var.b(String.class));
        byte b8 = 2;
        yc4Var.j(new ol(b8), x86Var.b(wg5.class));
        arrayList5.add(new vd5(new kk((byte) 1), x86Var.b(x98.class)));
        arrayList5.add(new vd5(new kk((byte) 2), x86Var.b(x98.class)));
        yc4Var.k(new ix((byte) 7), x86Var.b(x98.class));
        yc4Var.k(new ix(b8), x86Var.b(byte[].class));
        yc4Var.k(new ix((byte) 5), x86Var.b(x98.class));
        yc4Var.k(new ix((byte) 1), x86Var.b(Bitmap.class));
        arrayList3.add(new hb2(this, ll2Var, cj3Var));
        this.d = new uy0(uf0.y(arrayList3), uf0.y((ArrayList) yc4Var.m), uf0.y(arrayList5), uf0.y(arrayList4), uf0.y(arrayList6));
    }

    public final void a(ke3 ke3Var) {
        lv1.L(ke3Var, im3.o(this.b, (de1) this.a.c.getValue(), new g46(this, ke3Var, null, (byte) 0), 2));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b4 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01be A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:128:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x0212  */
    /* JADX WARN: Code duplicated, block: B:137:0x021c A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x022b  */
    /* JADX WARN: Code duplicated, block: B:141:0x022c A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:143:0x023a A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0241 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0245 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0249 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0255 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:135:0x0216, B:137:0x021c, B:142:0x0237, B:143:0x023a, B:145:0x0241, B:141:0x022c, B:146:0x0245, B:148:0x0249, B:151:0x0255, B:152:0x025a, B:28:0x006a, B:119:0x01ad, B:121:0x01b4, B:123:0x01be, B:124:0x01c8, B:125:0x01cb), top: B:178:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:161:0x026f A[Catch: all -> 0x027c, TRY_LEAVE, TryCatch #4 {all -> 0x027c, blocks: (B:159:0x026b, B:161:0x026f, B:166:0x027e, B:167:0x0283), top: B:177:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:166:0x027e A[Catch: all -> 0x027c, TRY_ENTER, TryCatch #4 {all -> 0x027c, blocks: (B:159:0x026b, B:161:0x026f, B:166:0x027e, B:167:0x0283), top: B:177:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a4, code lost:
    
        if (r1.b(r9) == r14) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, o.i46] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, o.ke3] */
    /* JADX WARN: Type inference failed for: r3v15, types: [o.z06] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, o.z06] */
    /* JADX WARN: Type inference failed for: r3v18, types: [o.ke3] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, o.z06] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, o.z06] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, o.ke3] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, o.z06] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [o.ke3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o.ke3] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9, types: [o.ke3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [o.ke3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.gb6] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r6v13, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(o.ke3 r18, int r19, o.jc1 r20) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i46.b(o.ke3, int, o.jc1):java.lang.Object");
    }

    public final Object c(ke3 ke3Var, jc1 jc1Var) {
        return ((ke3Var.c instanceof yy2) || (ke3Var.p instanceof s46) || ((x84) nv1.w(ke3Var, ne3.e)) != null) ? hm3.j(new ko2(this, ke3Var, null, (byte) 13), jc1Var) : b(ke3Var, 1, jc1Var);
    }

    public final m46 d() {
        return (m46) this.a.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    public final void e(bd2 bd2Var, vn7 vn7Var, z06 z06Var) {
        je3 je3Var;
        ke3 ke3Var = bd2Var.b;
        xd3 xd3Var = bd2Var.a;
        if (!(vn7Var instanceof yy2)) {
            if (vn7Var != null) {
            }
            z06Var.getClass();
            je3Var = ke3Var.d;
            if (je3Var != null) {
                je3Var.a();
            }
        }
        ((x45) nv1.w(ke3Var, ne3.a)).getClass();
        vn7Var.onError(xd3Var);
        z06Var.getClass();
        je3Var = ke3Var.d;
        if (je3Var != null) {
            je3Var.a();
        }
    }
}
