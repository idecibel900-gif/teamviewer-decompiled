package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m44 {
    public final kw4 a;
    public final i44 b;
    public final r34 c;
    public final long d;
    public final /* synthetic */ r34 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ge h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ w44 l;

    public m44(long j, i44 i44Var, r34 r34Var, int i, int i2, ge geVar, int i3, int i4, long j2, w44 w44Var) {
        this.e = r34Var;
        this.f = i;
        this.g = i2;
        this.h = geVar;
        this.i = i3;
        this.j = i4;
        this.k = j2;
        this.l = w44Var;
        kw4 kw4Var = uk3.a;
        this.a = new kw4();
        this.b = i44Var;
        this.c = r34Var;
        this.d = t61.b(0, r61.i(j), 0, Integer.MAX_VALUE, 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final p44 a(int i, long j) {
        List list;
        i44 i44Var = this.b;
        Object objD = i44Var.d(i);
        Object objB = i44Var.b(i);
        kw4 kw4Var = this.a;
        List list2 = (List) kw4Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            r34 r34Var = this.c;
            i44 i44Var2 = r34Var.f1889o;
            kw4 kw4Var2 = r34Var.p;
            List listM0 = (List) kw4Var2.b(i);
            if (listM0 == null) {
                Object objD2 = i44Var2.d(i);
                listM0 = r34Var.n.m0(objD2, r34Var.m.a(i, objD2, i44Var2.b(i)));
                kw4Var2.i(i, listM0);
            }
            int size = listM0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((zn4) listM0.get(i2)).C(j));
            }
            kw4Var.i(i, arrayList);
            list = arrayList;
        }
        return new p44(i, list, this.h, this.e.n.getLayoutDirection(), this.i, this.j, i != this.f + (-1) ? this.g : 0, this.k, objD, objB, this.l.f2378o, j);
    }
}
