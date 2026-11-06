package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pm implements tm {
    public final mm a;
    public final mm b;

    public pm(mm mmVar, mm mmVar2) {
        this.a = mmVar;
        this.b = mmVar2;
    }

    @Override // o.tm
    public final o30 d() {
        return new c87(this.a.d(), this.b.d());
    }

    @Override // o.tm
    public final List e() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.tm
    public final boolean f() {
        return this.a.f() && this.b.f();
    }
}
