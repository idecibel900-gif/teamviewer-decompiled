package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a58 extends bx2 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a58(byte b, int i, Object obj) {
        super(i, obj);
        this.n = b;
    }

    @Override // o.bj0, o.rt3
    public final String getName() {
        switch (this.n) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // o.bj0
    public final ku3 getOwner() {
        switch (this.n) {
            case 0:
                return w86.a.b(b58.class);
            default:
                return w86.a.b(q35.class);
        }
    }

    @Override // o.bj0
    public final String getSignature() {
        switch (this.n) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.n) {
            case 0:
                oz3 oz3Var = (oz3) obj;
                oz3 oz3Var2 = (oz3) obj2;
                oz3Var.getClass();
                oz3Var2.getClass();
                ((b58) this.receiver).getClass();
                p35.b.getClass();
                q35 q35Var = o35.b;
                return Boolean.valueOf(q35Var.b(oz3Var, oz3Var2) && !q35Var.b(oz3Var2, oz3Var));
            default:
                oz3 oz3Var3 = (oz3) obj;
                oz3 oz3Var4 = (oz3) obj2;
                oz3Var3.getClass();
                oz3Var4.getClass();
                return Boolean.valueOf(((q35) this.receiver).a(oz3Var3, oz3Var4));
        }
    }
}
