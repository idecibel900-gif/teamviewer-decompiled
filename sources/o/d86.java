package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d86 extends i86 implements to3 {
    public final Constructor a;

    public d86(Constructor constructor) {
        this.a = constructor;
    }

    @Override // o.i86
    public final Member b() {
        return this.a;
    }

    @Override // o.to3
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new o86(typeVariable));
        }
        return arrayList;
    }
}
