package o;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class vo1 extends qs1 {
    public final /* synthetic */ ad2 d;
    public final /* synthetic */ LinkedHashSet e;
    public final /* synthetic */ boolean f;

    public vo1(ad2 ad2Var, LinkedHashSet linkedHashSet, boolean z) {
        this.d = ad2Var;
        this.e = linkedHashSet;
        this.f = z;
    }

    public static /* synthetic */ void X(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.qs1
    public final void U(zi0 zi0Var, Collection collection) {
        if (zi0Var == null) {
            X(3);
            throw null;
        }
        if (!this.f || zi0Var.k() == 2) {
            zi0Var.d0(collection);
        }
    }

    @Override // o.qs1
    public final void z(zi0 zi0Var) {
        if (zi0Var == null) {
            X(0);
            throw null;
        }
        hc5.r(zi0Var, new t(this, (byte) 16));
        this.e.add(zi0Var);
    }
}
