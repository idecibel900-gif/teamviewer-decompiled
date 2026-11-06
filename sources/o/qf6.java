package o;

/* JADX INFO: loaded from: classes.dex */
public final class qf6 implements pw6, yl3 {
    public final ae1 a;
    public final ae1 b;
    public final ae1 c;
    public final ae1 d;

    public qf6(ae1 ae1Var, ae1 ae1Var2, ae1 ae1Var3, ae1 ae1Var4) {
        this.a = ae1Var;
        this.b = ae1Var2;
        this.c = ae1Var3;
        this.d = ae1Var4;
    }

    public static qf6 c(qf6 qf6Var, ae1 ae1Var, ae1 ae1Var2, ae1 ae1Var3, ae1 ae1Var4, int i) {
        if ((i & 1) != 0) {
            ae1Var = qf6Var.a;
        }
        if ((i & 2) != 0) {
            ae1Var2 = qf6Var.b;
        }
        if ((i & 4) != 0) {
            ae1Var3 = qf6Var.c;
        }
        if ((i & 8) != 0) {
            ae1Var4 = qf6Var.d;
        }
        qf6Var.getClass();
        return new qf6(ae1Var, ae1Var2, ae1Var3, ae1Var4);
    }

    @Override // o.pw6
    public final vs1 a(long j, j04 j04Var, in1 in1Var) {
        float fA = this.a.a(j, in1Var);
        float fA2 = this.b.a(j, in1Var);
        float fA3 = this.c.a(j, in1Var);
        float fA4 = this.d.a(j, in1Var);
        float fB = y07.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbN = e41.n("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbN.append(fA3);
            sbN.append(", bottomStart = ");
            sbN.append(fA4);
            sbN.append(")!");
            ni3.a(sbN.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new ob5(qs1.v(0L, j));
        }
        v56 v56VarV = qs1.v(0L, j);
        j04 j04Var2 = j04.m;
        float f5 = j04Var == j04Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (j04Var == j04Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = j04Var == j04Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (j04Var != j04Var2) {
            fA4 = fA3;
        }
        return new pb5(new lf6(v56VarV.a, v56VarV.b, v56VarV.c, v56VarV.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    @Override // o.yl3
    public final Object b(float f, Object obj) {
        if (im3.n(obj, kh.V) || obj == null) {
            qf6 qf6Var = sf6.a;
            nx5 nx5Var = new nx5();
            obj = new qf6(nx5Var, nx5Var, nx5Var, nx5Var);
        }
        if (!(obj instanceof qf6)) {
            return null;
        }
        qf6 qf6Var2 = (qf6) obj;
        qf6 qf6Var3 = sf6.a;
        return new qf6(new rf6(this.a, qf6Var2.a, f), new rf6(this.b, qf6Var2.b, f), new rf6(this.c, qf6Var2.c, f), new rf6(this.d, qf6Var2.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf6)) {
            return false;
        }
        qf6 qf6Var = (qf6) obj;
        return im3.n(this.a, qf6Var.a) && im3.n(this.b, qf6Var.b) && im3.n(this.c, qf6Var.c) && im3.n(this.d, qf6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
