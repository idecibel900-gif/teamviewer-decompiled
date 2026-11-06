package o;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j57 n;

    public /* synthetic */ pg0(j57 j57Var, byte b) {
        this.m = b;
        this.n = j57Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        j57 j57Var = this.n;
        switch (b) {
            case 0:
                jl3 jl3Var = (jl3) obj;
                if (jl3Var instanceof j63) {
                    j57Var.add(jl3Var);
                } else if (jl3Var instanceof k63) {
                    j57Var.remove(((k63) jl3Var).a);
                } else if (jl3Var instanceof dq2) {
                    j57Var.add(jl3Var);
                } else if (jl3Var instanceof eq2) {
                    j57Var.remove(((eq2) jl3Var).a);
                } else if (jl3Var instanceof yr5) {
                    j57Var.add(jl3Var);
                } else if (jl3Var instanceof zr5) {
                    j57Var.remove(((zr5) jl3Var).a);
                } else if (jl3Var instanceof xr5) {
                    j57Var.remove(((xr5) jl3Var).a);
                }
                break;
            default:
                jl3 jl3Var2 = (jl3) obj;
                if (jl3Var2 instanceof j63) {
                    j57Var.add(jl3Var2);
                } else if (jl3Var2 instanceof k63) {
                    j57Var.remove(((k63) jl3Var2).a);
                } else if (jl3Var2 instanceof dq2) {
                    j57Var.add(jl3Var2);
                } else if (jl3Var2 instanceof eq2) {
                    j57Var.remove(((eq2) jl3Var2).a);
                } else if (jl3Var2 instanceof yr5) {
                    j57Var.add(jl3Var2);
                } else if (jl3Var2 instanceof zr5) {
                    j57Var.remove(((zr5) jl3Var2).a);
                } else if (jl3Var2 instanceof xr5) {
                    j57Var.remove(((xr5) jl3Var2).a);
                } else if (jl3Var2 instanceof g52) {
                    j57Var.add(jl3Var2);
                } else if (jl3Var2 instanceof h52) {
                    j57Var.remove(((h52) jl3Var2).a);
                } else if (jl3Var2 instanceof f52) {
                    j57Var.remove(((f52) jl3Var2).a);
                }
                break;
        }
        return f88Var;
    }
}
